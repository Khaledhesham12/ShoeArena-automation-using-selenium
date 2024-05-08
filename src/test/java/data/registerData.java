package data;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class registerData {
    public String email, password,firstName,lastName;
    public void RegisterData() throws IOException, ParseException {
        String srcFile = System.getProperty("C:\\Users\\h\\IdeaProjects\\ShoeArena\\src\\test\\resources\\testDataFiles\\registerData.json");
        File file =new File(srcFile);

        JSONParser jsonParser = new JSONParser();
        JSONArray jsonArray = (JSONArray) jsonParser.parse(new FileReader(file));

        for (Object object : jsonArray){
            JSONObject User =(JSONObject) object;
            firstName =(String) User.get("firstName");
            lastName=(String) User.get("lastName");
            email=(String) User.get("email");
            password = (String) User.get("password");
        }
    }
}
