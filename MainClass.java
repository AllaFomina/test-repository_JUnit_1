import org.junit.Test;

public class MainClass extends MainClassTest
{
    int a = 0;
    int b = 14;

    @Test
    public void getLocalNumber()
    {
       int a = this.multiply( 7);
       System.out.println(a);
    }

}
