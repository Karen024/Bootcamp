package Exercise.Day19.AbstractClassTest.TestPackageForProblem4;

import Exercise.Day19.AbstractClassTest.AbstractClassAccessCheck;

public class Another extends AbstractClassAccessCheck {
    public Another() {
    }

    public void print() {
        field1 = "Dasht 1";
        field2 = "Dasht 2";
        field3 = "Dasht 3";
        System.out.println(field1);
        System.out.println(field2);
        System.out.println(field3);
    }
}
