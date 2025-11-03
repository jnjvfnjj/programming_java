package Project_03_november;

import com.google.gson.Gson;
import java.nio.file.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Gson gson = new Gson();

        // Read JSON from Input.txt
        String input = Files.readString(Path.of("Input.txt"));
        User user = gson.fromJson(input, User.class);

        // Create new user object manually
        User newUser = new User();
        newUser.name = "Bob";
        newUser.age = 30;

        // Write JSON to Output.txt
        Files.writeString(Path.of("Output.txt"), gson.toJson(newUser));
    }
}

