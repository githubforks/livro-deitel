package ch04.Exer04_17;

public class Func
{
    public void calcula(int n1, int n2)
    {
        boolean b=true;
        int i = 0;
        do
        {
            i++;
            System.out.printf("%d",n1/n2);
            n1%=n2;
            if(n1<n2 && n1!=0)
            {
                n1*=10;
                if(b)
                {
                    b=false;
                    System.out.printf(",");
                }
            }
        }while(n1!=0 && i<=10);
        System.out.println();
    }
}
