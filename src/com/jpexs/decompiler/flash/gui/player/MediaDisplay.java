/*
 *  Copyright (C) 2010-2015 JPEXS
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.jpexs.decompiler.flash.gui.player;

import java.awt.Color;
import java.awt.image.BufferedImage;

/**
 *
 * @author JPEXS
 */
public interface MediaDisplay {

    public int getCurrentFrame();

    public int getTotalFrames();

    public void zoom(Zoom zoom);

    public void pause();

    public void play();

    public void rewind();

    public boolean isPlaying();

    public void gotoFrame(int frame);

    public void setBackground(Color color);

    public int getFrameRate();

    public boolean isLoaded();

    public BufferedImage printScreen();

    public boolean screenAvailable();

    public boolean zoomAvailable();

    public double getZoomToFit();

    public Zoom getZoom();

    public void addEventListener(MediaDisplayListener listener);

    public void removeEventListener(MediaDisplayListener listener);
}
