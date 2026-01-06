package rabih.rajaa.ex2;

/**
 * Compressor interface - Strategy Pattern
 * Defines the compression operation for image processing.
 */
public interface Compressor {
    int[] compress(int[] data);
}
