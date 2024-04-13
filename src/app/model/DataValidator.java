package app.model;

import app.exceptions.InvalidDataException;

import java.util.regex.Pattern;

public class DataValidator {

    private static final String REGEX = "[1-3]";

    public int validate(String data) throws InvalidDataException {
        if (Pattern.matches(REGEX, data)) return Integer.parseInt(data);
        throw new InvalidDataException("You have entered invalid data(");
    }

}
