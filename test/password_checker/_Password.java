package password_checker;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class _Password {
    @Test
    public void password_should_have_at_least_6_chars_long() throws Exception {
        assertThat(new Password().isValid("a2sdfG_h"), is(true));
    }

    @Test
    public void password_should_have_at_least_one_uppercase_character() throws Exception {
        assertThat(new Password().isValid("aA2df_gh"), is(true));
        assertThat(new Password().isValid("abdcda2_"), is(false));
    }

    @Test
    public void password_should_have_at_least_one_lowercase_character() throws Exception {
        assertThat(new Password().isValid("aA3d_fgh"), is(true));
        assertThat(new Password().isValid("ABCDE2_"), is(false));
    }

    @Test
    public void password_should_have_at_least_one_number() throws Exception {
        assertThat(new Password().isValid("aA_1dfgh"), is(true));
        assertThat(new Password().isValid("aA_ddfgh"), is(false));
    }

    @Test
    public void password_should_have_at_least_one_underscore() throws Exception {
        assertThat(new Password().isValid("aA_1dfgh"), is(true));
        assertThat(new Password().isValid("aAd1dfgh"), is(false));
    }
}
