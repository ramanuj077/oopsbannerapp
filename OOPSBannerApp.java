/**
 * OOPSBannerApp - UC8
 * Prints "OOPS" in banner format using HashMap for character patterns
 * 
 * @author Ramanuj
 * @version 8.0
 */
import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    // Utility method to build character patterns
    public static Map<Character, String[]> buildCharacterPatterns() {
        Map<Character, String[]> patterns = new HashMap<>();

        patterns.put('O', new String[] {
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        });

        patterns.put('P', new String[] {
            "***** ",
            "*    *",
            "*    *",
            "***** ",
            "*     ",
            "*     ",
            "*     "
        });

        patterns.put('S', new String[] {
            " *****",
            "*     ",
            "*     ",
            " *****",
            "     *",
            "     *",
            " *****"
        });

        return patterns;
    }

    // Rendering function
    public static void renderBanner(String word, Map<Character, String[]> patterns) {
        for (int i = 0; i < 7; i++) { // 7 lines per character
            StringBuilder line = new StringBuilder();
            for (char c : word.toCharArray()) {
                line.append(patterns.get(c)[i]).append("  "); // spacing
            }
            System.out.println(line.toString());
        }
    }

    public static void main(String[] args) {
        Map<Character, String[]> patterns = buildCharacterPatterns();
        renderBanner("OOPS", patterns);
    }
}
