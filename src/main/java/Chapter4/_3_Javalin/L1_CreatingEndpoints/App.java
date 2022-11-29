package Chapter4._3_Javalin.L1_CreatingEndpoints;

import io.javalin.Javalin;


public class App 
{
    /*
     * You could run this method to start the server, and then access it using the 'curl' command. For example, you can
     * type into a terminal the following command:
     *      curl localhost:9000/hello/
     * Before this endpoint will return any information to you request, you will need to write that logic in
     * JavalinSingleton.java
     */
    public static void main( String[] args )
    {
        Javalin app = JavalinSingleton.getInstance();

        app.start(9000);
    }
}
