public class tables
{
    public static void main(String[] args)
    {
        for (int i=1; i<=12; i++)
        {
            String a = "";
            for (int j=1; j<=12; j++)
            {
                int n = i*j;
                if (n<10)
                {
                    if(i<10 && j ==1)
                        a = a+" "+n;
                    else
                        a = a+"   "+n;

                }
                else if (n<100)
                {
                    if (j<100 && j == 1)
                        a = a+n;
                    else
                        a = a+"  "+n;

                }
                else
                    a = a+" "+n;
            }
            System.out.println(a);
        }
    }
}
