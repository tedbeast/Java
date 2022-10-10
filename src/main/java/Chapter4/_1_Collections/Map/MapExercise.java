package Chapter4._1_Collections.Map;

import java.util.Map;

/**
 * Maps are key/value pairs: for instance, a dictionary 'key' may be the word and the 'value' may be its definition.
 * They are useful when we want unique keys and potentially non-unique values.
 */
public class MapExercise {

    /**
     * @return a new Map instantiated using Integer keys and String values.
     * Like the other collections problems, Map alone is only an interface. Some common Map implementations are
     * HashMap and TreeMap. Also like the other collections, Map must leverage a wrapper class instead of a primitive,
     * so here Integer is a wrapper for int.
     */
    public Map<Integer, String> createMap(){
        return null;
    }

    /**
     * @param map a map to be manipulated.
     * @return the size of map. (number of key/value paris)
     */
    public int getSize(Map<Integer,String> map){
//        return total number of key/value pairs in the map
        return 0;
    }

    /**
     * insert a key value pair into a map.
     * @param map a map to be manipulated.
     * @param key the key of the new pair.
     * @param value the value of the new pair.
     * @return nothing, pass by reference will cause changes to the list object to be reflected across the program.
     */
    public void addKeyValuePair(Map<Integer,String> map, int key, String value){
    }

    /**
     * get a value in a map given a key.
     * @param map a map to be manipulated.
     * @param key the key corresponding to the value we will be retrieving.
     * @return the value associated with key in map.
     */
    public String getValueFromKey(Map<Integer, String> map, int key){
        return "";
    }

    /**
     * remove a key value pair from a map.
     * @param map a map to be manipulated.
     * @param key the key corresponding to the pair we will be deleting.
     * @return nothing, pass by reference will cause changes to the list object to be reflected across the program.
     */
    public void removeKeyValuePair(Map<Integer, String> map, int key){
    }

    /**
     * update the value related to a certain key.
     * @param map a map to be manipulated.
     * @param key the key corresponding to the pair we will be updating.
     * @param value the new value that should be associated with key.
     * @return nothing, pass by reference will cause changes to the list object to be reflected across the program.
     */
    public void overwriteValue(Map<Integer, String> map, int key, String value){

    }
}
