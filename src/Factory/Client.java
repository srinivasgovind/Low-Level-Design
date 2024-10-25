package Factory;

public class Client {

    public static void main(String[] args) {

        Flutter flutter = new Flutter();

        UIFactory uiFactory = flutter.createUIFactory(SupportedPlatforms.ANDROID);

        uiFactory.createButton();
        uiFactory.createMenu();

    }
}
