
/**
 * Autor : Emilian Ossowski
 *
 * Budowniczy - zleca zadanie budowniczemu*/

public class Director {
    private Builder builder;

    public void setBuilder(Builder builder){
        this.builder = builder;
    }

    public Rower getRower(){
        return builder.getRower();
    }

    public void skladaj(){
        builder.newRower();
        builder.buildRama();
        builder.buildKierownica();
        builder.buildManetki();
        builder.buildPrzerzutki();
        builder.buildKoła();

    }
}
