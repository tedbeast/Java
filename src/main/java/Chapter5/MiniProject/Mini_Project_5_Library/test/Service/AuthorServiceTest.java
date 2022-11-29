package Chapter5.MiniProject.Mini_Project_5_Library.test.Service;

import Chapter5.MiniProject.Mini_Project_5_Library.main.DAO.AuthorDAO;
import Chapter5.MiniProject.Mini_Project_5_Library.main.Model.Author;
import Chapter5.MiniProject.Mini_Project_5_Library.main.Service.AuthorService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

public class AuthorServiceTest {
    public AuthorService authorService;
    public AuthorDAO mockAuthorDAO;
    /**
     * Before every test, set up an AuthorService that uses an AuthorDAO with fake behavior.
     * The actual behavior of AuthorDAO does not impact these tests: we define the mockAuthorDAO's behavior
     * using Mockito and thereby test the logic of the AuthorService independently.
     * This allows you to code the AuthorService before the AuthorDAO is even finished!
     */
    @Before
    public void setUp(){
        mockAuthorDAO = Mockito.mock(AuthorDAO.class);
        authorService = new AuthorService(mockAuthorDAO);
    }

    /**
     * When getAllAuthors is called, getAllAuthors should return all the authors retrieved from the mockAuthorDAO.
     */
    @Test
    public void getAllAuthorsTest(){
        List<Author> authors = new ArrayList<>();
        Author a1 = new Author(1, "James Joyce");
        Author a2 = new Author(2, "Leo Tolstoy");
        authors.add(a1);
        authors.add(a2);
        Mockito.when(mockAuthorDAO.getAllAuthors()).thenReturn(authors);
        List<Author> returnedAuthors = authorService.getAllAuthors();
        Assert.assertTrue(returnedAuthors.contains(a1));
        Assert.assertTrue(returnedAuthors.contains(a2));
    }

    /**
     * When addAuthor is called and the mockAuthorDAO does not yet contain some author, the method should return
     * the added author, and the insertAuthor method of authorDAO should have been called at some point.
     */
    @Test
    public void addAuthorOnSuccessfulAdd(){
        List<Author> authors = new ArrayList<>();
        Author a1 = new Author(1, "James Joyce");
        Author a2 = new Author(2, "Leo Tolstoy");
        Author a3 = new Author(2, "Stanislaw Lem");
        authors.add(a1);
        authors.add(a2);
        Mockito.when(mockAuthorDAO.getAllAuthors()).thenReturn(authors);
        Mockito.when(mockAuthorDAO.getAuthorById(1)).thenReturn(null);
        Assert.assertEquals(a3, authorService.addAuthor(a3));
        Mockito.verify(mockAuthorDAO).insertAuthor(a3);
    }

    /**
     * When addAuthor is called and the mockAuthorDAO already contains the author, the method should return null
     * and the insertAuthor method of authorDAO should not have been called.
     */
    @Test
    public void addAuthorReturnNullOnUnsuccessfulAdd(){
        List<Author> authors = new ArrayList<>();
        Author a1 = new Author(1, "James Joyce");
        authors.add(a1);
        Mockito.when(mockAuthorDAO.getAllAuthors()).thenReturn(authors);
        Mockito.when(mockAuthorDAO.getAuthorById(1)).thenReturn(a1);
        Assert.assertEquals(null, authorService.addAuthor(a1));
        Mockito.verify(mockAuthorDAO, Mockito.never()).insertAuthor(a1);
    }
}
