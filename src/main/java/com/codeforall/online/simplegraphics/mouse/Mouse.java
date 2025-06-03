package com.codeforall.online.simplegraphics.mouse;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.codeforall.online.simplegraphics.graphics.Canvas;

/**
 * Instantiate a Mouse for obtaining mouse handling capability
 */
public class Mouse implements MouseListener, MouseMotionListener {

    private MouseHandler handler;
    private List<MouseEventType> mouseEventTypes;

    public Mouse(MouseHandler var1) {
        Canvas.getInstance().addMouseListener(this);
        Canvas.getInstance().addMouseMotionListener(this);
        this.handler = var1;
        this.mouseEventTypes = new ArrayList();
    }

    public void addEventListener(MouseEventType var1) {
        this.mouseEventTypes.add(var1);
    }

    public void removeEventListener(MouseEventType var1) {
        this.mouseEventTypes.remove(var1);
    }

    public void mouseClicked(MouseEvent var1) {
        if (this.handler != null) {
            Iterator var2 = this.mouseEventTypes.iterator();

            while (var2.hasNext()) {
                MouseEventType var3 = (MouseEventType) var2.next();
                if (var3 == MouseEventType.MOUSE_CLICKED) {
                    this.handler.mouseClicked(new com.codeforall.online.simplegraphics.mouse.MouseEvent((double) var1.getX(), (double) var1.getY(), MouseEventType.MOUSE_CLICKED));
                }
            }
        }

    }

    public void mouseMoved(MouseEvent var1) {
        if (this.handler != null) {
            Iterator var2 = this.mouseEventTypes.iterator();

            while (var2.hasNext()) {
                MouseEventType var3 = (MouseEventType) var2.next();
                if (var3 == MouseEventType.MOUSE_MOVED) {
                    this.handler.mouseMoved(new com.codeforall.online.simplegraphics.mouse.MouseEvent((double) var1.getX(), (double) var1.getY(), MouseEventType.MOUSE_MOVED));
                }
            }
        }

    }

    public void mousePressed(MouseEvent var1) {
    }

    public void mouseReleased(MouseEvent var1) {
    }

    public void mouseEntered(MouseEvent var1) {
    }

    public void mouseExited(MouseEvent var1) {
    }

    public void mouseDragged(MouseEvent var1) {
    }

    /**
     * Returns the current {@link MouseHandler} assigned to handle mouse events.
     *
     * @return the mouse handler
     */
    public MouseHandler getHandler() {
        return handler;
    }

    /**
     * Sets the {@link MouseHandler} that will be used to handle mouse events.
     *
     * @param handler the mouse handler to set
     */
    public void setHandler(MouseHandler handler) {
        this.handler = handler;
    }

    /**
     * Returns the list of registered {@link MouseEventType}s that this class listens for.
     *
     * @return the list of mouse event types
     */
    public List<MouseEventType> getMouseEventTypes() {
        return mouseEventTypes;
    }

    /**
     * Sets the list of {@link MouseEventType}s that this class should listen for.
     *
     * @param mouseEventTypes the list of mouse event types to set
     */
    public void setMouseEventTypes(List<MouseEventType> mouseEventTypes) {
        this.mouseEventTypes = mouseEventTypes;
    }
}
