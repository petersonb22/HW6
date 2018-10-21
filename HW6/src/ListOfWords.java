import java.util.ArrayList;
import java.util.List;

public class ListOfWords {
	private ArrayList<String> words;
	private static ListOfWords instance;
	private ListOfWords()
	{
		words = new ArrayList<String>();
	}
	public static ListOfWords getInstance()
	{
		if (instance == null)
		{
			instance = new ListOfWords();
		}
		return instance;
	}
	public void remove(String word)
	{
		words.remove(word);
	}
	public void add(String word)
	{
		words.add(word);
	}
	public String toString() 
	{
		return words.toString();
	}
}
