package advancedTest;

import extras.*;

public class Main {

    public static void main(String[] args) {
        Test test1 = new Test();
        test1.test2 = new Test2();
        Test test3 = new Test(test1, new Test2(), new Test2());
        test1 = foo();
        test1.speak(new Test2());
        test3.speak(test1.test2);

        Test2 test2 = bar(test1.test2);
        test2.speak();
        int a = 1;
        test1 = new Main().buz(a, test3, test2);
        test1.speak();
        test1 = new Main().buz();
        test1 = foo(test1, test2);
        test1.speak(test1.test2);

    }

    public static Test foo() {
        return new Test();
    }

    public static Test foo(Test test, Test2 test2) {
        return new Test();
    }

    public static Test2 bar(Test2 arg) {
        if (arg == null)
            return new Test2();
        else
            return arg;
    }

    public Test buz() {
        Test localTest = new Test();
        localTest.speak();
        return localTest;
    }

    public Test buz(int a, Test b, Test2 c) {
        b.speak(c);
        Test2 localTest = new Test2();
        localTest.speak();
        c.speak();
        return new Test();
    }
}