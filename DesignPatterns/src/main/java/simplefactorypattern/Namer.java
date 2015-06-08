package simplefactorypattern;

/**
 * Simple Factory pattern returns an instance of one of several possible classes depending on the data
 * provided to it. Usually all classes that it returns have a common parent class and common methods,
 * but each performs a task differently and is optimized for different kinds of data.
 */
public class Namer {
	//base class extended by two child classes
	protected String last;
	//split name
	protected String first;
	//stored here
	public String getFirst() {
	return first;
	//return first name
	}
	public String getLast() {
	return last;
	//return last name
	}
}

