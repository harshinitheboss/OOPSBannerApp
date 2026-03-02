/*
 * OOPSBannerApp UC5 – Render OOPS as Banner using Inline Array Initialization
 * Version 5
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Declare and initialize array in a single statement
        String[] lines = {

            String.join(" ",
                    "  ***  ",
                    "  ***  ",
                    " ****** ",
                    " ***** "),

            String.join(" ",
                    " *   * ",
                    " *   * ",
                    " *    *",
                    " *    *"),

            String.join(" ",
                    "*     *",
                    "*     *",
                    " ***** ",
                    "*     "),

            String.join(" ",
                    "*     *",
                    "*     *",
                    "*      ",
                    " **** "),

            String.join(" ",
                    "*     *",
                    "*     *",
                    "*      ",
                    "     *"),

            String.join(" ",
                    " *   * ",
                    " *   * ",
                    "*      ",
                    "*     *"),

            String.join(" ",
                    "  ***  ",
                    "  ***  ",
                    "*      ",
                    " ***** ")
        };

        // Enhanced for-loop to print banner
        for (String line : lines) {
            System.out.println(line);
        }
    }
}


