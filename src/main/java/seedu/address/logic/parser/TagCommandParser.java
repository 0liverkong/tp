package seedu.address.logic.parser;

import seedu.address.logic.commands.TagCommand;
import seedu.address.logic.parser.exceptions.ParseException;

public class TagCommandParser implements Parser<TagCommand> {
    @Override
    public TagCommand parse(String args) throws ParseException {
        return new TagCommand();
    }
}
