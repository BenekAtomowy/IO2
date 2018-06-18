public class Main {

    public static void main(String[] args) {

        RecyclerApplication app = new RecyclerApplication("klienckie","RO", new ClientModule() );
        app.action();
        app = new RecyclerApplication("producenckie", "RW", new ProducerModule());
        app.action();


    }
}
