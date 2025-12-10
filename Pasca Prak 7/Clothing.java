/**
 * Clothing product type
 */
public class Clothing extends Product {
  private String size;

  public Clothing(String productId, String name, double weight, String size) {
    super(productId, name, weight);
    this.size = size;
    // TODO: Instantiate Objek
  }

  public String getSize() {
    return size;
    // TODO: return size
  }

  @Override
  public String getCategory() {
    return "Clothing";
  }

  @Override
  public String toString() {
    return super.toString() + String.format(" [Size: %s]", size);
  }
}
