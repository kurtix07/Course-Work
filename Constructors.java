public class Constructors
{ 
	private String first;
	private String middle;
	private String last;

	// constructor methods
	public Name (String f, String m, String l)
	{
		first = f;
		middle = m;
		last = l;
	}

	public Name (String f, String l)
	{
		first = f;
		middle = "";
		last = l;
	}

	public Name ()
	{
		first = "";
		middle = "";
		last = "";
	}

	public String toString()
	{
		return first + " " + middle + " " + last;
	}
