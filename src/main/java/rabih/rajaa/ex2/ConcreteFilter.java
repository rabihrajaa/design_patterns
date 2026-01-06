package rabih.rajaa.ex2;

/**
 * ConcreteFilter class - Concrete strategy for filtering
 * Implements a specific filter operation.
 */
public class ConcreteFilter implements Filter {

    @Override
    public int[] filter(int[] data) {
        System.out.println("Applying concrete filter.");
        // Simple filter: multiply each element by 2
        int[] result = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            result[i] = data[i] * 2;
        }
        return result;
    }
}
