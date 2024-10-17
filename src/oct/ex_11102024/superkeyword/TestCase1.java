package oct.ex_11102024.superkeyword;

public class TestCase1 extends BaseClass {

    // Test CAse is A type of BaseClass - Single Inheritance
    TestCase1() {
        super();// DC of parent
        this.setBrowser("edge", true);
    }

    @Override
        public void setBrowser(String browser, boolean isAuth) {
        super.setBrowser(browser, isAuth);

    }
}