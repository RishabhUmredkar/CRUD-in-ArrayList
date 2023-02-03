package using_arraylist;


import java.util.*;
class Student {  
int roll;  
String name,addr,res;  
public Student(int roll, String name, String addr, String res) {  
    this.roll = roll;  
    this.name = name;  
    this.addr = addr;  
    this.res = res;  
}  
public int getRoll()
{
	return roll;
}

public String getName()
{
	return name;
}

public String getAddr()
{
	return addr;
}

public String getRes()
{
	return res;
}
public String toString()
{
	return roll+"   "+name+"    "+addr+"   "+res;
	
}
}  
class practice {  
private static Scanner sc;

public static void main(String[] args) {  
    sc = new Scanner(System.in);
    List<Student> list=new ArrayList<Student>();  
    //Creating Books  
    int ch,i;
    do{
    	System.out.println("1. Add Student data");
    	System.out.println("2. Show Student data");
    	System.out.println("3. Search Student data");
    	System.out.println("4. Delete Student data");
    	System.out.println("5. Update Student data");
    	System.out.println("Enter your choice");
    	ch = Integer.parseInt(sc.nextLine());
    	
    	switch(ch)
    	{
    	case 1:
    	    System.out.println("Enter the no. of Student...");
    	    int n = Integer.parseInt(sc.nextLine());
    	    for(i=1; i<=n; i++)
    	    {    	   
    	           System.out.println(i+":Enter the Roll No. of Student");
    	        int roll =  Integer.parseInt(sc.nextLine());
    	        System.out.println("Enter the Name of Student");
    	        String name = sc.nextLine();
    	        System.out.println("Enter the Address of Student");
    	        String addr = sc.nextLine();
    	        System.out.println("Enter the Percentage of Student");
    	        String res = sc.nextLine();
    	 
     	     
    	    list.add(new Student(roll, name, addr, res));  
    	    }
    	    break;
    	    
    	case 2:
    		 //Traversing list  
    	   Iterator<Student> itr = list.iterator();
    	   while(itr.hasNext())
    	   {
    		   Student st = itr.next();
    		   System.out.println(st);
    	   }
    	    break;

    	case 3:
    		boolean found =false;
    		System.out.println("Enter No. to Search");
    		int roll = Integer.parseInt(sc.nextLine());
    		itr = list.iterator();
      	   while(itr.hasNext())
      	   {
    		   Student st = itr.next();
			if(st.getRoll() == roll)
      		   {
      			System.out.println(st);   
      			found =true;
      		   }
			
      	   }
      	 if(!found)
			{
   			System.out.println("Record is not found....");   
			}
    		break;
    		
    	case 4:
    		found = false;
    		System.out.println("Enter No. to Delete");
    		roll = Integer.parseInt(sc.nextLine());
    		itr = list.iterator();
      	   while(itr.hasNext())
      	   {
    		   Student st = itr.next();
			if(st.getRoll() == roll)
      		   {
				itr.remove();
      			found = true;
      		   }
    	   }
      	 if(!found)
			{
   			System.out.println("Record is not found....");   
			}
      	else
     	 {
     		 System.out.println("Deleted Successfuly...");
     	 } 
    		break;
    	case 5:
    		found = false;
    		System.out.println("Enter No. to Update");
    		roll = Integer.parseInt(sc.nextLine());
    		ListIterator <Student>li = list.listIterator();
      	   while(li.hasNext())
      	   {
    		   Student st = li.next();
			if(st.getRoll() == roll)
      		   {
      			System.out.println("Enter New Roll no.");
      			roll = Integer.parseInt(sc.nextLine());
      			
      			System.out.println("Enter New Name");
      			String name = sc.nextLine();
      			System.out.println("Enter New Address");
      			String addr = sc.nextLine();
      			System.out.println("Enter New Result");
      			String res = sc.nextLine();
      			System.out.println(st); 
      			li.set(new Student(roll, name , addr, res));
      			found = true;
      		   }
			
      	   }
      	 if(!found)
			{
   			System.out.println("Record is not found....");   
			}
      	 else
      	 {
      		 System.out.println("Updated Successfuly...");
      	 }
    		break;
       }
       
   
    }while(ch!=0);

}  
}


