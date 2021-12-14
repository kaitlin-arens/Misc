/**
 * MyStorage interface
 * 
 * @author Tim McGowen
 * @version version 1.0
 */
public interface MyStorage<T>
{
  /*
   * size - returns the size of the list
   * 
   * return - the size of the list as an integer
   */
  public int size();

  /*
   * add - add one value to the list in the next available position
   * 
   * param - integer to add to the list
   */
  public void add(T value);

  /*
   * get - return the value at the specified location in the list
   * 
   * param - index into the list for the value to return
   *
   * returns - value at parameter
   */
  public T get(int index);

  /*
   * clear - empty the list
   */
  public void clear();

  /*
   * toString - return a string value that represents the list
   *
   * return - String
   */
  public String toString();

  /*
   * set - set value at indicated index
   * 
   * param - index to set new value
   * param - value of new element
   */
  public void set(int index, T value);
  
  //public void test_method();
}
