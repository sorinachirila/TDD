import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class  AssertjTest {
    @Test
    public void testStringIsEqualWithAnotherString() {
        String text = "abc";
        assertThat(text).isEqualTo("abc");
    }

    @Test
    public void testMultipleConditionsForAnArray() {
        String[] stringArray = {"abc", "cde", "efg"};
        assertThat(stringArray)
                .hasSize(3)
                .contains("cde")
                .doesNotContain("xyz");
    }
}
