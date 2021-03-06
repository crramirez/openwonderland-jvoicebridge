/*
 * Copyright 2007 Sun Microsystems, Inc.
 *
 * This file is part of jVoiceBridge.
 *
 * jVoiceBridge is free software: you can redistribute it and/or modify 
 * it under the terms of the GNU General Public License version 2 as 
 * published by the Free Software Foundation and distributed hereunder 
 * to you.
 *
 * jVoiceBridge is distributed in the hope that it will be useful, 
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Sun designates this particular file as subject to the "Classpath"
 * exception as provided by Sun in the License file that accompanied this 
 * code. 
 */

package com.sun.mc.softphone.gui;

public class Parameter {

    public double initialXParameter;
    public double initialYParameter;
    public double xParameterIncr;
    public double yParameterIncr;

    public double minX;
    public double minY;
    public double maxX;
    public double maxY;

    public Parameter(double initialXParameter, double initialYParameter,
	    double xParameterIncr, double yParameterIncr,
	    double minX, double minY, double maxX, double maxY) {

        this.initialXParameter = initialXParameter;
        this.initialYParameter = initialYParameter;
        this.xParameterIncr = xParameterIncr;
        this.yParameterIncr = yParameterIncr;

        this.minX = minX;
        this.minY = minY;
        this.maxX = maxX;
        this.maxY = maxY;
    }

}
