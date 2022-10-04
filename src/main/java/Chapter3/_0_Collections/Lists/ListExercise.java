package Chapter3._0_Collections.Lists;

import java.util.List;

/**
 * Lists are ordered collections. This means that we could access elements at a certain position of a list,
 * and lists are also allowed to contain duplicate values.
 *
 * We will be using lists quite a bit to store values.
 */
public class ListExercise {
    /**
     * List<Integer> list = new List<>(); is not valid code.
     * Two interesting things here: First, List is actually an interface, not a class: its only ability is to define
     * potential behavior, but it does not provide implementation code.
     *
     * Second, the <Integer> portion represents a Generic. Generics allow an object to contain any object of a certain
     * type, so we can create a List that contains Integers, Strings, or even other Lists. Why do we use Integer and
     * not int? Generics can only contain Objects, and not primitives, so we Integer because it is a Wrapper class,
     * the Object form of a primitive.
     *
     * A popular implementation of List is ArrayList. Look up how to instantiate one.
     *
     * @return a List<Integer> object.
     */
    public List<Integer> createList(){
//        return a brand-new list that contains type Integer.
        return null;
    }

    /**
     * @param list a List<Integer> object.
     * @return the size of List (number of items it holds.)
     */
    public int getSize(List<Integer> list){
        return 0;
    }

    /**
     * When we add a value to a list, it gets appended to the end.
     *
     * @param list a List<Integer> object that we would like to modify.
     * @param value an integer that we would like to add to list.
     * @return nothing, pass by reference will cause changes to the list object to be reflected across the program.
     */
    public void addToList(List<Integer> list, int value){
    }

    /**
     * Lists, like arrays, are zero-indexed, so they start counting at zero. For instance,
     *      index 0 of {0,2,4,6} is 0.
     *      index 1 of {0,2,4,6} is 2.
     * Index is the same as saying the position, number, etc of a value.
     * Let's get the element from a list at a certain index.
     *
     * @param list a List<Integer> object that we would like to examine.
     * @param index represents the index of the element we would like to retrieve.
     * @return the int at the location in 'list' represented by 'index'.
     */
    public int get(List<Integer> list, int index){
        return 0;
    }

    /**
     * we can remove an item from the list, which will cause all items after it to reduce their index by 1 (they are
     * all still ordered, without any empty spaces in the list.)
     *
     * @param list a List<Integer> object that we would like to modify.
     * @param position represents the index of the element we would like to remove.
     * @return nothing, pass by reference will cause changes to the list object to be reflected across the program.
     */
    public void removeFromList(List<Integer> list, int position){

    }

    /**
     * We can update a value in the list, which will overwrite a value at a certain position.
     *
     * @param list a List<Integer> object that we would like to modify.
     * @param position represents the index of the element we would like to change.
     * @param value the new value which we would like to assign to the item at position in list
     * @return nothing, pass by reference will cause changes to the list object to be reflected across the program.
     */
    public void updateAtPosition(List<Integer> list, int position, int value){
    }
}