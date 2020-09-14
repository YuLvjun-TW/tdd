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


}
