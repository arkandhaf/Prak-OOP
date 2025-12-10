import java.util.ArrayList;
import java.util.List;

public final class GedungInternasional implements Asrama {
    List<Mahasiswa> penghuni;
    int kapasitas;
    // List<Mahasiswa> penghuni;
    // Integer kapasitas;

    /*
     * TODO: Implementasikan constructor kelas GedungInternasional
     * penghuni diinisialisasi dengan ArrayList baru
     * kapasitas diinisialisasi sesuai parameter
     */
    public GedungInternasional(Integer kapasitas) {
        this.kapasitas = kapasitas;
        this.penghuni = new ArrayList<>();
    }

    /*
     * TODO: Implementasikan method infoAsrama
     * Tampilkan "Asrama Gedung Internasional dengan kapasitas <kapasitas>"
     */
    public void infoAsrama() {
        System.out.println("Asrama Gedung Internasional dengan kapasitas " + kapasitas);
        //TODO: answer here
    }

    /*
     * TODO: Implementasikan method daftarAsrama
     * Jika kapasitas sudah penuh, tampilkan "Asrama Gedung Internasional sudah penuh
     * Jika mahasiswa sudah terdaftar di asrama lain (assigned), tampilkan "Mahasiswa sudah terdaftar di asrama lain"
     * Jika mahasiswa domestik, tampilkan "Mahasiswa domestik tidak boleh mendaftar di asrama ini"
     * Jika mahasiswa asing dan asrama belum penuh, tambahkan mhs ke penghuni,
     * tampilkan "Mahasiswa <username> diterima di asrama Gedung Internasional"
     * Lalu set asrama mahasiswa ke asrama ini
     */
    public void daftarAsrama(Mahasiswa mhs) {
        if (penghuni.size() >= kapasitas) {
            System.out.println("Asrama Gedung Internasional sudah penuh");
            return;
        }

        if (mhs.getAssigned()) {
            System.out.println("Mahasiswa sudah terdaftar di asrama lain");
            return;
        }

        if (mhs instanceof MahasiswaDomestik) {
            System.out.println("Mahasiswa domestik tidak boleh mendaftar di asrama ini");
            return;
        }

        if (mhs instanceof MahasiswaAsing) {
            penghuni.add(mhs);
            System.out.println("Mahasiswa " + mhs.getUsername() + " diterima di asrama Gedung Internasional");
            mhs.setAsrama(this);
        }

        //TODO: answer here
    }
}
