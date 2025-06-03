package com.codeforall.online.simplegraphics.mouse;

/**
 * Interface to be implemented by all classes that want to receive mouse events
 *
 * @see MouseEvent
 */
public interface MouseHandler {

    /**
     * @param e the event
     * @see java.awt.event.MouseListener#mouseClicked(java.awt.event.MouseEvent)
     */
    void mouseClicked(MouseEvent e);

    /**
     * @param e the event
     * @see java.awt.event.MouseMotionListener#mouseMoved(java.awt.event.MouseEvent)
     */
    void mouseMoved(MouseEvent e);

    /**
     * @param e the event
     * @see java.awt.event.MouseListener#mousePressed(java.awt.event.MouseEvent) 
     */
    void mousePressed(MouseEvent e);

    /**
     * @param e the event
     * @see java.awt.event.MouseListener#mouseReleased(java.awt.event.MouseEvent) 
     */
    void mouseReleased(MouseEvent e);

    /**
     * @param e the event
     * @see java.awt.event.MouseListener#mouseEntered(java.awt.event.MouseEvent) 
     */
    void mouseEntered(MouseEvent e);

    /**
     * @param e the event
     * @see java.awt.event.MouseListener#mouseExited(java.awt.event.MouseEvent)  
     */
    void mouseExited(MouseEvent e);

    /**
     * @param e the event
     * @see java.awt.event.MouseMotionListener#mouseDragged(java.awt.event.MouseEvent) 
     */
    void mouseDragged(MouseEvent e);
}
