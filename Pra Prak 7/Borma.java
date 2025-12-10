import java.util.ArrayList;
import java.util.List;

public class Borma {
    static List<Section<Product>> sections = new ArrayList<>();
    // static List<Section<Product>> sections = new ArrayList<>();

    /*
     * TODO: Lengkapi implementasi static-method addSection
     * Method ini akan menambahkan Section baru ke dalam list sections
     * Lakukan validasi agar sections memiliki section dengan nama yang unik
     * Jika Section dengan nama yang sama sudah ada, 
     * tampilkan pesan "Section already exists" dan tidak menambahkan Section baru
     */
    public static void addSection(String sectionName) { 
        for(Section<Product> section : sections) {
            if (section.getName().equals(sectionName)) {
                System.out.println("Section already exists");
                return;
            }
        }
        Section<Product> newSection = new Section<>(sectionName);
        sections.add(newSection);
        // TODO: Lengkapi implementasi method ini
    }

    /*
     * TODO: Lengkapi implementasi static-method removeSection
     * Method ini akan menghapus Section dari list sections berdasarkan nama section
     * Jika Section dengan nama tersebut tidak ditemukan,
     * tampilkan pesan "Section not found"
     */
    public static void removeSection(String sectionName) {
        Section<Product> sectionToRemove = null;

        // TODO: Lengkapi implementasi method ini
        for(Section<Product> section : sections) {
            if (section.getName().equals(sectionName)) {
                sectionToRemove = section;
                break;
            }
        }

        if (sectionToRemove != null) {
            sections.remove(sectionToRemove);
        } else {
            System.out.println("Section not found");
        }
    }    
    /*
     * TODO: Lengkapi implementasi static-method getSections
     * Method ini akan mengembalikan list sections
     */
    public static List<Section<Product>> getSections() {
        return sections;
        // TODO: Lengkapi implementasi method ini
    }

    /*
     * TODO: Lengkapi implementasi static-method addProductToSection
     * Method ini akan menambahkan Product ke dalam Section berdasarkan nama section
     * Jika Section dengan nama tersebut tidak ditemukan,
     * tampilkan pesan "Section not found"
     */
    public static void addProductToSection(Product product, String sectionName) {
        // TODO: Lengkapi implementasi method ini
        Section<Product> targetSection = null;

        for(Section<Product> section : sections) {
            if (section.getName().equals(sectionName)) {
                targetSection = section;
                break;
            }
        }
        if (targetSection != null) {
            targetSection.addProduct(product);
        } else {
            System.out.println("Section not found");
        }
    }

    /*
     * TODO: Lengkapi implementasi static-method removeProductFromSection
     * Method ini akan menghapus Product dari Section berdasarkan nama section
     * Jika Section dengan nama tersebut tidak ditemukan,
     * tampilkan pesan "Section not found"
     */
    public static void removeProductFromSection(Product product, String sectionName) {

        Section<Product> targetSection = null;

        for(Section<Product> section : sections) {
            if(section.getName().equals(sectionName)) {
                targetSection = section;
                break;
            }
        }
        // TODO: Lengkapi implementasi method ini
        if (targetSection != null) {
            targetSection.removeProduct(product);
        } else {
            System.out.println("Section not found");
        }
    }

    /*
     * TODO: Lengkapi implementasi static-method showTotalValue
     * Method ini akan menampilkan total nilai dari semua Section
     * Format tampilan: "Total value of all sections: Rp<total_value>"
     */
    public static void showTotalValue() {
        // TODO: Lengkapi implementasi method ini
        double Total = 0.0;

        for(Section<Product> section : sections) {
            Total += section.getTotalValue();
        }
        System.out.println("Total value of all sections: Rp" + Total);
    }
}
