import org.junit.*;

import static org.junit.Assert.*;

public class ReplaceCharTest {

        ReplaceChar test;
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
            test=new ReplaceChar();

            System.out.println("Inside Before");

        }

        @After
        public void tearDown()
        {
            //arrange
            test=null;

            System.out.println("Inside After");

        }
        /*Testcase to replace 'd' with 'f' and 'l' with 't'*/
        @Test
        public void replaceCharacter_GivenaString_ShouldReplaceCharacters()
        {

            assertEquals("faity fry",test.replaceCharacter("daily dry"));
        }
        /*Testcase to check negative result while replacing 'd' with 'f' and 'l' with 't'*/
        @Test
        public void replaceCharacter_GivenaString_checkingNegativeresult()
        {

        assertNotEquals("fairy fry",test.replaceCharacter("daily dry"));
        }



}