package Student;

public class Mahasiswa extends Orang {

    private String NIP;
    private String kelas;
    private int semester;
    private MahasiswaReport report;

    public Mahasiswa(String nama, String alamat, String kota, int umur, char jenis_kelamin, String NIP, String kelas, int semester, MahasiswaReport Report) {
       setnama(nama);
       setalamat(alamat);
       setkota(kota);
       setumur(umur);
       setjenis_kelamin(jenis_kelamin);
       setReport(Report);
        this.NIP = NIP;
        this.kelas = kelas;
        this.semester = semester;
    }

    public void setId(String id) {
        NIP = id;
    }

    public void setkelas(String kelas) {
        this.kelas = kelas;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public void setReport(MahasiswaReport report) {
        this.report = report;
    }
    public String getNIP() {
        return this.NIP;
    }
    public String getkelas()
    {
        return this.kelas;
    }
    public int getSemester()
    {
        return this.semester;
    }
    public MahasiswaReport getReport()
    {
        return report;
    }
    @Override
    public String toString()
    {
        /*
            Mengembalikan informasi mahasiswa
         */
        String string1 =  "\nNama : " + getnama() + "\n" +
                "Alamat : " + getalamat() + "\n" +
                "Kota : " + getkota() + "\n" +
                "Umur : " + getumur() + "\n" +
                "NIP   : " + NIP + "\n" +
                "Kelas : " + kelas + "\n" +
                "Semester : " + semester + "\n" +
                "\n" + getReport();
        return string1;
    }
}
