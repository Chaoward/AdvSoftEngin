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
                    new Size(Integer.parseInt(values[2])), 
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


    public static void saveFile(String path, RichCharacter[] writeInput) throws IOException, Exception {
        BufferedWriter writer; //= new BufferedWriter(new FileWriter(path));
        try {
            writer = new BufferedWriter(new FileWriter(path));
        }
        catch (IOException e) {
            throw e;
        }
        
        try {
            for (RichCharacter c : writeInput) {
                writer.write(
                    c.getChar() + "," +
                    c.getFont() + "," +
                    c.getSize() + "," +
                    c.getColor() + "\n"
                );
            }
        }
        catch (Exception e) {
            throw e;
        }
        finally {
            writer.close();
        }
    }
}
