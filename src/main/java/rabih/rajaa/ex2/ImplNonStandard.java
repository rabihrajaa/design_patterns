package rabih.rajaa.ex2;

/**
 * ImplNonStandard class - Legacy implementation
 * Old implementation with different signature for filtering.
 */
public class ImplNonStandard {
    public int[] appliquerFiltre(String filterName, int[] data) {
        System.out.println("Applying filter: " + filterName);
        // Simple implementation: reverse the array
        int[] result = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            result[i] = data[data.length - 1 - i];
        }
        return result;
    }
}
