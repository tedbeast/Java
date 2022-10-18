package Chapter4._0_OOP.Generic;

/**
 * T here is a generic type.  It can stand in for any kind of object.
 * Here, our objective is to have an object that can store any object in its 'data' field, and then retrieve it.
 * This doesn't seem useful yet, but in a real data structure such as ArrayList, you could have a generic
 * array that can store and retrieve many items of any type.
 * @param <T> a placeholder for any type of object.
 */
public class GenericExercise<T> {
    T data;

    /**
     * Set data to in.
     * @param in an Object that will be of type T at runtime.
     */
    public void loadGenericItem(T in){

    }
    /**
     * @return T data. The type of Data will again be set when the GenericExercise object is created (at runtime).
     */
    public T returnGenericItem(){
        return null;
    }
}
