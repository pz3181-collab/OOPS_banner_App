import java.util.HashMap;

public class week1UC8 {

    // Method to create character map
    public static HashMap<Character, String[]> createCharacterMap() {
        HashMap<Character, String[]> charMap = new HashMap<>();

        charMap.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        charMap.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        charMap.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });

        return charMap;
    }

    // Method to display banner
    public static void displayBanner(String message, HashMap<Character, String[]> charMap) {

        int patternHeight = charMap.get('O').length;

        for (int i = 0; i < patternHeight; i++) {
            StringBuilder sb = new StringBuilder();

            for (char ch : message.toCharArray()) {
                String[] pattern = charMap.get(ch);
                sb.append(pattern[i]).append("  ");
            }

            System.out.println(sb.toString());
        }
    }

    // Main method
    public static void main(String[] args) {
        HashMap<Character, String[]> charMap = createCharacterMap();
        String message = "OOPS";
        displayBanner(message, charMap);
    }
}