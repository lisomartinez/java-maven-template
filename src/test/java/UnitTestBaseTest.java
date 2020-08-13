import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class UnitTestBaseTest {
    @Test
    void unitTestShouldBeExecutedBySurefireAndFailsafe() {
        assertThat(true).isEqualTo(true);
    }
}
