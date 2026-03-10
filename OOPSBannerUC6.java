public class OOPSBannerUC6 {

    // Method to create pattern for O
    public static String getOPattern(int line) {
        String[] O = {
                String.join("", " *** ", " ", " *** "),
                String.join("", "*   *", " ", "*   *"),
                String.join("", "*   *", " ", "*   *"),
                String.join("", "*   *", " ", "*   *"),
                String.join("", "*   *", " ", "*   *"),
                String.join("", "*   *", " ", "*   *"),
                String.join("", " *** ", " ", " *** ")
        };
        return O[line];
    }

    // Method to create pattern for P
    public static String getPPattern(int line) {
        String[] P = {
                "**** ",
                "*   *",
                "*   *",
                "**** ",
                "*    ",
                "*    ",
                "*    "
        };
        return P[line];
    }

    // Method to create pattern for S
    public static String getSPattern(int line) {
        String[] S = {
                " ****",
                "*    ",
                "*    ",
                " *** ",
                "    *",
                "    *",
                "**** "
        };
        return S[line];
    }

    public static void main(String[] args) {

        // Build banner lines using helper methods
        String[] bannerLines = new String[7];

        for (int i = 0; i < 7; i++) {
            bannerLines[i] = String.join("   ",
                    getOPattern(i),
                    getOPattern(i),
                    getPPattern(i),
                    getSPattern(i));
        }

        // Print banner using enhanced for loop
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}