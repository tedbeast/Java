package Chapter9._1_DataStructuresAndAlgorithms.HashSetImplementation;
public class HashSetImplementation<T> {
    /**
     * The sparesely-populated array in which our data will be stored.
     */
    private T[] data;
    /**
     * the size of data - it should be very large as we want to minimize the risk of two objects trying to occupy
     * the same spot in data.
     */
    private int bucketSize;
    /**
     * the amount of items in HashSet.
     */
    private int size;

    /**
     * on the creation of a HashSet, we initialize a large sparsely populated array.
     */
    public HashSetImplementation(){
        bucketSize = 1000000;
        data = (T[]) new Object[bucketSize];
        size = 0;
    }

    /**
     * Find a position in which to place an object.
     *
     * All objects in java contain a method called hashcode, which can be used to generate a large number
     * that can be used to identify a specific object - in order to store that object into a sparsely populated array,
     * we could use hashcode % bucketsize to determine a random index that can be easily found later.
     *
     * Then, increment size.
     *
     * @param item an item to be added.
     */
    public void add(T item){

    }

    /**
     * You can use the exact same strategy as used in the add method to locate items within the set.
     *
     * @param item an item that may be in the hashSet already.
     * @return true if item is already contained in the set, false otherwise.
     */
    public boolean contains(T item){
        return false;
    }
    /**
     * No need to change this method, it works and will be used in testing.
     */
    public int size(){
        return size;
    }
}
