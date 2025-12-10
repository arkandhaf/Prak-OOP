public class BankSystem {
    private BankAccount[] accounts;
    private int count;

    /* TODO : Lengkapi konstruktor BankSystem(int capacity)
       Konstruktor ini membuat sistem bank yang dapat menampung sejumlah akun.
       - capacity menentukan banyaknya akun maksimum.
       - Inisialisasi array accounts dengan ukuran capacity.
       Tidak ada nilai kembalian. */
    public BankSystem(int capacity) {
        accounts = new BankAccount[capacity];
        count = 0;
        // Type your code
    }

    /* TODO : Lengkapi method addAccount(BankAccount account)
       Menambahkan akun ke sistem.
       - Jika sudah penuh, lempar IllegalStateException("Sistem sudah penuh.").
       - Jika akun null, lempar NullPointerException("Akun tidak boleh null.").
       Tidak ada nilai kembalian. */
    public void addAccount(BankAccount account) {
        if (count == accounts.length) {
            throw new IllegalStateException();
        } else if (account == null) {
            throw new NullPointerException();
        }
        accounts[count] = account;
        count++;
        // Type your code
    }

    /* TODO : Lengkapi method findAccount(String owner)
       Mencari akun berdasarkan nama pemilik.
       - Jika tidak ditemukan, return null.
       Return: objek BankAccount atau null jika tidak ada. */
    public BankAccount findAccount(String owner) {
        // Type your code
        for(int i = 0;  i < count; i++){
            if (owner.equals(accounts[i].getOwner())) {
                return accounts[i];
            }
        }
        return null;
    }

    /* TODO : Lengkapi method displayAll()
       Menampilkan semua akun yang ada di sistem.
       Format:
       Daftar Akun:
       - <nama> - Saldo: Rp<saldo>
       Jika belum ada akun, tampilkan pesan "(tidak ada akun)". */
    public void displayAll() {
      // Type your code
    System.out.println("Daftar Akun:");
        if (count == 0){
            System.out.println("(tidak ada akun)");
        }
        else {
            for (int i=0; i<count; i++){
                System.out.println("- " + accounts[i].toString());
            }
        }
    }
}
