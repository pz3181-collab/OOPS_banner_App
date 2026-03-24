/**
 * OOPSBannerApp UC3 – OOPS Banner Application (Use Case 3)
 * Uses String.join() to construct each line of the banner.
 */

public class OOPSBannerAppUC3 {

    public static void main(String[] args) {

        // O   O   P   S  (7 rows)

        System.out.println(String.join(" ",
                "  ***   ",
                "  ***   ",
                " *****  ",
                " *****  "
        ));

        System.out.println(String.join(" ",
                " *   *  ",
                " *   *  ",
                " *   *  ",
                " *      "
        ));

        System.out.println(String.join(" ",
                " *   *  ",
                " *   *  ",
                " *   *  ",
                " *      "
        ));

        System.out.println(String.join(" ",
                " *   *  ",
                " *   *  ",
                " *****  ",
                "  ***   "
        ));

        System.out.println(String.join(" ",
                " *   *  ",
                " *   *  ",
                " *      ",
                "     *  "
        ));

        System.out.println(String.join(" ",
                " *   *  ",
                " *   *  ",
                " *      ",
                " *   *  "
        ));

        System.out.println(String.join(" ",
                "  ***   ",
                "  ***   ",
                " *      ",
                "  ***   "
        ));
    }
}