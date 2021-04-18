package Recursion;
/*
 * peg 1 = source peg, peg 3 = destination, peg 2 = temp peg
 * 1. move n-1 disk from peg 1 to peg 2, using peg 3 as the temporary holding area
 * 2. move the last (1) disk from peg 1 to peg 3
 * 3. move n-1 disks from peg 2 to peg 3, using peg 1 as the temporary holding area
 */
public class TowersOfHanoi {
	//recursively move disks between towers
	public static void solveTowers(int disks, int sourcePeg, int destinationPeg, int tempPeg) {
		//base case - only one disk to move
		if (disks == 1) {
			System.out.printf("%d --> %d, 1%n",  sourcePeg, destinationPeg);
			return;
		}else {
			//recursion step: move disk - 1 disks from source peg to temp peg using destination peg
			solveTowers(disks - 1, sourcePeg, tempPeg, destinationPeg);
			
			//move last disk from source peg to destination peg
			System.out.printf("%d --> %d, 2%n",  sourcePeg, destinationPeg);
			
			//move disk - 1 disks from temp peg to destination peg
			solveTowers(disks - 1, tempPeg, destinationPeg, sourcePeg);
		}
		
	}
	
	public static void main(String[] args) {
		int startPeg = 1; //value 1 indicates start peg
		int endPeg = 3; //value 3 indicates end peg
		int tempPeg = 2; //value 2 indicates temp peg
		int totalDisks = 3; //total number of disks = 3
		solveTowers(totalDisks, startPeg, endPeg, tempPeg);
	}

}
