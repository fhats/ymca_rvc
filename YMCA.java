/*
Hi Freddy, 
Thanks so much again for taking a look at this. Here's what I need to do- 
This is a longer project that eventually has to become a registration for a local YMCA 
You have to be able to enter information about membership and course registration 
into an array and then report it. There have to be a bunch of reports 
and I have to be able to modify the information if necessary

The first window that pops up should ask "what do you want to do:
										Add/Modify a new member
										Add/Modify a course registration
										Generate Report
										Exit System
										
Right now I am working on the Add/Modify member (the add Modify course registration will be pretty simlar just with different variables)
See the notes I made. 

Thanks

Ray


*/

package ymca;
import javax.swing.JOptionPane;
import java.io.*;
import java.util.*;
public class YMCA {

	//Declare Variables
	
	public String[] First_Name = new String [100];
	public String [] Last_Name = new String [100];
	public String [] Member_Type = new String [100];
	public int [] age = new int [100];
	public int [] member_number = new int [100];
	public String [] gender = new String[100];
	public int count=-1;
	public String m_number;
	int i,delvalue,position=0,temp;
	int selection1,
    selection = Integer.parseInt(m_number);
	public String[] Course_registration = new String[100];;

	public YMCA() {
		
	}
	//While Loop telling everything where to go
	
	public static void main(String[] args) {
		
		{
			{
				YMCA phaseIII = new YMCA();
				int selection=0;
				selection =phaseIII.menu();
				phaseIII.count = phaseIII.start_program();
				while(selection!=4)
			     {
			    	    if (selection == 1)
			    	    	phaseIII.Modify_Member();
			    	      else 
			    	    	  if (selection == 2)
			    	    		  phaseIII.Modify_Reservation();
			    	         else 
			    	        	 if (selection == 3)
			    	        		 phaseIII.Report();
			    	  selection =phaseIII.menu();
			     }//end of while loop
				
				phaseIII.exit_program();
			     System.exit(0);
			     }} 
			}// end of main 
		
		//Start program Method
	public int start_program ()
			  
		{
			        String newLine;
			          try
			          {
			             BufferedReader Member_file = new BufferedReader(new FileReader("member.dat"));
			             while ((newLine = Member_file.readLine()) != null)
			               {
			                  StringTokenizer delimiter = new StringTokenizer(newLine,"#");
			                  count++;
			                  member_number[count] = Integer.parseInt(delimiter.nextToken());
			                  Member_Type[count] =delimiter.nextToken();
			                  First_Name[count] =delimiter.nextToken();
			                  Last_Name[count] =delimiter.nextToken();
			                  age[count] = Integer.parseInt(delimiter.nextToken());
			                  gender[count] =delimiter.nextToken();
			               System.out.println(member_number[count]+" "+Member_Type[count]+" "+First_Name[count]+" "+
			               Last_Name[count]+" "+age[count]+" "+gender[count]);
			                }
			               Member_file.close();
			            }
			        catch (IOException error)
			          {
			          System.out.println("Error on file read " + error);
			          }
			        return count;
			  }
	
			public int menu()
			{
				  String m_number;
				  int number;
				  String output = "Moon Area YMCA" + " \n " + " \n " +
			      "1. Add/Modify Member Information " + " \n " +
			      "2. Add/Modify Class Registrations  " + " \n " +
			      "3. Report Section " + " \n " +
			      "4. Exit the System" + " \n" + " \n " +
			      "Please make your selection  >";
			       m_number = JOptionPane.showInputDialog(null, output, " ",JOptionPane.QUESTION_MESSAGE);
			       try {
			       number=Integer.parseInt(m_number);
			       } catch (java.lang.NumberFormatException ex) {
			    	   number = 4;
			       }
			       return number;
			     } 
		//Modify member Method - this is where I am executing the first requirement of the project
			
			
			public int Modify_Member()
			{	
					  int number;
					  String output = "Modify Menu Method" + " \n " + " \n " +
				      "1. Add Member " + " \n " +
				      "2. Delete Member" + " \n " +
				      "3. Modiy Member Information" + " \n " +
				      "Please make your selection: ";
				       m_number = JOptionPane.showInputDialog(null, output, " ",JOptionPane.QUESTION_MESSAGE);
				       try {
				       number=Integer.parseInt(m_number);
				       } catch (java.lang.NumberFormatException ex) {
				    	   number = 4;
				       }
				       return number;
				       // This is where I want to enter in the member's information- do I use an if statement or a while loop??
				       if(output == 1)
				       {
				    	   First_Name = JOptionPane.showInputDialog(null, "Enter the first name of the member:", "Input Data",JOptionPane.QUESTION_MESSAGE); 

				   // Here I want a menu to pop up that asks me to enter in the member's info - I want the information entered in also to go into the array's I established above. what am I doing incorrectly??
				    // I want to do the same for all the member info. How am I loading the information into the Arrays incorrectly??	  
				    	 
				    	   Last_Name = JOptionPane.showInputDialog(null, "Enter the last name of the member:", "Input Data", JOptionPane.QUESTION_MESSAGE); 

				    	   Member_type = JOptionPane.showInputDialog(null, "Enter the membership type of the member:", "Input Data",JOptionPane.QUESTION_MESSAGE); 
				    	   
				    	   age = JOptionPane.showInputDialog(null, "Enter the age of the member:", "Input Data",JOptionPane.QUESTION_MESSAGE); 
				    	   
				    	   member_number = JOptionPane.showInputDialog(null, "Enter the membership number of the member:", "Input Data", JOptionPane.QUESTION_MESSAGE); 
				    	   
				    	   gender = JOptionPane.showInputDialog(null, "Enter the gender of the member:", "Input Data", JOptionPane.QUESTION_MESSAGE); 
				    	
				    	   // in this I am trying to set up a method where I can enter in information and add it to the arrays I set up. I could be doing this totally wrong.
				    	   
			}
				       
				       if(output == 2)// again, not sure if I should do an if statement here or a while loop. How do I write an if statement for something like this??
					       public void Delete_Reservation(){
				       //I don't have the delete code built yet, I have an example but if you have any guidence I would appreciate it. 
				       
				       }
				    	   
				    	   
				    	   
	 // This is where I want to develop a method where I can go into the stored arrays and edit the information. There are no bugs but will this do it?    
			
				       if (output == 3)// if statement? While loop? AHH!
				      
				public static int modify_member(int[]member_number,String[]Member_Type,String[]First_Name,
						String[]Last_Name,int[]age,String[]gender,int count)
				  {
				    //add new student information
				        String svalue,Output;
				        int intNum=0,intNum1=0,i,x=-1;
				        System.out.println("executing modify_member");
				        
				      count=count+1;
				        Output = "Enter the member's First Name";
				        First_Name[count] =JOptionPane.showInputDialog(null,Output,
				                  "",JOptionPane.QUESTION_MESSAGE);
				        
				        Output = "Enter the member's Last Name";
				        Last_Name[count] =JOptionPane.showInputDialog(null,Output,
				                  "",JOptionPane.QUESTION_MESSAGE);
				        
				        Output = "Enter the membership type";
				        svalue =JOptionPane.showInputDialog(null,Output,
				                  "",JOptionPane.QUESTION_MESSAGE);
				        
				        Output = "Enter the member's age";
				        svalue =JOptionPane.showInputDialog(null,Output,
				                  "",JOptionPane.QUESTION_MESSAGE);
				        age[count] = Integer.parseInt(svalue);
				        
				        Output = "Enter the member's gender";
				        svalue =JOptionPane.showInputDialog(null,Output,
				                  "",JOptionPane.QUESTION_MESSAGE);
				        age[count] = Integer.parseInt(svalue);
				        
				        Output = "Enter the member number";
				        svalue =JOptionPane.showInputDialog(null,Output,
				                  "",JOptionPane.QUESTION_MESSAGE);
				        member_number[count] = Integer.parseInt(svalue);*/
				        return count;
				   }//end add student


			

			
			// Start the reports
			public void Report()
			{
				{
					  int selection2=0;

					  while(selection2 !=10)
					  {
					    if (selection2 == 1)
					    { 	
					    	all_member_info();
					    } //selection 1
					      
					      else if (selection2 == 2)
					      {
					    	  Specific_Member_type();}//selection 2
					      else if (selection2 == 3)
					      {
					    	  Specific_Member_age();}//selection 3
					      else if (selection2 == 4)
					      {
					    	  Specific_Member_gender();}//selection 4
					      else if (selection2 == 5)
					      {
					    	  report5();}//selection 5
					      else if (selection2 == 6)
					      {
					    	  report6();}//selection 6
					      else if (selection2 == 7)
					      {
					    	  report7();}//selection 7
					      else if (selection2 == 8)
					      {
					    	  report8();}//selection 8
					      else if (selection2 == 9)
					      {
					    	  report9();}//selection 9
					    
					      //print menu again
					      selection2 = report_menu();
					  }//WHILE LOOP
					 menu();
				}}//report method
				

				public int report_menu()
				 {
				 int selection_two=0;
				  String output = "Moon Area YMCA" + " \n " + " \n " +
				         "1.    All Member Info" + " \n " +
				         "2.    All Members of a Specific type" + " \n " +
				         "3.    All Members between a specific age range" + " \n " +
				         "4.    All Members of a specific gender" + " \n " +
				         "5.    Report 5" + " \n " +
				         "6.    Report 6" + " \n " +
				         "7.    Report 7" + " \n " +
				         "8.    Report 8" + " \n " +
				         "9.    Report 9" + " \n " +
				         "10.   Exit Report Menu" + " \n" + " \n " +
				         "Please make your selection  >";
				          String mnumber_two = JOptionPane.showInputDialog(null, output, " ", JOptionPane.QUESTION_MESSAGE);
				         try {
				          selection_two=Integer.parseInt(mnumber_two);
				         } catch (NumberFormatException ex) {
				        	 return 10;
				         }
				  return selection_two;	
				 }//report menu method
				
				public void all_member_info() 
				{
					String output ="MemberID   Member Type  First Name   Last Name   Age  Gender\n";
					for(int x = 0;x < count;x++) {
						output = output + member_number[x]+"   "+Member_Type[x]+"  "+First_Name[x]+"  "+
				                Last_Name[x]+"  "+age[x]+"  "+gender[x]+"\n";
					}
					JOptionPane.showMessageDialog(null, output,"Thank You",JOptionPane.INFORMATION_MESSAGE);
					
					        
				}//All Member Info method

				public void Specific_Member_type() 
				{
					String output = "The Member Specific Type method has been executed.";
					JOptionPane.showMessageDialog(null, output,"Thank You",JOptionPane.INFORMATION_MESSAGE);
					System.out.println("This is the Member Specific Type method stub and will come later.");	
				}//Specific Member Type method
				
				public void Specific_Member_age() 
				{
					String output = "The Member Specific Age method has been executed.";
					JOptionPane.showMessageDialog(null, output,"Thank You",JOptionPane.INFORMATION_MESSAGE);
					System.out.println("This is the Member Specific Age method stub and will come later.");	
				}//Specific Member Age method

				public void Specific_Member_gender() 
				{
					String output = "The Member Specific Gender method has been executed.";
					JOptionPane.showMessageDialog(null, output,"Thank You",JOptionPane.INFORMATION_MESSAGE);
					System.out.println("This is the Member Specific Type stub and will come later.");	
				}//Specific Member Gender method

				public void report5() 
				{
					String output = "The Report 5 method has been executed.";
					JOptionPane.showMessageDialog(null, output,"Thank You",JOptionPane.INFORMATION_MESSAGE);
					System.out.println("This is the Report 5 method stub and will come later.");	
				}//Report 5 method

				public void report6() 
				{
					String output = "The Report 6 method has been executed.";
					JOptionPane.showMessageDialog(null, output,"Thank You",JOptionPane.INFORMATION_MESSAGE);
					System.out.println("This is the Report 6 method stub and will come later.");	
				}//Report 6 method

				public void report7() 
				{
					String output = "The Report 7 method has been executed.";
					JOptionPane.showMessageDialog(null, output,"Thank You",JOptionPane.INFORMATION_MESSAGE);
					System.out.println("This is the Report 7 method stub and will come later.");	
				}//Report 7 method
				
				public void report8() 
				{
					String output = "The Report 8 method has been executed.";
					JOptionPane.showMessageDialog(null, output,"Thank You",JOptionPane.INFORMATION_MESSAGE);
					System.out.println("This is the Report 8 method stub and will come later.");	
				}//Report 8 method
				
				public void report9() 
				{
					String output = "The Report 9 method has been executed.";
					JOptionPane.showMessageDialog(null, output,"Thank You",JOptionPane.INFORMATION_MESSAGE);
					System.out.println("This is the Report 9 method stub and will come later.");	
				}//Report 9 method

			public void exit_program()
			  {
			  int i;
			   try
			      {
			      BufferedWriter member_file = new BufferedWriter(new FileWriter("member.dat"));
			            for (i=0; i<=count; ++i)
			              {
			             
			             member_file.write(member_number[i] + "#"+ Member_Type[i] + "#" +First_Name[i] + "#" + Last_Name[i] + "#" + age[i]+"#" + gender[i] +  "#" );
			                member_file.newLine();
			              }//for loop
			            member_file.close();
			          }//end try

			        catch (IOException error)
			          {
			             System.out.println("Error on file write " + error);
			          }//end error message
	}//End program method

	}//end of class
