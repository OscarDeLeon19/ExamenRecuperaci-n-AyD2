package org.example.refactor;

import org.example.refactor.user.User;
import org.example.refactor.user.UserBuilder;
import org.example.refactor.user.UserDto;
import org.example.refactor.user.UserException;

/**
 * Creamos una clase para manejar la creación de usuarios
 */
public class UserCreator {

    public String createUser(UserDto userDto) throws UserException {

        userValidation(userDto);

        User user = new UserBuilder().withName(userDto.getName())
                .withEmail(userDto.getEmail()).withPhone(userDto.getPhone())
                .withAddress(userDto.getAddress()).withCity(userDto.getCity()).withZip(userDto.getZip()).build();

        return "User created: " + userDto.getName();
    }

    // Metodo para las validaciones del usuario
    private void userValidation(UserDto userDto) throws UserException {
        if (userDto.getName() == null || userDto.getName().isEmpty()) {
            throw new UserException("Name is empty");
        }
        if (userDto.getEmail() == null || !userDto.getEmail().contains("@")) {
            throw new UserException("Invalid email");
        }

        // more validations

    }
}
