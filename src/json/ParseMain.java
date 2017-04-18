package json;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ParseMain {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		sb.append("{");
		sb.append("\"name\":\"맥도날드\",");
		sb.append("\"loc\":\"신정동\",");
		sb.append("\"menus\":[");
		sb.append("{\"name\":\"빅맥\", \"price\":3000, \"cal\":1200},");
		sb.append("{\"name\":\"치킨버거\", \"price\":2000, \"cal\":900}");
		sb.append("]");
		sb.append("}");
		
		System.out.println(sb.toString());
		
		JSONParser jsonParser = new JSONParser();
		try {
			//파싱한 결과물을 반환받자!!
			JSONObject obj = (JSONObject)jsonParser.parse(sb.toString());
			String name = (String)obj.get("name");
			System.out.println(name);
			System.out.println((String)obj.get("loc"));
			JSONArray menus=(JSONArray)obj.get("menus");
			for(int i=0;i<menus.size();i++){
				JSONObject json = (JSONObject)menus.get(i);
				System.out.println(json.get("name"));
			}
			
			
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
