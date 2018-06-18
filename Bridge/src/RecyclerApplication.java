public class RecyclerApplication extends Application {
    RecyclerApplication(String menu, String permissions, Display display){
        super(menu,permissions, display);
    }
    public void action(){
        display.action();
    }
}
