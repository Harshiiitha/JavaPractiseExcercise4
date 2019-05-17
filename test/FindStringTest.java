import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class FindStringTest {

        FindString test;
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
            test=new FindString();

            System.out.println("Inside Before");

        }

        @After
        public void tearDown()
        {
            //arrange
            test=null;

            System.out.println("Inside After");

        }
        /*Testcase to check whether Harry is present in string or not*/
        @Test
        public void findHarry_GivenInputString_ShouldReturnTrue()
        {
            assertEquals("true",test.findHarry("This is Harry","Harry"));

        }
        /*Testcase to check whether Harry is present in string or not*/
        @Test
         public void findHarry_GivenInputString_ShouldReturnFalse()
         {
             assertEquals("false", test.findHarry("This is Henry", "Harry"));
         }
        /*Testcase to check Harry in null string*/
        @Test
        public void findHarry_GivenNullString_ShouldReturnStringCannotBeNUll()
        {
            assertEquals("Strings cannot be null",test.findHarry(null,"Harry"));
        }

    }

