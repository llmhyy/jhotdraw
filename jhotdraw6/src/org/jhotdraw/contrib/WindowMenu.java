/*
 * @(#)WindowMenu.java
 *
 * Project:		JHotdraw - a GUI framework for technical drawings
 *				http://www.jhotdraw.org
 *				http://jhotdraw.sourceforge.net
 * Copyright:	� by the original author(s) and all contributors
 * License:		Lesser GNU Public License (LGPL)
 *				http://www.opensource.org/licenses/lgpl-license.html
 */

package CH.ifa.draw.contrib;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.beans.*;

/**
 * Menu component that handles the functionality expected of a standard
 * "Windows" menu for MDI applications.
 *
 * @author Wolfram Kaiser (adapted from an article in JavaWorld)
 * @version <$CURRENT_VERSION$>
 */
public class WindowMenu extends JMenu {
    private MDIDesktopPane desktop;
    private JMenuItem cascade=new JMenuItem("Cascade");
    private JMenuItem tile=new JMenuItem("Tile");

    public WindowMenu(String newText, MDIDesktopPane desktop) {
        this.desktop=desktop;
        setText(newText);
        cascade.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                WindowMenu.this.desktop.cascadeFrames();
            }
        });
        tile.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                WindowMenu.this.desktop.tileFrames();
            }
        });
        addMenuListener(new MenuListener() {
            public void menuCanceled (MenuEvent e) {}

            public void menuDeselected (MenuEvent e) {
                removeAll();
            }

            public void menuSelected (MenuEvent e) {
                buildChildMenus();
            }
        });
    }

    /* Sets up the children menus depending on the current desktop state */
    private void buildChildMenus() {
        int i;
        ChildMenuItem menu;
        JInternalFrame[] array = desktop.getAllFrames();

        add(cascade);
        add(tile);
        if (array.length > 0) addSeparator();
        cascade.setEnabled(array.length > 0);
        tile.setEnabled(array.length > 0);

        for (i = 0; i < array.length; i++) {
            menu = new ChildMenuItem(array[i]);
            menu.setState(i == 0);
            menu.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                    JInternalFrame frame = ((ChildMenuItem)ae.getSource()).getFrame();
                    frame.moveToFront();
                    try {
                        frame.setSelected(true);
                    } catch (PropertyVetoException e) {
                        e.printStackTrace();
                    }
                }
            });
            menu.setIcon(array[i].getFrameIcon());
            add(menu);
        }
    }

    /* This JCheckBoxMenuItem descendant is used to track the child frame that corresponds
       to a give menu. */
    class ChildMenuItem extends JCheckBoxMenuItem {
        private JInternalFrame frame;

        public ChildMenuItem(JInternalFrame frame) {
            super(frame.getTitle());
            this.frame=frame;
        }

        public JInternalFrame getFrame() {
            return frame;
        }
    }
}