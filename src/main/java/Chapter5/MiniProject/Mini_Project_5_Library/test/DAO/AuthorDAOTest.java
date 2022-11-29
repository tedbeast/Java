package Chapter5.MiniProject.Mini_Project_5_Library.test.DAO;

import Chapter5.MiniProject.Mini_Project_5_Library.main.Application;
import Chapter5.MiniProject.Mini_Project_5_Library.main.DAO.AuthorDAO;
import Chapter5.MiniProject.Mini_Project_5_Library.main.Model.Author;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * This class will use the dummy data inserted in the Application.databaseSetup() method.
 * It contains the following records:
 *      (0, 'jorge luis borges'),
 *      (1, 'italo calvino'),
 *      (2, 'thomas pynchon'),
 *      (3, 'marshall mcluhan'),
 *      (4, 'immanuel kant')
 */
public class AuthorDAOTest {
    AuthorDAO authorDAO;

    /**
     * Before every test, reset the database and re-instantiate a new AuthorDAO.
     */
    @Before
    public void setUp(){
        Application.databaseSetup();
        authorDAO = new AuthorDAO();
    }
    /**
     * getAllAuthors should return all authors.
     */
    @Test
    public void getAllAuthorsTest(){
        List<Author> authors = authorDAO.getAllAuthors();
        Author a0 = new Author(0, "jorge luis borges");
        Author a1 = new Author(1, "italo calvino");
        Author a2 = new Author(2, "thomas pynchon");
        Author a3 = new Author(3, "marshall mcluhan");
        Author a4 = new Author(4, "immanuel kant");
        Assert.assertTrue(authors.contains(a0));
        Assert.assertTrue(authors.contains(a1));
        Assert.assertTrue(authors.contains(a2));
        Assert.assertTrue(authors.contains(a3));
        Assert.assertTrue(authors.contains(a4));
    }
    /**
     * getAuthorById should return an Author object where the fields of the object (int id, String name) match the
     * data in the record.
     */
    @Test
    public void getAuthorByIdTest(){
        Author a1 = new Author(1, "italo calvino");
        Author author = authorDAO.getAuthorById(1);
        Assert.assertEquals(a1, author);
    }
    /**
     * Inserting an author should make that author visible when getting all authors.
     */
    @Test
    public void insertAuthorCheckWithGetAllTest(){
        Author a5 = new Author(5, "james joyce");
        authorDAO.insertAuthor(a5);
        List<Author> authors = authorDAO.getAllAuthors();
        Assert.assertTrue(authors.contains(a5));
    }
    /**
     * Inserting an author should make the AuthorDAO able to retrieve it by its ID.
     */
    @Test
    public void insertAuthorCheckWithGetByIdTest(){
        Author a5 = new Author(5, "james joyce");
        authorDAO.insertAuthor(a5);
        Author author = authorDAO.getAuthorById(5);
        Assert.assertEquals(a5, author);
    }
}
