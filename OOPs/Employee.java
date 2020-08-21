package OOPs;
// we will use here ToString() method 
public class Employee {
    int ID;
    String name , Department;
    
    Employee(int ID , String name , String Dept){
        this.ID = ID;
        this.Department =Dept;
        this.name = name;
    }

    //toString function converts the string ID to a string
    public String toString()
    {
        return ID+ " " +name +" "+Department;
    }
    public static void main(String[] args) {
        Employee e1 = new Employee(101 ,"Akash","CSIT");
        Employee e2= new Employee(102,"Vijay","CSIT");  
        System.out.println("Detail of the Employee are:");
        System.out.println();
        System.out.println("1."+e1);//compiler writes here s1.toString()  
        System.out.println("2."+e2);//compiler writes here s2.toString()  
 

    }
}