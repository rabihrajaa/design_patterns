package rabih.rajaa.ex1;

/**
 * Decorator abstract class - Decorator in Decorator Pattern
 * Wraps a Traitement component and adds additional responsibilities.
 */
public abstract class Decorator implements Traitement {
    protected Traitement component;

    public Decorator(Traitement component) {
        this.component = component;
    }

    @Override
    public void traitement() {
        component.traitement();
    }
}
