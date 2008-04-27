/*
 * @(#)ColorWheelChooser.java  1.1.1  2007-02-24
 *
 * Copyright (c) 2005-2007 Werner Randelshofer
 * Staldenmattweg 2, Immensee, CH-6405, Switzerland.
 * All rights reserved.
 *
 * The copyright of this software is owned by Werner Randelshofer. 
 * You may not use, copy or modify this software, except in  
 * accordance with the license agreement you entered into with  
 * Werner Randelshofer. For details see accompanying license terms. 
 */

package org.jhotdraw.color;

import ch.randelshofer.quaqua.util.*;

import java.awt.*;
import javax.swing.*;
import javax.swing.colorchooser.*;
import javax.swing.event.*;
import javax.swing.plaf.*;
/**
 * A HSB color chooser, which displays a hue/saturation color wheel, and a 
 * brightness slider.
 *
 * @author  Werner Randelshofer
 * @version 1.1.1 2007-02-24 To prevent rounding errors: Don't set color on
 * color model while updating the chooser from the color model. 
 * <br>1.1 2006-04-23 Retrieve labels from UIManager. 
 * <br>1.0.2 2005-11-07 Get "labels" resource bundle from UIManager.
 * <br>1.0.1 2005-09-11 Get icon from UIManager.
 * <br>1.0 August 27, 2005 Created.
 */
public class ColorWheelChooser extends AbstractColorChooserPanel implements UIResource {
    private ColorWheel colorWheel;
    private ColorSliderModel ccModel = new DefaultColorSliderModel(new HSVRGBColorSystem());

    private int updatingChooser;
    
    /**
     * Creates a new instance.
     */
    public ColorWheelChooser() {
        initComponents();
        
                int textSliderGap = UIManager.getInt("ColorChooser.textSliderGap");
        if (textSliderGap != 0) {
            BorderLayout layout = (BorderLayout) getLayout();
            layout.setHgap(textSliderGap);
}
        
        colorWheel = new ColorWheel();
        add(colorWheel);
        
        ccModel.configureSlider(2, brightnessSlider);
        colorWheel.setModel(ccModel);
        
        ccModel.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                setColorToModel(ccModel.getColor());
            }
        });
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    private void initComponents() {//GEN-BEGIN:initComponents
        brightnessSlider = new javax.swing.JSlider();

        setLayout(new java.awt.BorderLayout());

        brightnessSlider.setMajorTickSpacing(50);
        brightnessSlider.setOrientation(javax.swing.JSlider.VERTICAL);
        brightnessSlider.setPaintTicks(true);
        add(brightnessSlider, java.awt.BorderLayout.EAST);

    }//GEN-END:initComponents

    protected void buildChooser() {
    }    
    
    public String getDisplayName() {
        return UIManager.getString("ColorChooser.colorWheel");
    }    
    
    public javax.swing.Icon getLargeDisplayIcon() {
        return UIManager.getIcon("ColorChooser.colorWheelIcon");
    }
    
    public Icon getSmallDisplayIcon() {
        return getLargeDisplayIcon();
    }
    
    public void updateChooser() {
        updatingChooser++;
        ccModel.setColor(getColorFromModel());
        updatingChooser--;
    }
    public void setColorToModel(Color color) {
        if (updatingChooser == 0) {
        getColorSelectionModel().setSelectedColor(color);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSlider brightnessSlider;
    // End of variables declaration//GEN-END:variables
    
}
