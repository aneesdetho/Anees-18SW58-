class Addition
{
public static void main(String arr[])
{
     int a[][]={{2,3},{5,6}};
     int b[][]={{1,2},{6,7}};
     int result[][]=new int[2][2];
	 System.out.println("Welcome to First Matric");
       for(int i=0;i<a.length;i++)
    {
	     for(int j=0;j<a[i].length;j++)
	 {
	     System.out.print(a[i][j]+"  ");
	 }
	   System.out.println();
	}
	    System.out.println();
	    System.out.println();
	 System.out.println("Welcome to Second Matric");
	   for(int i=0;i<b.length;i++)
	{
		 for(int j=0;j<b[i].length;j++)
	 {
		 System.out.print(b[i][j]+"  ");
	 }
	  System.out.println();
	}
	     System.out.println();
	     System.out.println();
	  System.out.println("Welcome to Addition of Two Dimensional Array");
	  for(int i=0;i<result.length;i++)
	{  
		 for(int j=0;j<result[i].length;j++)
	  {
		  result[i][j]=a[i][j]+b[i][j];
        System.out.print(result[i][j]+"  ");
	  }
      System.out.println();
    }
}
}	  