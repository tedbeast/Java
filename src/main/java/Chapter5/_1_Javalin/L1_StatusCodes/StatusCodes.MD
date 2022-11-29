# Javalin Lab: Changing the Status Code in an HTTP Response

As we mentioned in the first Javalin lab, status codes are how we tell the client machine how successful the HTTP 
Request was. HTTP Responses have 5 main categories of status codes:

There are 5 categories of status code responses:
- `100`: Request was informational
- `200`: Request was successful
- `300`: Request is being redirected
- `400`: Request failed due to a client-side error
- `500`: Request failed due to a server-side error


## Changing the status code in Javalin

```java
app.get("/request-was-accepted", ctx -> {
    ctx.status(202);
});
```

The only line we need to add to achieve this is `ctx.status(code);` Appropriate codes should be sent back. For instance:
 - 500 represents a server-side error - you should look to the server for a stack trace or other debugging info
 - 400 represents a client-side error
   - 404 This means your request did not match any endpoint.
   - 415 Could mean that the body has an unrecognized content type.
