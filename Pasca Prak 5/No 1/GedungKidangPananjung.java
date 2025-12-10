import java.util.ArrayList;
import java.util.List;

public final class GedungKidangPananjung implements Asrama {
    List<Mahasiswa> penghuni;
    int kapasitas;
    // List<Mahasiswa> penghuni;
    // Integer kapasitas;

    /*
     * TODO: Implementasikan constructor kelas GedungKidangPananjung
     * penghuni diinisialisasi dengan ArrayList baru
     * kapasitas diinisialisasi sesuai parameter
     */
    public GedungKidangPananjung(Integer kapasitas) {
        this.kapasitas = kapasitas;
        this.penghuni = new ArrayList<>();
        // TODO: answer here
    }

    /*
     * TODO: Implementasikan method infoAsrama
     * Tampilkan "Asrama Gedung Kidang Pananjung dengan kapasitas <kapasitas>"
     */
    public void infoAsrama() {
        System.out.println("Asrama Gedung Pananjung dengan kapasitas " + kapasitas);
        // TODO: answer here
    }

    /*
     * TODO: Implementasikan method daftarAsrama
     * Asrama kidang pananjung hanya untuk mahasiswa domestik PRIA
     * 
     * Jika kapasitas asrama penuh, tampilkan "Asrama Gedung Kidang Pananjung sudah penuh"
     * Jika mahasiswa sudah terdaftar di asrama lain (assigned), tampilkan "Mahasiswa sudah terdaftar di asrama lain"
     * Jika mahasiswa asing, tampilkan "Mahasiswa asing tidak boleh mendaftar di asrama ini"
     * Jika mahasiswa domestik WANITA, tampilkan "Asrama Gedung Kidang Pananjung hanya untuk mahasiswa laki-laki"
     * Jika mahasiswa domestik PRIA dan asrama belum penuh, tambahkan mhs ke penghuni,
     * tampilkan "Mahasiswa <username> diterima di asrama Gedung Kidang Pananjung"
     * Lalu set asrama mahasiswa ke asrama ini
     */
    public void daftarAsrama(Mahasiswa mhs) {
        if (penghuni.size() >= kapasitas) {
            System.out.println("Asrama Gedung Kidang Pananjung sudah penuh");
            return;
        }

        if (mhs.getAssigned()) {
            System.out.println("Mahasiswa sudah terdaftar di asrama lain");
            return;
        }

        if (mhs instanceof MahasiswaAsing) {
            System.out.println("Mahasiswa asing tidak boleh mendaftar di asrama ini");
            return;
        }

        if (mhs instanceof MahasiswaDomestik) {
            MahasiswaDomestik domestik = (MahasiswaDomestik) mhs;
                if (domestik.getGender() == Gender.WANITA) {
                    System.out.println("Asrama Gedung Kidang Pananjung hanya untuk mahasiswa laki-laki");
                    
                    return;
                }
            
            penghuni.add(mhs);
            System.out.println("Mahasiswa " + mhs.getUsername() + " diterima di asrama Gedung Kidang Pananjung");
            mhs.setAsrama(this);
        }
        // TODO: answer here
    }
}