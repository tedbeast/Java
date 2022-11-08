package Chapter3.MiniProject.Dictionary.main;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.javalin.*;
import io.javalin.http.Context;

/**
 *      * You can interact with the Javalin controller by
 *      * a) for GET requests, navigating to the endpoint in your web browser (eg localhost:8080/groceries)
 *      * b) for GET requests, using CURL (eg curl localhost:8080/entries). you can use post, but it's difficult to format
 *      * c) use the desktop version of Postman for any type of request
 */
public class DictionaryAPI {
    DictionaryService dictionaryService;
    public DictionaryAPI(){
        dictionaryService = new DictionaryService();
    }
    public void runAPI(){
//        create a javalin app and set it to wait and listen on localhost:8080.
        Javalin app = Javalin.create();
        app.start(8080);
//        notice that we are using get, post, and delete here in almost identical ways. these are http methods.
//        http methods allow us to define specific actions to be performed, and allow requests to be self-descriptive.
//        this::method is a way for us to pass a method as a parameter.
        app.get("/entries", this::getWordsHandler);
        app.post("/entries", this::postWordHandler);
        app.get("/entries/{word}", this::getSingleWordHandler);
    }

    /**
     * This will be referred to as a handler method. It 'handles' a request using data recieved from Context ctx, which
     * is passed in by the calling app.get.
     *
     * It will call ctx.json at the end, which will produce a json response that will contain the result of
     * getAllGroceries, or, a List<String> converted to JSON. JSON, or javascript object
     * notation, is a useful format for transporting data over the web.
     *
     * @param ctx contains data about the request, such as the body, and any parameters or headers used.
     */
    public void getWordsHandler(Context ctx){
        ctx.json(dictionaryService.getAllEntries());
    }

    /**
     * Like the previous handler, we will be using ctx. This time we will be using it to also retrieve some information
     * about the HTTP request body, which will contain a String that represents the grocery to be added.
     *
     * @param ctx contains data about the request, such as the body, and any parameters or headers used.
     */
    public void postWordHandler(Context ctx) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        DictionaryEntry entry = objectMapper.readValue(ctx.body(), DictionaryEntry.class);
        dictionaryService.addEntry(entry);
    }
    /**
     * This will be referred to as a handler method. It 'handles' a request using data recieved from Context ctx, which
     * is passed in by the calling app.get.
     *
     * It will call ctx.json at the end, which will produce a json response that will contain the result of
     * getAllGroceries, or, a List<String> converted to JSON. JSON, or javascript object
     * notation, is a useful format for transporting data over the web.
     *
     * @param ctx contains data about the request, such as the body, and any parameters or headers used.
     */
    public void getSingleWordHandler(Context ctx){
        ctx.json(dictionaryService.getEntry(ctx.pathParam("name")));
    }

}
