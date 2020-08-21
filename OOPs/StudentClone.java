package OOPs;

class StudentClone implements Cloneable {
    int rollno;
    String name;

    StudentClone(int rollno , String name){
        this.rollno = rollno;
        this.name = name;
    }

    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }

    public static void main(String[] args) {
        try{
            StudentClone s1 = new StudentClone(1, "Akash");
            StudentClone s2 = (StudentClone)s1.clone();
            System.out.println("display original object");
            System.out.println(s1.rollno+" "+s1.name);

            System.out.println("hashCode of s1="+s1.hashCode());

            System.out.println("Display the Cloning Object :");
            System.out.println(s2.rollno+" "+s2.name);  
            System.out.println("hashCode of s2="+s2.hashCode());

        }
        catch(CloneNotSupportedException c) {
            System.out.println("not cloneable");
        }
    }
}