import java.util.Scanner;
public class MatrixMultiplication {
	public static void main(String[]args)
	{
		Scanner sc =new Scanner(System.in);
		int r1,c1,r2,c2,i,j,k;
		System.out.println("Enter the Row of the fisrt matrix");
	    r1 = sc.nextInt();
	    System.out.println("Enter the column of the fisrt matrix");
	    c1 = sc.nextInt();
	    System.out.println("Enter the Row of the second matrix");
	    r2 = sc.nextInt();
	    System.out.println("Enter the column of the second matrix");
	    c2 = sc.nextInt();
	    if(c1 != r2)
	     {
	    	System.out.println("Cannot perform Matrix Multiplication ");
	    	return;
	     }
	    int A[][] = new int[r1][c1];
	    int B[][] = new int[r2][c2];
	    int C[][] = new int[r1][c2];
	    System.out.println("Enter the elements of the first matrix");
	    for(i=0;i<r1;i++)
	     {
	       for(j=0;j<c1;j++)
	       {
	    	   A[i][j]=sc.nextInt();
	       }
	     }
	    System.out.println("Enter the elements of the Second matrix");
	    for(i=0;i<r2;i++)
	     {
	       for(j=0;j<c2;j++)
	       {
	    	   B[i][j]=sc.nextInt();
	       }
	     }
	    for(i=0;i<r1;i++)
	     { 
	       for(j=0;j<c2;j++)
	       {
	    	   C[i][j] =0;
	    	   for(k=0;k<r2;k++)
	    	   {
	    		   C[i][j]+=A[i][k] * B[k][j];
	    	   }  
	       }
	     }
	    System.out.println("The first matrix is :");
	    for(i=0;i<r1;i++)
	     {
	       for(j=0;j<c1;j++)
	       {
	    	   System.out.print(A[i][j]);
	    	   System.out.print(" ");
	       }System.out.println();
	     }
	    System.out.println("The second matrix is :");
	    for(i=0;i<r2;i++)
	     {
	       for(j=0;j<c2;j++)
	       {
	    	   System.out.print(B[i][j]);
	    	   System.out.print(" ");
	       }System.out.println();
	     }
	    System.out.println("The multiplied matrix");
	    for(i=0;i<r1;i++)
	     {
	       for(j=0;j<c2;j++)
	       {
	    	   System.out.print(C[i][j]);
	    	   System.out.print(" ");
	       }
	       System.out.println();
	     }
	}
}
