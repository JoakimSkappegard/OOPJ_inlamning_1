public abstract class Vaxt implements Behov,Gast { // ska vara abstarakt

    private Double vaxtHojd;
    private String vaxtName;

    public Double getVaxtHojd() {
        return vaxtHojd;
    }

    public void setVaxtHojd(Double hojd) {
        this.vaxtHojd = hojd;
    }

    public String getVaxtName() {
        return vaxtName;
    }

    public void setVaxtName(String vaxtName) {
        this.vaxtName = vaxtName;
    }

    public Vaxt(double hojd, String namn) {
        this.vaxtHojd = hojd;
        this.vaxtName = namn.toUpperCase();
    }

    public Vaxt(){

    }

}
