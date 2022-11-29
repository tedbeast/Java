package Chapter4._3_Javalin.L2_PathParameters;

import io.javalin.Javalin;

public class JavalinSingleton {

    public static Javalin getInstance(){
        Javalin app = Javalin.create();
        
        /**
         * Assignment: retrieve the variable "first" from the path parameter and send it in the response body. Produce
         * the response using:
         *      ctx.result(StringVariable);
         */
        app.get("/firstname/{first}", ctx -> {
            //write code here

        });


        return app;
    }
    
}
