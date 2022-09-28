package Chapter5._0_OOP.Generic;

/*
T here is a generic type.  Meaning, it can stand in for any kind of object.
Here, our objective is to have an object that can store anything inside of itself, and then retrieve it.
This doesn't seem useful yet, but in a real data structure such as ArrayList, you could have a generic
array that can store and retrieve many items of whatever type.
 */
public class GenericExercise<T> {
    T data;
    public void loadGenericItem(T in){

    }
    public T returnGenericItem(){
        return null;
    }
}
