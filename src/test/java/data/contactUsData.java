package data;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class contactUsData {
    public String mobile, subject, message;
    public void ContactUsData() throws IOException, ParseException {
        String srcFile = System.getProperty("C:\\Users\\h\\IdeaProjects\\ShoeArena\\src\\test\\resources\\testDataFiles\\contactUsData.json");
        File file = new File(srcFile);

        JSONParser jsonParser=new JSONParser();
        JSONArray jsonArray= (JSONArray) jsonParser.parse(new FileReader(file));

        for (Object object: jsonArray){
            JSONObject user=(JSONObject) object;
            mobile= (String) user.get("mobile");
            subject=(String) user.get("subject");
            message=(String) user.get("message");
        }
    }
}
