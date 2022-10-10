package Chapter3._1_OOP;

/**
 * This class contains two constructors, but currently the constructors have no behavior,
 * which causes the tests to fail.
 *
 * The first constructor should take in a player's name, and set the Player object's playerName to the parameter.
 * Considerusing the 'this' keyword do this. Since a level is not provided, the constructor should also
 * set the player's level to 1 by default.
 *
 * The second constructor will use a player's name and level to set the Player object's respective field.
 **/
public class Player {
    public String playerName;
    public int level;

    /**
     * this.playerName should be set to playerName.
     *
     * Constructor should assign the object's playername using this.playername to refer to the playerName at the top of
     * the class rather than the playerName in the parameter of this method.
     *
     * @param playerName the name of the player to be created.
     */
    public Player(String playerName){

    }

    /**
     * Again, the values of this object should be set with the help of the this keyword to avoid confusion between
     * class fields / parameter variables.
     *
     * this.playerName should be set to playerName. this.level should be set to level.
     *
     * You may notice that this constructor has the same name as the first constructor. This is allowed, so long as
     * Java is able to differentiate between the constructors using different parameter types. This is referred to as
     * constructor overloading.
     *
     * @param playerName the name of the player to be created.
     * @param level the starting level of the player to be created.
     */
    public Player(String playerName, int level){

    }

}
