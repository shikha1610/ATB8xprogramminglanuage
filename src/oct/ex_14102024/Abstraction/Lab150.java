package oct.ex_14102024.Abstraction;

public class Lab150 {
}

interface I1{}
interface I2{}//
class A{}// concrete class
class B{}// concrete class
class Test1 extends A{}// single inheritance
//class Test2 extends A,B{}// multiple never using class
class Test3 implements I1{}
class Test4 implements I1, I2{}// multiple inheritance Interfaces
class Test5 extends A implements I1, I2{}
//class Test6 implements I1 extends A{}