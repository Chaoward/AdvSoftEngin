import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SelectClasses;

@Suite
@SelectClasses({FullTestSuite.class, DateCheckerTest.class, CalculatorTest.class})
public class FullTestSuite {}
