import org.junit.*;

import static org.junit.Assert.*;

public class countCharacterTest {

        CountCharacter test;
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
            test=new CountCharacter();

            System.out.println("Inside Before");

        }

        @After
        public void tearDown()
        {
            //arrange
            test=null;

            System.out.println("Inside After");

        }
        /*Testcase to check count the occurence of 'a' in string*/
        @Test
        public void countChar_Givenacharacter_shouldreturncount()
        {

            assertEquals("count is 10",test.countChar("java is again java again java","a"));
        }
        /*Testcase to check count the occurence of 'y' in nullstring*/
        @Test
        public void countChar_GivenNullString_ShouldReturnCannotBeNull()
        {
            assertEquals("String cannot be null",test.countChar(null,"y"));
        }

}