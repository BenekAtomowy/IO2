public abstract class Application {
    protected Display display;
    protected String menu;
    protected String permissions;

    public Application(){};

    public Application(String menu, String permissions, Display display){
        this.menu = menu;
        this.permissions = permissions;
        this.display = display;

    }

}
