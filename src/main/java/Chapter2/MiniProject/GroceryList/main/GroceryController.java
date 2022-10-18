package Chapter2.MiniProject.GroceryList.main;

import com.fasterxml.jackson.core.JsonProcessingException;
import io.javalin.Javalin;
import io.javalin.http.Context;

/**
 * There is no need to modify anything in this class. The purpose of the class is to familiarize you with the creation
 * of a Javalin web API.
 *
 * This class represents the API portion of the GroceryList app. API is an application programming interface - that
 * means it is a tool that programs can easily interpret to leverage in their own operations. In this case, another
 * program, such as a front-end for a website, may consume the data provided by this API over the web via HTTP.
 *
 * You can interact with the Javalin controller:
 * a) for GET requests, navigating to the endpoint in your web browser (eg localhost:8080/groceries)
 * b) for GET requests, using CURL (eg curl localhost:8080/groceries). you can use POST too, but it's difficult to
 * format
 * c) use the desktop version of Postman for any type of request, which will allow you to easily make a POST and write
 * a raw JSON body, too. POST request bodies should be formatted as raw JSON. Because this challenge only requires
 * us to deserialize a String, all you need to write in the request body is the name of the grocery.
 */
public class GroceryController {
    GroceryService groceryService;
    public void runAPI(){
        groceryService = new GroceryService();
//        create a javalin app and set it to wait and listen on localhost:8080.
        Javalin app = Javalin.create();
        app.start(8080);
//        notice that we are using get, post, and delete here in almost identical ways. these are http methods.
//        http methods allow us to define specific actions to be performed, and allow requests to be self-descriptive.
//        this::method is a way for us to pass a method as a parameter.
        app.get("/groceries", this::getGroceriesHandler);
        app.post("/groceries", this::postGroceriesHandler);
        app.delete("/groceries", this::clearGroceriesHandler);
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
    public void getGroceriesHandler(Context ctx){
        ctx.json(groceryService.getAllGroceries());
    }

    /**
     * Like the previous handler, we will be using ctx. This time we will be using it to also retrieve some information
     * about the HTTP request body, which will contain a String that represents the grocery to be added.
     *
     * @param ctx contains data about the request, such as the body, and any parameters or headers used.
     */
    public void postGroceriesHandler(Context ctx) throws JsonProcessingException {
//        because we are just deserializing a single string, no need to introduce any fancy object mapping. can
//        just use the body directly.
        groceryService.addItem(ctx.body());
        ctx.json("abc");
    }

    /**
     * Like the previous handlers, we will be using ctx. This time, the handler is rather simple. Its only task is
     * to call the Service method that will delete all of the groceries. There isn't anything very useful the
     * API could send back as a respoonse, so it will not be using ctx.json and will respond with nothing.
     *
     * @param ctx contains data about the request, such as the body, and any parameters or headers used.
     */
    public void clearGroceriesHandler(Context ctx){

    }
}
/*

 */