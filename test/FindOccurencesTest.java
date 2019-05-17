import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class FindOccurencesTest
{

    FindOccurences test;

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
        test=new FindOccurences();

        System.out.println("Inside Before");

    }

    @After
    public void tearDown()
    {
        //arrange
        test=null;

        System.out.println("Inside After");

    }
    /*Testcase to check occurences of "se" in given string*/
    @Test
    public void findOccurences_GivenInputAndPattern_ShouldReturnOccurencesOfPattern()
    {
        String input="She sells seashells by the seashore";
        List<String> expected=new ArrayList<String>();
        expected.add("Found at:4-6");
        expected.add("Found at:10-12");
        expected.add("Found at:27-29");
        assertArrayEquals(expected.toArray(),(test.findOccurences(input,"se")).toArray());

    }
    /*Testcase to check occurences of "Ja" in given string*/
    @Test
    public void findOccurences_GivenInput1AndPattern_ShouldReturnOccurencesOfPattern()
    {
        String input="Java is a Java the Java";
        List<String> expected=new ArrayList<String>();
        expected.add("Found at:0-2");
        expected.add("Found at:10-12");
        expected.add("Found at:19-21");
        assertArrayEquals(expected.toArray(),(test.findOccurences(input,"Ja")).toArray());
    }
    /*Testcase to check occurences of pattern not present in given string*/
    @Test
    public void findOccurences_GivenInput1AndPatternNotThereInString_ShouldReturnEmptyList()
    {
        String input="My Daily routine is to learn and excel";
        List<String> expected=new ArrayList<String>();
        assertArrayEquals(expected.toArray(),(test.findOccurences(input,"ha")).toArray());
    }


}