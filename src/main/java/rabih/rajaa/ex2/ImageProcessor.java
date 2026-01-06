package rabih.rajaa.ex2;

/**
 * ImageProcessor class - Context in Strategy Pattern, uses Filter and Compressor
 * Processes images by applying filter and compression.
 */
public class ImageProcessor {
    private Filter filter;
    private Compressor compressor;

    public void setFilter(Filter filter) {
        this.filter = filter;
    }

    public void setCompressor(Compressor compressor) {
        this.compressor = compressor;
    }

    public int[] processImage(int[] data) {
        if (filter != null) {
            data = filter.filter(data);
        }
        if (compressor != null) {
            data = compressor.compress(data);
        }
        return data;
    }
}
