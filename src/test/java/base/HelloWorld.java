package base;

class HelloWorld {
    public static void main(String[] args) {
        String input = "*&\" #$%^&*1234$%^^&   Inter….   view%^&^ \"#$\"";
        StringBuilder result = new StringBuilder();
        boolean lastCharWasSpace = false;

        for (char c : input.toCharArray()) {
            // Use Character class methods correctly
            if (Character.isLetterOrDigit(c)) {
                result.append(c);
                lastCharWasSpace = false;
            } else if (c == ' ' && !lastCharWasSpace && result.length() > 0) {
                result.append(' ');
                lastCharWasSpace = true;
            }
        }

        // Trim the final string to remove extra spaces
        System.out.println("Alphanumeric characters: " + result.toString().trim());
    }
}
