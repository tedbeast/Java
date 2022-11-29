package Chapter5.MiniProject.Mini_Project_5_Library.main.Controller;

import Chapter5.MiniProject.Mini_Project_5_Library.main.Model.Author;
import Chapter5.MiniProject.Mini_Project_5_Library.main.Model.Book;
import Chapter5.MiniProject.Mini_Project_5_Library.main.Service.AuthorService;
import Chapter5.MiniProject.Mini_Project_5_Library.main.Service.BookService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.javalin.Javalin;
import io.javalin.http.Context;

import java.util.List;
/**
 * There is no need to modify anything in this class. This class will create a Javalin API with endpoints when the
 * startAPI method is called.
 *
 *  You can interact with the Javalin controller by
 *  a) for GET requests, navigating to the endpoint in your web browser (eg localhost:8080/books)
 *  b) for GET requests, using the CURL command in your terminal (eg curl localhost:8080/books). you can use post,
 *     but it's difficult to format within CURL.
 *  c) using the desktop version of Postman for any type of request. Be sure to set the request type to the intended
 *     one (GET/POST/PUT/DELETE), and to properly format the body (setting the body content type to raw JSON).
 *
 *  The included endpoints:
 *
 *  GET localhost:8080/books : retrieve all books
 *
 *  POST localhost:8080/books : post a new book. a new book should be contained in the body of the request as a
 *  JSON representation. example:
 *      {
 *          "isbn":1234,
 *          "author_id":1,
 *          "title":"my favorite book",
 *          "copies_available":1
 *      }
 *
 *  GET localhost:8080/books/available : retrieve all books with a copies_available of at least 1
 *
 *  GET localhost:8080/authors : retrieve all authors
 *
 *  POST localhost:8080/authors : post a new author. a new author should be contained in the body of the request as a
 *  JSON representation. example:
 *      {
 *          "id":1,
 *          "name":"mrs writer"
 *      }
 */
public class LibraryController {
    BookService bookService;
    AuthorService authorService;
    /**
     * Method defines the structure of the Javalin Library API. Javalin methods will use handler methods
     * to manipulate the Context object, which is a special object provided by Javalin which contains information about
     * HTTP requests and can generate responses.
     */
    public void startAPI(){
        Javalin app = Javalin.create();
        app.get("/books", this::getAllBooksHandler);
        app.post("/books", this::postBookHandler);
        app.get("/authors", this::getAllAuthorsHandler);
        app.post("/authors", this::postAuthorHandler);
        app.get("/books/available", this::getAvailableBooksHandler);
        app.start(8080);
    }

    /**
     * handler to post a new author.
     * The Jackson ObjectMapper will automatically convert the JSON of the POST request into an Author object.
     * If AuthorService returns a null author (meaning posting an Author was unsuccessful), the API will return a 400
     * message (client error).
     * @param ctx the context object handles information HTTP requests and generates responses within Javalin. It will
     *            be available to this method automatically thanks to the app.post method.
     * @throws JsonProcessingException will be thrown if there is an issue converting JSON into an object.
     */
    private void postAuthorHandler(Context ctx) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        Author author = mapper.readValue(ctx.body(), Author.class);
        if(authorService.addAuthor(author)!=null){
            ctx.json(author);
        }else{
            ctx.status(400);
        }
    }
    /**
     * handler to retrieve all authors.
     * @param ctx the context object handles information HTTP requests and generates responses within Javalin. It will
     *            be available to this method automatically thanks to the app.put method.
     */
    private void getAllAuthorsHandler(Context ctx) {
        List<Author> authors = authorService.getAllAuthors();
        ctx.json(authors);
    }
    /**
     * handler to post a new book.
     * The Jackson ObjectMapper will automatically convert the JSON of the POST request into a Book object.
     * If BookService returns a null book (meaning posting a Book was unsuccessful), the API will return a 400
     * message (client error).
     * @param ctx the context object handles information HTTP requests and generates responses within Javalin. It will
     *            be available to this method automatically thanks to the app.post method.
     * @throws JsonProcessingException will be thrown if there is an issue converting JSON into an object.
     */
    private void postBookHandler(Context ctx) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        Book book = mapper.readValue(ctx.body(), Book.class);
        if(bookService.addBook(book)!=null){
            ctx.json(book);
        }else{
            ctx.status(400);
        }
    }
    /**
     * handler to retrieve all books.
     * @param ctx the context object handles information HTTP requests and generates responses within Javalin. It will
     *            be available to this method automatically thanks to the app.put method.
     */
    public void getAllBooksHandler(Context ctx){
        List<Book> books = bookService.getAllBooks();
        ctx.json(books);
    }
    /**
     * handler to retrieve all books with a book count over zero.
     * @param context the context object handles information HTTP requests and generates responses within Javalin.
     *                It will be available to this method automatically thanks to the app.put method.
     */
    private void getAvailableBooksHandler(Context context) {
        context.json(bookService.getAllAvailableBooks());
    }
}
