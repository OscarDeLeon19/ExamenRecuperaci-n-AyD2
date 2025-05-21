package org.example;

import org.example.refactor.ShapeCalculator;
import org.example.refactor.UserCreator;
import org.example.refactor.user.User;
import org.example.refactor.user.UserDto;
import org.example.refactor.user.UserException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FinalExampleRefactorTest {

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

    private UserCreator userCreator;
    private ShapeCalculator shapeCalculator;
    private UserDto userDto;


    @BeforeEach
    void setUp() {
        userCreator = new UserCreator();
        shapeCalculator = new ShapeCalculator();

        userDto = new UserDto();
        userDto.setName(USER_NAME);
        userDto.setEmail(USER_EMAIL);
        userDto.setPhone(USER_PHONE);
        userDto.setAddress(USER_ADDRESS);
        userDto.setCity(USER_CITY);
        userDto.setZip(USER_ZIP);

    }

    @Test
    public void createUserSuccesfully() throws UserException {

        String expected = "User created: " + USER_NAME;
        String actual = userCreator.createUser(userDto);

        assertEquals(expected, actual);
    }

    @Test
    public void createUserInvalidNameNull() {

        userDto.setName(null);

        assertThrows(UserException.class, () -> userCreator.createUser(userDto));

    }

    @Test
    public void createUserInvalidNameEmpty() {

        userDto.setName("");

        assertThrows(UserException.class, () -> userCreator.createUser(userDto));

    }

    @Test
    public void createUserInvalidEmailNull() {

        userDto.setEmail(null);

        assertThrows(UserException.class, () -> userCreator.createUser(userDto));

    }

    @Test
    public void createUserInvalidEmailNotCorrect() {

        userDto.setEmail("email");

        assertThrows(UserException.class, () -> userCreator.createUser(userDto));

    }

    @Test
    public void calculateAreaCircleSuccesfully() {

        double expect = Math.PI * DIMENSIONS[0] * DIMENSIONS[0];

        double actual = shapeCalculator.calculateArea(SHAPE_CIRCLE, DIMENSIONS);

        assertEquals(expect, actual);
    }

    @Test
    public void calculateAreaRectangleSuccesfully() {

        double expect = DIMENSIONS[0] * DIMENSIONS[1];

        double actual = shapeCalculator.calculateArea(SHAPE_RECTANGLE, DIMENSIONS);

        assertEquals(expect, actual);
    }

    @Test
    public void calculateAreaTriangleSuccesfully() {

        double expect = DIMENSIONS[0] * DIMENSIONS[1] / 2;

        double actual = shapeCalculator.calculateArea(SHAPE_TRIANGLE, DIMENSIONS);

        assertEquals(expect, actual);
    }

    @Test
    public void calculateAreaUknowShape(){

        assertThrows(IllegalArgumentException.class, () -> shapeCalculator.calculateArea("square", DIMENSIONS));

    }




}
