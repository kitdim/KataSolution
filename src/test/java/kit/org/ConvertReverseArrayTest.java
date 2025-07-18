package kit.org;

import kit.org.kata.ConvertReverseArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ConvertReverseArrayTest {
    @ParameterizedTest
    @MethodSource("provideStringsForIsBlank")
    public void tests(int[] expect, long data) {
        assertArrayEquals(expect, ConvertReverseArray.digitize(data));
    }

    private static Stream<Arguments> provideStringsForIsBlank() {
        return Stream.of(
                Arguments.of(new int[] {1, 3, 2, 5, 3}, 35231),
                Arguments.of(new int[] {0}, 0)
        );
    }
}
