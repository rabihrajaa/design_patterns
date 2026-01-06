package rabih.rajaa.ex2;

/**
 * FilterAdapter class - Adapter Pattern
 * Adapts ImplNonStandard to the Filter interface.
 */
public class FilterAdapter implements Filter {
    private ImplNonStandard implNonStandard;

    public FilterAdapter(ImplNonStandard implNonStandard) {
        this.implNonStandard = implNonStandard;
    }

    @Override
    public int[] filter(int[] data) {
        // Assume a default filter name for adaptation
        return implNonStandard.appliquerFiltre("default", data);
    }
}
