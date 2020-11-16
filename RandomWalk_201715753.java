package test;

public class RandomWalk_201715753 {

	public static void main(String[] args) {
		int x =5; int y = 5;
		boolean title [][] = new boolean [10][10];
		int line [][] = new int [10][10];
		int steps;
		
		title[5][5] = true;
		
		for (steps = 0; steps <20; steps++) {
			int direction = (int)(Math.random()*4);
			
			if (direction == 0 && x>0)
				x--;
			else if (direction == 1 && x<9)
				x++;
			else if (direction == 2 && y>0)
				y--;
			else if (y < 9)
			    y++;
			if (steps % 3 == 0)
				line[y][x] = steps;
			
			title[y][x] = true;
			
			System.out.println("--------------------------------");
			for (int i = 0; i < 10; i ++) {
				for (int j = 0; j < 10; j++) {
					
					if (line[i][j] != 0)
						System.out.print(line[i][j] + " ");
					else if (title[i][j] == true)
						System.out.print("# ");
						else
							System.out.print(". ");
				}
				System.out.println();
			}
			System.out.print("---------------------------------");
		}
		System.out.println("전체 걸음수는 " + steps);
	}
}
       