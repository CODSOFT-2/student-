import java.util.*;
public class yoga2{
    public static  void  main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of subjects:");
        int n=s.nextInt();
        int tot=0;
        float avg=0;
        char g;
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
            tot+=a[i];
            avg=tot/n;
        }
        System.out.println("Total marks:"+ tot);
        System.out.println("Average marks:"+ avg);
        
        if (avg>=90)
        {
            System.out.println("Grade:A");
            }
            else if (avg>=80){
                System.out.println("Grade:B");
            }
            else if (avg>=70)
            {
            System.out.println("Grade:C");
            }
            else if(avg>=60){
            System.out.println("Grade:D");
            }
            else
            {
                System.out.println("Grade:F");
            }
        }
    }