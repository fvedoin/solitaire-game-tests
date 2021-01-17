package card;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
        StackTests.class,
        StackMovesTests.class
})
public class StackSuitTests {
}
