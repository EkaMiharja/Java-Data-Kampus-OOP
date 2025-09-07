// Create a class called "datasekolah" with four attributes: "nama", "nim", "prodi", and "jurusan"
public class datasekolah {
    public String nama;
    public String nim;
    public String prodi;
    public String jurusan;

    // Create a constructor for the "datasekolah" class
    public datasekolah(String nama, String nim, String prodi, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.jurusan = jurusan;
    }
    
    // Create a method called "tampildata" that prints out the values of the attributes
    public void tampildata() {
        System.out.print("==============================================");
        System.out.println("\nNama          : " + nama);
        System.out.println("NIM           : " + nim);
        System.out.println("Prodi         : " + prodi);
        System.out.println("Jurusan       : " + jurusan);
        System.out.println("==============================================");
    }

    public static void main(String[] args) {
        // Create an object of the "datasekolah" class and call the "tampildata" method
        datasekolah siswa = new datasekolah("Eka Miharja", "3201234567890001", "Teknik Multimedia dan Jaringan", "Teknik Informatika");
        datasekolah siswa1 = new datasekolah("Fathir Diaz", "3201234567890001", "Teknik Multimedia dan Jaringan", "Teknik Informatika");
        datasekolah siswa2 = new datasekolah("Budi", "3201234567890001", "Teknik Elektro", "Teknik Elektronika");
        datasekolah siswa3 = new datasekolah("Andi", "3201234567890001", "Keuangan", "Akuntansi");

        // Call the "tampildata" method
        siswa.tampildata();
        siswa1.tampildata();
        siswa2.tampildata();
        siswa3.tampildata();
    }

}

