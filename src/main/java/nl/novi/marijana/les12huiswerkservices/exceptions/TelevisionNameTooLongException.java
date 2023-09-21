package nl.novi.marijana.les12huiswerkservices.exceptions;

public class TelevisionNameTooLongException extends RuntimeException {

    public TelevisionNameTooLongException() {
        super();
    }

    public TelevisionNameTooLongException(String message) {
        super(message);
    }
}
