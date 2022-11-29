package Chapter5.MiniProject.Mini_Project_5_Library.main.Service;

import Chapter5.MiniProject.Mini_Project_5_Library.main.DAO.AuthorDAO;
import Chapter5.MiniProject.Mini_Project_5_Library.main.Model.Author;

import java.util.List;

/**
 * The purpose of a Service class is to contain "business logic" that sits between the web layer (controller) and
 * persistence layer (DAO). That means that the Service class performs tasks that aren't done through the web or
 * SQL: programming tasks like checking that the input is valid, conducting additional security checks, or saving the
 * actions undertaken by the API to a logging file.
 *
 * It's perfectly normal to have Service methods that only contain a single line that calls a DAO method. An
 * application that follows best practices will often have unnecessary code, but this makes the code more
 * readable and maintainable in the long run!
 */
public class AuthorService {
    private AuthorDAO authorDAO;
    /**
     * no-args constructor for creating a new AuthorService with a new AuthorDAO.
     * There is no need to change this constructor.
     */
    public AuthorService(){
        authorDAO = new AuthorDAO();
    }
    /**
     * Constructor for a AuthorService when a AuthorDAO is provided.
     * This is used for when a mock AuthorDAO that exhibits mock behavior is used in the test cases.
     * This would allow the testing of AuthorService independently of AuthorDAO.
     * There is no need to modify this constructor.
     * @param authorDAO
     */
    public AuthorService(AuthorDAO authorDAO){
        this.authorDAO = authorDAO;
    }
    /**
     * TODO: Use the AuthorDAO to retrieve all authors.
     * @return all authors
     */
    public List<Author> getAllAuthors() {
        return null;
    }
    /**
     * TODO: Use the AuthorDAO to persist an author.
     * Method should check if an author already exists before this is done.
     *
     * @param author an author object.
     * @return The persisted author if the persistence is successful, null if unsuccessful (eg if the author id already
     * exists in the database.)
     */
    public Author addAuthor(Author author) {
        return null;
    }
}
