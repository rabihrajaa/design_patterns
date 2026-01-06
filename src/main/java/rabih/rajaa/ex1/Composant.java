package rabih.rajaa.ex1;

/**
 * Composant class - Concrete component in Decorator Pattern
 * Implements the core Traitement operation.
 */
public class Composant implements Traitement {

    @Override
    public void traitement() {
        System.out.println("Executing core traitement operation.");
    }
}
