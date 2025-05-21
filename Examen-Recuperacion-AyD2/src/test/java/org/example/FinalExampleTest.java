package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FinalExampleTest {

    private final String USER_NAME = "user name";
    private final String USER_EMAIL = "email@gmail.com";
    private final String USER_PHONE = "user phone";
    private final String USER_ADDRESS = "user address";
    private final String USER_CITY = "user city";
    private final String USER_ZIP = "user zip";

    private final String SHAPE_CIRCLE = "circle";
    private final String SHAPE_RECTANGLE = "rectangle";
    private final String SHAPE_TRIANGLE = "triangle";
    private final double[] DIMENSIONS = {4, 3};


    private FinalExample finalExample;

    @BeforeEach
    public void setUp() {
        finalExample = new FinalExample();
    }

    @Test
    public void createUserSuccess() {

        String expect = "User created: " + USER_NAME;

        String actual = finalExample.createUser(USER_NAME, USER_EMAIL, USER_PHONE, USER_ADDRESS, USER_CITY, USER_ZIP);

        assertEquals(expect, actual);

    }

    @Test
    public void createUserInvalidNameNull() {
        String expect = "Name cannot be empty";

        String actual = finalExample.createUser(null, USER_EMAIL, USER_PHONE, USER_ADDRESS, USER_CITY, USER_ZIP);

        assertEquals(expect, actual);
    }

    @Test
    public void createUserInvalidNameEmpty() {
        String expect = "Name cannot be empty";

        String actual = finalExample.createUser("", USER_EMAIL, USER_PHONE, USER_ADDRESS, USER_CITY, USER_ZIP);

        assertEquals(expect, actual);
    }

    @Test
    public void createUserInvalidEmailNull() {
        String expect = "Invalid email";

        String actual = finalExample.createUser(USER_NAME, null, USER_PHONE, USER_ADDRESS, USER_CITY, USER_ZIP);

        assertEquals(expect, actual);
    }

    @Test
    public void createUserInvalidEmailNotContains() {
        String expect = "Invalid email";

        String actual = finalExample.createUser(USER_NAME, "email", USER_PHONE, USER_ADDRESS, USER_CITY, USER_ZIP);

        assertEquals(expect, actual);
    }

    @Test
    public void calculateAreaCircleSuccesfully(){

        double expect = Math.PI * DIMENSIONS[0] * DIMENSIONS[0];

        double actual = finalExample.calculateArea(SHAPE_CIRCLE, DIMENSIONS);

        assertEquals(expect, actual);
    }

    @Test
    public void calculateAreaRectangleSuccesfully(){

        double expect = DIMENSIONS[0] * DIMENSIONS[1];

        double actual = finalExample.calculateArea(SHAPE_RECTANGLE, DIMENSIONS);

        assertEquals(expect, actual);
    }

    @Test
    public void calculateAreaTriangleSuccesfully(){

        double expect = DIMENSIONS[0] * DIMENSIONS[1] / 2;

        double actual = finalExample.calculateArea(SHAPE_TRIANGLE, DIMENSIONS);

        assertEquals(expect, actual);
    }

    @Test
    public void calculateAreaUknowShape(){

        assertThrows(IllegalArgumentException.class, () -> finalExample.calculateArea("square", DIMENSIONS));

    }


}
