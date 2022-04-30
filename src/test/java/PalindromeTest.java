import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeTest {
    private Palindrome palindrome = new Palindrome();
    private String str = null;
    @Test
    public void testPalindrome() throws Exception{
        str = "tacocat";
        assertTrue(palindrome.isPalindrome(str));
    }
}