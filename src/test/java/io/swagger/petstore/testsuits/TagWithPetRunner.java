package io.swagger.petstore.testsuits;

import io.swagger.petstore.testbase.TestBase;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.annotations.WithTag;
import net.thucydides.core.annotations.WithTags;
import org.junit.Test;

///@RunWith(SerenityRunner.class)
public class TagWithPetRunner extends TestBase {
    @WithTag("petfeature:POSITIVE")
    @Title("Provide a 200 status code when incorrect HTTP method is used to access resource")
    @Test
    public void invalidMethod() {
        SerenityRest.rest()
                .given()
                .when()
                .post("/pet")
                .then()
                .statusCode(415)
                .log().all();
    }
    @WithTags({
            @WithTag("petfeature:SMOKE"),
            @WithTag("petfeature:NEGETIVE")
    })
    @Title("This test will verify if a status code of 200 is returned for GET request")
    @Test
    public void verifyIfTheStatusCodeIs200() {
        SerenityRest.rest()
                .given()
                .when()
                .get("/pet/125")
                .then()
                .statusCode(404)
                .log().all();
    }
    @WithTags({
            @WithTag("petfeature:SMOKE"),
            @WithTag("petfeature:NEGETIVE")
    })
    @Title("This test will provide an error code of 400 when user tries to access an invalid resource")
    @Test
    public void inCorrectResource() {
        SerenityRest.rest()
                .given()
                .when()
                .get("/pet123")
                .then()
                .statusCode(404)
                .log().all();
    }
}
