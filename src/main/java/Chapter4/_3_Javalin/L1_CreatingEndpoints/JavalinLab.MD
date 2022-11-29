# Javalin Lab: Creating Endpoints
Javalin is a web framework for java. This allows other machines to send HTTP requests to the endpoints that we define 
with Javalin, and to send appropriate HTTP responses based on that specific Request. An endpoint is the pattern in 
the URL which directs our request to the appropriate code. For example:
    www.website.com/this/leads/to/some/code/in/our/app

## Parts of HTTP:
- **HTTP Request**
    - *An HTTP request is how a client computer sends a request to a server computer. This only works if that server 
      computer is set up to receive HTTP requests.*
    - HTTP Requests have 3 important components:
        - **Head**: stores meta-data regarding the request
        - **Body**: stores the important data that the client is trying to give the server
        - **HTTP Verb**: Describes what type of operation we want the server to do.
            - There are many HTTP verbs but let's look at the most common:
                - `GET`: retrieve records from our DB
                - `POST`: create new records in our DB
                - `PUT`: fully update records in our DB
                - `PATCH`: partially update records in our DB
                - `DELETE`: delete records from our DB
- **HTTP Response**
    - An HTTP response is what the server computer sends back to the client computer
    - HTTP Responses have 3 parts as well:
        - **Head**: stores meta-data regarding the response
        - **Body**: stores the important data that the server is trying to return to the client
        - **Status Code**: describes how successful the HTTP Request was
            - There are 5 categories of status code responses:
                - `100`: Request was informational
                - `200`: Request was successful
                - `300`: Request is being redirected
                - `400`: Request failed due to a client-side error
                - `500`: Request failed due to a server-side error

## Steps to Create Endpoints

### Step 1: Creating the Webserver
The first line to any Javalin app is as follows: 
```java
public static void main(String[] args){
    Javalin app = Javalin.create();
    app.start(9000);
}
```

Note: the number 9000 above represents the port that our web application will be running on. This is the port that we will need to send HTTP requests to.


### Step 2: Defining Endpoints
Now that we have a webserver that continuously runs, we need to define endpoints that users and other applications 
can send HTTP Requests to.

The syntax for creating an endpoint is as follows:
```java
public static void main(String[] args){
    Javalin app = Javalin.create();
    app.start(9000);

    // HTTP GET REQUEST to http://localhost:9000/get-request
    app.get("/get-request", ctx -> {
        //logic to be executed when this endpoint is hit
    });


    // HTTP POST REQUEST to http://localhost:9000/post-request
    app.post("/post-request", ctx -> {
        //logic to be executed when this endpoint is hit
    });
}
```

### Step 3: Returning Text
Notice the `ctx` variable. We can utilize this variable to send back data in HTTP response.

```java
public static void main(String[] args){
    Javalin app = Javalin.create().start(9000);

    // HTTP GET REQUEST to http://localhost:9000/get-request
    app.get("/get-request", ctx -> {
        //logic to be executed when this endpoint is hit
        ctx.result("get request endpoint hit!");
    });


    // HTTP POST REQUEST to http://localhost:9000/post-request
    app.post("/post-request", ctx -> {
        //logic to be executed when this endpoint is hit
        ctx.result("post request endpoint hit!");
    });
}
```

The `ctx.result();` method allows us to return data in the HTTP response body. (We will look at how to return different
formats of data later)
