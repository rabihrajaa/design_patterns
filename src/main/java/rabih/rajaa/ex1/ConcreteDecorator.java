package rabih.rajaa.ex1;

/**
 * ConcreteDecorator class - Concrete decorator in Decorator Pattern
 * Adds specific responsibilities before and after the traitement call.
 */
public class ConcreteDecorator extends Decorator {

    public ConcreteDecorator(Traitement component) {
        super(component);
    }

    @Override
    public void traitement() {
        System.out.println("Before traitement - additional logic.");
        super.traitement();
        System.out.println("After traitement - additional logic.");
    }
}
