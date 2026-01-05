public class UC4 {
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        // Constructor
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter for character
        public char getCharacter() {
            return character;
        }

        // Getter for pattern
        public String[] getPattern() {
            return pattern;
        }
    }


    public static String[] getCharacterPattern(char character, CharacterPatternMap[] maps) {

        for (int i = 0; i < maps.length; i++) {
            if (maps[i].getCharacter() == character) {
                return maps[i].getPattern();
            }
        }
        return null;
    }

    public static void printBanner(String word, CharacterPatternMap[] maps) {

        int rows = maps[0].getPattern().length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < word.length(); j++) {
                String[] pattern = getCharacterPattern(word.charAt(j), maps);
                System.out.print(pattern[i] + "   ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

        CharacterPatternMap[] patterns = {

                new CharacterPatternMap('O', new String[]{
                        " **** ",
                        "*    *",
                        "*    *",
                        "*    *",
                        " **** "
                }),

                new CharacterPatternMap('P', new String[]{
                        "***** ",
                        "*    *",
                        "***** ",
                        "*     ",
                        "*     "
                }),

                new CharacterPatternMap('S', new String[]{
                        " **** ",
                        "*     ",
                        " **** ",
                        "     *",
                        " **** "
                })
        };

        printBanner("OOPS", patterns);
    }
}