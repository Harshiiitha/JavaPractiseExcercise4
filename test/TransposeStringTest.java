import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TransposeStringTest {

   TransposeString test;

    @BeforeClass
    public static void setUpBeforeClass()
    {


        System.out.println("Inside BeforeClass");

    }

    @AfterClass
    public static void tearDownAfterClass()
    {


        System.out.println("Inside AfterClass");

    }

    @Before
    public void setUp()
    {
        //arrange
        test=new TransposeString();

        System.out.println("Inside Before");

    }

    @After
    public void tearDown()
    {
        //arrange
        test=null;

        System.out.println("Inside After");

    }
    /*Testcase to transpose each word in a string*/
    @Test
    public void transposeString_GivenInputString_ShouldReturnEachWord()
    {
        assertEquals("a kciuq nworb xof spmuj revo eht yzal god",test.transposeString("a quick brown fox jumps over the lazy dog"));

    }
    /*Testcase to check negative result transpose each word in a string*/
    @Test
    public void transposeString_GivenInputString_CheckingNegativeCase()
    {
        assertNotEquals("evirsemmi lluf kcats gninia",test.transposeString("immesrive full stack training"));

    }


}