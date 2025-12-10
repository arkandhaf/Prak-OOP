public class MahasiswaAsing extends Mahasiswa {
    // private String country;
    private String country;
    /*
     * TODO: Implementasikan constructor kelas MahasiswaAsing
     * country diinisialisasi sesuai parameter, username dan password diinisialisasi dengan null
     */
    public MahasiswaAsing(String country) {
        super();
        this.country = country;
        // TODO: answer here
    }

    /*
     * TODO: Implementasikan method perkenalkan
     * Tampilkan "Halo, saya mahasiswa asing dengan username <username> dari negara <country>"
     */
    public void perkenalkan() {
        System.out.println("Halo, saya mahasiswa asing dengan username " + this.getUsername() + " dari negara " + country);
        // TODO: answer here
    }

    /*
     * TODO: Implementasikan method daftarAsrama
     * Tampilkan "Mahasiswa asing dengan username <username> dari negara <country> berhasil mendaftar asrama"
     * panggil method daftarAsrama pada objek asrama
     */
    public void daftarAsrama(Asrama asrama) {
        System.out.println("Mahasiswa asing dengan username " + this.getUsername() + " dari negara " + country + " berhasil mendaftar asrama");
        asrama.daftarAsrama(this);
        // TODO: answer here
    }
    
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    /*
     * TODO: Implementasikan setter dan getter
     * setCountry, getCountry
     */
}
