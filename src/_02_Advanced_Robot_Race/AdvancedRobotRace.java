package _02_Advanced_Robot_Race;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class AdvancedRobotRace {
static Robot[] robos;
static boolean win = false;
	// Re-do the robot race recipe from level 3 module 0. 
	// This time, use threads to make all of the robots go at the same time.
	public static void main(String[] args) {
		robos = new Robot[5];
		for(int i = 0; i<5; i++) {
			robos[i]= new Robot(300 + 300*i, 600);
			robos[i].setSpeed(15);
		}


		Thread r1 = new Thread(()->GoGoGo(robos[0]));
		Thread r2 = new Thread(()->GoGoGo(robos[1]));
		Thread r3 = new Thread(()->GoGoGo(robos[2]));
		Thread r4 = new Thread(()->GoGoGo(robos[3]));
		Thread r5 = new Thread(()->GoGoGo(robos[4]));
		r1.start();
		r2.start();
		r3.start();
		r4.start();
		r5.start();	
		
		while(win==false) {
		for(int i = 0; i<5; i++) {
			if(robos[i].getY()<=100) {
				System.out.println("¡Robot "+(i+1) + " gana la competición!");
for(int j = 0; j<3; j++) {
	robos[i].turn(360);
	robos[i].sparkle();
}
				win = true;
				break;
			}	
		}
		}
	}
	
	public static void GoGoGo(Robot r) {
		
		while(r.getY()>100) {	
Random ran = new Random();
r.move(ran.nextInt(50));
		}
	}
	

}
