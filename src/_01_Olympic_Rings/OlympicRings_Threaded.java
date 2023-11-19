package _01_Olympic_Rings;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;
public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.

	public static void main(String[] args) {
		Robot Arin = new Robot(500,200);
		Arin.setPenColor(Color.BLUE);
		Arin.penDown();
		Arin.setAngle(90);
		Arin.setSpeed(25);
		Arin.setPenWidth(15);
		Robot Sora = new Robot(900,200);
		Sora.setPenColor(Color.BLACK);
		Sora.penDown();
		Sora.setAngle(90);
		Sora.setSpeed(25);
		Sora.setPenWidth(15);
		Robot Riyu = new Robot(1300,200);
		Riyu.setPenColor(Color.RED);
		Riyu.penDown();
		Riyu.setAngle(90);
		Riyu.setSpeed(25);
		Riyu.setPenWidth(15);
		Robot Wyldfire = new Robot(700,400);
		Wyldfire.setPenColor(Color.YELLOW);
		Wyldfire.penDown();
		Wyldfire.setAngle(90);
		Wyldfire.setSpeed(25);
		Wyldfire.setPenWidth(15);
		Robot Ras = new Robot(1100,400);
		Ras.setPenColor(Color.GREEN);
		Ras.penDown();
		Ras.setAngle(90);
		Ras.setSpeed(25);
		Ras.setPenWidth(15);
		
		Thread r1 = new Thread(()->drawCircle(Arin));
		Thread r2 = new Thread(()->drawCircle(Sora));
		Thread r3 = new Thread(()->drawCircle(Riyu));
		Thread r4 = new Thread(()->drawCircle(Wyldfire));
		Thread r5 = new Thread(()->drawCircle(Ras));

			r1.start();
			r2.start();
			r3.start();
			r4.start();
			r5.start();	
		
	}
	public static void drawCircle(Robot r) {
		for(int i = 0; i<360; i++) {
			r.move(3);
			r.turn(1);
		}
	}
}

