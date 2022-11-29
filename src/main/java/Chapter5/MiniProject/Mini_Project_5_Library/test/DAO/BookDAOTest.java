package Chapter5.MiniProject.Mini_Project_5_Library.test.DAO;

import Chapter5.MiniProject.Mini_Project_5_Library.main.Application;
import Chapter5.MiniProject.Mini_Project_5_Library.main.DAO.BookDAO;
import Chapter5.MiniProject.Mini_Project_5_Library.main.Model.Book;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
/**
 * This class will use the dummy data inserted in the Application.databaseSetup() method.
 * The Book table contains the following records:
 *      (100, 0, 'ficciones', 2),
 *      (101, 0, 'book of sand', 0),
 *      (102, 1, 'mr palomar', 1),
 *      (103, 1, 'invisible cities', 3),
 *      (104, 2, 'crying of lot 49', 0),
 *      (105, 2, 'mason and dixon', 0),
 *      (106, 3, 'understanding media', 1),
 *      (107, 4, 'critique of pure reason', 7)
 * For the purpose of DAO methods that require joins with the Author table, these are the records in Author:
 *      (0, 'jorge luis borges'),
 *      (1, 'italo calvino'),
 *      (2, 'thomas pynchon'),
 *      (3, 'marshall mcluhan'),
 *      (4, 'immanuel kant')
 */
public class BookDAOTest {
    BookDAO bookDAO;
    /**
     * Before every test, reset the database and re-instantiate a new BookDAO.
     */
    @Before
    public void setUp(){
        Application.databaseSetup();
        bookDAO = new BookDAO();
    }
    /**
     * getAllBooks should return all books.
     */
    @Test
    public void getAllBooksTest(){
        List<Book> books = bookDAO.getAllBooks();
    }
    /**
     * getBookByIsbn should return a Book object where the fields of the object (int isbn, int author_id,
     * String title, int copies_available) match the data in the database record.
     */
    @Test
    public void getBookByIsbnTest(){
        Book b1 = new Book(100, 0, "ficciones", 2);
        Book book = bookDAO.getBookByIsbn(100);
        Assert.assertEquals(b1, book);
    }
    /**
     * Inserting a book should make that book visible when getting all books.
     */
    @Test
    public void insertBookCheckWithGetAllTest(){
        Book b1 = new Book(108, 1,"cosmicomics", 1);
        bookDAO.insertBook(b1);
        List<Book> books = bookDAO.getAllBooks();
        Assert.assertTrue(books.contains(b1));
    }
    /**
     * Inserting a book should make the BookDAO able to retrieve it by its ISBN.
     */
    @Test
    public void insertBookCheckWithGetByIdTest(){
        Book b1 = new Book(108, 1,"cosmicomics", 1);
        bookDAO.insertBook(b1);
        Book book = bookDAO.getBookByIsbn(108);
        Assert.assertEquals(b1, book);
    }
    /**
     * Getting all available books should retrieve all books with copies_available over 0, but should not return
     * any other books.
     */
    @Test
    public void getBooksWithBookCountOverZeroTest(){
        Book b0 = new Book(100, 0, "ficciones", 2);
        Book b1 = new Book(102, 1, "mr palomar", 1);
        Book b2 = new Book(103, 1, "invisible cities", 3);
        Book b3 = new Book(106, 3, "understanding media", 1);
        Book b4 = new Book(107, 4, "critique of pure reason", 7);
        List<Book> availableBooks = bookDAO.getBooksWithBookCountOverZero();
        Assert.assertTrue(availableBooks.contains(b0));
        Assert.assertTrue(availableBooks.contains(b1));
        Assert.assertTrue(availableBooks.contains(b2));
        Assert.assertTrue(availableBooks.contains(b3));
        Assert.assertTrue(availableBooks.contains(b4));
        Assert.assertTrue(availableBooks.size()==5);
    }
}
