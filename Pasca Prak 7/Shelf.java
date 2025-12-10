import java.util.ArrayList;
import java.util.List;

/**
 * Generic Shelf class that can hold containers of items extending type T
 * 
 * @param <T> the base type of items that containers on this shelf can hold
 */
public class Shelf<T> {
  private String shelfId;
  private List<Container<? extends T>> containers;
  private int maxContainers;

  public Shelf(String shelfId, int maxContainers) {
    this.shelfId = shelfId;
    this.maxContainers = maxContainers;
    containers = new ArrayList<Container<? extends T>>();
    // TODO: Instantiate Objek
  }

  /**
   * Adds a container to the shelf
   * Uses wildcard with upper bound to accept containers of T or any subtype of T
   * 
   * Hint:
   * - Check if the current number of containers is less than maxContainers before
   * adding.
   * - If there's space, add the container to the containers list and return true.
   * - If full, return false.
   * 
   * @param container the container to add
   * @return true if container was added, false if shelf is full
   */
  public boolean addContainer(Container<? extends T> container) {
    if (isFull()) {
      return false;
    } else {
      containers.add(container);
      return true;
    }
    // TODO: Implement
  }

  /**
   * Removes a container from the shelf
   * 
   * @param container the container to remove
   * @return true if removed, false otherwise
   */
  public boolean removeContainer(Container<? extends T> container) {
    return containers.remove(container);
    // TODO: Implement
  }

  /**
   * Gets all containers on the shelf
   * 
   * Hint:
   * - Return a new list containing all containers on the shelf.
   * 
   * @return list of containers
   */
  public List<Container<? extends T>> getContainers() {
    return containers;
    // TODO: Implement
  }

  /**
   * Checks if shelf is full
   * 
   * @return true if full, false otherwise
   */
  public boolean isFull() {
    if (containers.size() >= maxContainers) {
      return true;
    } else {
      return false;
    }
    // TODO: Implement
  }

  /**
   * Gets current number of containers
   * 
   * @return number of containers
   */
  public int getCurrentContainerCount() {
    return containers.size();
    // TODO: Implement
  }

  /**
   * Gets total number of items across all containers
   * 
   * @return total items
   */
  public int getTotalItems() {
    // TODO: Implement
    int total = 0;
    for(Container container : containers) {
      total +=  container.getItems().size();
    }
    return total;
  }

  public String getShelfId() {
    return shelfId;
    // TODO: Implement
  }

  public int getMaxContainers() {
    return maxContainers;
    // TODO: Implement
  }

  @Override
  public String toString() {
    return String.format("Shelf[%s] (%d/%d containers, %d total items)",
        shelfId, containers.size(), maxContainers, getTotalItems());
  }
}
