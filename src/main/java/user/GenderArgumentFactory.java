package user;

import org.jdbi.v3.core.argument.AbstractArgumentFactory;
import org.jdbi.v3.core.argument.Argument;
import org.jdbi.v3.core.config.ConfigRegistry;

import java.sql.Types;

public class GenderArgumentFactory extends AbstractArgumentFactory<User.Gender> {
    public GenderArgumentFactory() {
        super(Types.INTEGER);
    }

    @Override
    protected Argument build(User.Gender value, ConfigRegistry config) {
        return (position, statement, ctx) -> statement.setInt(position, value.ordinal());
    }
}