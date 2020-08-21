package OOPs;
//this class accesses the comparingobj class to compare the hash values
public class HashCodeEquals{
    public static void main(String[] args) {
        comparingobj s1 = new comparingobj(1, "Raj");
        comparingobj s2 = new comparingobj(2, "Badshah");
        System.out.println("s1 hashcode = " +s1.hashCode());
        System.out.println("s2 hashcode = " +s2.hashCode());
        System.out.println("s1 is equal to s2 or not = "+s1.equals(s2));
    }
}