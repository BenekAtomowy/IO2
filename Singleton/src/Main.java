public class Main {
    public static void main(String[]args){
        Config cfg = Config.getConfig();
        cfg.about();
        Config [] cfg2 = new Config[3];
        cfg2[0] = Config.getConfig();
        cfg2[1] = Config.getConfig();
        cfg2[2] = Config.getConfig();
    }
}

