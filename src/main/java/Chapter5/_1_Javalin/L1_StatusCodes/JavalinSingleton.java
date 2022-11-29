package Chapter5._1_Javalin.L1_StatusCodes;

import io.javalin.Javalin;

public class JavalinSingleton {

    public static Javalin getInstance(){
        Javalin app = Javalin.create();
        
        /**
         * Assignment: return the status code for a generic "client side error" in the http response
         */
        app.get("/client-side-err", ctx -> {
            ctx.status(400);

        });

        return app;
    }
    
}
