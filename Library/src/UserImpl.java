/**
 * UserImpl
 * <br>
 * Created on 24/10/2018
 *
 * @author zu
 */
public class UserImpl implements User {

    private final String name;
    private final String lastName;
    private final int id;
    private final int penalty;
    private final String date;

    public UserImpl(final int id, final String name, final String lastName, final String date, final int penalty) {

        this.name = name;
        this.lastName = lastName;
        this.id = id;
        this.penalty = penalty;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDate() {
        return date;
    }

    public int getPenalty() {
        return penalty;
    }
}
