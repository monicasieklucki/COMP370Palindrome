import java.util.Locale;

public class Palindrome {
    public static void main(String[] args) {
    String str = "hannah";

    str = str.toLowerCase();
    tellMePal(isPalindrome(str));
}

    // Palindrome checker method
    static boolean isPalindrome(String str)
    {
        // Make it not case-sensitive and index of the strings i = left side and j = right side
        String input = str.toLowerCase();
        int i = 0;
        int j = input.length() - 1;

        // Base case check for spaces or empty strings THROWS EXCEPTIONS
        if (input == ""){ throw new IllegalArgumentException(" Your string can not be empty or have any spaces in it!");}
        for (int k = 0; k< input.length(); k++){
            if (input.charAt(k) == ' '){ throw new IllegalArgumentException(" Your string can not be empty or have any spaces in it!");}
        }

        // check if palindrome
        while (i < j) {
            if (input.charAt(i) == input.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    // prints to screen the result of the Palindrome checker method
    public static void tellMePal (boolean input){
        if (input == true){
            System.out.println("Yes: is a Palindrome");
        } else {
            System.out.println("No: Not a Palindrome");
        }
    }
}
