package Factory;

public class UIFactoryFactory {

    public static UIFactory getUIFactoryFromPlatform(SupportedPlatforms platforms) {
        return switch (platforms) {
            case IOS -> new IosUIFactory();
            case ANDROID -> new AndriodUIFactory();
        };
    }
}
