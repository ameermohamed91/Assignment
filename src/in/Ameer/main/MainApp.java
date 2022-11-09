package in.Ameer.main;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Assignment_01_01();
//		 Check();
//		Assignment_01_05();
		// K();
		// Diagnol_L2();
		// Diagnol_L1();
		// L3();
		// D();
		// P();
		// Q();
		// ABCD();
//		 MultiDiamond_outline();
//		 diamond_L10();
	}

	public static void Assignment_01_05() {

		int n = 12;

		for (int j = 1; j <= n; ++j) {
			System.out.print("*");

		}
		System.out.println("");

		for (int i = n / 2; i > 1; --i) {
			for (int j = 1; j <= i; ++j) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 0; i < n / 2; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
		for (int j = 1; j <= n; ++j) {
			System.out.print("*");

		}

	}

	public static void Assignment_01_01() {

		int n = 6;
		
		for (int i = 0; i < n; i++) {
			// I
			for (int j = 0; j < n; j++) {
				if (i==0 || (j==(n-1)/2) || i==(n-1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			
			// N
			for (int j = 0; j < n; j++) {
				if ((j==0) ||(i == j)|| j==(n-1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			
			//E
			for (int j = 0; j < n; j++) {
				if (i==0 || (j==0) || (i==(n-1)/2) || i==(n-1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			
			//U
			for (int j = 0; j < n; j++) {
				if ((j==0)&& i<n-1 
						||(i == (n-1)&& j>0 && j<(n-1))
						|| j==(n-1) && i<(n-1)   ) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			
			// R
						for (int j = 0; j < n; j++) {
							if ((j==0) ||(i == j) && i>(n-1)/2
									|| j==(n-1) && i<(n)/2
									|| i==0
									|| i==(n-1)/2
									) {
								System.out.print("*");
							} else {
								System.out.print(" ");
							}
						}
						System.out.print("  ");
						
						//0
						for (int j = 0; j < n; j++) {
							if (
									(j==0)&& i<n-1 && i>0 && j<n-1 ||
									 (i==0) && j>0 && j<n-1  ||
									 (i == (n-1)&& j>0 && j<(n-1)) ||
									 j==(n-1) && i<(n-1) && i>0
									) {
								System.out.print("*");
							} else {
								System.out.print(" ");
							}
						}
						System.out.print("  ");
			
			// N
			for (int j = 0; j < n; j++) {
				if ((j==0) ||(i == j)|| j==(n-1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
    

		

	}
	
	
	public static void Check() {

		int n = 6;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((j==0) ||(i == j)|| j==(n-1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
    

		

	}
	public static void Check2() {

		int n = 12;

		

		for (int i = n / 2; i >= 1; --i) {
			for (int j = 1; j <= i; ++j) {
				System.out.print("");
			}
			System.out.println();
		}

		
		
		
		for(int i = 0; i < n/2; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(i >= j)  // bottom left triangle
                    System.out.print("*");
                else
                    System.out.print(" ");
                if(i >= (n - 1) - j)  
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
		
		for (int j = 1; j <= n*2; ++j) {
			System.out.print("*");

		}

	}

	public static void K() {
		int n = 8;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				// p1
				if ((i + j == (n - 1) / 2)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			for (int j = 0; j < n; j++) {
				// p1
				if ((i - j == (n - 1) / 2)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			for (int j = 0; j < n; j++) {
				// p1
				if ((j - i == (n - 1) / 2)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void Diagnol_L2() {
		int n = 15;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((i + j == n - 1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void Diagnol_L1() {
		int n = 15;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((i == j)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void L3() {
		int n = 15;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void D() {
		int n = 10;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				if ((i == 0 && j < n - 1) || j == 0 || (i == n - 1 && j < n - 1)
						|| (j == n - 1 && i > 0 && i < n - 1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
	}

	public static void P() {
		int n = 10;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				// G (i==0 && j>0 && j< (3*n)/4) ||
				/*
				 * (j==0 && i>0 && i<n-1) || (i==(n-1)/2 && j>=(n-1)/2 && j<=(3*n)/4) ||
				 * (j==(3*n)/4 && i>=(n-1)/2) || (i==n-1 && j<(n-1)/2) || (j==(n-1)/2 &&
				 * i>=(n-1)/2)
				 */

				// H j==0 || j==(3*n)/4 || i==(n-1)/2 && j<=(3*n)/4
				if (j == 0 || i == 0 && j < (n - 1) / 2 || i == (n - 1) / 2 && j < (n - 1) / 2
						|| j == (n - 1) / 2 && i < (n - 1) / 2 && i > 0) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
	}

	public static void Q() {

		int n = 11;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((i == n / 4 && j > n / 4 && j < (3 * n) / 4) ||

						(i == (3 * n) / 4) && j > n / 4 && j < (3 * n) / 4
						|| (j == n / 4 && i > n / 4 && i < (3 * n) / 4)
						|| (j == (3 * n) / 4) && i > n / 4 && i < (3 * n) / 4 || (i == j) && i > n / 2 && j > n / 2) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void ABCD() {
		int n = 10;

		for (int i = 0; i < n; i++) {
			// Print A
			for (int j = 0; j < n; j++) {
				if ((j == 0 && i > 0) || (i == (n - 1) / 2 && j <= (3 * n) / 4) || (i == 0 && j < (3 * n) / 4) && j > 0
						|| (j == (3 * n) / 4 && i > 0)) {
					System.out.print("*");
				} else {
					System.out.print(" ");

				}

			}
			// Print B
			for (int j = 0; j < n; j++) {
				if ((i == 0 && j < (n - 1) / 2) || (i == (n - 1) / 2) && j > 0 && j < (n - 1) / 2
						|| (i == n - 1 && j < (n - 1) / 2)
						|| (j == (n - 1) / 2 && i > 0 && i != (n - 1) / 2 && i < n - 1) || j == 0) {
					System.out.print("*");
				} else {
					System.out.print(" ");

				}

			}
			// Print C
			for (int j = 0; j < n; j++) {
				if (i == 0 && j > 0 && j < (3 * n) / 4 || j == 0 && i > 0 && i < n - 1
						|| i == n - 1 && j > 0 && j < (3 * n) / 4) {
					System.out.print("*");
				} else {
					System.out.print(" ");

				}

			}
			// Print D
			for (int j = 0; j < n; j++) {
				if ((i == 0 && j < (n - 1)) || j == 0 || (i == (n - 1) && j < (n - 1))
						|| (j == (n - 1) && i > 0 && i < (n - 1))) {
					System.out.print("*");
				} else {
					System.out.print(" ");

				}

			}
			System.out.println();
		}

	}

	public static void MultiDiamond_outline() {

		int n = 28;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i + j == (n - 1) / 2 || i - j == (n - 1) / 2 || j - i == (n - 1) / 2 || i + j == n - 1 + (n - 1) / 2
						||

						i == j || i + j == n - 1 || i == 0 || j == 0 || i == n - 1 || j == n - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void diamond_L10() {

		int n = 11;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (
						i + j >= (n - 1) / 2 && j <= (n - 1) / 2 && i <= (n - 1) / 2
						|| i - j <= (n - 1) / 2 && i >= (n - 1) / 2 && j <= (n - 1) / 2
						|| j - i <= (n - 1) / 2 && j >= (n - 1) / 2 && i <= (n - 1) / 2
						|| i + j <= n - 1 + (n - 1) / 2 && i > (n - 1) / 2 && j > (n - 1) / 2

				) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
