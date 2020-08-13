import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class IntegrationIT {
    @Test
    void integrationTestShouldNotBeExecutedBySurefire() {
        assertThat(true).isEqualTo(true);
    }
}
