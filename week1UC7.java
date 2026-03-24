/**
 * OOPS Banner App
 * UC7: Store Character Pattern in a Class
 *
 * This program displays the word "OOPS" in banner format
 * using a static inner class to encapsulate character patterns.
 */
public class week1UC7 {

    /**
     * Static inner class to store a character and its 7-line pattern.
     */
    static class CharacterPatternMap {
        private final char character;
        private final String[] pattern;

        /**
         * Constructs a CharacterPatternMap object.
         *
         * @param character the character to store
         * @param pattern the 7-line banner pattern of the character
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Returns the character.
         *
         * @return the stored character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Returns the pattern of the character.
         *
         * @return the 7-line banner pattern
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Returns the banner pattern for a given character
     * by searching in the CharacterPatternMap array.
     *
     * @param ch the character to search
     * @param patterns the array of CharacterPatternMap objects
     * @return the matching 7-line pattern, or null if not found
     */
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] patterns) {
        for (CharacterPatternMap cp : patterns) {
            if (cp.getCharacter() == ch) {
                return cp.getPattern();
            }
        }
        return null;
    }

    /**
     * Displays the given word in banner format.
     *
     * @param word the word to display
     * @param patterns the array containing character-pattern mappings
     */
    public static void printBanner(String word, CharacterPatternMap[] patterns) {
        for (int row = 0; row < 7; row++) {
            StringBuilder line = new StringBuilder();

            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                String[] pattern = getCharacterPattern(ch, patterns);

                if (pattern != null) {
                    line.append(pattern[row]).append("  ");
                }
            }

            System.out.println(line);
        }
    }

    /**
     * Main method to run the OOPS Banner App.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        CharacterPatternMap oPattern = new CharacterPatternMap('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        CharacterPatternMap pPattern = new CharacterPatternMap('P', new String[]{
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        });

        CharacterPatternMap sPattern = new CharacterPatternMap('S', new String[]{
                " ******",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                "****** "
        });

        CharacterPatternMap[] patterns = {oPattern, pPattern, sPattern};

        printBanner("OOPS", patterns);
    }
}