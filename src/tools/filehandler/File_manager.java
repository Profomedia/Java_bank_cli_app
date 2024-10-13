package tools.filehandler;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class File_manager {
    public static void manage(String json) {
        // file path
        String path = "src/db/UserAcc.json";
        // create file
        File file = new File(path);
        try {  
            // write to file
            FileWriter writer = new FileWriter(path, false);
            writer.write(json);
            writer.close();
            
        } catch (IOException e){
            e.printStackTrace();
        }
        
    }
}
