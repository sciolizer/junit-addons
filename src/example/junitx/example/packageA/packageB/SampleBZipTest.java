package junitx.example.packageA.packageB;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * @version $Revision: 1.1 $ $Date: 2003/02/05 10:34:22 $
 * @author <a href="mailto:vbossica@users.sourceforge.net">Vladimir R. Bossicard</a>
 */
public class SampleBZipTest
        extends TestCase {

    public SampleBZipTest(String name) {
        super(name);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite();

        suite.addTest(new SampleBZipTest("testDummy1"));
        suite.addTest(new SampleBZipTest("testDummy2"));

        return suite;
    }

    public void testDummy1() {
    }

    public void testDummy2() {
    }

    public void testDummy3() {
    }

}
