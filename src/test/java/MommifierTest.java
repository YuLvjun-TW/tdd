import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class MommifierTest {
    @Test
    public void should_throw_exception_when_string_is_null() throws StringIsNullException {
        assertThrows(StringIsNullException.class, ()->{
            Mommifier mommifier = new Mommifier();
            mommifier.getMommifierString(null);
        });
    }

    @Test
    public void should_return_itself_when_string_is_empty() throws StringIsNullException {
        Mommifier mommifier = new Mommifier();
        String emptyString = "";
        assertEquals(emptyString, mommifier.getMommifierString(emptyString));
    }

    @Test
    public void should_return_itself_when_number_of_vowels_are_not_more_than_thirty_percent_of_string_length() throws StringIsNullException {
        Mommifier mommifier = new Mommifier();
        String vowelsNotThirtyPercent = "give";
        assertEquals(vowelsNotThirtyPercent, mommifier.getMommifierString(vowelsNotThirtyPercent));
    }

    @Test
    public void should_return_itself_when_number_of_vowels_are_more_than_thirty_percent_and_not_include_continuous_vowels() throws StringIsNullException {
        Mommifier mommifier = new Mommifier();
        String vowelsNotThirtyPercentAndNotContinuousVowels = "git";
        assertEquals(vowelsNotThirtyPercentAndNotContinuousVowels, mommifier.getMommifierString(vowelsNotThirtyPercentAndNotContinuousVowels));
    }


}
