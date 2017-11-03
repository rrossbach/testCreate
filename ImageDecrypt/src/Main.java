import javax.swing.JFrame;

/* In this assignment you will continue to learn about computer graphics and how they work - and solve some cool puzzles
 * along the way!
 * 
 * A digital image is a matrix of dots (called pixels);  each pixel has a red color value, a green color value,
 * and a blue color value.  Those three color values are collectively called the RGB value of the pixel.  The combination
 * of the values of those 3 colors determines the visible color of the pixel.
 * 
 * Run this program - and look at the picture!  It's just meaningless dots!  What is this, some kind of joke?
 * 
 * Hardly.  You are one of the country's top experts in encryption (otherwise known as secret codes).
 * The agency you work for has intercepted a message from the Internet, containing pictures which reveals the location
 * of two secret meetings for an enemy organization.  Of course, the enemy is too smart to just send a plain picture showing
 * the location.....first, they disguised the picture so that, unless you know how to decipher it, the picture is just
 * meaningless random garbage.
 *   
 * Your mission - should you choose to accept it:  decode the picture and reveal the location of the secret meetings!
 *  
 * Fortunately, others in your agency have identified the algorithms the enemy used to encode the pictures:
 *
 *	FOR SECRET MEETING #1:
 * 		1) All pixels have been set to a random red and green value to disguise the true image.  This is what makes the picture
 * 			look like "static".  To undo this, you need to set the red and green values of each pixel in the image to 0.
 * 				a) the ImageDisplay class has methods called setRed() and setGreen() which you can use to do this
 * 		2) The blue value of each pixel has been distorted.  To correct the blue value of each pixel: 
 * 				a) get the current blue value.  If it is greater than 16, it's garbage....so set it to 0
 * 				b) otherwise, set it to it's current value multiplied by 16.     
 * 				c) the ImageDisplay class has methods called getBlue() and setBlue() which you can use to do this
 *
 * 	FOR SECRET MEETING #2....the algorithm is very similar except:
 * 		1) All pixels have been set to a random blue and green value......
 * 		2) The red value of each pixel has been distorted;  they are all too small by a factor of 10
 * 			(in other words, the current red value needs to be multiplied by 10 to get the correct value)
 *
 * The agency needs your help to implement this algorithm.....complete the program below, and the decoded picture will appear!
 * 
 */

public class Main {

	public static void main(String[] args) {
		JFrame locationOne = new JFrame(), locationTwo = new JFrame();
		ImageDisplay meetingOne = new ImageDisplay("MeetingLocation1.png");
		ImageDisplay meetingTwo = new ImageDisplay("MeetingLocation2.png");
		
		locationOne.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		locationTwo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		locationOne.setTitle("Meeting Location #1");
		locationTwo.setTitle("Meeting Location #2");
		locationOne.add(meetingOne);
		locationTwo.add(meetingTwo);
		locationOne.pack();
		locationTwo.pack();

		/*
		 * what code can you add here to decrypt the picture, before displaying it?
		 * 
		 * Think about what you need to do:
		 * 		1) loop through each pixel in the image (Remember how we used getWidth() and getHeight()
		 * 			to draw with lines in the previous assignments?  These will help you with the loops you need)
		 * 		2) set the pixel's red and green values to 0
		 * 		3) correct the pixel's blue value (if it's less than 16, multiply it by 16;  otherwise set it 0
		 * 
		 */
		meetingOne.setRed(0,0,0);
		meetingOne.setRed(1,0,0);
		meetingOne.setRed(2,0,0);

		for (int x = 0; x < meetingOne.getWidth(); x++) {
			for (int y = 0; y < meetingOne.getHeight(); y++) {
				meetingOne.setRed(x, y, 0);
				meetingOne.setGreen(x, y, 0);
				int blueValue = meetingOne.getBlue(x, y);
				if (blueValue >= 16) {
					meetingOne.setBlue(x, y, 0);
				} else {
					blueValue = blueValue * 16;
					meetingOne.setBlue(x, y, blueValue);
				}
			}
		}

		locationOne.setVisible(true);



		// now how would you decrypt the picture for meeting location #2, before displaying it?

		locationTwo.setVisible(true);
	}

}
