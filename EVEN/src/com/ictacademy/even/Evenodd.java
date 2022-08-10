package com.ictacademy.even;

public class Evenodd {

	public static void main(String[] args) {
		
		
		{
		// TODO Auto-generated method stub
		Evenodd obj=new Evenodd();
		int result= obj.checkevenodd(8);
		System.out.println("Result = "+ result);

	}
		
	}
	
int checkevenodd(int x)
{
	
  if(x%2==0)
  {
	  System.out.println("even");
	  return 1;
  }
  else
  {
	  System.out.println("Odd");
	  return 2;
  }
 
  
  }






	
}
