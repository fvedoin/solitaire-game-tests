package solitaire;

import card.StackMovesTests;
import card.StackTests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
        SequentialStackCardTests.class,
        SequentialStackStackTests.class
})
public class SequentialStackSuitTests {
}
