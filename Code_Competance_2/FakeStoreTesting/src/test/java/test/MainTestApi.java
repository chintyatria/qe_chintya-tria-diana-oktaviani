package test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;



public class MainTestApi {

//    LOGIN TESTING
    @Test
    void loginFeature(){

        String endpoint = "https://fakestoreapi.com/auth/login";

        String reqBody = "{\n" +
                "    \"username\": \"mor_2314\",\n" +
                "    \"password\": \"83r5^_\"\n" +
                "}";

        Response response = RestAssured
                .given()
                .contentType(ContentType.JSON)
                .body(reqBody)
                .post(endpoint);

        String token = response.jsonPath().getString("token");
        System.out.println("{\n    token: \"" + token + "\"\n}");
    }


//    PRODUCT TESTING
    @Test
    void getAllProducts(){
        given()
                .baseUri("https://fakestoreapi.com")
        .when()
                .log().all()
                .get("/products")
        .then()
                .log().all()
                .statusCode(200)
                .time(lessThan((long) 2000L))
                .body(matchesJsonSchemaInClasspath("getallproductsschema.json"));

    }
    @Test
    void getSingleProduct(){
        int productId = 1;
        given()
                .baseUri("https://fakestoreapi.com")
        .when()
                .log().all()
                .get("/products/"+productId)
        .then()
                .log().all()
                .statusCode(200)
                .body("id", equalTo(1))
                .body(matchesJsonSchemaInClasspath("getsingleproductschema.json"));
    }
    @Test
    void addNewProduct(){

        String endpoint = "https://fakestoreapi.com/products";
        String reqBody = "{\n" +
                "    \"title\": \"test product\",\n" +
                "    \"price\": 13.5,\n" +
                "    \"description\": \"lorem ipsum set\",\n" +
                "    \"image\": \"https://i.pravatar.cc\",\n" +
                "    \"category\": \"electronic\"\n" +
                "}";
        Response response = RestAssured
                .given()
                .contentType(ContentType.JSON)
                .body(reqBody)
                .post(endpoint);
        int id = response.jsonPath().getInt("id");
        String title = response.jsonPath().getString("title");
        String price = response.jsonPath().getString("price");
        String category = response.jsonPath().getString("category");
        String description = response.jsonPath().getString("description");
        String image = response.jsonPath().getString("image");
        System.out.println("{\n" +
                "    id: " + id + ",\n" +
                "    title: \"" + title + "\",\n" +
                "    price: \"" + price + "\",\n" +
                "    category: \"" + category + "\",\n" +
                "    description: \"" + description + "\",\n" +
                "    image: \"" + image + "\"\n" +
                "}");
    }
    @Test
    void updateProduct(){

        int productId = 7;
        String title = "test product";
        String price = "13.5";
        String description = "lorem ipsum set";
        String image = "https://i.pravatar.cc";
        String category = "electronic";
        JSONObject bodyRequest = new JSONObject();
        bodyRequest.put("title", title);
        bodyRequest.put("price", price);
        bodyRequest.put("description", description);
        bodyRequest.put("image", image);
        bodyRequest.put("category", category);

        given()
                .baseUri("https://fakestoreapi.com")
                .header("Content-Type", "application/json")
                .body(bodyRequest)
        .when()
                .log().all()
                .put("/products/" + productId)
        .then()
                .log().all()
                .statusCode(200)
                .body("id", equalTo(productId))
                .body("title", equalTo(title))
                .body("price", equalTo(price))
                .body("description", equalTo(description))
                .body("image", equalTo(image))
                .body("category", equalTo(category))
                .body(matchesJsonSchemaInClasspath("updateproductschema.json"));
    }
    @Test
    void deleteProduct(){
        String endpoint = "https://fakestoreapi.com/products/6";
        Response response = RestAssured
                .given()
                .delete(endpoint);
        int id = response.jsonPath().getInt("id");
        String title = response.jsonPath().getString("title");
        String price = response.jsonPath().getString("price");
        String category = response.jsonPath().getString("category");
        String description = response.jsonPath().getString("description");
        String image = response.jsonPath().getString("image");
        System.out.println("{\n" +
                "    id: " + id + ",\n" +
                "    title: \"" + title + "\",\n" +
                "    price: \"" + price + "\",\n" +
                "    category: \"" + category + "\",\n" +
                "    description: \"" + description + "\",\n" +
                "    image: \"" + image + "\"\n" +
                "}");
    }


//    CART TESTING
    @Test
    void getAllCarts(){
        given()
                .baseUri("https://fakestoreapi.com")
        .when()
                .log().all()
                .get("/carts")
        .then()
                .log().all()
                .statusCode(200)
                .time(lessThan((long) 2000L))
                .body(matchesJsonSchemaInClasspath("getallcartsschema.json"));

    }
    @Test
    void getSingleCart(){
        int cartId = 5;
        given()
                .baseUri("https://fakestoreapi.com")
        .when()
                .log().all()
                .get("/carts/"+cartId)
        .then()
                .log().all()
                .statusCode(200)
                .body("id", equalTo(5))
                .body(matchesJsonSchemaInClasspath("getsinglecartschema.json"));
    }
    @Test
    void addNewCart(){

        String endpoint = "https://fakestoreapi.com/carts";
        String requestBody = "{\n" +
                "    \"userId\": 5,\n" +
                "    \"date\": \"2020-02-03\",\n" +
                "    \"products\": [\n" +
                "        {\n" +
                "            \"productId\": 5,\n" +
                "            \"quantity\": 1\n" +
                "        },\n" +
                "        {\n" +
                "            \"productId\": 1,\n" +
                "            \"quantity\": 5\n" +
                "        }\n" +
                "    ]\n" +
                "}";

        Response response = RestAssured
                .given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .post(endpoint);
        int id = response.jsonPath().getInt("id");
        String userId = response.jsonPath().getString("userId");
        String date = response.jsonPath().getString("date");
        String products = response.jsonPath().getString("products");
        System.out.println("{\n" +
                "    id: " + id + ",\n" +
                "    userId: \"" + userId + "\",\n" +
                "    date: \"" + date + "\",\n" +
                "    products: \"" + products + "\",\n" +
                "}");

    }
    @Test
    void updateCart(){
        String jsonBody = "{ \"userId\": 3, \"date\": \"2019-12-10\", \"products\": [ { \"productId\": 1, \"quantity\": 3 } ] }";

        given()
                .contentType("application/json")
                .body(jsonBody)
        .when()
                .log().all()
                .put("https://fakestoreapi.com/carts/7")
        .then()
                .assertThat()
                .log().all()
                .statusCode(200)
                .body("userId", equalTo(3))
                .body("date", equalTo("2019-12-10"))
                .body("products[0].productId", equalTo(1))
                .body("products[0].quantity", equalTo(3));
    }
    @Test
    void deleteCart(){
        String endpoint = "https://fakestoreapi.com/products/6";
        Response response = RestAssured
                .given()
                .delete(endpoint);
        int id = response.jsonPath().getInt("id");
        String userId = response.jsonPath().getString("userId");
        String date = response.jsonPath().getString("date");
        String products = response.jsonPath().getString("products");
        System.out.println("{\n" +
                "    id: " + id + ",\n" +
                "    userId: \"" + userId + "\",\n" +
                "    date: \"" + date + "\",\n" +
                "    products: \"" + products + "\",\n" +
                "}");
    }


//    USER TESTING
    @Test
    void getAllUsers(){
        given()
                .baseUri("https://fakestoreapi.com")
        .when()
                .log().all()
                .get("/users")
        .then()
                .log().all()
                .statusCode(200)
                .time(lessThan((long) 2000L))
                .body(matchesJsonSchemaInClasspath("getallusersschema.json"));

    }
    @Test
    void getSingleUser(){
        int userId = 1;
        given()
                .baseUri("https://fakestoreapi.com")
        .when()
                .log().all()
                .get("/users/"+userId)
        .then()
                .log().all()
                .statusCode(200)
                .body("id", equalTo(1))
                .body(matchesJsonSchemaInClasspath("getsingleuserschema.json"));
    }
    @Test
    void addNewUser(){
        RestAssured.baseURI = "https://fakestoreapi.com";

        given().
                contentType(ContentType.JSON).
                body("{\n" +
                        "    \"email\":\"John@gmail.com\",\n" +
                        "    \"username\":\"johnd\",\n" +
                        "    \"password\":\"m38rmF$\",\n" +
                        "    \"name\":{\n" +
                        "        \"firstname\":\"John\",\n" +
                        "        \"lastname\":\"Doe\"\n" +
                        "    },\n" +
                        "    \"address\":{\n" +
                        "        \"city\":\"kilcoole\",\n" +
                        "        \"street\":\"7835 new road\",\n" +
                        "        \"number\":3,\n" +
                        "        \"zipcode\":\"12926-3874\",\n" +
                        "        \"geolocation\":{\n" +
                        "            \"lat\":\"-37.3159\",\n" +
                        "            \"long\":\"81.1496\"\n" +
                        "        }\n" +
                        "    },\n" +
                        "    \"phone\":\"1-570-236-7033\"\n" +
                        "}").
        when().
                log().all().
                post("/users").
        then().
                log().all().
                assertThat().
                statusCode(200).
                extract().response();
    }
    @Test
    void updateUser(){

        int userId = 7;
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "John@gmail.com");
        requestBody.put("username", "johnd");
        requestBody.put("password", "m38rmF$");
        JSONObject name = new JSONObject();
        name.put("firstname", "John");
        name.put("lastname", "Doe");
        requestBody.put("name", name);
        JSONObject address = new JSONObject();
        address.put("city", "kilcoole");
        address.put("street", "7835 new road");
        address.put("number", 3);
        address.put("zipcode", "12926-3874");
        JSONObject geolocation = new JSONObject();
        geolocation.put("lat", "-37.3159");
        geolocation.put("long", "81.1496");
        address.put("geolocation", geolocation);
        requestBody.put("address", address);
        requestBody.put("phone", "1-570-236-7033");

        given()
                .baseUri("https://fakestoreapi.com")
                .contentType("application/json")
                .body(requestBody.toString())
        .when()
                .log().all()
                .put("/users/" + userId)
        .then()
                .log().all()
                .statusCode(200)
                .body("email", equalTo("John@gmail.com"))
                .body("username", equalTo("johnd"))
                .body("name.firstname", equalTo("John"))
                .body("name.lastname", equalTo("Doe"))
                .body("address.city", equalTo("kilcoole"))
                .body("address.street", equalTo("7835 new road"))
                .body("address.number", equalTo(3))
                .body("address.zipcode", equalTo("12926-3874"))
                .body("address.geolocation.lat", equalTo("-37.3159"))
                .body("address.geolocation.long", equalTo("81.1496"))
                .body("phone", equalTo("1-570-236-7033"))
                .body(matchesJsonSchemaInClasspath("updateuserschema.json"));
    }
    @Test
    void deleteUser(){
        String url = "https://fakestoreapi.com/users/6";
        Response response = given()
                .when()
                .delete(url)
                .then()
                .extract()
                .response();

        if (response.statusCode() == 200) {
            System.out.println(response.getBody().asPrettyString());
        } else {
            System.out.println("Failed to delete data.");
        }
    }
}
