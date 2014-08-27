/*
http://www.elclubdelprogramador.com/2012/01/30/java-json-simple-una-simple-herramienta-java-para-json/

*/

package json_simple;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class JsonCreate {

	public static void main(String[] args) {
		JSONObject obj2 = new JSONObject(); 
		JSONObject obj = new JSONObject();
		obj.put("id", new Integer(30));
		obj.put("s", "developer");
		obj2.put("mensajito","mensajito 01");
                obj2.put("hola","hola 09");
                
		JSONArray list = new JSONArray();
		list.add("item 1");
		list.add("item 2");
		list.add("item 3");
		
		obj.put("Lista", list);
		obj.put("obj2",obj2);
                
                JSONArray list4 = new JSONArray();
		list.add("item 1");
		list.add("item 2");
		list.add("item 3");
		
		obj.put("Lista4", list4);
                System.out.print(obj);
	 
	     }
}
