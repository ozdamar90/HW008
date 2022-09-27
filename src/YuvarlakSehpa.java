public class YuvarlakSehpa extends Mobilya implements Daire {
    private double yariCap;

    public YuvarlakSehpa(String aciklama, double yukseklik, double yariCap, boolean kapaliMi) {
        super(aciklama, yukseklik, kapaliMi);
        this.yariCap = yariCap;
    }

    public YuvarlakSehpa() {
    }

    @Override
    public void setYaricap(double yaricap) {

    }

    @Override
    public double getYaricap() {

        return yariCap;
    }

    @Override
    public double hacimHesapla() {
        return Math.PI*yariCap*yariCap*getYukseklik();
    }

    @Override
    public double alanHesapla() {
        return isKapaliMi() == false?Math.PI * yariCap * yariCap:2 * Math.PI * yariCap * yariCap +
                2 * Math.PI * yariCap * getYukseklik();
        }


    @Override
    public String toString() {

        return String.format(super.toString()+"Yari Cap: %5.2f Yükseklik : %5.2f",yariCap,getYukseklik());


    }
}
