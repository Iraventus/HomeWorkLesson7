import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class SimpleTest {

    @Test
    @Tag("positive")
    @DisplayName("Some positive test")
    void positiveTest() {
        step("Assert that true is true", () ->
                assertThat(true, is(true)));
    }

    @Test
    @Tag("negative")
    @DisplayName("Some negative test")
    void negativeTest() {
        step("Assert that true is false", () ->
                assertThat(true, is(false)));
    }
}
