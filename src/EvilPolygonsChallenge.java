import java.awt.Color;
import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {
	
	public static void main(String[] args) {
for(int r=0;r<3;r++) {		
		//1. Create a robot
		Robot bob=new Robot("batman");
		Random number=new Random();
		bob.setX(number.nextInt(500));
		bob.setY(number.nextInt(500));
		bob.penDown();
		//2. Set the speed to 100
bob.setSpeed(100);

		int colorChoice=JOptionPane.showOptionDialog(null, "what color do you want your robot to color with?", "title", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new String[]{"Red","Blue", "Green"}, 0);
		System.out.println(colorChoice);
		//3. Set the pen color of the robot according to the value of the colorChoise variable
		if (colorChoice==0) {
			bob.setPenColor(Color.red);
		}
		if(colorChoice==1) {
			bob.setPenColor(Color.BLUE);
		}
		if(colorChoice==2) {
			bob.setPenColor(Color.green);
		}
		//4. Ask the use how many polygons they want to be drawn.
		String v=JOptionPane.showInputDialog("How many polygons do you want to draw?");
		int e=Integer.parseInt(v);
		//5. Use the robot to draw the number of polygons the user requested.
		for(int i=0;i<e;i++) {
			bob.move(100);
			bob.turn(360/e);
		}
		//6. Make it so your shapes do not overlap

		//7. Challenge: add more colors to the Option Dialog.
		
		
}
	}
}

