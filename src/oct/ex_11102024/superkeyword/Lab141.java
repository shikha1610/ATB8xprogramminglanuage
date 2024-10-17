package oct.ex_11102024.superkeyword;

public class Lab141 {
    public static void main(String[] args) {
        BaseClass t1 = new TestCase1(); // Dynamic dispatch
        t1.openBrowser("edge");
        t1.closeBrowser();
    }
}
