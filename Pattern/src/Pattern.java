import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

	/*
	 * Complete the 'staircase' function below.
	 *
	 * The function accepts INTEGER n as parameter.
	 */

	public static void staircase(int n) {
		int i, j;
		for (i = 0; i < n; i++) {
			System.out.print(" ");
		}
		for (j = 0; j <= i; j++) {
			System.out.print("*");

		}

		System.out.println(); // ending line after each row

	}

}

public class Pattern {
	public static void main(String[] args) throws IOException {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size ");
		n = sc.nextInt();

		squarePattern(n);
		IncreasingTriagle(n);
		DecreasingTriagle(n);
		RightSidedTriangle(n);
		RightSidedDecreasingTriagle(n);
		HillPatern(n);
		ReverseHillPattern(n);
		DiamondPattern(n);
		leftPascalsTrianglePattern(n);
		RightPascalsTrianglePattern(n);
		butterfly(n);
		sandglass(n);

	}

	private static void sandglass(int n) {
		System.out.println("---------sandglass -----------");
		for (int i = 1; i <= n; i++) {
			// inc space
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			// dec star
			for (int j = i; j <= n; j++) {
				System.out.print("*");
			}
			// dec star
			for (int j = i; j < n; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
		for (int i = 0; i <= n; i++) {

			// dec sace
			for (int j = i; j <= n; j++) {
				System.out.print(" ");
			}
			// inc star
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			// inc star
			for (int j = 1; j < i; j++) {
				System.out.print("*");
			}
		  System.out.println();
		}

	}

	private static void butterfly(int n) {

	}

	private static void RightPascalsTrianglePattern(int n) {
		System.out.println("---------RightPascalsTrianglePattern -----------");

		for (int i = 1; i < n; i++) {
			// dec space
			for (int j = i; j <= n; j++) {
				System.out.print(" ");
			}
			// inc star
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 1; i <= n; i++) {
			// inc space
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}

			for (int j = i; j <= n; j++) {
				System.out.print("*");
			}

			System.out.println();
		}

	}

	private static void leftPascalsTrianglePattern(int n) {
		System.out.println("---------leftPascalsTrianglePattern -----------");

		for (int i = 1; i <= n; i++) {
			// inc star
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			System.out.println();
		}

		for (int i = 1; i <= n; i++) {
			// dec star
			for (int j = i; j < n; j++) {
				System.out.print("*");
			}

			System.out.println();
		}

	}

	private static void DiamondPattern(int n) {
		System.out.println("---------DiamondPattern -----------");

		// Hill pattern
		for (int i = 1; i < n; i++) {

			// dec space
			for (int j = i; j <= n; j++) {
				System.out.print(" ");
			}
			// inc *
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			// inc *
			for (int j = 1; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();

		}

		// reverese hill pattern
		for (int i = 1; i <= n; i++) {
			// inc space
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			// dec star
			for (int j = i; j <= n; j++) {
				System.out.print("*");
			}
			// dec star
			for (int j = i; j < n; j++) {
				System.out.print("*");
			}

			System.out.println();
		}

	}

	private static void ReverseHillPattern(int n) {
		System.out.println("---------ReverseHillPattern -----------");

		for (int i = 1; i <= n; i++) {
			// inc space
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			// dec star
			for (int j = i; j <= n; j++) {
				System.out.print("*");
			}
			// dec star
			for (int j = i; j < n; j++) {
				System.out.print("*");
			}

			System.out.println();
		}

	}

	private static void HillPatern(int n) {
		System.out.println("---------HillPatern -----------");

		for (int i = 1; i <= n; i++) {
			// dec space
			for (int j = i; j <= n; j++) {
				System.out.print(" ");
			}
			// inc *
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			// inc *
			for (int j = 1; j < i; j++) {
				System.out.print("*");
			}

			System.out.println();
		}

	}

	private static void RightSidedDecreasingTriagle(int n) {
		System.out.println("---------LeftSidedDecreasingTriagleTriangle -----------");

		for (int i = 1; i <= n; i++) {
			// recall loop for increasig traigle wit space
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			// recall loop for decressing star

			for (int j = i; j <= n; j++) {
				System.out.print("*");
			}

			System.out.println();
		}

	}

	private static void RightSidedTriangle(int n) {
		System.out.println("---------RightSidedTriangle -----------");

		for (int i = 1; i <= n; i++) {
			// recall nested loop for decreasing triangle
			for (int j = i; j <= n; j++) {
				System.out.print(" ");
			}
			// recall nested loop for Increasing triangle
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			System.out.println();
		}

	}

	private static void DecreasingTriagle(int n) {
		System.out.println("---------DecreasingTriagle -----------");
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print("* ");
			}
			System.out.println();

		}
	}

	private static void IncreasingTriagle(int n) {
		System.out.println("---------IncreasingTriagle -----------");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();

		}

	}

	private static void squarePattern(int n) {
		System.out.println("---------squarePattern -----------");

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}
}
