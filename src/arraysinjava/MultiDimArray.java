package arraysinjava;

public class MultiDimArray {

	
	
	//drawbags of array  memory waste , singleton data type
	
	public static void main(String[] args)
	{
		int idRoll[][] =new int[3][2];
        
		idRoll[0][0] =101;
        idRoll[0][1]=10101;
		
        idRoll[1][0] =102;
        idRoll[1][1]=10102;
		
        idRoll[2][0] =103;
        idRoll[2][1]=10103;
        
        for(int i=0;i<3;i++)
        {
        	System.out.print(" Id and roll are ");
        	for(int j=0;j<2;j++)
        	{
        		System.out.print("  "+idRoll[i][j]);
        	}
        	System.out.println();
        }
        
		
        
	}

}
