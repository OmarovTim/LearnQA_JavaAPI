import org.junit.jupiter.api.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
class HelloWorldTest{

    @Test
    public void testRestAssured() {
        Response response;
        response = RestAssured
                .given()
                .redirects()
                .follow(false)
                .when()
                .get("https://playground.learnqa.ru/api/long_redirect")
                .andReturn();


        int statusCode = response.getStatusCode();
        System.out.println(statusCode);

        String locationHeader = response.getHeader("Location");
        System.out.println(locationHeader);
    }
}