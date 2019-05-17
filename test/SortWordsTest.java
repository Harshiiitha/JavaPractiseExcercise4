import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SortWordsTest {

        SortWords test;
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
            test=new SortWords();

            System.out.println("Inside Before");

        }

        @After
        public void tearDown()
        {
            //arrange
            test=null;

            System.out.println("Inside After");

        }
        /*Testcase to sort words in a given paragraph*/
        @Test
        public void sortWords_GivenaParagraph_ShouldReturnSortedWords()
        {
         String input="Write your choice Extract the word you want";
         input=input.toLowerCase();
            List<String> expected=new ArrayList<String>();
            expected.add("choice");
            expected.add("extract");
            expected.add("the");
            expected.add("want");
            expected.add("word");
            expected.add("write");
            expected.add("you");
            expected.add("your");
            assertArrayEquals( expected.toArray(),(test.sortWords(input)).toArray());

    }

}