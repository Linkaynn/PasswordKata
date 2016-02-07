package password_checker;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class _Password {
    @Test
    public void password_should_have_at_least_6_chars_long() throws Exception {
        assertThat(new Password().isValid("a2sdfGh"), is(true));
        assertThat(new Password().isValid("asdfg"), is(false));
    }

    @Test
    public void password_should_have_at_least_one_uppercase_character() throws Exception {
        assertThat(new Password().isValid("aA2dfgh"), is(true));
        assertThat(new Password().isValid("asddgd"), is(false));
    }

    @Test
    public void password_should_have_at_least_one_lowercase_character() throws Exception {
        assertThat(new Password().isValid("aA3dfgh"), is(true));
        assertThat(new Password().isValid("DDDDDD"), is(false));
    }

    @Test
    public void password_should_have_at_least_one_number() throws Exception {
        assertThat(new Password().isValid("aA1dfgh"), is(true));
        assertThat(new Password().isValid("DDDDsD"), is(false));
    }
}
