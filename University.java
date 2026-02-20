/*Create a Java class named University with a static data member totalStudents to keep track of the number of student objects created. Implement a static method getTotalStudents (). Also, include a static block to initialize a static variable (e.g., universityName) and an instance block to print a message when an object is created. Demonstrate their execution order.*/

class University{
static int totalStudent;
static String universityName;

//static block
static{
   totalStudent=0;
   universityName="Saffrony Institute of technology";
   System.out.println("Static block executed");
}

//instance block
{
   System.out.println("Instance block executes");
}
University(){
   totalStudent++;
   System.out.println("Constructor executed");
}
static int gettotalStudent(){
   return totalStudent;
}
public static void main(String args[]){
   System.out.println("Main method Started");
   System.out.println("University Name= "+universityName);
   University u1 = new University();
   System.out.println("Total Student= "+gettotalStudent());
  }
}