package Mehmet;

public class MusteriBilgileri {

    private String adSoyad;

    private String kartNo;

    private String sifre;

    MusteriBilgileri(String adSoyad, String kartNo, String sifre){
        this.adSoyad=adSoyad;
        this.kartNo=kartNo;
        this.sifre=sifre;

    }

    public String getKartNo() {
        return kartNo;
    }

    public void setKartNo(String kartNo) {
        this.kartNo = kartNo;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }
}
