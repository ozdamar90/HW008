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

        return yariCap;
    }

    @Override
    public double alanHesapla() {
        return isKapaliMi() == false?Math.PI * yariCap * yariCap:2 * Math.PI * yariCap* yariCap +
                2 * Math.PI * yariCap * getYukseklik();
        }


    @Override
    public double hacimHesapla() {
        return Math.PI * yariCap * yariCap * getYukseklik();
    }

    @Override
    public String toString() {

        return String.format(super.toString()+yariCap*getYukseklik());
    }
}
