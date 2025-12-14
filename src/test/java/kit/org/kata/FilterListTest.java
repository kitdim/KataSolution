package kit.org.kata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class FilterListTest {

    @ParameterizedTest
    @MethodSource("getTestData")
    void filterList(List<Object> expect, List<Object> dataByTest) {
        List<Object> actual = FilterList.filterList(dataByTest);
        assertEquals(expect, actual);
    }

    public static Stream<Arguments> getTestData() {
        return Stream.of(
                Arguments.of(List.of(1, 2, 2212, 2, 1), List.of(1, 2, 2212, "dada", 2, "ds", 1)),
                Arguments.of(List.of(1, 1), List.of(1, "dada", "1", "ds", 1))
        );
    }
}