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
			Object obj = new JSONParser()
					.parse(new FileReader("C:\\Users\\loeln\\git\\MessingAround\\MessingAround\\AndroidApps\\src\\application\\quotes.json"));
			JSONArray quoteObject = (JSONArray) obj;
			Iterator itr = quoteObject.iterator();
//			String author = (String) quoteObject.get("Author");
//			String quote = (String) quoteObject.get("Quote");
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
//			for (int i = 0; i < 10; i++) {
//				JSONObject jo = (JSONObject) quoteObject.get(i);
//				String author = (String) jo.get("Author");
//				String quote = (String) jo.get("Quote");
//				String category = (String) jo.get("Category");
//				if (category.equals("love")) {
//					System.out.println(author);
//					System.out.println(quote);
//				}
//			}

//			JSONArray js = (JSONArray) obj;
//			for(JSONObject jo : js) {
//			JSONObject qj = (JSONObject) obj;
//			List<String> authors = (JSONArray) qj.get("Author");
//			List<String> quote = (JSONArray) qj.get("Quote");
//			}
//			for (int i = 0; i < 5; i++) {
//				String a = (String) authors.get(i);
//				System.out.println(a);
//				String q = (String) quote.get(i);
//				System.out.println(q);
//			}
		} catch (ParseException e) {

		}

//	public List<String> quoteReader() {
//		List<String> qList = new ArrayList<String>();
//		;
//		JSONParser jsonParser = new JSONParser();
//		try (FileReader reader = new FileReader(
//				"/home/loel/git/messingAround/AndroidApps/src/application/quotes.json")) {
//			Object obj = jsonParser.parse(reader);
//			JSONArray quoteList = (JSONArray) obj;
//			for (Object o : quoteList) {
//				System.out.println((String) o);
//			}
//			quoteList.forEach(qtr -> {
//				try {
//					parseEmployeeObject((JSONObject) qtr);
//				} catch (FileNotFoundException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				} catch (ParseException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			});
//			qList = new ArrayList<>(quoteList);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} catch (ParseException e) {
//			e.printStackTrace();
//		}
//		return qList;
//	}
//
//	@SuppressWarnings("unused")
//	private static void parseEmployeeObject(JSONObject quotes)
//			throws FileNotFoundException, IOException, ParseException {
//		// Get employee object within list
//		Object obj = new JSONParser().parse(new FileReader("JSONExample.json"));
//		JSONObject quoteObject = (JSONObject) quotes.get("");
//		JSONObject jo = (JSONObject) obj;
//		// Get employee first name
//		String author = (String) quoteObject.get("Author");
//		System.out.println(author);
//
//		// Get employee last name
//		String quote = (String) quoteObject.get("Quote");
//		System.out.println(quote);
//
//		// Get employee website name
////		String tag = (String) quoteObject.get("Tag");
////		System.out.println(tag);
//	}
	}
}
