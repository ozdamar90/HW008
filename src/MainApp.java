public class MainApp {
    public static void main(String[] args) {

        Mobilya mobilya1=new Masa("Ahşap Masa : ", 120,
                70,60,false);


        System.out.println(mobilya1.getAciklama());
        System.out.printf("Alan  = %5.2f\n",((Masa)mobilya1).alanHesapla());
        System.out.printf("Hacim = %5.2f\n",((Masa)mobilya1).hacimHesapla());;
        System.out.println();
        Daire daire1=new YuvarlakSehpa("Beyaz Sehpa : ",40,
                     40,false);
        System.out.println(daire1);
        System.out.printf("Alan  = %5.2f\n",daire1.alanHesapla());
        System.out.printf("Hacim = %5.2f\n",daire1.hacimHesapla());
        Dortgen[] mobilyalar=new Dortgen[]{new Sehpa(),new Masa()};



        }


        }




