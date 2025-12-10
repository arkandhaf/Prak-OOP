public class Electronic implements Product {
    private String name;
    private double price;
    private int warrantyMonths;
    // private String name;
    // private double price;
    // private int warrantyMonths;

    /* 
     * TODO: Lengkapi implementasi konstruktor Electronic 
     * Semua attribut diinisialisasi melalui konstruktor
    */
    public Electronic(String name, double price, int warrantyMonths) {
        this.name = name;
        this.price = price;
        this.warrantyMonths = warrantyMonths;
        // TODO: Lengkapi implementasi konstruktor ini
    }

    /*
     * TODO: Lengkapi implementasi method getPrice
     * Method ini mengembalikan nilai price dari produk elektronik
     */
    @Override
    public double getPrice() {
        return price;
        // TODO: Lengkapi implementasi method ini
    }

    /*
     * TODO: Lengkapi implementasi method getName
     * Method ini mengembalikan nilai name dari produk elektronik
     */
    @Override
    public String getName() {
        return name;
        // TODO: Lengkapi implementasi method ini
    }

    /*
     * TODO: Lengkapi implementasi method getWarrantyMonths
     * Method ini mengembalikan nilai warrantyMonths dari produk elektronik
     */
    public int getWarrantyMonths() {
        return warrantyMonths;
        // TODO: Lengkapi implementasi method ini
    }

    /*
     * TODO: Lengkapi implementasi method toString
     * Method ini mengembalikan representasi string dari produk elektronik
     * Format: "<name> - Rp<price> (<warrantyMonths> months warranty)"
     */
    @Override
    public String toString() {
        return name + " - Rp" + price + " (" + warrantyMonths + " months warranty)";

        // TODO: Lengkapi implementasi method ini
    }
}
