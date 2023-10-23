import static org.junit.Assert.*;
import org.junit.*;
import java.util.Arrays;
import java.util.List;

public class ListTests {
	@Test 
	public void testFilter() {

    StringChecker checker = s -> true;
    List<String> input1 = Arrays.asList("3");
    ListExamples.filter(input1, checker);
    assertEquals(Arrays.asList( "3" ), input1);
    List<String> input2 = Arrays.asList( "1", "2", "3" );
    assertEquals(Arrays.asList( "1", "2", "3" ), ListExamples.filter(input2, checker));
	}


  @Test
  public void testMerge() {
    List<String> input1 = Arrays.asList( );;
    List<String> input2 = Arrays.asList( "1", "2", "3" );
    assertEquals(Arrays.asList( "1", "2", "3" ), ListExamples.merge(input1, input2));
  }
}
