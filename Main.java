package giris;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Değişkenleri oluştur.
        int mat, fizik, kimya, türkce, tarih, muzik;

        //Scanner sınıfını oluştur.
        Scanner inp = new Scanner(System.in);

        //Kullanıcıdan değerleri al.
        System.out.print("Matematik Notunuz : ");
        mat = inp.nextInt();

        System.out.print("Fizik Notunuz : ");
        fizik = inp.nextInt();

        System.out.print("Kimya Notunuz : ");
        kimya = inp.nextInt();

        System.out.print("Turkce Notunuz : ");
        türkce = inp.nextInt();

        System.out.print("Tarih Notunuz : ");
        tarih = inp.nextInt();

        System.out.print("Muzik Notunuz : ");
        muzik = inp.nextInt();
        int toplam = (mat + fizik + kimya + türkce + tarih + muzik);
        double sonuc = toplam / 6;
        System.out.println("Ortalamaniz : " + sonuc);

        System.out.print((sonuc >= 63.0) ? "Sinifi Gecti" :  "Sinifta Kaldi");
    }
}
