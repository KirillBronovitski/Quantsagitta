package org.example.gui;

import java.awt.*;

/**
 * For the starter let's create a triangle sprite with an apex directing as specified by
 * constructor `direction` parameter
 */
@SuppressWarnings("unused")
public class Sprite {
    private Direction direction;
    private boolean isMoving;
    private Dimension position;
    private Dimension size;
    
    public Sprite(Dimension position, Dimension size, Direction direction, boolean isMoving) {
        this.position = position;
        this.size = size;
        this.direction = direction;
        this.isMoving = isMoving;
    }
    
    // we will use some of the following setters to change sprite's properties on the fly (reacting on keyboard events)
    public void setDirection(Direction direction) {
        this.direction = direction;
    }
    
    public void setMoving(boolean moving) {
        isMoving = moving;
    }
    
    public void setPosition(Dimension position) {
        this.position = position;
    }
    
    public void setSize(Dimension size) {
        this.size = size;
    }
    
    /**
     * This will actually draw a directed triangle, as specified by the current this.direction property value
     *
     * @param g - graphics handler providing means to draw whatever we want to
     */
    public void draw(Graphics g) {
        int halfSide = size.width / 2;
        int[] xPoints = {position.width, position.width + size.width, position.width + halfSide};
        int[] yPoints = {position.height, position.height, position.height - size.height};
        switch (direction) {
            case UP -> {
                xPoints = new int[]{position.width, position.width + size.width, position.width + halfSide};
                yPoints = new int[]{position.height, position.height, position.height - size.height};
            }
            case DOWN -> {
                xPoints = new int[]{position.width, position.width + size.width, position.width + halfSide};
                yPoints = new int[]{position.height, position.height, position.height + size.height};
            }
            case LEFT -> {
                xPoints = new int[]{position.width, position.width, position.width - size.width};
                yPoints = new int[]{position.height, position.height + size.height, position.height + halfSide};
            }
            case RIGHT -> {
                xPoints = new int[]{position.width, position.width, position.width + size.width};
                yPoints = new int[]{position.height, position.height + size.height, position.height + halfSide};
            }
        }
        
        // Draw the triangle using the specified points
//        g.setColor(Color.LIGHT_GRAY); // you can use predefined color-constants
        g.setColor(new Color(0x395BC8)); // or choose free color using hexadecimal RGB color representation
        g.fillPolygon(xPoints, yPoints, 3); // draw a filled polygon, which, in our case, is an equilateral triangle
    }
}
