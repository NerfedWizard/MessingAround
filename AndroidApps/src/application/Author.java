package application;

/**
 * Storing Quotes
 *
 */

public class Author {
	private String name;
	private String quote;

	public Author(String name, String quote) {
		this.setName(name);
		this.setQuote(quote);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQuote() {
		return quote;
	}

	public void setQuote(String quote) {
		this.quote = quote;
	}
}