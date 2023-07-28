/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Patter2
{
	 public static void main(String[]args)
    {
        int n=5;

        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<=n;j++)
            {
                if(i==1 || j==1 || i==j || j==n)
                {
                    System.out.print(j+" ");
                }
                else
                {
                    System.out.print("  ");
                }

            }
              System.out.println();
        }
      
    }
}
