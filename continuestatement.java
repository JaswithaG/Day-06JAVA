import java.util.*;
public class continuestatement{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(i==2)
            continue;
            System.out.println("Continue example");
            System.out.println(i);
        }
    }
}