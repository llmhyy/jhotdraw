package CH.ifa.draw.test.contrib;

import junit.framework.TestCase;
// JUnitDoclet begin import
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
* TestCase MDI_DrawApplicationTest is generated by
* JUnitDoclet to hold the tests for MDI_DrawApplication.
* @see CH.ifa.draw.contrib.MDI_DrawApplication
*/
// JUnitDoclet end javadoc_class
public class MDI_DrawApplicationTest
// JUnitDoclet begin extends_implements
extends TestCase
// JUnitDoclet end extends_implements
{
  // JUnitDoclet begin class
  // instance variables, helper methods, ... put them in this marker
  CH.ifa.draw.contrib.MDI_DrawApplication mdi_drawapplication = null;
  // JUnitDoclet end class
  
  /**
  * Constructor MDI_DrawApplicationTest is
  * basically calling the inherited constructor to
  * initiate the TestCase for use by the Framework.
  */
  public MDI_DrawApplicationTest(String name) {
    // JUnitDoclet begin method MDI_DrawApplicationTest
    super(name);
    // JUnitDoclet end method MDI_DrawApplicationTest
  }
  
  /**
  * Factory method for instances of the class to be tested.
  */
  public CH.ifa.draw.contrib.MDI_DrawApplication createInstance() throws Exception {
    // JUnitDoclet begin method testcase.createInstance
    return new CH.ifa.draw.contrib.MDI_DrawApplication();
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
    mdi_drawapplication = createInstance();
    // JUnitDoclet end method testcase.setUp
  }
  
  /**
  * Method tearDown is overwriting the framework method to
  * clean up after each single test of this TestCase.
  * It's called from the JUnit framework only.
  */
  protected void tearDown() throws Exception {
    // JUnitDoclet begin method testcase.tearDown
    mdi_drawapplication = null;
    super.tearDown();
    // JUnitDoclet end method testcase.tearDown
  }
  
  // JUnitDoclet begin javadoc_method promptNew()
  /**
  * Method testPromptNew is testing promptNew
  * @see CH.ifa.draw.contrib.MDI_DrawApplication#promptNew()
  */
  // JUnitDoclet end javadoc_method promptNew()
  public void testPromptNew() throws Exception {
    // JUnitDoclet begin method promptNew
    // JUnitDoclet end method promptNew
  }
  
  // JUnitDoclet begin javadoc_method newWindow()
  /**
  * Method testNewWindow is testing newWindow
  * @see CH.ifa.draw.contrib.MDI_DrawApplication#newWindow(CH.ifa.draw.framework.Drawing)
  */
  // JUnitDoclet end javadoc_method newWindow()
  public void testNewWindow() throws Exception {
    // JUnitDoclet begin method newWindow
    // JUnitDoclet end method newWindow
  }
  
  // JUnitDoclet begin javadoc_method newView()
  /**
  * Method testNewView is testing newView
  * @see CH.ifa.draw.contrib.MDI_DrawApplication#newView()
  */
  // JUnitDoclet end javadoc_method newView()
  public void testNewView() throws Exception {
    // JUnitDoclet begin method newView
    // JUnitDoclet end method newView
  }
  
  // JUnitDoclet begin javadoc_method views()
  /**
  * Method testViews is testing views
  * @see CH.ifa.draw.contrib.MDI_DrawApplication#views()
  */
  // JUnitDoclet end javadoc_method views()
  public void testViews() throws Exception {
    // JUnitDoclet begin method views
    // JUnitDoclet end method views
  }
  
  // JUnitDoclet begin javadoc_method getDefaultDrawingTitle()
  /**
  * Method testGetDefaultDrawingTitle is testing getDefaultDrawingTitle
  * @see CH.ifa.draw.contrib.MDI_DrawApplication#getDefaultDrawingTitle()
  */
  // JUnitDoclet end javadoc_method getDefaultDrawingTitle()
  public void testGetDefaultDrawingTitle() throws Exception {
    // JUnitDoclet begin method getDefaultDrawingTitle
    // JUnitDoclet end method getDefaultDrawingTitle
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
  
  /**
  * Method to execute the TestCase from command line
  * using JUnit's textui.TestRunner .
  */
  public static void main(String[] args) {
    // JUnitDoclet begin method testcase.main
    junit.textui.TestRunner.run(MDI_DrawApplicationTest.class);
    // JUnitDoclet end method testcase.main
  }
}
