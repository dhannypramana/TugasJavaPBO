package Student;

public class Dosen extends Orang
{
    private String mk;
    private String strata;
    private int salary; // Nilai salary harus lebih dari 0

    public Dosen(String Nama, String Alamat, String Kota, int Umur, char JenisKelamin, String mk, String strata, int salary)
    {
        setnama(Nama);
        setalamat(Alamat);
        setkota(Kota);
        setumur(Umur);
        setjenis_kelamin(JenisKelamin);
        this.mk = mk;
        this.strata = strata;
        this.salary = salary;
    }

    public void setStrata(String strata) {
        this.strata = strata;
    }

    public void setMk(String tittle) {
        tittle = mk;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString()
    {
        /*
            Mengembalikan informasi dosen
         */

        String string1 =  "Nama : " + getnama() + "\n" +
                        "Alamat : " + getalamat() + "\n" +
                        "Kota : " + getkota() + "\n" +
                        "Umur : " + getumur() + "\n" +
                        "MK   : " + mk + "\n" +
                        "Strata : " + strata + "\n" +
                        "Salary : " + salary;

        return string1;
    }
}