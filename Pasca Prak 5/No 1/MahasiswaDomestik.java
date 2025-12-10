public final class MahasiswaDomestik extends Mahasiswa{
    // private Gender gender;
    private Gender gender;
    /*
     * TODO: Implementasikan constructor kelas MahasiswaDomestik
     * gender diinisialisasi sesuai parameter, username dan password diinisialisasi dengan null
     * */
    public MahasiswaDomestik(Gender gender){
        super();
        this.gender = gender;
        // TODO: answer here
    }

    /*
     * TODO: Implementasikan method perkenalkan
     * Tampilkan "Halo, saya mahasiswa domestik <gender> dengan username <username>"
     */
    public void perkenalkan(){
        System.out.println("Halo, saya mahasiswa domestik " + gender + " dengan username " + this.getUsername());
        // TODO: answer here
    }

    /*
     * TODO: Implementasikan method daftarAsrama
     * Tampilkan "Mahasiswa domestik <gender> dengan username <username> berhasil mendaftar asrama"
     * panggil method daftarAsrama pada objek asrama
     */
    public void daftarAsrama(Asrama asrama) {
        System.out.println("Mahasiswa domestik " + gender  + " dengan username " + this.getUsername() + " berhasil mendaftar asrama");
        asrama.daftarAsrama(this);
        // TODO: answer here
    }
    
    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
    /*
     * TODO: Implementasikan setter dan getter
     * setGender, getGender
     */
}
