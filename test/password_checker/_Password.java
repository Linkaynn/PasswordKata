package password_checker;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class _Password {
    @Test
    public void password_should_have_at_least_6_chars_long() throws Exception {
        assertThat(new Password().isValid("asdfgh"), is(true));
        assertThat(new Password().isValid("asdfg"), is(false));
    }
}
