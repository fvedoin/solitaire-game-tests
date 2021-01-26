package card;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
        BasicCardTests.class,
        FlipCardTests.class,
        LocationCardTests.class,
        InstanceClassicCardTests.class
})
public class CardSuiteTests {
}
