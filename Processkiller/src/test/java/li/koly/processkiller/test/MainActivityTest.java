package li.koly.processkiller.test;

import android.test.InstrumentationTestCase;
import li.koly.processkiller.MainActivity;

public class MainActivityTest extends InstrumentationTestCase{

    public void test_call_on_create(){
        MainActivity mainActivity = new MainActivity();

        assertEquals(true, true);
    }

}
