import java.util.*;
public class breakestatement{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(i==2)
            break;
            System.out.println("Break example");
            System.out.println(i);
        }
    }
}