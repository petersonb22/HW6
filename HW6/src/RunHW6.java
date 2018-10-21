import java.util.Scanner;

public class RunHW6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameCmdInvoker invoker = new GameCmdInvoker();
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		String word;
		while(run)
		{
			System.out.println("Command: ");
			String commandName = scan.next();
			switch (commandName)
			{
				case "quit":
					run = false;
					break;
				case "add":
					word = scan.next();
					AddCommand add = new AddCommand(word);
					invoker.setCommand(add);
					invoker.execute();
					System.out.println(ListOfWords.getInstance().toString());
					break;
				case "delete":
					word = scan.next();
					DeleteCommand del = new DeleteCommand(word);
					invoker.setCommand(del);
					invoker.execute();
					System.out.println(ListOfWords.getInstance().toString());
					break;
				case "undo":
					invoker.undo();
					System.out.println(ListOfWords.getInstance().toString());
					break;
				case "redo":
					invoker.redo();
					System.out.println(ListOfWords.getInstance().toString());
					break;
				default:
					System.out.println("Invalid Command");
			}
		}
	}

}
