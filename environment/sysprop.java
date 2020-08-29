package environment;

public class sysprop {
    public static void main(String[] args) throws Exception{
        if (args.length == 0)
        {
            System.getProperties().list(System.out);
        }
        else{
            for (String s : args)
            {
                System.out.println(s+ " = " + System.getProperty(s));
            }
        }
    }
}