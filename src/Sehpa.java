public class Sehpa extends Mobilya implements Dortgen {
private double genislik;
private double derinlik;

    public Sehpa(String aciklama, double yukseklik, boolean kapaliMi, double genislik, double derinlik) {
        super(aciklama, yukseklik, kapaliMi);
        this.genislik = genislik;
        this.derinlik = derinlik;
    }

    public Sehpa() {
    }

    @Override
    public void setGenislik(double genislik) {

    }

    @Override
    public double getGenislik() {

        return getGenislik();
    }

    @Override
    public void setDerinlik(double derinlik) {

    }

    @Override
    public double getDerinlik() {

        return getDerinlik();
    }

    @Override
    public double hacimHesapla() {
        return getGenislik()*getDerinlik()*getYukseklik();
    }

    @Override
    public double alanHesapla() {
        if (isKapaliMi() == false) {
            return getGenislik() * getDerinlik();
        } else {
            return 6 * getGenislik() * getDerinlik();
        }

    }

    @Override
    public String toString() {

        return super.toString()+getGenislik()*getDerinlik()*getYukseklik();
    }
}
