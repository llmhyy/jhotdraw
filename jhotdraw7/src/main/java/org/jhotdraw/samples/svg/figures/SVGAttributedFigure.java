/*
 * @(#)SVGAttributedFigure.java  1.0  December 10, 2006
 *
 * Copyright (c) 1996-2007 by the original authors of JHotDraw
 * and all its contributors ("JHotDraw.org")
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * JHotDraw.org ("Confidential Information"). You shall not disclose
 * such Confidential Information and shall use it only in accordance
 * with the terms of the license agreement you entered into with
 * JHotDraw.org.
 */

package org.jhotdraw.samples.svg.figures;

import org.jhotdraw.draw.*;

import java.awt.*;
import java.awt.geom.*;
import java.util.*;
import java.io.*;
import org.jhotdraw.samples.svg.*;
import static org.jhotdraw.samples.svg.SVGAttributeKeys.*;
import org.jhotdraw.geom.*;
import org.jhotdraw.xml.DOMInput;
import org.jhotdraw.xml.DOMOutput;
/**
 * SVGAttributedFigure.
 *
 * @author Werner Randelshofer
 * @version 1.0 December 10, 2006 Created.
 */
public abstract class SVGAttributedFigure extends AbstractAttributedFigure {
    
    /** Creates a new instance. */
    public SVGAttributedFigure() {
    }
    
    public void drawFigure(Graphics2D g) {
        Paint paint = SVGAttributeKeys.getFillPaint(this);
        if (paint != null) {
            g.setPaint(paint);
            drawFill(g);
        }
        paint = SVGAttributeKeys.getStrokePaint(this);
        if (paint != null) {
            g.setPaint(paint);
            g.setStroke(SVGAttributeKeys.getStroke(this));
            drawStroke(g);
        }
        if (isConnectorsVisible()) {
            drawConnectors(g);
        }
    }
    
    public void basicSetAttribute(AttributeKey key, Object newValue) {
        if (key == STROKE_MITER_LIMIT && (Double) newValue < 1d) {
            System.out.println(this+".basicSetAttribute("+key+","+newValue);
            new Throwable().printStackTrace();
        }
        super.basicSetAttribute(key, newValue);
    }
}
