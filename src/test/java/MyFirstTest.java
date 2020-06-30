import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


public class MyFirstTest {
    //Create a test method that uses assertEquals or assertNotEquals to verify if the String Codeup is the same as CodeUp.
    @Test
    public void codeup() {
        String word = "Codeup";
        assertEquals("CodeUp", word);
    }

//    Create a test method that uses assertNotSame to verify that the following ArrayLists are not the same:
//    List<String> languages = new ArrayList<>();
//    List<String> moreLanguages = new ArrayList<>();
    @Test
    public void notTheSame() {
        List<String> languages = new ArrayList<>();
        List<String> moreLanguages = new ArrayList<>();
        assertNotSame(languages, moreLanguages);
    }

//    Create a test method that uses assertArrayEquals to verify the following arrays are equal.
//    int[] numbers = {1, 2, 3};
//    int[] otherNumbers = new int[3];
//    otherNumbers[0] = 1;
//    otherNumbers[1] = 2;
//    otherNumbers[2] = 3;
    @Test
    public void isEqual() {
        int[] numbers = {1, 2, 3};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;
        assertArrayEquals(numbers, otherNumbers);
    }

//    Create a test method that uses both assertFalse and assertTrue to verify the following statements:
//    String language = "PHP";
//    language.contains("H"); // use assertTrue for this statement
//    language.contains("J"); // use assertFalse for this statement
    @Test
    public void verify() {
        String language = "PHP";
        assertTrue(language.contains("H"));
        assertFalse(language.contains("J"));
    }
}
