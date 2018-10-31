import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class UserDAO {
    private final static String CSV_FILE = "Users.csv";

    private List<UserImpl> userList;

    public void add(UserImpl user) {
        try {
            FileWriter writer = new FileWriter(CSV_FILE, true);

            writer.append((char) user.getId());
            writer.append(';');
            writer.append(user.getName());
            writer.append(';');
            writer.append(user.getLastName());
            writer.append(';');
            writer.append(user.getDate());
            writer.append(';');
            writer.append((char) user.getPenalty());
            writer.append('\n');

            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void delete(String userId) {
        //
    }

    public List<UserImpl> findAll() {
        String line = "";
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(CSV_FILE))) {

            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] user = line.split(cvsSplitBy);

                final String name = user[1];
                final String lastName = user[2];
                final int id = Integer.parseInt(user[0]);
                final int penalty = Integer.parseInt(user[4]);
                final String date = user[3];

                final UserImpl newUser = new UserImpl(id, name, lastName, date, penalty);

                userList.add(newUser);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return userList;
    }
}