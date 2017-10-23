import javax.swing.JFrame;


/* In this assignment you will apply what we've learned about graphics and how images are displayed.....
 * 
 * Remember that a digital image is a matrix of dots (called pixels);  each pixel has a red color value, a green color value, 
 * and a blue color value.  Those three color values are collectively called the RGB value of the pixel.
 * 
 * Run the program - and look at the picture!  It's just meaningless dots!  What is this, some kind of joke?
 * 
 * Hardly.  You are one of the country's top experts in encryption (otherwise known as secret codes).
 * The agency you work for has intercepted a message from the Internet, containing a picture which reveals the location
 * of a secret meeting for an enemy organization.  Of course, the enemy is too smart to just send a plain picture showing
 * the location.....first, they disguised the picture so that, unless you know how to decipher it, the picture is just
 * meaningless random garbage.
 *   
 * Your mission - should you choose to accept it:  decode the picture and reveal the location of the secret meeting!  
 *  
 * Fortunately, your agency has also identified the algorithm the enemy used to encode the picture:
 * 		1) All pixels have been set to a random red and green value to disguise the true image.  This is what makes the picture 
 * 			look like "static".  To undo this, you need to set the red and green values of each pixel in the image to 0.
 * 				a) the ImageDisplay class has methods called setRed() and setGreen() which you can use to do this
 * 		2) The blue value of each pixel has been distorted.  To correct the blue value of each pixel: 
 * 				a) get the current blue value.  If it is greater than 16, it's garbage....so set it to 0
 * 				b) otherwise, set it to it's current value multiplied by 16.     
 * 				c) the ImageDisplay class has methods called getBlue() and setBlue() which you can use to do this
 * 
 * The agency needs your help to implement this algorithm.....complete the program below, and the decoded picture will appear!
 * 
 */

public class Main {

	public static void main(String[] args) {
		JFrame theApp = new JFrame();
		ImageDisplay theDisplay = new ImageDisplay("west-puzzle.png");
		
		theApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		theApp.add(theDisplay);
		theApp.pack();

		/*
		 * what code can you add here to decrypt the picture?  
		 * 
		 * Think about what you need to do:
		 * 		1) loop through each pixel in the image (Remember how we used getWidth() and getHeight()
		 * 			to draw with pixels in the previous assignments?  These will help you with the loops you need)
		 * 		2) set the pixel's red and green values to 0
		 * 		3) correct the pixel's blue value (if it's less than 16, multiply it by 16;  otherwise set it 0
		 * 
		 */
		
		theApp.setVisible(true);
	}

}
