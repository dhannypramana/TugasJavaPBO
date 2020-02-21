package Student;

public class MahasiswaReport
{
    private static final int A = 4;
    private static final int B = 3;
    private static final int C = 2;
    private static final int D = 1;
    private static final int E = 0;
    private String mk1;
    private String mk2;
    private int sks1;
    private int sks2;
    private String nilai1;
    private String nilai2;

    MahasiswaReport(String mk1, String mk2, int sks1, int sks2, String nilai1, String nilai2) {
        this.mk1 = mk1;
        this.mk2 = mk2;
        this.sks1 = sks1;
        this.sks2 = sks2;
        this.nilai1 = nilai1;
        this.nilai2 = nilai2;
    }
    
    MahasiswaReport(MahasiswaReport sp) {

    }
    
    public String getmk1() {
        return mk1;
    }
    public void setmk1(String mk1) {
        this.mk1 = mk1;
    }
    
    public String getmk2() {
        return  mk2;
    }
    
    public void setmk2(String mk2) {
        this.mk2 = mk2;
    }
    
    public int getsks1() {
        return  sks1;
    }
    public void setsks1(int sks1) {
        this.sks1 = sks1;
    }
    public int getsks2() {
        return  sks2;
    }
    public void setsks2(int sks2) {
        this.sks2 = sks2;
    }
    public String getnilai1() {
        return nilai1;
    }
    public void setnilai1(String nilai1) {
        this.nilai1 = nilai1;
    }
    public String getnilai2() {
        return nilai2;
    }
    public void setnilai2(String nilai2) {
        this.nilai2 = nilai2;
    }
    public double HitungNR()
    {
        /*
            Nilai NR adalah : ( Nilai mutu MK1 + Nilai mutu MK2 ) / (sks MK1 + sks MK2)
         */
        var simpanNilai1 = ConvertNilaiMutu(nilai1);
        var simpanNilai2 = ConvertNilaiMutu(nilai2);
        double nr;
        nr = (simpanNilai1 + simpanNilai2) / (sks1 + sks2);
        return nr;
    }
    
    public double ConvertNilaiMutu(String HurufMutu){
        double mutu = 0;
        /*
            Huruf mutu A : nilai mutu 4
            Huruf mutu B : nilai mutu 3
            Huruf mutu C : nilai mutu 2
            Huruf mutu D : nilai mutu 1
            Huruf mutu E : nilai mutu 0
         */
        if(HurufMutu == "A"){
            mutu = 4.0;
        }else if(HurufMutu == "B"){
            mutu = 3.0;
        }else if(HurufMutu == "C"){
            mutu = 2.0;
        }else if(HurufMutu == "D"){
            mutu = 1.0;
        }else if(HurufMutu == "E"){
            mutu = 0.0;
        }
        return mutu;
    }
    public String toString() {
        /*
            Mengembalikan informasi laporan nilai mahasiswa
         */
//        double getNilai1Convert = ConvertNilaiMutu(getnilai1());

        String string1 = "MK1 : " + getmk1() + "\n" +
                "SKS1 : " + getsks1() + "\n" +
                "Nilai1 : " + ConvertNilaiMutu(getnilai1()) + "\n\n" +
                "MK2 : " + getmk2() + "\n" +
                "SKS2  : " + getsks2() + "\n" +
                "Nilai2 : " + ConvertNilaiMutu(getnilai2()) + "\n" +
                "NR : " + HitungNR();

        return string1;
    }
}
