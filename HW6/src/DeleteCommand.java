
public class DeleteCommand implements GameCommandInterface {
	String myString;
	public DeleteCommand(String s)
	{
		myString = s;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		ListOfWords lw =ListOfWords.getInstance();
		lw.remove(myString);
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		ListOfWords lw = ListOfWords.getInstance();
		lw.add(myString);
	}

	@Override
	public void redo() {
		// TODO Auto-generated method stub
		execute();
	}

}
