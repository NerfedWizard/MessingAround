package application;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONQuoteReader {
	static HashSet<String> set = new HashSet<String>();
	static List<String> categories = new ArrayList<>();
	static HashMap<String, HashMap<String, List<String>>> mapped = new HashMap<>();

	@SuppressWarnings("rawtypes")
	public static void quoteReader() throws IOException {

		try {
			Object obj = new JSONParser().parse(new FileReader(
					"C:\\Users\\loeln\\git\\MessingAround\\MessingAround\\AndroidApps\\src\\application\\quotes.json"));
			JSONArray quoteObject = (JSONArray) obj;
			String name = "";
			String quote = "";
			Iterator itr = quoteObject.iterator();
			do {
				Object author = itr.next();
				JSONObject ju = (JSONObject) author;
				String catr = (String) ju.get("Category");
				set.add(catr);
				if (!mapped.containsKey(catr)) {
					mapped.put(catr, new HashMap<String, List<String>>()); 
				}
				name = (String) ju.get("Author");
				if (!mapped.get(catr).containsKey(name)) {
					mapped.get(catr).put(name, new ArrayList<String>());
				}
				quote = (String) ju.get("Quote");
				mapped.get(catr).get(name).add(quote);
			} while (itr.hasNext());
		} catch (ParseException e) {
		}
	}
}
