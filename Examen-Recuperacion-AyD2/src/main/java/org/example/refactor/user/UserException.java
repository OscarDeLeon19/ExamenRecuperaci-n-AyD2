package org.example.refactor.user;

/**
 * Excepcion creada para manejar errores del usuario
 */
public class UserException extends Exception {
    public UserException(String message) {
        super(message);
    }
}
