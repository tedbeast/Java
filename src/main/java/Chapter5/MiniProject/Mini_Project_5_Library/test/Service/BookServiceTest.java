package Chapter5.MiniProject.Mini_Project_5_Library.test.Service;

import Chapter5.MiniProject.Mini_Project_5_Library.main.DAO.BookDAO;
import Chapter5.MiniProject.Mini_Project_5_Library.main.Model.Book;
import Chapter5.MiniProject.Mini_Project_5_Library.main.Service.BookService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

public class BookServiceTest {
    BookService bookService;
    BookDAO mockBookDAO;

    /**
     * Before every test, set up a BookService that uses a BookDAO with fake behavior.
     * The actual behavior of BookDAO does not impact these tests: we define the mockBookDAO's behavior
     * using Mockito and thereby test the logic of the AuthorService independently.
     * This allows you to code the AuthorService before the AuthorDAO is even finished!
     */
    @Before
    public void setUp(){
        mockBookDAO = Mockito.mock(BookDAO.class);
        bookService = new BookService(mockBookDAO);
    }

    /**
     * When getAllBooks is called, all books should be retrieved from the database using the BookDAO.
     */
    @Test
    public void getAllBooksTest1(){
        List<Book> bookList = new ArrayList<Book>();
        Book b1 = new Book(101, 1, "Ulysses", 2);
        Book b2 = new Book(102, 1, "Finnegan's Wake", 0);
        Book b3 = new Book(103, 2, "War and Peace", 1);
        bookList.add(b1);
        bookList.add(b2);
        bookList.add(b3);
        Mockito.when(mockBookDAO.getAllBooks()).thenReturn(bookList);
        List<Book> returnedBooks = bookService.getAllBooks();
        Assert.assertTrue(returnedBooks.contains(b1));
        Assert.assertTrue(returnedBooks.contains(b2));
        Assert.assertTrue(returnedBooks.contains(b3));
    }

    /**
     * When addBook is called and the mockBookDAO does not yet contain some author, the method should return
     * the added book, and the insertBook method of authorDAO should have been called at some point.
     */
    @Test
    public void addBookVerifyNotNullOnSuccessfulAddTest(){
        List<Book> bookList = new ArrayList<Book>();
        Book b1 = new Book(101, 1, "Ulysses", 2);
        Book b2 = new Book(102, 1, "Finnegan's Wake", 0);
        Book b3 = new Book(103, 2, "War and Peace", 1);
        Book b4 = new Book(103, 3, "Roadside Picnic", 1);
        bookList.add(b1);
        bookList.add(b2);
        bookList.add(b3);
        Mockito.when(mockBookDAO.getAllBooks()).thenReturn(bookList);
        Mockito.when(mockBookDAO.getBookByIsbn(104)).thenReturn(null);
        Assert.assertEquals(b4, bookService.addBook(b4));
        Mockito.verify(mockBookDAO).insertBook(b4);
    }
    /**
     * When addBook is called and the mockBookDAO already contains the author, the method should return null
     * and the insertBook method of BookDAO should not have been called.
     */
    @Test
    public void addBookVerifyNullOnUnsuccessfulAdd(){
        List<Book> bookList = new ArrayList<Book>();
        Book b1 = new Book(101, 1, "Ulysses", 2);
        Book b2 = new Book(102, 1, "Finnegan's Wake", 0);
        Book b3 = new Book(103, 2, "War and Peace", 1);
        bookList.add(b1);
        bookList.add(b2);
        bookList.add(b3);
        Mockito.when(mockBookDAO.getAllBooks()).thenReturn(bookList);
        Mockito.when(mockBookDAO.getBookByIsbn(103)).thenReturn(b3);
        Assert.assertEquals(null, bookService.addBook(b3));
        Mockito.verify(mockBookDAO, Mockito.never()).insertBook(b3);
    }

    /**
     * When getAllAvailableBooks is called, all books in the database with copies_available over 0 should be returned.
     */
    @Test
    public void getAllAvailableBooksTest(){
        List<Book> bookList = new ArrayList<>();
        List<Book> bookListOverZero = new ArrayList<>();
        Book b1 = new Book(101, 1, "Ulysses", 2);
        Book b2 = new Book(102, 1, "Finnegan's Wake", 0);
        Book b3 = new Book(103, 2, "War and Peace", 1);
        bookList.add(b1);
        bookList.add(b2);
        bookList.add(b3);
        bookListOverZero.add(b1);
        bookListOverZero.add(b3);
        Mockito.when(mockBookDAO.getAllBooks()).thenReturn(bookList);
        Mockito.when(mockBookDAO.getBooksWithBookCountOverZero()).thenReturn(bookListOverZero);
        List<Book> returnedBooks = bookService.getAllAvailableBooks();
        Assert.assertTrue(returnedBooks.contains(b1));
        Assert.assertTrue(returnedBooks.contains(b3));
        Assert.assertFalse(returnedBooks.contains(b2));
    }
}
