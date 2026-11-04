package advsoft.flyweight;

import java.io.*;
import java.util.ArrayList;

public class FileReading {

    public static RichCharacter[] readFile(String path) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader(path));
        String line;
        String[] values;
        ArrayList<RichCharacter> characters = new ArrayList<RichCharacter>();

        try {
            while ((line = reader.readLine()) != "") {
                values = line.split(",");
                characters.add(new RichCharacter(
                    values[0].charAt(0),
                    new Font(values[1]), 
                    Integer.getInteger(values[2]), 
                    new Color(values[3])
                ));
            }

            return (RichCharacter[])(characters.toArray());
        }
        catch (Exception e) {
            throw e;
        }
        finally {
            reader.close();
        }
    }
}
