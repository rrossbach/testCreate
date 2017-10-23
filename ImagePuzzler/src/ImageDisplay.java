import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JPanel;


public class ImageDisplay extends JPanel {

	BufferedImage theImage = null;
	
	public ImageDisplay(String fileName) {
		
		try {
			theImage = ImageIO.read(new File(fileName));
			setPreferredSize(new Dimension(theImage.getWidth(),theImage.getHeight()));
		} catch (Exception e) {
			System.out.println("Unable to read image file: " + fileName);
		}
	}

	@Override
	protected void paintComponent(Graphics g) {	
		super.paintComponent(g);
		g.drawImage(theImage,0,0,null);
	}
	
	
	// return the red color value for the pixel at (x,y)
	public int getRed(int x, int y) {
		Color c = new Color(theImage.getRGB(x, y));
		return c.getRed();
	}
	
	// return the green color value for the pixel at (x,y)
	public int getGreen(int x, int y) {
		Color c = new Color(theImage.getRGB(x,y));
		return c.getGreen();
	}
	
	// return the blue color value for the pixel at (x,y)
	public int getBlue(int x, int y) {
		Color c = new Color(theImage.getRGB(x, y));
		return c.getBlue();
	}
	
	// set the red color value for the pixel at (x,y)
	public void setRed(int x, int y, int redValue) {
		Color c = new Color(redValue, getGreen(x, y), getBlue(x, y));
		theImage.setRGB(x, y, c.getRGB());
	}
	
	// set the green color value for the pixel at (x,y)
	public void setGreen(int x, int y, int greenValue) {
		Color c = new Color(getRed(x,y), greenValue, getBlue(x,y));
		theImage.setRGB(x, y, c.getRGB());
	}
	
	// set the blue color value for the pixel at (x,y)
	public void setBlue(int x, int y, int blueValue) {
		Color c = new Color(getRed(x,y), getGreen(x,y), blueValue);
		theImage.setRGB(x, y, c.getRGB());
	}
}
