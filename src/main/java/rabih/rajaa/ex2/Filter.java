package rabih.rajaa.ex2;

/**
 * Filter interface - Strategy Pattern
 * Defines the filter operation for image processing.
 */
public interface Filter {
    int[] filter(int[] data);
}
