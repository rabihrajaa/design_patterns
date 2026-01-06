package rabih.rajaa.ex1;

/**
 * Factory implementation - Factory Method Pattern
 * Allows client to instantiate Plugin without knowing the concrete class.
 */
public class PluginFactoryImpl implements PluginFactory {

    @Override
    public Plugin createPlugin() {
        return new ConcretePlugin();
    }
}
