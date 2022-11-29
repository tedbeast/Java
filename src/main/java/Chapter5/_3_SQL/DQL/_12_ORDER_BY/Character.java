package Chapter5._3_SQL.DQL._12_ORDER_BY;

import java.util.Objects;

/**
 * This class defines a Character object. Objects of this class represent one row of a database table. The table
 * should be defined as follows to be compatible with these objects:
 *
 * CREATE TABLE characters (
 *      id SERIAL PRIMARY KEY,
 *      first_name VARCHAR(255),
 *      last_name VARCHAR(255)
 * );
 *
 */
public class Character {
    private Integer id;
    private String firstName;
    private String lastName;

    public Character(Integer id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Character(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Character() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Character character = (Character) o;
        return Objects.equals(id, character.id) && Objects.equals(firstName, character.firstName) && Objects.equals(lastName, character.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName);
    }

    @Override
    public String toString() {
        return "Character{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
