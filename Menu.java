	import java.awt.*;
	import java.awt.event.*;
	import javax.swing.*;

	public class Menu extends JFrame {

	   public static void main(String[] args) {
	          // A main routine that allows this class to be run
	          // as a stand-alone application.  It just opens a frame.
	      new Menu();
	   }

	   JRadioButtonMenuItem black, red, green, blue, cyan, magenta, 
	                           yellow, white, custom;
	        // Items for the "Color" menu, which controls the drawing color.
	        // They form a group in which only one item can be selected.
	        // When the user starts drawing, the color is determined by
	        // checking to see which of the items is selected.

	   JRadioButtonMenuItem curve, straightLine, rectangle, oval,
	                        roundRect, filledRectangle, filledOval, filledRoundRect;
	        // Items for the "Shape" menu, which determine the shape to be drawn.

	   JRadioButtonMenuItem noSymmetry, twoWay, fourWay, eightWay;
	        // Items for the "Symmetry" menu, which determine which
	        // reflections of the basic figure should be drawn.

	   public boolean standAlone = true;
	        // If a frame is created by an applet, the applet should
	        // set this variable to false.  Otherwise, an error will
	        // be generated when the user selects the "Quit" command,
	        // since that command will call System.exit() if standalone
	        // is true.  The applet should also call the frame's
	        // setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE). 

	   public Menu() {  // replaces init() method.
	         // Constructor creates a drawing area and uses it as its
	         // content pane.  It also sets up the menu bar.

	      super("Graphics Menu");  // Set a title for the window.

	      Display canvas = new Display();  // The drawing area.
	      setContentPane(canvas);

	      // Create menu bar and menus.

	      JMenuBar menubar = new JMenuBar();
	      JMenu controlMenu = new JMenu("Control",true);
	      menubar.add(controlMenu);
	      JMenu colorMenu = new JMenu("Color",true);
	      menubar.add(colorMenu);
	      JMenu shapeMenu = new JMenu("Shape",true);
	      menubar.add(shapeMenu);
	      JMenu symmetryMenu = new JMenu("Symmetry",true);
	      menubar.add(symmetryMenu);
	      setJMenuBar(menubar);

	      // Set up the "Control" menu, and set the canvas to respond
	      // to commands from this menu.  Add accelerators for some
	      // of the commands.

	      controlMenu.add("Fill with Black").addActionListener(canvas);
	      controlMenu.add("Fill with Red").addActionListener(canvas);
	      controlMenu.add("Fill with Green").addActionListener(canvas);
	      controlMenu.add("Fill with Blue").addActionListener(canvas);
	      controlMenu.add("Fill with Cyan").addActionListener(canvas);
	      controlMenu.add("Fill with Magenta").addActionListener(canvas);
	      controlMenu.add("Fill with Yellow").addActionListener(canvas);
	      controlMenu.add("Fill with White").addActionListener(canvas);
	      controlMenu.add("Fill with Custom").addActionListener(canvas);
	      controlMenu.addSeparator();
	      JMenuItem customItem = new JMenuItem("Set Custom Color...");
	      customItem.addActionListener(canvas);
	      customItem.setAccelerator( KeyStroke.getKeyStroke("ctrl T") );
	      controlMenu.add(customItem);
	      JMenuItem clearItem = new JMenuItem("Clear");
	      clearItem.addActionListener(canvas);
	      clearItem.setAccelerator( KeyStroke.getKeyStroke("ctrl K") );
	      controlMenu.add(clearItem);
	      JMenuItem undoItem = new JMenuItem("Undo");
	      undoItem.addActionListener(canvas);
	      undoItem.setAccelerator( KeyStroke.getKeyStroke("ctrl Z") );
	      controlMenu.add(undoItem);
	      JMenuItem quitItem = new JMenuItem("Quit");
	      quitItem.setAccelerator( KeyStroke.getKeyStroke("ctrl Q") );
	      quitItem.addActionListener(canvas);
	      controlMenu.add(quitItem);

	      // Set up the "Color" menu, with all the items in a button group.

	      ButtonGroup colorGroup = new ButtonGroup();
	      black = new JRadioButtonMenuItem("Black");
	      colorGroup.add(black);
	      colorMenu.add(black);
	      red = new JRadioButtonMenuItem("Red");
	      colorGroup.add(red);
	      colorMenu.add(red);
	      green = new JRadioButtonMenuItem("Green");
	      colorGroup.add(green);
	      colorMenu.add(green);
	      blue = new JRadioButtonMenuItem("Blue");
	      colorGroup.add(blue);
	      colorMenu.add(blue);
	      cyan = new JRadioButtonMenuItem("Cyan");
	      colorGroup.add(cyan);
	      colorMenu.add(cyan);
	      magenta = new JRadioButtonMenuItem("Magenta");
	      colorGroup.add(magenta);
	      colorMenu.add(magenta);
	      yellow = new JRadioButtonMenuItem("Yellow");
	      colorGroup.add(yellow);
	      colorMenu.add(yellow);
	      white = new JRadioButtonMenuItem("White");
	      colorGroup.add(white);
	      colorMenu.add(white);
	      custom = new JRadioButtonMenuItem("Custom Color");
	      colorGroup.add(custom);
	      colorMenu.add(custom);
	      black.setSelected(true);

	      // Set up the "Shape" menu.

	      ButtonGroup shapeGroup = new ButtonGroup();
	      curve = new JRadioButtonMenuItem("Curve");
	      shapeGroup.add(curve);
	      shapeMenu.add(curve);
	      straightLine = new JRadioButtonMenuItem("Straight Line");
	      shapeGroup.add(straightLine);
	      shapeMenu.add(straightLine);
	      rectangle = new JRadioButtonMenuItem("Rectangle");
	      shapeGroup.add(rectangle);
	      shapeMenu.add(rectangle);
	      oval = new JRadioButtonMenuItem("Oval");
	      shapeGroup.add(oval);
	      shapeMenu.add(oval);
	      roundRect = new JRadioButtonMenuItem("RoundRect");
	      shapeGroup.add(roundRect);
	      shapeMenu.add(roundRect);
	      filledRectangle = new JRadioButtonMenuItem("Filled Rectangle");
	      shapeGroup.add(filledRectangle);
	      shapeMenu.add(filledRectangle);
	      filledOval = new JRadioButtonMenuItem("Filled Oval");
	      shapeGroup.add(filledOval);
	      shapeMenu.add(filledOval);
	      filledRoundRect = new JRadioButtonMenuItem("Filled RoundRect");
	      shapeGroup.add(filledRoundRect);
	      shapeMenu.add(filledRoundRect);
	      curve.setSelected(true);

	      // Set up the "Symmetry" menu.

	      ButtonGroup symmetryGroup = new ButtonGroup();
	      noSymmetry = new JRadioButtonMenuItem("None");
	      noSymmetry.setAccelerator( KeyStroke.getKeyStroke("ctrl 0") );
	      symmetryGroup.add(noSymmetry);
	      symmetryMenu.add(noSymmetry);
	      twoWay = new JRadioButtonMenuItem("Two-way");
	      twoWay.setAccelerator( KeyStroke.getKeyStroke("ctrl 2") );
	      symmetryGroup.add(twoWay);
	      symmetryMenu.add(twoWay);
	      fourWay = new JRadioButtonMenuItem("Four-way");
	      fourWay.setAccelerator( KeyStroke.getKeyStroke("ctrl 4") );
	      symmetryGroup.add(fourWay);
	      symmetryMenu.add(fourWay);
	      eightWay = new JRadioButtonMenuItem("Eight-way");
	      eightWay.setAccelerator( KeyStroke.getKeyStroke("ctrl 8") );
	      symmetryGroup.add(eightWay);
	      symmetryMenu.add(eightWay);
	      noSymmetry.setSelected(true);

	      // Set size, etc., of frame and make it visible.

	      pack();
	      setLocation(75,50);
	      setResizable(false);
	      setDefaultCloseOperation(EXIT_ON_CLOSE);
	      show();

	   }  // end constructor



	   private class Display extends JPanel 
	              implements MouseListener, MouseMotionListener, ActionListener {

	           // Nested class Display represents the drawing surface of the
	           // applet.  It lets the user use the mouse to draw colored curves
	           // and shapes.  The current color is specified by the pop-up menu
	           // colorChoice.  The current shape is specified by another pop-up menu,
	           // figureChoice.  (These are instance variables in the main class.)
	           // The panel also listens for action events from buttons
	           // named "Clear" and "Set Background".  The "Clear" button fills
	           // the panel with the current background color.  The "Set Background"
	           // button sets the background color to the current drawing color and
	           // then clears.  These buttons are set up in the main class.


	      private final static int
	                 CURVE = 0,
	                 LINE = 1,
	                 RECT = 2,               // Some constants that code
	                 OVAL = 3,               // for the different types of
	                 ROUNDRECT = 4,          // figure the program can draw.
	                 FILLED_RECT = 5,
	                 FILLED_OVAL = 6,
	                 FILLED_ROUNDRECT = 7;

	      private final static int
	                  NO_SYMMETRY = 0,       // Some constants that code for 
	                  SYMMETRY_2 = 1,        // the different symmetry styles.
	                  SYMMETRY_4 = 2,        
	                  SYMMETRY_8 = 3;


	      Color customColor = Color.gray;  // The custom color that is used
	                                       // when the user selects "Custom Color"
	                                       // as the drawing color or "Fill with Custom"
	                                       // from the "Control" menu.  This color
	                                       // is changed when the user selects the
	                                       // "Set Custom Color..." command.

	      /* Some variables used for backing up the contents of the panel. */

	      Image OSI;  // The off-screen image (created in checkOSI()).

	      int widthOfOSI, heightOfOSI;  // Current width and height of OSI.  These
	                                    // are checked against the size of the applet,
	                                    // to detect any change in the panel's size.
	                                    // If the size has changed, a new OSI is created.
	                                    // The picture in the off-screen image is lost
	                                    // when that happens.

	      Image undoBuffer;  // An off-screen image that is used to implement
	                         // the undo operation.  When the user begins
	                         // a drawing operation, the OSI is copied to
	                         // undoBuffer.  If the user selects the "Undo" 
	                         // command, the OSI and the undoBuffer are swapped
	                         // and the panel is repainted to show the previous image.


	      /* The following variables are used when the user is sketching a
	         curve while dragging a mouse. */

	      private int mouseX, mouseY;   // The location of the mouse.

	      private int prevX, prevY;     // The previous location of the mouse.

	      private int startX, startY;   // The starting position of the mouse.
	                                    // (Not used for drawing curves.)

	      private boolean dragging;     // This is set to true when the user is drawing.

	      private int figure;    // What type of figure is being drawn.  This is
	                             //    specified by the figureChoice menu.

	      private int symmetry;  // What type of symmetry style is being used.  This is
	                             //    specified by the symmetryChoice menu.

	      private Graphics dragGraphics;  // A graphics context for the off-screen image,
	                                      // to be used while a drag is in progress.

	      private Color dragColor;  // The color that is used for the figure that is
	                                // being drawn.

	      Display() {
	             // Constructor.  When this component is first created, it is set to
	             // listen for mouse events and mouse motion events from
	             // itself.  The initial background color is white.
	         addMouseListener(this);
	         addMouseMotionListener(this);
	         setBackground(Color.white);
	         setPreferredSize( new Dimension(450,450) );
	      }


	      private Color getSelectedColor() {
	            // Check the "Color" menu and return the color
	            // that is currently selected.
	         if (black.isSelected())
	            return Color.black;
	         else if (red.isSelected())
	            return Color.red;
	         else if (green.isSelected())
	            return Color.green;
	         else if (blue.isSelected())
	            return Color.blue;
	         else if (cyan.isSelected())
	            return Color.cyan;
	         else if (magenta.isSelected())
	            return Color.magenta;
	         else if (yellow.isSelected())
	            return Color.yellow;
	         else if (white.isSelected())
	            return Color.white;
	         else
	            return customColor;
	      }


	      private int getSelectedShape() {
	            // Check the "Shape" menu and return the code
	            // for the shape that is currently selected.
	         if (curve.isSelected())
	            return CURVE;
	         else if (straightLine.isSelected())
	            return LINE;
	         else if (rectangle.isSelected())
	            return RECT;
	         else if (oval.isSelected())
	            return OVAL;
	         else if (roundRect.isSelected())
	            return ROUNDRECT;
	         else if (filledRectangle.isSelected())
	            return FILLED_RECT;
	         else if (filledOval.isSelected())
	            return FILLED_OVAL;
	         else
	            return FILLED_ROUNDRECT;
	      }


	      private int getSelectedSymmetry() {
	            // Check the "Symmetry" menu and return the code
	            // for the type of symmetry that is currently selected.
	         if (noSymmetry.isSelected())
	            return NO_SYMMETRY;
	         else if (twoWay.isSelected())
	            return SYMMETRY_2;
	         else if (fourWay.isSelected())
	            return SYMMETRY_4;
	         else 
	            return SYMMETRY_8;
	      }


	      private void drawFigure(Graphics g, int shape, int x1, int y1, int x2, int y2) {
	            // This method is called to do ALL drawing in this applet!
	            // Draws a shape in the graphics context g.
	            // The shape parameter tells what kind of shape to draw.  This
	            // can be LINE, RECT, OVAL, ROUNTRECT, FILLED_RECT,
	            // FILLED_OVAL, or FILLED_ROUNDRECT.  (Note that a CURVE is
	            // drawn by drawing multiple LINES, so the shape parameter is
	            // never equal to CURVE.)  For a LINE, a line is drawn from
	            // the point (x1,y1) to (x2,y2).  For other shapes,  the
	            // points (x1,y1) and (x2,y2) give two corners of the shape
	            // (or of a rectangle that contains the shape).
	         if (shape == LINE) {
	               // For a line, just draw the line between the two points.
	            g.drawLine(x1,y1,x2,y2);
	            return;
	         }
	         int x, y;  // Top left corner of rectangle that contains the figure.
	         int w, h;  // Width and height of rectangle that contains the figure.
	         if (x1 >= x2) {  // x2 is left edge
	            x = x2;
	            w = x1 - x2;
	         }
	         else {          // x1 is left edge
	            x = x1;
	            w = x2 - x1;
	         }
	         if (y1 >= y2) {  // y2 is top edge
	            y = y2;
	            h = y1 - y2;
	         }
	         else {          // y1 is top edge.
	            y = y1;
	            h = y2 - y1;
	         }
	         switch (shape) {   // Draw the appropriate figure.
	            case RECT:
	               g.drawRect(x, y, w, h);
	               break;
	            case OVAL:
	               g.drawOval(x, y, w, h);
	               break;
	            case ROUNDRECT:
	               g.drawRoundRect(x, y, w, h, 20, 20);
	               break;
	            case FILLED_RECT:
	               g.fillRect(x, y, w, h);
	               break;
	            case FILLED_OVAL:
	               g.fillOval(x, y, w, h);
	               break;
	            case FILLED_ROUNDRECT:
	               g.fillRoundRect(x, y, w, h, 20, 20);
	               break;
	         }
	      }


	      private void putMultiFigure(Graphics g, int shape, int x1, int y1, int x2, int y2) {
	            // Draws the shape and possibly some of its reflections.
	            // The reflections that are drawn depend on the selected
	            // item in symmetryChoice.  The shapes are drawn by calling
	            // the drawFigure method.

	         int width = getWidth();
	         int height = getHeight();

	         drawFigure(g,shape,x1,y1,x2,y2);  // Draw the basic figure

	         if (symmetry >= SYMMETRY_2) {  // Draw the horizontal reflection.
	            drawFigure(g, shape, width - x1, y1, width - x2, y2);
	         }

	         if (symmetry >= SYMMETRY_4) {  // Draw the two vertical reflections.
	            drawFigure(g, shape, x1, height - y1, x2, height - y2);
	            drawFigure(g, shape, width - x1, height - y1, width - x2, height - y2);
	         }

	         if (symmetry == SYMMETRY_8) {  // Draw the four diagonal reflections.
	            int a1 = (int)( ((double)y1 / height) * width );
	            int b1 = (int)( ((double)x1 / width) * height );
	            int a2 = (int)( ((double)y2 / height) * width );
	            int b2 = (int)( ((double)x2 / width) * height );
	            drawFigure(g, shape, a1, b1, a2, b2);
	            drawFigure(g, shape, width - a1, b1, width - a2, b2);
	            drawFigure(g, shape, a1, height - b1, a2, height - b2);
	            drawFigure(g, shape, width - a1, height - b1, width - a2, height - b2);
	         }

	      }


	      private void repaintRect(int x1, int y1, int x2, int y2) {
	            // Call repaint on a rectangle that contains the points (x1,y1)
	            // and (x2,y2).  (Add a 1-pixel border along right and bottom 
	            // edges to allow for the pen overhang when drawing a line.)
	         int x, y;  // top left corner of rectangle that contains the figure
	         int w, h;  // width and height of rectangle that contains the figure
	         if (x2 >= x1) {  // x1 is left edge
	            x = x1;
	            w = x2 - x1;
	         }
	         else {          // x2 is left edge
	            x = x2;
	            w = x1 - x2;
	         }
	         if (y2 >= y1) {  // y1 is top edge
	            y = y1;
	            h = y2 - y1;
	         }
	         else {          // y2 is top edge.
	            y = y2;
	            h = y1 - y2;
	         }
	         repaint(x,y,w+1,h+1);
	      }


	      private void repaintMultiRect(int x1, int y1, int x2, int y2) {
	            // Call repaint on a rectangle that contains the points (x1,y1)
	            // and (x2,y2).  Also call repaint on reflections of this
	            // rectangle, depending on the type of symmetry.  The
	            // rects are repainted by calling repaintRect().
	         int width = getWidth();
	         int height = getHeight();
	         repaintRect(x1,y1,x2,y2); // repaint the original rect
	         if (symmetry >= SYMMETRY_2) {  // repaint the horizontal reflection.
	            repaintRect(width - x1, y1, width - x2, y2);
	         }
	         if (symmetry >= SYMMETRY_4) {  // repaint the two vertical reflections.
	            repaintRect(x1, height - y1, x2, height - y2);
	            repaintRect(width - x1, height - y1, width - x2, height - y2);
	         }
	         if (symmetry == SYMMETRY_8) {  // repaint the four diagonal reflections.
	            int a1 = (int)( ((double)y1 / height) * width );
	            int b1 = (int)( ((double)x1 / width) * height );
	            int a2 = (int)( ((double)y2 / height) * width );
	            int b2 = (int)( ((double)x2 / width) * height );
	            repaintRect(a1, b1, a2, b2);
	            repaintRect(width - a1, b1, width - a2, b2);
	            repaintRect(a1, height - b1, a2, height - b2);
	            repaintRect(width - a1, height - b1, width - a2, height - b2);
	         }
	      }


	      private void checkOSI() {
	           // This method is responsible for creating the off-screen image. 
	           // It should be called before using the OSI.  It will make a new OSI if
	           // the size of the panel changes.
	         if (OSI == null || widthOfOSI != getSize().width || heightOfOSI != getSize().height) {
	                // Create the OSI, or make a new one if panel size has changed.
	            OSI = null;  // (If OSI already exists, this frees up the memory.)
	            undoBuffer = null;  // (Free memory.)
	            widthOfOSI = getWidth();
	            heightOfOSI = getHeight();
	            OSI = createImage(widthOfOSI,heightOfOSI);
	            Graphics OSG = OSI.getGraphics();  // Graphics context for drawing to OSI.
	            OSG.setColor(getBackground());
	            OSG.fillRect(0, 0, widthOfOSI, heightOfOSI);
	            OSG.dispose();
	            undoBuffer = createImage(widthOfOSI,heightOfOSI);
	            OSG = undoBuffer.getGraphics();  // Graphics context for drawing to undoBuffer
	            OSG.setColor(getBackground());
	            OSG.fillRect(0, 0, widthOfOSI, heightOfOSI);
	            OSG.dispose();
	         }
	      }


	      public void paintComponent(Graphics g) {
	           // Copy the off-screen image to the screen,
	           // after checking to make sure it exists.  Then,
	           // if a shape other than CURVE is being drawn, 
	           // draw it on top of the image from the OSI.
	         checkOSI();
	         g.drawImage(OSI, 0, 0, this);
	         if (dragging && figure != CURVE) {
	            g.setColor(dragColor);
	            putMultiFigure(g,figure,startX,startY,mouseX,mouseY);
	         }
	      }


	      public void actionPerformed(ActionEvent evt) {
	              // Respond when the user selects an item from the "Control" menu.
	         String command = evt.getActionCommand();
	         checkOSI();
	         if (command.equals("Fill with Black"))
	            clear(Color.black);
	         else if (command.equals("Fill with Red"))
	            clear(Color.red);
	         else if (command.equals("Fill with Green"))
	            clear(Color.green);
	         else if (command.equals("Fill with Blue"))
	            clear(Color.blue);
	         else if (command.equals("Fill with Cyan"))
	            clear(Color.cyan);
	         else if (command.equals("Fill with Magenta"))
	            clear(Color.magenta);
	         else if (command.equals("Fill with Yellow"))
	            clear(Color.yellow);
	         else if (command.equals("Fill with White"))
	            clear(Color.white);
	         else if (command.equals("Fill with Custom"))
	            clear(customColor);
	         else if (command.equals("Set Custom Color...")) {
	            Color c = JColorChooser.showDialog(this,"Select Custom Color",customColor);
	            if (c != null) {
	                  // Change the custom color and select it for use as
	                  // the drawing color.
	               customColor = c;
	               custom.setSelected(true);
	            }
	         }
	         else if (command.equals("Clear")) {
	               // Clear to current background color.
	            Graphics g = OSI.getGraphics();
	            g.setColor(getBackground());
	            g.fillRect(0,0,getSize().width,getSize().height);
	            g.dispose();
	            repaint();
	         }
	         else if (command.equals("Undo")) {
	               // Undo the most recent drawing operation
	               // by swapping OSI with undoBuffer.
	            Image temp = OSI;
	            OSI = undoBuffer;
	            undoBuffer = temp;
	            repaint();
	         }
	         else if (command.equals("Quit")) {
	               // Close the window and exit.  Note:  The
	               // exit command will cause an error when
	               // the frame is opened from an applet.
	               // An applet should set the frame's standAlone
	               // variable to false after creating the frame. 
	            dispose();
	            if (standAlone)
	               System.exit(0);
	         }
	      }

	      private void clear(Color background) {
	            // Fill with the specified color.  If the
	            // color is equal to the current drawing color, then
	            // the current drawing color is changed, so that
	            // drawing operations will not be invisible.
	         setBackground(background);
	         if (background.equals(getSelectedColor())) {
	            if (background.equals(Color.black))
	               white.setSelected(true);  // On a black background, draw in white.
	            else
	               black.setSelected(true);  // On other backgrounds, use black.
	         }
	         Graphics g = OSI.getGraphics();
	         g.setColor(getBackground());
	         g.fillRect(0,0,getSize().width,getSize().height);
	         g.dispose();
	         repaint();
	      }


	      public void mousePressed(MouseEvent evt) {
	              // This is called when the user presses the mouse on the
	              // panel.  This begins a draw operation in which the user
	              // sketches a curve or draws a shape.  (Note that curves
	              // are handled differently from other shapes.  For CURVE,
	              // a new segment of the curve is drawn each time the user
	              // moves the mouse.  For the other shapes, a "rubber band
	              // cursor" is used.  That is, the figure is drawn between
	              // the starting point and the current mouse location.)

	         if (dragging == true)  // Ignore mouse presses that occur
	             return;            //    when user is already drawing a curve.
	                                //    (This can happen if the user presses
	                                //    two mouse buttons at the same time.)

	         prevX = startX = evt.getX();  // Save mouse coordinates.
	         prevY = startY = evt.getY();

	         figure = getSelectedShape();      // Get data from menus for drawing.
	         symmetry = getSelectedSymmetry();
	         dragColor = getSelectedColor();  

	         checkOSI();

	         Graphics undoGraphics = undoBuffer.getGraphics();
	         undoGraphics.drawImage(OSI,0,0,null);  // Remember the current image,
	                                                // for "Undo" operations,
	                                                // before changing the image.
	         undoGraphics.dispose();   

	         dragGraphics = OSI.getGraphics();
	         dragGraphics.setColor(dragColor);

	         dragging = true;  // Start drawing.

	      } // end mousePressed()


	      public void mouseReleased(MouseEvent evt) {
	              // Called whenever the user releases the mouse button.
	              // If the user was drawing a shape, we make the shape
	              // permanent by drawing it to the off-screen image.
	          if (dragging == false)
	             return;  // Nothing to do because the user isn't drawing.
	          dragging = false;
	          mouseX = evt.getX();
	          mouseY = evt.getY();
	          if (figure == CURVE) {
	                 // A CURVE is drawn as a series of LINEs
	              putMultiFigure(dragGraphics,LINE,prevX,prevY,mouseX,mouseY);
	              repaintMultiRect(prevX,prevY,mouseX,mouseY);
	          }
	          else if (figure == LINE) {
	             repaintMultiRect(startX,startY,prevX,prevY);
	             if (mouseX != startX || mouseY != startY) {
	                   // Draw the line only if it has non-zero length.
	                putMultiFigure(dragGraphics,figure,startX,startY,mouseX,mouseY);
	                repaintMultiRect(startX,startY,mouseX,mouseY);
	             }
	          }
	          else {
	             repaintMultiRect(startX,startY,prevX,prevY);
	             if (mouseX != startX && mouseY != startY) {
	                   // Draw the shape only if both its height
	                   // and width are both non-zero.
	                putMultiFigure(dragGraphics,figure,startX,startY,mouseX,mouseY);
	                repaintMultiRect(startX,startY,mouseX,mouseY);
	             }
	          }
	          dragGraphics.dispose();
	          dragGraphics = null;
	      }


	      public void mouseDragged(MouseEvent evt) {
	               // Called whenever the user moves the mouse while a mouse button
	               // is down.  If the user is drawing a curve, draw a segment of
	               // the curve on the off-screen image, and repaint the part
	               // of the panel that contains the new line segment.  Otherwise,
	               // just call repaint and let paintComponent() draw the shape on
	               // top of the picture in the off-screen image.

	          if (dragging == false)
	             return;  // Nothing to do because the user isn't drawing.

	          mouseX = evt.getX();   // x-coordinate of mouse.
	          mouseY = evt.getY();   // y=coordinate of mouse.

	          if (figure == CURVE) { 
	                 // A CURVE is drawn as a series of LINEs.
	             putMultiFigure(dragGraphics,LINE,prevX,prevY,mouseX,mouseY);
	             repaintMultiRect(prevX,prevY,mouseX,mouseY);
	          }
	          else {
	                // Repaint two rectangles:  The one that contains the previous
	                // version of the figure, and the one that will contain the
	                // new version.  The first repaint is necessary to restore
	                // the picture from the off-screen image in that rectangle.
	             repaintMultiRect(startX,startY,prevX,prevY);
	             repaintMultiRect(startX,startY,mouseX,mouseY);
	          }

	          prevX = mouseX;  // Save coords for the next call to mouseDragged or mouseReleased.
	          prevY = mouseY;

	      } // end mouseDragged.


	      public void mouseEntered(MouseEvent evt) { }   // Some empty routines.
	      public void mouseExited(MouseEvent evt) { }    //    (Required by the MouseListener
	      public void mouseClicked(MouseEvent evt) { }   //    and MouseMotionListener
	      public void mouseMoved(MouseEvent evt) { }     //    interfaces).


	   } // end nested class Display


	} // end class Menu




