package basics;
import java.util.Scanner;

public class transpose {

	public static void main(String[] args) {
		try(Scanner s=new Scanner(System.in)){
		int row=s.nextInt();
		int col=s.nextInt();
		int arr[][]=new int[row][col];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
				arr[i][j]=s.nextInt();
		}
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(j==0)
					System.out.print(arr[j][i]);
				else
					System.out.print(" "+arr[j][i]);
			}
			System.out.print("\n");
			}
		}

	}
}

