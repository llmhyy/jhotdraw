/*
 * @(#)UndoCommand.java
 *
 * Project:		JHotdraw - a GUI framework for technical drawings
 *				http://www.jhotdraw.org
 *				http://jhotdraw.sourceforge.net
 * Copyright:	� by the original author(s) and all contributors
 * License:		Lesser GNU Public License (LGPL)
 *				http://www.opensource.org/licenses/lgpl-license.html
 */

package CH.ifa.draw.util;

import java.util.*;
import CH.ifa.draw.standard.*;
import CH.ifa.draw.framework.*;

/**
 * Command to undo the latest change in the drawing.
 * Undo activities can be undone only once, therefore they
 * are not added to the undo stack again (redo activities
 * can be added to the redo stack again, because they can
 * be redone several times, every time pushing a corresponding
 * undo activity as well).
 *
 * @author Wolfram Kaiser
 * @version <$CURRENT_VERSION$>
 */ 
public class UndoCommand extends AbstractCommand {

	/**
	 * Constructs a properties command.
	 * @param name the command name
	 * @param view the target view
	 */
	public UndoCommand(String name, DrawingView inView) {
		super(name, inView);
	}

	public void execute() {
		UndoManager um = view().getUndoManager();

		if ((um == null) || !um.isUndoable()) {
			return;
		}
		
		Undoable lastUndoable = um.popUndo();

		// Execute undo
		boolean hasBeenUndone = lastUndoable.undo();

		// Add to redo stack
		if (hasBeenUndone && lastUndoable.isRedoable()) {
			um.pushRedo(lastUndoable);
		}

		view().checkDamage();
		
		view().editor().figureSelectionChanged(view());
	}
  
	/**
	 * Used in enabling the undo menu item.
	 * Undo menu item will be enabled only when there is atleast one undoable
	 * activity registered with UndoManager.
	 */
	public boolean isExecutable() {
		UndoManager um = view().getUndoManager();

		if ((um != null) && (um.getUndoSize() > 0)) {
			return true;
		}

		return false;
	}
}
