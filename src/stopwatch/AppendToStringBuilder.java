package stopwatch;
/**
 * a class that called for append char to StringBuilder.
 * 
 * @author Triwith Mutitakul
 *
 */
public class AppendToStringBuilder implements Runnable {
	private int count;

	/**
	 * The Constructor
	 * 
	 * @param count
	 *            is the number that control how many time will be append.(set
	 *            how many loop?)
	 */
	public AppendToStringBuilder(int count) {
		this.count = count;
	}

	@Override
	/**
	 * set the method run to add char 'a' to StringBuilder until the end of the
	 * loops. print the final string length.
	 */
	public void run() {
		final char CHAR = 'a';
		StringBuilder builder = new StringBuilder();
		int k = 0;
		while (k++ < count) {
			builder = builder.append(CHAR);
		}

		String result = builder.toString();
	}

	@Override
	/**
	 * return the String that show what is the class doing.
	 */
	public String toString() {
		return String.format("Append %,d chars to StringBuilder\nfinal string length = %d", count, count);

	}

}
