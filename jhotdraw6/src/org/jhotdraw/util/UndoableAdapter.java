/*
 * @(#)UndoableAdapter.java
 *
 * Project:		JHotdraw - a GUI framework for technical drawings
 *				http://www.jhotdraw.org
 *				http://jhotdraw.sourceforge.net
 * Copyright:	� by the original author(s) and all contributors
 * License:		Lesser GNU Public License (LGPL)
 *				http://www.opensource.org/licenses/lgpl-license.html
 */

package CH.ifa.draw.util;

import CH.ifa.draw.framework.*;
import CH.ifa.draw.standard.FigureEnumerator;
import CH.ifa.draw.standard.StandardFigureSelection;
import java.util.*;

/**
 * Most basic implementation for an Undoable activity. Subclasses should override
 * methods to provide specialized behaviour when necessary.
 *
 * @author Wolfram Kaiser
 * @version <$CURRENT_VERSION$>
 */
public class UndoableAdapter implements Undoable {

	private Vector myAffectedFigures;
	private int    myAffectedFiguresCount;
	private boolean myIsUndoable;
	private boolean myIsRedoable;
	private DrawingView myDrawingView;

	public UndoableAdapter(DrawingView newDrawingView) {
		setDrawingView(newDrawingView);
	}
	
	/**
	 * Undo the activity
	 * @return true if the activity could be undone, false otherwise
	 */
	public boolean undo() {
		return isUndoable();
	}

	/*
	 * Redo the activity
	 * @return true if the activity could be redone, false otherwise
	 */
	public boolean redo() {
		return isRedoable();
	}
	
	public boolean isUndoable() {
		return myIsUndoable;
	}
	
	public void setUndoable(boolean newIsUndoable) {
		myIsUndoable = newIsUndoable;
	}
	
	public boolean isRedoable() {
		return myIsRedoable;
	}
	
	public void setRedoable(boolean newIsRedoable) {
		myIsRedoable = newIsRedoable;
	}
	
	public void setAffectedFigures(FigureEnumeration newAffectedFigures) {
		// the enumeration is not reusable therefore a copy is made
		// to be able to undo-redo the command several time
		rememberFigures(newAffectedFigures);
	}

	public FigureEnumeration getAffectedFigures() {
		return new FigureEnumerator((Vector)myAffectedFigures.clone());
	}
	
	public int getAffectedFiguresCount() {
		return myAffectedFiguresCount;
	}
	
	protected void rememberFigures(FigureEnumeration toBeRemembered) {
		myAffectedFigures = new Vector();
		myAffectedFiguresCount = 0;
		while (toBeRemembered.hasMoreElements()) {
			myAffectedFigures.addElement(toBeRemembered.nextElement());
			myAffectedFiguresCount++;
		}
	}
	
	/**
	 * Releases all resources related to an undoable activity
	 */
	public void release() {
		FigureEnumeration fe = getAffectedFigures();
		while (fe.hasMoreElements()) {
			fe.nextFigure().release();
		}
		myAffectedFiguresCount = 0;
		setAffectedFigures(FigureEnumerator.getEmptyEnumeration());
	}

	/**
	 * Create new set of affected figures for redo operation because
	 * deleting figures in an undo operation makes them unusable
	 * Especially contained figures have been removed from their
	 * observing container like CompositeFigure or DecoratorFigure.
	 * Duplicating these figures re-establishes the dependencies.
	 */
	protected void duplicateAffectedFigures() {
		setAffectedFigures(StandardFigureSelection.duplicateFigures(
			getAffectedFigures(), getAffectedFiguresCount()));
	}
	
	public DrawingView getDrawingView() {
		return myDrawingView;
	}
	
	protected void setDrawingView(DrawingView newDrawingView) {
		myDrawingView = newDrawingView;
	}
}