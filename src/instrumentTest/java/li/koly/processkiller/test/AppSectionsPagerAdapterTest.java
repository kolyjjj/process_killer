package li.koly.processkiller.test;

import android.test.InstrumentationTestCase;
import li.koly.processkiller.AppSectionsPagerAdapter;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by twer on 6/10/13.
 */
public class AppSectionsPagerAdapterTest extends InstrumentationTestCase {

    public void test_should_return_three_fragment_when_get_count_called() {
        AppSectionsPagerAdapter appSectionsPagerAdapter = new AppSectionsPagerAdapter(null);
        int count = appSectionsPagerAdapter.getCount();

        assertThat(count, is(3));
    }
}
