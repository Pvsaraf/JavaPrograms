package myCaptain;

public class SumArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[][] = {{1,3,4},{2,4,3},{3,4,5}};
        int b[][] = {{1,3,4},{2,4,3},{1,2,4}};
//        int sum[][] = new int [3][3];
        for(int i=0;i<3;i++)
        {
        	for(int j=0;j<3;j++)
        	{
        		System.out.print((a[i][j]+b[i][j])+" ");
        	}
        	System.out.println();
        }
	}

}
