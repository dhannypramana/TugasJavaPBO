package Student;

public class Orang {
    
    private String nama;
    private String alamat;
    private String kota;
    private int umur;
    private char jenis_kelamin;

    void setnama(String nama) {
        this.nama = nama;
    }

    void setalamat(String alamat) {
        this.alamat = alamat;
    }

    void setkota(String kota) {
        this.kota = kota;
    }

    void setumur(int umur) {
        /*
            Umur harus lebih dari 0
         */
        if(umur > 0){
            this.umur = umur;
        }else{
            System.err.println("Umur Harus Lebih Dari 0");
        }
    }

    void setjenis_kelamin(char jenis_kelamin) {
        /*
            Validasi bahawa karakter jenis kelamin adalah
            L: laki-laki dan
            P: perempuan
         */
        this.jenis_kelamin = jenis_kelamin;
    }
    String getnama() {
        return nama + " ";
    }
    String getalamat() {
        return alamat + " ";
    }
    String getkota() {
        return kota + " ";
    }
    int getumur() {
        return umur;
    }
    char getjenis_kelamin() {
        return jenis_kelamin;
    }
    public String toString() {
        /*
            Mengembalikan informasi identitas orang
         */
        String string1 =  "Nama : " + getnama() + "\n" +
                "Alamat : " + getalamat() + "\n" +
                "Kota : " + getkota() + "\n" +
                "Umur : " + getumur() + "\n";
        return string1;
    }
}