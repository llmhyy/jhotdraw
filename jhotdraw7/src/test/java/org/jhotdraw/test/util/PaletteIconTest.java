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
package org.jhotdraw.test.util;

// JUnitDoclet begin import
import org.jhotdraw.util.PaletteIcon;
import org.jhotdraw.util.Iconkit;
import org.jhotdraw.application.DrawApplication;
import org.jhotdraw.framework.JHotDrawRuntimeException;
import org.jhotdraw.test.JHDTestCase;

import java.awt.*;
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
* TestCase PaletteIconTest is generated by
* JUnitDoclet to hold the tests for PaletteIcon.
* @see org.jhotdraw.util.PaletteIcon
*/
// JUnitDoclet end javadoc_class
public class PaletteIconTest
// JUnitDoclet begin extends_implements
extends JHDTestCase
// JUnitDoclet end extends_implements
{
	// JUnitDoclet begin class
	// instance variables, helper methods, ... put them in this marker
	private PaletteIcon paletteicon;
	// JUnitDoclet end class

	/**
	 * Constructor PaletteIconTest is
	 * basically calling the inherited constructor to
	 * initiate the TestCase for use by the Framework.
	 */
	public PaletteIconTest(String name) {
		// JUnitDoclet begin method PaletteIconTest
		super(name);
		// JUnitDoclet end method PaletteIconTest
	}

	/**
	 * Factory method for instances of the class to be tested.
	 */
	public PaletteIcon createInstance() throws Exception {
		// JUnitDoclet begin method testcase.createInstance
		Iconkit kit = Iconkit.instance();
		if (kit == null) {
			throw new JHotDrawRuntimeException("Iconkit instance isn't set");
		}

		String iconName = DrawApplication.IMAGES + "SEL";
		Image im[] = new Image[3];
		im[0] = kit.loadImageResource(iconName + "1.gif");
		im[1] = kit.loadImageResource(iconName + "2.gif");
		im[2] = kit.loadImageResource(iconName + "3.gif");

		MediaTracker tracker = new MediaTracker(getDrawingEditor());
		for (int i = 0; i < 3; i++) {
			tracker.addImage(im[i], i);
		}
		try {
			tracker.waitForAll();
		}
		catch (Exception e) {
			// ignore exception
		}

		return new PaletteIcon(new Dimension(24, 24), im[0], im[1], im[2]);
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
		paletteicon = createInstance();
		// JUnitDoclet end method testcase.setUp
	}

	/**
	 * Method tearDown is overwriting the framework method to
	 * clean up after each single test of this TestCase.
	 * It's called from the JUnit framework only.
	 */
	protected void tearDown() throws Exception {
		// JUnitDoclet begin method testcase.tearDown
		paletteicon = null;
		super.tearDown();
		// JUnitDoclet end method testcase.tearDown
	}

	// JUnitDoclet begin javadoc_method normal()
	/**
	 * Method testNormal is testing normal
	 * @see org.jhotdraw.util.PaletteIcon#normal()
	 */
	// JUnitDoclet end javadoc_method normal()
	public void testNormal() throws Exception {
		// JUnitDoclet begin method normal
		// JUnitDoclet end method normal
	}

	// JUnitDoclet begin javadoc_method pressed()
	/**
	 * Method testPressed is testing pressed
	 * @see org.jhotdraw.util.PaletteIcon#pressed()
	 */
	// JUnitDoclet end javadoc_method pressed()
	public void testPressed() throws Exception {
		// JUnitDoclet begin method pressed
		// JUnitDoclet end method pressed
	}

	// JUnitDoclet begin javadoc_method selected()
	/**
	 * Method testSelected is testing selected
	 * @see org.jhotdraw.util.PaletteIcon#selected()
	 */
	// JUnitDoclet end javadoc_method selected()
	public void testSelected() throws Exception {
		// JUnitDoclet begin method selected
		// JUnitDoclet end method selected
	}

	// JUnitDoclet begin javadoc_method getWidth()
	/**
	 * Method testGetWidth is testing getWidth
	 * @see org.jhotdraw.util.PaletteIcon#getWidth()
	 */
	// JUnitDoclet end javadoc_method getWidth()
	public void testGetWidth() throws Exception {
		// JUnitDoclet begin method getWidth
		// JUnitDoclet end method getWidth
	}

	// JUnitDoclet begin javadoc_method getHeight()
	/**
	 * Method testGetHeight is testing getHeight
	 * @see org.jhotdraw.util.PaletteIcon#getHeight()
	 */
	// JUnitDoclet end javadoc_method getHeight()
	public void testGetHeight() throws Exception {
		// JUnitDoclet begin method getHeight
		// JUnitDoclet end method getHeight
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
