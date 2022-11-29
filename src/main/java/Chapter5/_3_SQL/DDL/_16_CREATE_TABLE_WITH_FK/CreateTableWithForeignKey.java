package Chapter5._3_SQL.DDL._16_CREATE_TABLE_WITH_FK;


import Util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * We know how to create tables but we don't know how to relate tables to one another. This is a crucial part of relational databases.
 *
 * We can relate tables together by utilizing foreign keys.
 *
 * A foreign key is a column in one table that refers to the primary key in another table.
 *
 * For example lets say we have the "artists" table below:
 *      artists table:
 *      |    id    |        artist_name     |
 *      -------------------------------------
 *      |1         |'Beatles'               |
 *      |2         |'Eagles'                |
 *      |3         |'Led Zeppelin'          |
 *
 * Now lets say we want a songs table.
 *      songs table:
 *      |    id    |        song_name       |
 *      -------------------------------------
 *      |1         |'Let it be'             |
 *      |2         |'Imagine'               |
 *      |3         |'Kashmir'               |
 *
 *
 * Currently, the songs table has no reference to the artist that made the song. To make that reference we are going to want to use a foreign key.
 * The songs table with a foreign key would look like the table below
 *
 *      songs table with fk:
 *      |    id    |        song_name       |   artist_fk   |
 *      -----------------------------------------------------
 *      |1         |'Let it be'             |1              |
 *      |2         |'Imagine'               |1              |
 *      |3         |'Kashmir'               |3              |
 *
 * The "artist_fk" column would reference the primary key of the "artist" table.
 *
 * If we try to input an "artist_fk" that isn't in the artist table, an exception will be thrown.
 *
 * the syntax for creating the songs table with an artist fk is as follows:
 * CREATE TABLE songs (
 *  id SERIAL PRIMARY KEY,
 *  song_name varchar(100),
 *  artist_fk int REFERENCES artists(id)
 * );
 *
 *
 * notice the constraint we add to the artist_fk. We are referencing the id column in the artist table.
 * This is how we create a foreign key.
 *
 * NOTE: Other flavors of SQL might have different syntax for this however for our labs, this is the syntax we will utilize
 *
 */
public class CreateTableWithForeignKey {


    /**
     * Assume the following table already exists:
     *       users table:
     *       |   id  |     firstname        |        lastname        |
     *       ----------------------------------------------------------
     *       |1      |'Steve'               |'Garcia'                |
     *       |2      |'Alexa'               |'Smith'                 |
     *       |3      |'Steve'               |'Jones'                 |
     *       |4      |'Brandon'             |'Smith'                 |
     *       |5      |'Adam'                |'Jones'                 |
     *
     * Background: We are creating a social media app. We need to create a posts table so a user can create a post on the timeline.
     * Assignment: create a "posts" table that has the following columns:
     *       posts table:
     *       |   id  |     post        |        user_fk         |
     *       ----------------------------------------------------
     *
     * Note: The post column will hold the content of the post and the user_fk column will be a foreign key to the users table.
     *
     */
    public void problem(){
        //Write SQL statement here
        String sql = "CHANGE ME";

        try {
            Connection connection = ConnectionUtil.getConnection();

            PreparedStatement ps = connection.prepareStatement(sql);

            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
