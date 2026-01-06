package rabih.rajaa.ex1;

/**
 * Plugin abstract class - Template Method Pattern
 * Defines the skeleton of an algorithm with variable parts (partie1 and partie2).
 */
public abstract class Plugin {

    /**
     * Template method defining the algorithm skeleton.
     */
    public final void executeAlgorithm() {
        partie1();
        partie2();
    }

    /**
     * Abstract method for the first variable part.
     */
    protected abstract void partie1();

    /**
     * Abstract method for the second variable part.
     */
    protected abstract void partie2();
}
