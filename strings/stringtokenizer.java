package strings;

import java.util.StringTokenizer;

public class stringtokenizer {
    public static void main(String[] args) 
    {
    StringTokenizer st = new StringTokenizer("this is java");
    int count =1;
    while(st.hasMoreTokens())
    {
        System.out.println("Token "+count+": "+st.nextToken());
        count++;
    }
  }
}