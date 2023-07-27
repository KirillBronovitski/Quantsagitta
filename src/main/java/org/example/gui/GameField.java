package org.example.gui;

import javax.swing.*;
import java.awt.*;

/**
 * The GameField class is a subclass of the JPanel class, which provides us the functionality of creating a
 * component with methods defining key binding, component size and painting behaviour, so we can override
 * them to customize and force this component do what we want it to do, e.g. painting a sprite
 * <p>
 * This class introduces the content of the game field, including the protagonist's sprite
 */
public class GameField extends JPanel {
    
    private static final Dimension SCREEN_SIZE = Toolkit.getDefaultToolkit().getScreenSize();
    private static final boolean MOVING = true;
    
    private static final Dimension PREFERRED_DIMENSION =
            new Dimension(SCREEN_SIZE.width * 5 / 8, SCREEN_SIZE.height * 3 / 4);
    
    private final Sprite protagonistSprite;
    
    public GameField() {
        // call parent constructor
        super();
        // set initial state of the sprite
        protagonistSprite = new Sprite( // todo>> try changing parameters of the sprite and restart the application, see what happens
                // todo >> you may also try to draw something different from a triangle, it's up to you what do you want to draw
                new Dimension(PREFERRED_DIMENSION.width / 2, PREFERRED_DIMENSION.height / 2), // initial sprite position
                new Dimension(50, 50), // initial sprite size
                Direction.RIGHT, // initial sprite direction
                !MOVING // initially sprite isn't moving, for now our sprite can't move, we will implement this on one of the future dev iterations
        );
        
        // call repaint component
        repaint(); // will call our overridden in this class `paintComponent(Graphics g)`
    }
    
    /**
     * We overrode this method of the JComponent class, so it will return to us our default predefined PREFERRED_SIZE
     * or already set up preferred size if it was defined ar changed earlier
     *
     * @return Dimension object with the size of game field element
     */
    @Override
    public Dimension getPreferredSize() {
        if (isPreferredSizeSet()) {
            return super.getPreferredSize();
        }
        return PREFERRED_DIMENSION;
    }
    
    /**
     * We overrode this method of the JComponent class, so we able now to draw whatever we want
     *
     * @param g the <code>Graphics</code> object to handle graphics operation
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        protagonistSprite.draw(g);
    }
}
