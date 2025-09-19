package Strings;
class secondLargestt{
    public static int secondLargest(String s) {
        int largest = -1;
        int secondLargest = -1;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                int d = Character.getNumericValue(ch);

                if (d > largest) {
                    secondLargest = largest;
                    largest = d;
                } else if (d > secondLargest && d < largest) {
                    secondLargest = d;
                }
            }
        }
        return secondLargest; 
    }

    public static void main(String[] args) {
        // Example usage
        String input = "abc12345"; // You can change this input
        int result = secondLargest(input);
        System.out.println("The second highest digit is: " + result);
    }
}
