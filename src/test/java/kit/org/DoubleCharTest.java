package kit.org;

import kit.org.kata.DoubleChar;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DoubleCharTest {
    @ParameterizedTest
    @MethodSource("provideStringsForIsBlank")
    void sampleTest(String expect, String data) {
        assertEquals(expect, DoubleChar.doubleChar(data));
    }

    private static Stream<Arguments> provideStringsForIsBlank() {
        return Stream.of(
                Arguments.of("SSttrriinngg", "String"),
                Arguments.of("HHeelllloo  WWoorrlldd", "Hello World"),
                Arguments.of("11223344!!__  ", "1234!_ ")
        );
    }
}
