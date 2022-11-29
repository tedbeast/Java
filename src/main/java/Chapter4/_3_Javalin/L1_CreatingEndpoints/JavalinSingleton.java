package Chapter4._3_Javalin.L1_CreatingEndpoints;

import io.javalin.Javalin;

public class JavalinSingleton {

    
    /**
     * Lab: Create an HTTP GET endpoint at the url: http://localhost:9000/hello that will return the string "Hello
     * World" in the response.
     */
    public static Javalin getInstance(){
        Javalin app = Javalin.create();
        
        //write endpoint here



        return app;
    }
    
}
