package tools.filehandler;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class File_manager {
    public static void manage(String json) {
        String path = "UserAcc.json";
        // create file
        File file = new File(path);
        try {
                System.out.println("File created: " + file.getName());
                System.out.println("File location is: " + file.getAbsolutePath());

                
                // write to file
                FileWriter writer = new FileWriter(path, false);
                writer.write(json);
                writer.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}
