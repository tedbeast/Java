package Chapter2.MiniProject.GroceryList.main;


public class GroceryMain {
    /**
     * There is no need to change anything in this class or in GroceryController.
     * It does not affect the outcome of the test cases.
     *
     * You can interact with the Javalin controller by
     * a) for GET requests, navigating to the endpoint in your web browser (eg localhost:8080/groceries)
     * b) for GET requests, using CURL (eg curl localhost:8080/groceries). you can use post, but it's difficult to format
     * c) use the desktop version of Postman for any type of request
     */
    public static void main(String[] args) {
        GroceryController groceryController = new GroceryController();
        groceryController.runAPI();
    }
}
