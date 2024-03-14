package seedu.address.model.person;

import static java.util.Objects.requireNonNull;
import static seedu.address.commons.util.AppUtil.checkArgument;

/**
 * Represents a Person's address in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValid(String)}
 */
public class Country {

    public static final String MESSAGE_CONSTRAINTS = "Countries can take any values, and it should not be blank";

    /*
     * The first character of the address must not be a whitespace,
     * otherwise " " (a blank string) becomes a valid input.
     */
    public static final String VALIDATION_REGEX = "[^\\s].*";

    public final String value;

    /**
     * Constructs an {@code Country}.
     *
     * @param address A valid address.
     */
    public Country(String address) {
        requireNonNull(address);
        checkArgument(isValidCountry(address), MESSAGE_CONSTRAINTS);
        value = address;
    }

    /**
     * Returns true if a given string is a valid country.
     */
    public static boolean isValidCountry(String test) {
        return test.matches(VALIDATION_REGEX);
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }

        // instanceof handles nulls
        if (!(other instanceof Country)) {
            return false;
        }

        Country otherCountry = (Country) other;
        return value.equals(otherCountry.value);
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

}
