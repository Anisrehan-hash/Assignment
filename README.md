# Assignment
Aim to creat star(hollow traingle) pattern program.

creat class.

creat main method.

creat scanner class to take input from system.

read the number of rows from user.

use for loop to itterate the number of rows and to print the space.
          
                for (i=1; i<= rows ; i++)  
    {  
		for (j = i; j < rows ; j++)   
			{  
				System.out.print(" ");  
	} 
         
  using variable k and itterating upto "2*i-1" and checking the codition using if and else
       using or operator(||) inside if condition indicates if any one of the conditions will be true it will print if part or it will print else part.
       
                    
                     for (k = 1; k <= (2*i -1) ;k++)   
			{  
				if(k==1 || i == rows || k==(2*i-1))   
					{  
						System.out.print("*");  
					}  
				else   
					{  
						System.out.print(" ");  
					}  
			} 

to move the cursor on next line or next rows I used print statement.

          System.out.println(""); 
          
 The output I got from this code is below......
 
                enter the number of rows
                            5
                                      *
                                     * *
                                    *   *
                                   *     *
                                  *********
