import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class TestCommand {

		@Test
		public void testAddCommand() {
			AddCommand addTest = new AddCommand("test");
			GameCmdInvoker invoke = new GameCmdInvoker();
			invoke.setCommand(addTest);
			invoke.execute();
			assertTrue(ListOfWords.getInstance().toString().contains("test"));
		}
		@Test
		public void testDeleteCommand() {
			AddCommand addTest = new AddCommand("test");
			DeleteCommand delTest = new DeleteCommand("test");
			GameCmdInvoker invoke = new GameCmdInvoker();
			invoke.setCommand(addTest);
			invoke.execute();
			invoke.setCommand(delTest);
			invoke.execute();
			assertTrue(!ListOfWords.getInstance().toString().contains("test"));
		}
		
}
