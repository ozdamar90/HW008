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
        return Math.PI*getYaricap()*getYaricap()*getYukseklik();
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
    public String toString() {

        return String.format(super.toString()+"Yari Cap: %5.2f Yükseklik : %5.2f",getYaricap(),getYukseklik());


    }
}
