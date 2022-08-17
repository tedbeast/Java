package Chapter2._0_OOP.Encapsulation;
/*
Our first introduction to objects should be explaining why we use them, as although OOP is a common feature of many
programming languages, there is a reason to (or not to) use it.

Objects contain states (its own internal variables) and behavior (its methods). We write classes to define these
(classes are the blueprints for objects - classes are the files that we write, and objects are what's generated when
the program actually runs.)

Let's say we're working on a birdwatching application (to keep track of endangered wetlands species).
In this case, a Bird contains an int ageMonths variable and a sound() method.
In a language without objects (C, for instance), if we wanted to keep track of the ages of a lot of birds, we'd end
up creating an array like birdAges[]. This is all well and good, but let's say that our app will also
generate a different sound depending on the bird's age: alright, then we'd need to write a method for
generateBirdSound(birdAges[n]). This is referred to as 'functional programming' and it
works, but in a large application consisting of hundreds of program files, this
becomes cumbersome, and difficult to test and debug.

What we want is for our objects to be able to a) contain some data and b) change its behavior based off of the data that
it individually contains, so we would then maintain an array of Bird objects, which individually contains their own
age, and can generate their own sound. This concept of containing data is encapsulation: oftentimes
encapsulation is reductively defined as "having access modifiers" but this is a very shallow understanding.

Alright, let's say that an individual bird returns "Tweet" if ageMonths is less than 3 and "Chirp" if ageMonths is
greater than or equal to 3.
 */
public class Bird {
    int ageMonths;
    public String sound(){
        return "";
    }
}
