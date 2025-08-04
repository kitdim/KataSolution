package kit.org;

import kit.org.kata.CreditCardMask;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreditCardMaskTest {
   @ParameterizedTest
   @MethodSource("getData")
    public void maskifyTest(String expect, String testData) {
       assertEquals(expect, CreditCardMask.maskify(testData));
   }

    private static Stream<Arguments> getData() {
        return Stream.of(
                Arguments.of("############5616", "4556364607935616"),
                Arguments.of("#######5616", "64607935616"),
                Arguments.of("1", "1"),
                Arguments.of("", ""),
                Arguments.of("##ippy", "Skippy"),
                Arguments.of("####################################man!", "Nananananananananananananananana Batman!")
        );
    }
}
