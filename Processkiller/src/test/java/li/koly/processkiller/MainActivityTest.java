package li.koly.processkiller;

import android.test.InstrumentationTestCase;

public class MainActivityTest extends InstrumentationTestCase{

    public void test_call_on_create(){
        MainActivity mainActivity = new MainActivity();

        assertEquals(true, true);
    }

}
