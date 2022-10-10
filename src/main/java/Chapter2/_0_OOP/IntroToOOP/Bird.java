package Chapter2._0_OOP.IntroToOOP;

/**
 * What would like objects to be able to do
 *      a) contain some data
 *      and
 *      b) change its behavior based off of the data that it individually contains.
 * Let's say we're working on a birdwatching app.
 * Using OOP, we could maintain many birds which individually contain their own
 * age, and can generate their own sound. This concept of an object controlling its own data can be
 * referred to as encapsulation.
 *
 * Let's say that an individual bird returns "Tweet" if ageMonths is less than 3 and "Chirp" if ageMonths is
 * greater than or equal to 3.
 */
public class Bird {
    /**
     * A variable (in this context, often referred to as a field), which represents the age of the bird.
     */
    public int ageMonths;

    /**
     * A constructor for the bird class: this method allows us to build a new bird with the 'new' keyword.
     * No need to change anything here, for now.
     */
    public Bird(){

    }
    /**
     * @return "Tweet" if ageMonths is less than 3 and "Chirp" if ageMonths is
     *  * greater than or equal to 3.
     */
    public String sound(){
        return "";
    }

}
