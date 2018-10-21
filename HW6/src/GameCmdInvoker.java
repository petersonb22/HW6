import java.util.Stack;

public class GameCmdInvoker {
	private Stack<GameCommandInterface> undoStack; 
	private Stack<GameCommandInterface> redoStack;
	public GameCmdInvoker () {
		undoStack = new Stack<GameCommandInterface>();
		redoStack = new Stack<GameCommandInterface>();
	}
	public void setCommand(GameCommandInterface command)
	{
		undoStack.push(command);
	}
	public void execute()
	{
		if(!undoStack.isEmpty()) {
			undoStack.peek().execute();
		}
	}
	public void redo()
	{
		if(!redoStack.isEmpty())
		{
			redoStack.peek().redo();
			undoStack.push(redoStack.pop());
		}
	}
	public void undo()
	{
		if(!undoStack.isEmpty())
		{
			undoStack.peek().undo();
			redoStack.push(undoStack.pop());
		}
	}
}
