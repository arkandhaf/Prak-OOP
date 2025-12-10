import java.util.ArrayList;
import java.util.List;

public final class GedungSangkuriang implements Asrama {
    List<Mahasiswa> penghuni;
    int kapasitas;
    // List<Mahasiswa> penghuni;
    // Integer kapasitas;

    /*
     * TODO: Implementasikan constructor kelas GedungSangkuriang
     * penghuni diinisialisasi dengan ArrayList baru
     * kapasitas diinisialisasi sesuai parameter
     */
    public GedungSangkuriang(Integer kapasitas) {
        this.kapasitas = kapasitas;
        this.penghuni = new ArrayList<>();
        // TODO: answer here
    }

    /*
     * TODO: Implementasikan method infoAsrama
     * Tampilkan "Asrama Gedung Sangkuriang dengan kapasitas <kapasitas>"
     */
    public void infoAsrama() {
        System.out.println("Asrama Gedung Sangkuriang dengan kapasitas " + kapasitas);
        // TODO: answer here
    }

    /*
     * TODO: Implementasikan method daftarAsrama
     * Jika kapasitas sudah penuh, tampilkan "Asrama Gedung Sangkuriang sudah penuh"
     * Jika mahasiswa sudah terdaftar di asrama lain (assigned), tampilkan "Mahasiswa sudah terdaftar di asrama lain"
     * Jika mahasiswa asing, tampilkan "Mahasiswa asing tidak boleh mendaftar di asrama ini"
     * Jika mahasiswa domestik dan asrama belum penuh, tambahkan mhs ke penghuni,
     * tampilkan "Mahasiswa <username> diterima di asrama Gedung Sangkuriang"
     * Lalu set asrama mahasiswa ke asrama ini
     */ 
    public void daftarAsrama(Mahasiswa mhs) {
         if (penghuni.size() >= kapasitas) {
            System.out.println("Asrama Gedung Sangkuriang sudah penuh");
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
            penghuni.add(mhs);
            System.out.println("Mahasiswa " + mhs.getUsername() + " diterima di asrama Gedung Sangkuriang");
            mhs.setAsrama(this);
        }
        // TODO: answer here
    }
}