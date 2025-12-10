public class Food implements Product {
    private String name;
    private double price;
    private String expiryDate;
    // private String name;
    // private double price;
    // private String expiryDate;

    /*
     * TODO: Lengkapi implementasi konstruktor Food
     * Semua attribut diinisialisasi melalui konstruktor
     */
    public Food(String name, double price, String expiryDate) {
        this.name = name;
        this.price = price;
        this.expiryDate = expiryDate;
        // TODO: Lengkapi implementasi method ini
    }

    /*
     * TODO: Lengkapi implementasi method getPrice
     * Method ini mengembalikan nilai price dari produk makanan
     */
    @Override
    public double getPrice() {
        return price;
        // TODO: Lengkapi implementasi method ini
    }

    /*
     * TODO: Lengkapi implementasi method getName
     * Method ini mengembalikan nilai name dari produk makanan
     */
    @Override
    public String getName() {
        return name;
        // TODO: Lengkapi implementasi method ini
    }

    /*
     * TODO: Lengkapi implementasi method getExpiryDate
     * Method ini mengembalikan nilai expiryDate dari produk makanan
     */
    public String getExpiryDate() {
        return expiryDate;
        // TODO: Lengkapi implementasi method ini
    }

    /*
     * TODO: Lengkapi implementasi method toString
     * Method ini mengembalikan representasi string dari produk makanan
     * Format: "<name> - Rp<price> (exp: <expiryDate>)"
     */
    @Override
    public String toString() {
        return name + " - Rp" + price + " (exp: " + expiryDate + ")";
        // TODO: Lengkapi implementasi method ini
    }
}
