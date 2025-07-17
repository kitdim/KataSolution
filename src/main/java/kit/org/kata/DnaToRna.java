package kit.org.kata;

/**
 * The DnaToRna class provides a method for converting a DNA sequence to an RNA sequence.
 * <p>
 * DNA (deoxyribonucleic acid) consists of four bases: guanine ('G'), cytosine ('C'), adenine ('A'), and thymine ('T').
 * RNA (ribonucleic acid) differs in that it contains uracil ('U') instead of thymine ('T').
 * <p>
 * The dnaToRnaConvert method replaces all occurrences of 'T' with 'U' in the given DNA string, simulating the transcription process.
 *
 * <pre>
 * Example usage:
 * DnaToRna converter = new DnaToRna();
 * String rna = converter.dnaToRnaConvert("GATTACA"); // Returns "GAUUACA"
 * </pre>
 */
public class DnaToRna {
    /**
     * Default constructor for DnaToRna.
     */
    public DnaToRna() {
    }

    /**
     * Converts a DNA sequence to an RNA sequence by replacing all 'T' with 'U'.
     *
     * @param dna the DNA sequence as a String
     * @return the RNA sequence as a String
     */
    public String dnaToRnaConvert(String dna) {
        return dna.replaceAll("T", "U");
    }
}
