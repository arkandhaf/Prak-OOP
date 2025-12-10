import java.util.ArrayList;
import java.util.List;

public class Library {
    private String name;
    private List<Section> sections;
    // Todo: Buat atribut name (String) dan sections (List<Section>)

    public Library(String name) {
        this.name = name;
        this.sections = new ArrayList<>();

        // Todo: Implementasi konstruktor dengan inisialisasi atribut name dengan parameter name
        // dan inisialisasi sections sebagai ArrayList kosong
    }

    public void addSection(Section section) {
        sections.add(section);
        System.out.println("Section " + section.getSectionName() + "' added to " + name);
    }
    // Todo: Implementasi method addSection yang menerima parameter Section
    // Method ini menambahkan section ke list sections
    // Tampilkan pesan: "Section '[nama section]' added to [nama library]"

    public void findBook(String title) {
        boolean found = false;
        for (Section section : sections) {
            for (Section.Book book : section.getBooks()) {
                if (book.getTitle().equalsIgnoreCase(title)) {
                    System.out.println("Found \"" + title + "\" in " + section.getSectionName() + " section");
                    System.out.println(book.getDetails());
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("Book \"" + title + "\" not found in library");
        }
    }
    // Todo: Implementasi method findBook yang menerima parameter String title
    // Method ini mencari buku berdasarkan judul di semua section
    // Jika ditemukan, tampilkan:
    // - "Found "[title]" in [nama section] section"
    // - Detail buku menggunakan getDetails()
    // Jika tidak ditemukan, tampilkan: "Book "[title]" not found in library"
    public void displayAllBooks() {
        if (sections.isEmpty()) {
            System.out.println("No sections in library");
            return;
        }

        for(Section section : sections) {
            System.out.println("Section: " + section.getSectionName());
            section.displayBooks();
            System.out.println();
        }
    }
    // Todo: Implementasi method displayAllBooks tanpa parameter
    // Method ini menampilkan semua buku di semua section
    public String getName() {
        return name;
    }
    // Todo: Implementasi getter getName() yang mengembalikan name
    public List<Section> getSections() {
        return sections;
    }
    // Todo: Implementasi getter getSections() yang mengembalikan sections

    // Static Nested Class - Section
    public static class Section {
        private String sectionName;
        private List<Book> books;
        // Todo: Buat atribut sectionName (String) dan books (List<Book>)

        public Section(String sectionName) {
            this.sectionName = sectionName;
            this.books = new ArrayList<>();
            // Todo: Implementasi konstruktor
            // Inisialisasi sectionName dengan parameter
            // Inisialisasi books sebagai ArrayList kosong
        }

        public void addBook(Book book) {
            books.add(book);
            System.out.println("Book " + book.getTitle() + " added to " + sectionName + " section");
        }
        // Todo: Implementasi method addBook yang menerima parameter Book
        // Method ini menambahkan book ke list books
        // Tampilkan pesan: "Book "[judul buku]" added to [nama section] section"
        
        public void removeBook(String title) {
            boolean found = false;
            for (int i = 0; i < books.size(); i++) {
                if (books.get(i).getTitle().equalsIgnoreCase(title)) {
                    Book removedBook = books.remove(i);
                    System.out.println("Book " + title + " removed form " + sectionName + " section");
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Book " + title + " not found in " + sectionName + " section");
            }
        }
        // Todo: Implementasi method removeBook yang menerima parameter String title
        // Method ini menghapus buku berdasarkan judul dari list books
        // Gunakan looping untuk mencari buku dengan judul yang sesuai (case-insensitive)
        // Jika ditemukan:
        // - Hapus buku dari list
        // - Tampilkan: "Book "[title]" removed from [nama section] section"
        // Jika tidak ditemukan:
        // - Tampilkan: "Book "[title]" not found in [nama section] section"
        public void displayBooks() {
            if (books.isEmpty()) {
                System.out.println("No books in this section");
            } else {
                for (Book book : books) {
                    System.out.println(book.getDetails());
                }
            }
        }
        // Todo: Implementasi method displayBooks tanpa parameter
        // Jika books kosong, tampilkan: "No books in this section"
        // Jika ada buku, tampilkan detail setiap buku
        public String getSectionName() {
            return sectionName;
        }
        // Todo: Implementasi getter getSectionName() yang mengembalikan sectionName
        public List<Book> getBooks() {
            return books;
        }
        // Todo: Implementasi getter getBooks() yang mengembalikan books

        // Non-static Inner Class - Book
        public class Book {
            private String title;
            private String author;
            private boolean isAvailable;
            private String borrowedBy;
            // Todo: Buat atribut:
            // - title (String)
            // - author (String)
            // - isAvailable (boolean)
            // - borrowedBy (String)

            public Book(String title, String author) {
                this.title = title;
                this.author = author;
                this.isAvailable = true;
                this.borrowedBy = null;
                // Todo: Implementasi konstruktor
                // Inisialisasi title dan author dengan parameter
                // Set isAvailable = true
                // Set borrowedBy = null
            }
            public void borrowBook(String memberName) {
                if (!isAvailable) {
                    System.out.println("Error: Book " + title + " is already borrowed by " + borrowedBy);
                } else {
                    isAvailable = false;
                    borrowedBy = memberName;
                    System.out.println("Book " + title + " is now borrowed by " + memberName);
                }
            }
            // Todo: Implementasi method borrowBook yang menerima parameter String memberName
            // Jika buku sudah dipinjam (!isAvailable):
            // - Tampilkan: "Error: Book "[title]" is already borrowed by [borrowedBy]"
            public void returnBook() {
                if (isAvailable) {
                    System.out.println("Error: Book " + title + " is not currently borrowed");
                } else {
                    System.out.println("Book " + title + " returned by " + borrowedBy);
                    isAvailable = true;
                    borrowedBy = null;
                }
            }
            // Jika tersedia:
            // - Set isAvailable = false
            // - Set borrowedBy = memberName
            // - Tampilkan: "Book "[title]" is now borrowed by [memberName]"
            // Todo: Implementasi method returnBook tanpa parameter
            // Jika buku sedang tidak dipinjam (isAvailable):
            // - Tampilkan: "Error: Book "[title]" is not currently borrowed"
            
            // Jika sedang dipinjam:
            // - Tampilkan: "Book "[title]" returned by [borrowedBy]"
            // - Set isAvailable = true
            // - Set borrowedBy = null
            public String getDetails() {
                String status;
                if (isAvailable) {
                    status = "Available";
                } else {
                    status = "Borrowed by " + borrowedBy;
                }
                return "Book \"" + title + "\" by " + author + " [" + status + "] - Section: " + sectionName;
            }
            // Todo: Implementasi method getDetails() yang mengembalikan String
            // Buat variabel status:
            // - Jika isAvailable = true, status = "Available"
            // - Jika isAvailable = false, status = "Borrowed by [borrowedBy]"
            // Return format: "Book "[title]" by [author] [[status]] - Section: [sectionName]"
            // Note: Book dapat mengakses sectionName dari enclosing class Section
            public String getTitle() {
                return title;
            }
            // Todo: Implementasi getter getTitle() yang mengembalikan title
            public String getAuthor() {
                return author;
            }
            // Todo: Implementasi getter getAuthor() yang mengembalikan author
            public boolean isAvailable() {
                return isAvailable;
            }
            // Todo: Implementasi getter isAvailable() yang mengembalikan isAvailable
        }
    }

    public static class Member {
        private String name;
        private List<Section.Book> borrowedBooks;
        private int maxBorrowLimit;
        // Todo: Buat atribut:
        // - name (String)
        // - borrowedBooks (List<Section.Book>)
        // - maxBorrowLimit (int)

        public Member(String name, int maxBorrowLimit) {
            this.name = name;
            this.maxBorrowLimit = maxBorrowLimit;
            this.borrowedBooks = new ArrayList<>();
            // Todo: Implementasi konstruktor
            // Inisialisasi name dan maxBorrowLimit dengan parameter
            // Inisialisasi borrowedBooks sebagai ArrayList kosong
        }

        public boolean canBorrow() {
            return borrowedBooks.size() < maxBorrowLimit;
        }
        // Todo: Implementasi method canBorrow() yang mengembalikan boolean
        // Return true jika jumlah borrowedBooks < maxBorrowLimit
        // Return false jika sudah mencapai limit

        public void borrowBook(Section.Book book) {
            if (!canBorrow()) {
                System.out.println("Error: " + name + " has reached the borrow limit of " + maxBorrowLimit + " books");
            } else if (!book.isAvailable()) {
                System.out.println("Error: Book \"" + book.getTitle() + "\" is not available");
            } else {
                book.borrowBook(name);
                borrowedBooks.add(book);
            }
        }
        // Todo: Implementasi method borrowBook yang menerima parameter Section.Book book
        // Jika member tidak bisa meminjam lagi (!canBorrow()):
        // - Tampilkan: "Error: [name] has reached the borrow limit of [maxBorrowLimit] books"
        
        // Jika buku tidak tersedia (!book.isAvailable()):
        // - Tampilkan: "Error: Book "[judul buku]" is not available"
      
        // Jika bisa meminjam:
        // - Panggil book.borrowBook(name)
        // - Tambahkan book ke borrowedBooks
        public void returnBook(Section.Book book) {
             if (borrowedBooks.contains(book)) {
                book.returnBook();
                borrowedBooks.remove(book);
            } else {
                System.out.println("Error: " + name + " has not borrowed \"" + book.getTitle() + "\"");
            }
        }
        // Todo: Implementasi method returnBook yang menerima parameter Section.Book book
        // Jika book ada di borrowedBooks:
        // - Panggil book.returnBook()
        // - Hapus book dari borrowedBooks
        // Jika book tidak ada di borrowedBooks:
        // - Tampilkan: "Error: [name] has not borrowed "[judul buku]""
        
        public void displayBorrowedBooks() {
            System.out.println(name + "'s Borrowed Books (" + borrowedBooks.size() + "/" + maxBorrowLimit + "):");
                if (borrowedBooks.isEmpty()) {
                System.out.println("No books currently borrowed");
                } else {
                for (Section.Book book : borrowedBooks) {
                    System.out.println("  - " + book.getTitle() + " by " + book.getAuthor());
                    }
                }
            }   
        }
        // Todo: Implementasi method displayBorrowedBooks tanpa parameter
        // Tampilkan: "[name]'s Borrowed Books ([jumlah borrowed]/[maxBorrowLimit]):"
        // Jika borrowedBooks kosong:
        // - Tampilkan: "No books currently borrowed"
        // Jika ada buku yang dipinjam:
        // - Untuk setiap buku, tampilkan: "  - [title] by [author]"
}
