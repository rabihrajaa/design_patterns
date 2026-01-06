package rabih.rajaa.ex2;

/**
 * AbstractCompressor abstract class - Template Method Pattern
 * Defines the skeleton of the compression algorithm, delegating details to subclasses.
 */
public abstract class AbstractCompressor implements Compressor {

    @Override
    public final int[] compress(int[] data) {
        // Common steps
        prepareData(data);
        int[] compressed = performCompression(data);
        finalizeCompression(compressed);
        return compressed;
    }

    protected void prepareData(int[] data) {
        System.out.println("Preparing data for compression.");
    }

    protected abstract int[] performCompression(int[] data);

    protected void finalizeCompression(int[] compressed) {
        System.out.println("Finalizing compression.");
    }
}
