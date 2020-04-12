package user;

import org.jdbi.v3.core.mapper.ColumnMapper;
import org.jdbi.v3.core.statement.StatementContext;

import java.sql.ResultSet;
import java.sql.SQLException;

public class GenderColumnMapper implements ColumnMapper<User.Gender> {
    @Override
    public User.Gender map(ResultSet r, int columnNumber, StatementContext ctx) throws SQLException {
        return User.Gender.values()[r.getInt(columnNumber)];
    }
}
