package application;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONQuoteReader {
	@SuppressWarnings("rawtypes")
	public void quoteReader() throws FileNotFoundException, IOException {
		try {
			Object obj = new JSONParser().parse(new FileReader("/home/loel/git/messingAround/AndroidApps/src/application/quotes.json"))
					//.parse(new FileReader("C:\\Users\\loeln\\git\\MessingAround\\MessingAround\\AndroidApps\\src\\application\\quotes.json"));
			JSONArray quoteObject = (JSONArray) obj;
			Iterator itr = quoteObject.iterator();
			int count = 0;
			int total = 0;
			while (itr.hasNext()) {
				total++;
				Object author = itr.next();
				JSONObject ju = (JSONObject) author;
				String catr = (String) ju.get("Category");
				if (catr.equals("love")) {
					String name = (String) ju.get("Author");
					String quote = (String) ju.get("Quote");
					count++;
					System.out.println(count + ") " + name + "\n" + quote);
				}

			}
			System.out.println(total);
		} catch (ParseException e) {

		}


	}
}
