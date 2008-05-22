/**
 * @(#)FontModel.java  1.0  May 18, 2008
 *
 * Copyright (c) 2008 Werner Randelshofer
 * Staldenmattweg 2, CH-6405 Immensee, Switzerland
 * All rights reserved.
 *
 * The copyright of this software is owned by Werner Randelshofer. 
 * You may not use, copy or modify this software, except in  
 * accordance with the license agreement you entered into with  
 * Werner Randelshofer. For details see accompanying license terms. 
 */

package org.jhotdraw.gui.fontchooser;

import java.awt.Font;
import javax.swing.tree.MutableTreeNode;
import javax.swing.tree.TreeModel;

/**
 * This interface defines the methods components like JFontChooser
 * use to get a font from a font collection or a font family.
 * <p>
 * FontChooserModel is a TreeModel with the following structure for 
 * the tree:
 * <ul>
 * <li>The root node must be a MutableTreeNode.</li>
 * <li>A child of the root node must be a FontCollectionNode.</li>
 * <li>A child of a FontCollectionNode must be a FontFamilyNode.</li>
 * <li>A child of a FontFamilyNode must be a FontTypefaceNode.</li>
 * </ul>
 *
 * @author Werner Randelshofer
 * @version 1.0 May 18, 2008 Created.
 */
public interface FontChooserModel extends TreeModel {
    /**
     * Returns <code>true</code> if <code>node</code> is editable by the user.
     * This method returns true, if the node and all its parents are editable.
     *
     * @param   node  a node in the tree, obtained from this data source
     * @return  true if <code>node</code> is editable
     */
    public boolean isEditable(MutableTreeNode node);    
}
