package tools.filehandler;

import java.lang.reflect.Type;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import User.User;

public class Json_Handler {
    public static void jsonHandle(ArrayList<User> userArray, User user){
        // convert to json
        Gson json = new Gson();
        String array_to_json = json.toJson(userArray);
        
        // read from json db
        Type users = new TypeToken<ArrayList<User>>(){}.getType();
        @SuppressWarnings("unchecked")
        ArrayList<User> user_from_json = json.fromJson(array_to_json, ArrayList.class);
        user_from_json.add(user);

        //convert the "user_from_json" back to json
        String backToJson = json.toJson(user_from_json);

        //write to file
        File_manager.manage(backToJson);

        
    }
}
