package stringworksheet4;

public class Question6 {
    public static void main(String[] args) {
        String input = "C:\\Users\\Admin\\Pictures\\Flower.jpg";
        int lastBackslashIndex = input.lastIndexOf('\\');
        int lastDotIndex = input.lastIndexOf('.');

        // Extract and print the path
        System.out.println("The path of the flower is " + input.substring(0, lastBackslashIndex));

        // Check if the backslash and dot are found, and extract file name and extension
        if (lastBackslashIndex >= 0 && lastDotIndex > lastBackslashIndex && lastDotIndex < input.length() - 1) {
            // Extract and print the file name
            String fileName = input.substring(lastBackslashIndex+1 , lastDotIndex);
            System.out.println("The File name is " + fileName);

            // Extract and print the extension
            String extension = input.substring(lastDotIndex + 1);
            System.out.println("The Extension is " + extension);
        }
    }
}
