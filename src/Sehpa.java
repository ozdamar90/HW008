public class Sehpa extends Mobilya implements Dortgen {
private double genislik;
private double derinlik;

    public Sehpa(String aciklama, double yukseklik, double genislik, double derinlik, boolean kapaliMi) {
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

        return genislik;
    }

    @Override
    public void setDerinlik(double derinlik) {

    }

    @Override
    public double getDerinlik() {

        return derinlik;
    }

    @Override
    public double hacimHesapla() {
        return genislik*derinlik*getYukseklik();
    }

    @Override
    public double alanHesapla() {
        return isKapaliMi() == false?genislik * derinlik:6 * genislik * derinlik;

    }

    @Override
    public String toString() {

        return super.toString()+genislik*derinlik*getYukseklik();
    }


    }
