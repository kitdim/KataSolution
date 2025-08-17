package kit.org;

import kit.org.kata.XO;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class XoTest {
    @ParameterizedTest
    @MethodSource("init")
    public void getXOtest(boolean expect, String testData) {
        assertEquals(expect, XO.getXO(testData));
    }

    public static Stream<Arguments> init() {
        return Stream.of(
                Arguments.of(true, "ooxx"),
                Arguments.of(false, "xooxx"),
                Arguments.of(true, "ooxXm"),
                Arguments.of(true, "zpzpzpp"),
                Arguments.of(false, "zzoo")
        );
    }
}
