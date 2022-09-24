public interface Daire {
    void setYaricap(double yaricap);
    double getYaricap();
    double alanHesapla();    //:: Eğer kapaliMi false ise (genislik x derinlik) değilse (6 x genislik x derinlik)
    double hacimHesapla();  //: genislik x derinlik x yukseklik
}
