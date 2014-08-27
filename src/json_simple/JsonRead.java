package json_simple;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonRead {

    public static void main(String[] args) throws IOException {

        JSONParser parser = new JSONParser();

        try {
            //String json="{\"nombre\":\"developer\",\"edad\":30,\"Lista\":[\"item 1\",\"item 2\",\"item 3\",true,\"Mon Jan 30 17:05:28 CET 2012\"]}";
            Object obj = parser.parse(new FileReader("/home/lp-ub-14/NetBeansProjects/JSON_Simple/src/json_simple/cat.json"));
//Object obj = parser.parse(json);
            JSONObject jsonObject = (JSONObject) obj;

            JSONObject responsable = (JSONObject) jsonObject.get("responsable");
            System.out.println(responsable);
            
            JSONArray msg = (JSONArray) responsable.get("Aficiones");
            for (Object o : msg) {
                System.out.println("aficiones: "+o);
            }

        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

}
