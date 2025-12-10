import java.util.ArrayList;
import java.util.List;

/**
 * Generic Container class that can hold items of type T
 * 
 * @param <T> the type of items this container holds
 */
public class Container<T> {
  private String containerId;
  private List<T> items;
  private int maxCapacity;

  public Container(String containerId, int maxCapacity) {
    this.containerId = containerId;
    items = new ArrayList<T>(); 
    this.maxCapacity = maxCapacity;
    // TODO: Instantiate Objek
  }

  /**
   * Adds an item to the container
   * 
   * Hint:
   * - Check if the current size is less than maxCapacity before adding.
   * - If there's space, add the item to the items list and return true.
   * - If full, return false.
   * 
   * @param item the item to add
   * @return true if item was added successfully, false if container is full
   */
  public boolean addItem(T item) {
    if (items.size() >= maxCapacity) {
      return false;
    } else {
      items.add(item);
      return true;
    }
    // TODO: Implement
  }

  /**
   * Removes an item from the container
   * 
   * Hint:
   * - Attempt to remove the item from the items list.
   * - Return true if the item was present and removed, false otherwise.
   * 
   * @param item the item to remove
   * @return true if item was removed, false otherwise
   */
  public boolean removeItem(T item) {
    return items.remove(item);
    // TODO: Implement
  }

  /**
   * Gets all items in the container
   * 
   * Hint:
   * - Return a new list containing all items in the container.
   * 
   * @return list of items
   */
  public List<T> getItems() {
    return items;
    // TODO: Implement
  }

  /**
   * Checks if container is full
   * 
   * @return true if full, false otherwise
   */
  public boolean isFull() {
    // TODO: Implement
    if(items.size() >= maxCapacity) {
      return true;
    } else {
      return false;
    }
  }

  /**
   * Checks if container is empty
   * 
   * @return true if empty, false otherwise
   */
  public boolean isEmpty() {
    if (items.size() == 0) {
      return true;
    } else {
      return false;
    }
    // TODO: Implement
  }

  /**
   * Gets current number of items
   * 
   * @return number of items
   */
  public int getCurrentSize() {
    return items.size();
    // TODO: Implement
  }

  /**
   * Gets maximum capacity
   * 
   * @return max capacity
   */
  public int getMaxCapacity() {
    return maxCapacity;
    // TODO: Implement
  }

  /**
   * Gets container ID
   * 
   * @return container ID
   */
  public String getContainerId() {
    return containerId;
    // TODO: Implement
  }

  /**
   * Clears all items from container
   */
  public void clear() {
    items.clear();
    // TODO: Implement
  }

  @Override
  public String toString() {
    return String.format("Container[%s] (%d/%d items)", containerId, items.size(), maxCapacity);
  }
}
