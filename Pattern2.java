package lec2;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int star = 1;
		int row = 1;
		while (row <= n) {
			// only star
			int i = 1;
			while (i <= star) {
				System.out.print("*" + " ");
				i++;
			}
			// next row
			star++;
			row++;
			System.out.println();

		}

	}

}