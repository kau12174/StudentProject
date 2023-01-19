/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package printstudentdetails;

/**
 * store and print student details 
 * view class- user interaction 
 * @author hp
 */
public class PrintStudentDetails {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
       //   store and print 3 students details
       Student [] list = new Student[3];
        // student class as an object here for array of objects
        Student s1 = new Student(); // object s1 created
        Student s2 = new Student();
        Student s3 = new Student();
        s1.setName("jashan");  // assigning values
        s1.setSid(19);
        
        s2.setName("parneet");
        s2.setSid(21);
        
        s3.setName("shubh");
        s3.setSid(20);
        
        //store object in array  that is why it is called    array of objects
        list[0]=s1;
        list[1]=s2;
        list[2]=s3;
        
        for(int i=0;i<list.length;i++)
        {
         System.out.println(list[i].getName()+ " " + list[i].getSid());
    
          }
    
}
