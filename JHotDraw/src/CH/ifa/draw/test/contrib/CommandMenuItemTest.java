/*
 * @(#)Test.java
 *
 * Project:		JHotdraw - a GUI framework for technical drawings
 *				http://www.jhotdraw.org
 *				http://jhotdraw.sourceforge.net
 * Copyright:	� by the original author(s) and all contributors
 * License:		Lesser GNU Public License (LGPL)
 *				http://www.opensource.org/licenses/lgpl-license.html
 */
package CH.ifa.draw.test.contrib;

// JUnitDoclet begin import
import CH.ifa.draw.contrib.CommandMenuItem;
import CH.ifa.draw.standard.DeleteCommand;
import CH.ifa.draw.test.JHDTestCase;
// JUnitDoclet end import

/*
 * Generated by JUnitDoclet, a tool provided by
 * ObjectFab GmbH under LGPL.
 * Please see www.junitdoclet.org, www.gnu.org
 * and www.objectfab.de for informations about
 * the tool, the licence and the authors.
 */

// JUnitDoclet begin javadoc_class
/**
 * TestCase CommandMenuItemTest is generated by
 * JUnitDoclet to hold the tests for CommandMenuItem.
 * @see CH.ifa.draw.contrib.CommandMenuItem
 */
// JUnitDoclet end javadoc_class
public class CommandMenuItemTest
// JUnitDoclet begin extends_implements
extends JHDTestCase
// JUnitDoclet end extends_implements
{
	// JUnitDoclet begin class
	// instance variables, helper methods, ... put them in this marker
	private CommandMenuItem commandmenuitem;
	// JUnitDoclet end class

	/**
	 * Constructor CommandMenuItemTest is
	 * basically calling the inherited constructor to
	 * initiate the TestCase for use by the Framework.
	 */
	public CommandMenuItemTest(String name) {
		// JUnitDoclet begin method CommandMenuItemTest
		super(name);
		// JUnitDoclet end method CommandMenuItemTest
	}

	/**
	 * Factory method for instances of the class to be tested.
	 */
	public CH.ifa.draw.contrib.CommandMenuItem createInstance() throws Exception {
		// JUnitDoclet begin method testcase.createInstance
		return new CH.ifa.draw.contrib.CommandMenuItem(new DeleteCommand("TestDelete", getDrawingEditor()));
		// JUnitDoclet end method testcase.createInstance
	}

	/**
	 * Method setUp is overwriting the framework method to
	 * prepare an instance of this TestCase for a single test.
	 * It's called from the JUnit framework only.
	 */
	protected void setUp() throws Exception {
		// JUnitDoclet begin method testcase.setUp
		super.setUp();
		commandmenuitem = createInstance();
		// JUnitDoclet end method testcase.setUp
	}

	/**
	 * Method tearDown is overwriting the framework method to
	 * clean up after each single test of this TestCase.
	 * It's called from the JUnit framework only.
	 */
	protected void tearDown() throws Exception {
		// JUnitDoclet begin method testcase.tearDown
		commandmenuitem = null;
		super.tearDown();
		// JUnitDoclet end method testcase.tearDown
	}

	// JUnitDoclet begin javadoc_method setCommand()
	/**
	 * Method testSetGetCommand is testing setCommand
	 * and getCommand together by setting some value
	 * and verifying it by reading.
	 * @see CH.ifa.draw.contrib.CommandMenuItem#setCommand(CH.ifa.draw.util.Command)
	 * @see CH.ifa.draw.contrib.CommandMenuItem#getCommand()
	 */
	// JUnitDoclet end javadoc_method setCommand()
	public void testSetGetCommand() throws Exception {
		// JUnitDoclet begin method setCommand getCommand
		CH.ifa.draw.util.Command[] tests = { new CH.ifa.draw.standard.DeleteCommand("TestDelete", getDrawingEditor()), null };

		for (int i = 0; i < tests.length; i++) {
			commandmenuitem.setCommand(tests[i]);
			assertEquals(tests[i], commandmenuitem.getCommand());
		}
		// JUnitDoclet end method setCommand getCommand
	}

	// JUnitDoclet begin javadoc_method actionPerformed()
	/**
	 * Method testActionPerformed is testing actionPerformed
	 * @see CH.ifa.draw.contrib.CommandMenuItem#actionPerformed(java.awt.event.ActionEvent)
	 */
	// JUnitDoclet end javadoc_method actionPerformed()
	public void testActionPerformed() throws Exception {
		// JUnitDoclet begin method actionPerformed
		// JUnitDoclet end method actionPerformed
	}

	// JUnitDoclet begin javadoc_method testVault
	/**
	 * JUnitDoclet moves marker to this method, if there is not match
	 * for them in the regenerated code and if the marker is not empty.
	 * This way, no test gets lost when regenerating after renaming.
	 * <b>Method testVault is supposed to be empty.</b>
	 */
	// JUnitDoclet end javadoc_method testVault
	public void testVault() throws Exception {
		// JUnitDoclet begin method testcase.testVault
		// JUnitDoclet end method testcase.testVault
	}
}
