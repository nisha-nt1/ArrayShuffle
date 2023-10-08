public class PangramChecker {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        
        boolean isPangram = checkIfPangram(input);
        
        System.out.println("Is the input a pangram? " + isPangram);
    }
    
    public static boolean checkIfPangram(String input) {
        // Convert the input to lowercase for case-insensitive comparison
        String lowercaseInput = input.toLowerCase();
        
        // Create an array to mark the presence of each alphabet
        boolean[] alphabetPresence = new boolean[26];
        
        for (char c : lowercaseInput.toCharArray()) {
            if (Character.isLetter(c)) {
                int index = c - 'a';
                alphabetPresence[index] = true;
            }
        }
        
        // Check if all alphabet letters are present
        for (boolean isPresent : alphabetPresence) {
            if (!isPresent) {
                return false;
            }
        }
        
        return true;
    }
}
