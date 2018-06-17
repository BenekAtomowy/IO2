abstract public class Builder {
    protected Rower rower;

    public void newRower(){
        rower = new Rower();
    }
    public Rower getRower(){
        return rower;
    }

    public abstract void buildRama();
    public abstract void buildKierownica();
    public abstract void buildManetki();
    public abstract void buildPrzerzutki();
    public abstract void buildKoła();

}
