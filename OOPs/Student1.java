package OOPs;

public class Student1 {
    private String regno;

    public Student1(String regno){
        this.regno = regno;
    }

    public String getregno(){
        return regno;
    }

    public void setregno(String regno){
        this.regno = regno;
    }

    public boolean equals(Object o)
    {
        System.out.println("mapped: ");
        if(o!=null && o instanceof Student1)
        {
            String regno = ((Student1)o).getregno();
            if(regno!= null && regno.equals(this.getregno()))
            {
                return true;
            } 
        }  
        return false;
    }
    public int hashCode() 
    {
        System.out.println("from hash");
        return this.regno.hashCode();
    }
}