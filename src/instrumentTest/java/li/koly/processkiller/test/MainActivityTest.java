package li.koly.processkiller.test;

import android.test.InstrumentationTestCase;
import li.koly.processkiller.MainActivity;

public class MainActivityTest extends InstrumentationTestCase{

    public void testReturnTrue(){
        MainActivity mainActivity = new MainActivity();

        assertEquals(true, true);
    }

    public void testFailedTest(){
        assertEquals(false, true);
    }

}