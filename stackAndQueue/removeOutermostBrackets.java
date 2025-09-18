package stackAndQueue;
public class removeOutermostBrackets {
    public static String removeOutermostBrackets(String s) {
        StringBuilder result = new StringBuilder();
        int size = 0; // This tracks our depth

        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (size > 0) result.append(c); // Only add if not outermost
                size++;
            } else {
                size--;
                if (size > 0) result.append(c); // Only add if not outermost
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        // Example usage
        String input = "(()())(())";
        System.out.println(removeOutermostBrackets(input));
    }
}



