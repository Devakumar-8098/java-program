class Splchar {
    public static void main(String[] args) {
String input = "Hello @#$% World!";
StringBuilder output = new StringBuilder();
for (int i = 0; i < input.length(); i++) {
    if ((input.charAt(i) >= 'A' && input.charAt(i) <= 'Z') ||
        (input.charAt(i) >= 'a' && input.charAt(i) <= 'z') ||
        (input.charAt(i) >= '0' && input.charAt(i) <= '9')) {
        output.append(input.charAt(i));
    }
}
System.out.println(output); // Output: HelloWorld

    }
}
