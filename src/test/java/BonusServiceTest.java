import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

public class BonusServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/data.csv")
    void shouldCalculateForRegisteredAndUnderLimit(long amount, long expected, boolean registered) {
        BonusService service = new BonusService();


        long actual = service.calculate(amount, registered);


        assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/data.csv")
    void shouldCalculateForUnregisteredAndOverLimit(long amount, long expected, boolean registered) {
        BonusService service = new BonusService();


        long actual = service.calculate(amount, registered);


        assertEquals(expected, actual);
    }
}