package arraysinjava;

public class SingleDimArray {

	
	
	/*
	 *     Array is a collection of similar type of data
	 *     Array is fixed in size
	 *     int ,string,double
	 * 
	 *    String name1 ="Vandan"
	 *    String name2="Sumit"
	 *    String name3= "abc"
	 *    String name4="bcd"..
	 *    ..
	 *    ..
	 *    ..
	 *    ..
	 *    ..
	 *    ..
	 *    
	 *    datatype [] arrayName=new datatype[size of array];
	 *    String [] student=new String[15]; 
	 *    
	 * 
	 * 
	 * 
	 * */
	
	public static void main(String[] args)
	{
		String studentName[] =new String[5];
		
		studentName[0]= "Vandan";
		studentName[1]= "Sumit";
		studentName[2]= "Sachin";
		studentName[3]= "Virat";
		studentName[4]= "Akshay";
		
		//System.out.println(studentName.length);
		
	/*	System.out.println(studentName[0]);
		System.out.println(studentName[1]);
		System.out.println(studentName[2]);
		System.out.println(studentName[3]);
		System.out.println(studentName[4]);*/

		for(int i=0;i<studentName.length;i++)   // i++ is shortcut of i=i+1;
		{
			System.out.println(studentName[i]);
		}
		
		
	}

}
