package main;

import main.utils.TestManager;
import org.junit.*;

import static org.junit.Assert.assertTrue;

public class Test1 extends TestManager {

    @Test
    public void search(){
        ResultPage result = main.search("123");
        assertTrue("Result Page isn't shown", result.isPresent("123"));
    }


}
