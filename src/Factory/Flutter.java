package Factory;

public class Flutter {

    public void createTheme(){
        System.out.println("Creating Flutter Theme");
    }

    public void setRefreshRate(){
        System.out.println("Setting Refresh Rate");
    }

    public UIFactory createUIFactory(SupportedPlatforms params){
        System.out.println("Creating UI Factory");
        return UIFactoryFactory.getUIFactoryFromPlatform(params);
    }
}
