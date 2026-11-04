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
            while (reader.ready()) {
                line = reader.readLine();
                values = line.split(",");
                characters.add(new RichCharacter(
                    values[0].charAt(0),
                    new Font(values[1]), 
                    Integer.parseInt(values[2]), 
                    new Color(values[3])
                ));
            }
            
            RichCharacter[] temp = new RichCharacter[characters.size()];
            return characters.toArray(temp);
        }
        catch (Exception e) {
            throw e;
        }
        finally {
            reader.close();
        }
    }
}
