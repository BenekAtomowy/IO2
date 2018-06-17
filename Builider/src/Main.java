public class Main {
    public static void main(String[] args) {
        Director szef = new Director();
        Builder builder = new Gretta();
        Builder builder2 = new Excelo();

        System.out.println("\nZESTAW1");
        szef.setBuilder(builder);
        szef.skladaj();
        Rower zestaw1 = szef.getRower();


        szef.setBuilder(builder2);
        szef.skladaj();
        Rower zestaw2 = szef.getRower();


        zestaw1.show();
        System.out.println("\n\nZESTAW2");
        zestaw2.show();

    }
}
