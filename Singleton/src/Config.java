/**
 * Autor: Emilian OSsowski
 *
 * Plik zawiera konfiguracje, konstruktor jest prywatny dlatego nie można go wywołać
 * mozna tylko odebrać dane z singletona i istnieć tylko jedna instancja tej klasy**/

public class Config {


    private static Config instance = null;
    private String language = "EN";
    private String idletime = "30";
    private String AccountId="aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee";
    private String CdKey="1111-1111-1111-1111";
    private Config(){}


    public static Config getConfig(){
        if(instance == null){
            instance = new Config();
            return instance;
        }
        else {
            System.out.println("Konfiguracja została już utworzona!");
            return instance;
        }
    }
    public void about(){
        System.out.println(language);
        System.out.println(idletime);
        System.out.println(AccountId);
        System.out.println(CdKey);
    }
}
