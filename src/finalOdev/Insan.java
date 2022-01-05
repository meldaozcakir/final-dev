package finalOdev;

public class Insan {
    String ad;
    String soyadı;
    int dogumYili;
    int yas;

    public Insan(String ad, String soyadı, int dogumYili, int yas) {
        this.ad = ad;
        this.soyadı = soyadı;
        this.dogumYili = dogumYili;
        this.yas = yas;
    }

    public Insan(){
        ad = "bilgi girilmedi";
    }

    public void info(){
        System.out.println("Çalışan Adı : " + this.ad + "\nÇalışan Soyadı : " + this.soyadı + "\nDoğum Yılı : " + this.dogumYili + "\nYaş : " + this.yas );
    }
}
