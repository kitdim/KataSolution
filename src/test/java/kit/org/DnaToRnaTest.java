package kit.org;

import kit.org.kata.DnaToRna;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DnaToRnaTest {
    private DnaToRna d;

    @BeforeEach
    public void init() {
        d = new DnaToRna();
    }

    @ParameterizedTest
    @MethodSource("provideStringsForIsBlank")
    public void testDna(String expect, String dna) {
        assertEquals(expect, d.dnaToRnaConvert(dna));
        assertEquals(expect, d.dnaToRnaConvert(dna));
    }

    private static Stream<Arguments> provideStringsForIsBlank() {
        return Stream.of(
                Arguments.of("UUUU", "TTTT"),
                Arguments.of("GCAU", "GCAT")
        );
    }
}
