package Chapter2._0_OOP.IntroToOOP;
/*
What we want is for our objects to be able to a) contain some data and b) change its behavior based off of the data that
it individually contains. This way, we could maintain many birds which individually contain their own
age, and can generate their own sound. This concept of owning data is encapsulation: oftentimes
encapsulation is reductively defined as "having access modifiers" but this is a very shallow understanding.

Let's say that an individual bird returns "Tweet" if ageMonths is less than 3 and "Chirp" if ageMonths is
greater than or equal to 3.
 */
public class Bird {
    private int ageMonths;

    public Bird(){

    }
    public String sound(){
        return "";
    }
}
