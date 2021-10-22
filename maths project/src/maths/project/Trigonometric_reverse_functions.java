
package maths.project;

import static maths.project.differentiation.*;

public class Trigonometric_reverse_functions {

    public static String sinhDiff(String eq, char x) {
        eq = eq.substring(4, eq.length() - 1);
        String derivative = "cosh(" + eq + ")*" + chainDiff(eq, 'x');
        return derivative;
    }

    public static String arcSinhDiff(String eq, char x) {
        eq = eq.substring(7, eq.length() - 1);
        String derivative = chainDiff(eq, 'x') + "/sqrt((" + eq + ")^(2)+1)";
        return derivative;
    }

    public static String coshDiff(String eq, char x) {
        eq = eq.substring(4, eq.length() - 1);
        String derivative = "sinh" + eq + "*" + chainDiff(eq, 'x');
        return derivative;
    }

    public static String arcCoshDiff(String eq, char x) {
        eq = eq.substring(7, eq.length() - 1);
        String derivative = chainDiff(eq, 'x') + "/sqrt((" + eq + ")^(2)-1)";
        return derivative;
    }

    public static String tanhDiff(String eq, char x) {
        eq = eq.substring(3, eq.length() - 2);
        String derivative = "sech" + eq + "^(2)*" + chainDiff(eq, 'x');
        return derivative;
    }

    public static String arcTanhDiff(String eq, char x) {
        eq = eq.substring(3, eq.length() - 2);
        String derivative = chainDiff(eq, 'x') + "/(1-(" + eq + ")^(2))";
        return derivative;
    }

    public static String cothDiff(String eq, char x) {
        eq = eq.substring(3, eq.length() - 2);
        String derivative = "-csch" + eq + "^(2)*" + chainDiff(eq, 'x');
        return derivative;
    }

    public static String arcCothDiff(String eq, char x) {
        eq = eq.substring(3, eq.length() - 2);
        String derivative = chainDiff(eq, 'x') + "/(1-(" + eq + ")^(2))";
        return derivative;
    }

    public static String sechDiff(String eq, char x) {
        eq = eq.substring(4, eq.length() - 1);
        String derivative = "-sech" + eq + "*" + "tanh" + eq + "*" + chainDiff(eq, 'x');
        return derivative;
    }

    public static String cschDiff(String eq, char x) {
        eq = eq.substring(3, eq.length() - 2);
        String derivative = "-csch" + eq + "*" + "coth" + eq + "*" + chainDiff(eq, 'x');
        return derivative;
    }

    public static String arcCschDiff(String eq, char x) {
        eq = eq.substring(3, eq.length() - 2);
        String derivative = "-" + chainDiff(eq, 'x') + "/(" + eq + "*sqrt((" + eq + ")^(2)+1))";
        return derivative;
    }

    public static String arcSechDiff(String eq, char x) {
        eq = eq.substring(3, eq.length() - 2);
        String derivative = "-" + chainDiff(eq, 'x') + "/(" + eq + "*sqrt(1-(" + eq + ")^(2)))";
        return derivative;
    }

}
