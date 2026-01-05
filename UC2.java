public class UC2 {


    static class Banner2 {
        void display2() {
            String[] lines = {
                    "  *     *     **       ***",
                    " * *   * *    *    *   **",
                    "*   * *   *   *     * **",
                    "*   * *   *   *    *   **",
                    "*   * *   *   **        *",
                    "*   * *   *   *               *",
                    "*   * *   *   *                *",
                    " * *   * *    *               *",
                    "  *     *     *          **"
            };


            for (String line : lines) {
                System.out.println(line);
            }
        }
    }


    public static void main(String[] args) {

        Banner2 b2 = new Banner2();
        b2.display2();


    }
}