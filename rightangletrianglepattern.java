import java.util.*;
public class rightangletrianglepattern{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if((i==n-1)||(j==0)||(i==j))
                System.out.print("*"+" ");
                else
                System.out.print(""+"");
            }
            System.out.println();
        }
    }
}