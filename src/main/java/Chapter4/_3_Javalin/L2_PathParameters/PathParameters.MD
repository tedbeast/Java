# Javalin Lab: Retrieving Data from Path Parameters

Now that we have learned how to create a webserver and define endpoints with Javalin, we need to learn how to 
retrieve data from the HTTP requests.

The most common ways to transmit data in an HTTP request are:
- Path parameters
- HTTP Request body

For this lab we will be looking at Path Parameters

## Path Parameters

Path parameters are variables that are in the URL path. For example, Lets say we define the following endpoint:

```java
app.get("/lastname/{name}", ctx -> {
    String lastName = ctx.pathParam("name");
});
```

The curly braces in the url above defines a variable. A client can now send a request to the above endpoint in the 
following with any name in that spot:

- http://localhost:9000/lastname/Jones
- http://localhost:9000/lastname/Smith


The `ctx.pathParam()` method above is used to retrieve this variable in java. The variable name and the value that's 
put in the parameter of the `ctx.pathParam()` method must be identical. In this case the variable was called `name`.
