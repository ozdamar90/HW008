public class YuvarlakMasa extends Mobilya implements Daire {
private double yariCap;

    public YuvarlakMasa(String aciklama, double yukseklik, boolean kapaliMi, double yariCap) {
        super(aciklama, yukseklik, kapaliMi);
        this.yariCap = yariCap;
    }

    public YuvarlakMasa() {
    }

    @Override
    public void setYaricap(double yaricap) {

    }

    @Override
    public double getYaricap() {

        return getYaricap();
    }

    @Override
    public double alanHesapla() {
        if (isKapaliMi() == false) {
            return Math.PI * getYaricap() * getYaricap();
        } else {
            return 2 * Math.PI * getYaricap() * getYaricap() + 2 * Math.PI * getYaricap() * getYukseklik();
        }

    }

    @Override
    public double hacimHesapla() {
        return Math.PI * getYaricap() * getYaricap() * getYukseklik();
    }

    @Override
    public String toString() {

        return String.format(super.toString()+getYaricap()*getYukseklik());
    }
}
