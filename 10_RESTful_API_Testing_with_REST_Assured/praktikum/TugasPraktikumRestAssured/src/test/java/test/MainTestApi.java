package test;

import org.json.simple.JSONObject;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThan;

public class MainTestApi {
    @Test
    void getPosts(){
        given()
                .baseUri("https://jsonplaceholder.typicode.com")
//                .queryParam("id", 1) //berhasil
//                .queryParam("user", 10) //harusnya gagal
        .when()
                .log().all() //log request
                .get("/posts")
        .then()
                .log().all() //log response
                .statusCode(200)
                .time(lessThan((long) 2000L)) //durasi request adalah 2 detik
                .body(matchesJsonSchemaInClasspath("allposts.json"));
//                .body("[0].title", equalTo("sunt aut facere repellat provident occaecati excepturi optio reprehenderit")); //tampilkan data berdasarkan title

    }
    @Test
    void addPost(){
        int userId = 2;
//        int id = 10;
        String title = "121212";
        String body = "This Is The Body Of A New Post";
        JSONObject bodyRequest = new JSONObject();
        bodyRequest.put("userId", userId);
//        bodyRequest.put("id", id);
        bodyRequest.put("title", title);
        bodyRequest.put("body", body);
        given()
                .baseUri("https://jsonplaceholder.typicode.com")
                .header("Content-Type", "application/json")
                .body(bodyRequest)
        .when()
                .log().all() //log request
                .post("/posts")
        .then()
                .log().all() //log response
                .statusCode(201)
                .body("userId", equalTo(userId))
                .body("id", equalTo(101))
                .body("title", equalTo(title))
                .body("body", equalTo(body))
                .body(matchesJsonSchemaInClasspath("addpost.json"));
    }
    @Test
    void getPostById(){
        int postId = 1;
        given()
                .baseUri("https://jsonplaceholder.typicode.com")
        .when()
                .log().all() //log request
                .get("/posts/"+postId)
        .then()
                .log().all() //log response
                .statusCode(200)
                .body("id", equalTo(1))
                .body(matchesJsonSchemaInClasspath("getpostbyid.json"));

    }
    @Test
    void updatePost(){
        int userId = 2;
//        int id = 10;
        int postId = 1;
        String title = "New Post";
        String body = "This Is The Body Of A New Post";
        JSONObject bodyRequest = new JSONObject();
        bodyRequest.put("userId", userId);
//        bodyRequest.put("id", id);
        bodyRequest.put("title", title);
        bodyRequest.put("body", body);
        given()
                .baseUri("https://jsonplaceholder.typicode.com")
                .header("Content-Type", "application/json")
                .body(bodyRequest)
        .when()
                .log().all() //log request
                .put("/posts/" + postId)
        .then()
                .log().all() //log response
                .statusCode(200)
                .body("userId", equalTo(userId))
                .body("id", equalTo(postId))
                .body("title", equalTo(title))
                .body("body", equalTo(body))
                .body(matchesJsonSchemaInClasspath("updatepost.json"));
    }
    @Test
    void deletePost(){
        given()
                .baseUri("https://jsonplaceholder.typicode.com")
        .when()
                .log().all()
                .delete("/posts/"+1)
        .then()
                .log().all()
                .statusCode(200);
    }
}
