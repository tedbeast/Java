package Chapter7._0_DataStructuresAndAlgorithms.ArrayListImplementation;

public class ArrayListImplementation<T> {
    /**
     * This array contains generic data.
     * The field is private because an external class modifying the field directly could break the ArrayList's internal
     * logic.
     */
    private T[] data;
    /**
     * The logical - not the physical - size of data. How many items exist.
     * The field is private because an external class modifying the field directly could break the ArrayList's internal
     * logic.
     */
    private int size;

    /**
     * Initialize data to a new array of type T of a small size, like 1 or 2.
     * You will need to create an Array of Object and cast it to type T[].
     */
    public ArrayListImplementation(){

    }

    /**
     * First, check if data is capable of taking in more items
     * (if size == data.length).
     * If it's full, resize the array by creating a new generic array of length size*2,
     * and copy over all the items from the old data into the new data, and set data to the new array.
     * Add a new item at the current index of size, then increment size by 1.
     * @param item New item added to the ArrayList.
     */
    public void add(T item){

    }

    /**
     * Get the value at an index.
     * @param index index in data.
     * @return the value of data at index.
     */
    public T get(int index){
        return null;
    }

    /**
     * No need to change this method - it works and will be used in testing.
     * @return the size of the ArrayList.
     */
    public int size(){
        return size;
    }
}