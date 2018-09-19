/**
 * Autor : Emilian Ossowski
 *
 * klasa nadrzedna do tworzenia podklas Excelo i Gretta**/

public class Rower {
    private String rama;
    private String kierownica;
    private String manetki;
    private String przerzutki;
    private String koła;


    public void setRama(String rama) {
        this.rama = rama;
    }

    public void setKierownica(String kierownica) {
        this.kierownica = kierownica;
    }

    public void setManetki(String manetki) {
        this.manetki = manetki;
    }

    public void setPrzerzutki(String przerzutki) {
        this.przerzutki = przerzutki;
    }

    public void setKoła(String koła) {
        this.koła = koła;
    }

    public void show(){
        if(rama!=null) System.out.println("Monitor = " + rama);
        if(kierownica!=null) System.out.println("Procesor = " + kierownica);
        if(manetki!=null) System.out.println("Grafika = " + manetki);
        if(przerzutki!=null) System.out.println("RAM = " + przerzutki);
        if(koła!=null) System.out.println("HDD = " + koła);
    }


}
