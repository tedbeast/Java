package Chapter5._0_OOP.Generic;

public class GenericExersize <T> {
    T t;
    public T returnGeneric(){
        Object o = new Object();
        o = (T) o;
        return (T) o;
    }
}
