
package maths.project;

import static maths.project.differentiation.*;
import static maths.project.simplfecation.*;

public class Trigonometric_functions {

    public static String sinDiff(String s, char x) {
        String A = "";
        String res = "";
        int i = s.indexOf("sin");
        String F = s.substring(i + 3, s.lastIndexOf(")") + 1);
        String eF = s.substring(i, s.lastIndexOf(")") + 1);
        if (i != 0) {
            A = s.substring(0, i);
            if (A.equals("-")) {
                A = "-1";
            }
            res += ((chainDiff(A, x) == "1") ? (eF) : ((chainDiff(A, x) == "0") ? ("") : (chainDiff(A, x) + eF)));
        }
        res += simplfecation.multiply(chainDiff(F, x), A) + "cos" + F;
        return shape(res);

    }

    public static String cosDiff(String s, char x) {
        String A = "";
        String res = "";
        int i = s.indexOf("cos");
        String F = s.substring(i + 3, s.lastIndexOf(")") + 1);
        String eF = s.substring(i, s.lastIndexOf(")") + 1);
        if (i != 0) {
            A = s.substring(0, i);
            if (A.equals("-")) {
                A = "-1";
            }
            res += ((chainDiff(A, x) == "1") ? (eF) : ((chainDiff(A, x) == "0") ? ("") : (chainDiff(A, x) + eF)));
            //                + sim.multiply(chainDiff(F, x), A) + "cos" + F;
            //        String res = chainDiff(A, x) + eF 
        }
        res += simplfecation.multiply(simplfecation.multiply(chainDiff(F, x), A), "-1") + "sin" + F;
        return shape(res);
    }

    public static String TanDiff(String s, char x) {

        int index1, index2, index3;

        index1 = s.indexOf("tan");
        index2 = s.indexOf("(");
        index3 = s.indexOf(")");

        String tan = s.substring(index1);
        String angle = s.substring(index2 + 1, index3);

        String diffAngle = chainDiff(angle, x);

        String res = diffAngle + " * sec^2" + "(" + (angle) + ")";

        return res;
    }

    public static String CotDiff(String s, char x) {

        int index1, index2, index3;

        index1 = s.indexOf("cot");
        index2 = s.indexOf("(");
        index3 = s.indexOf(")");

        String cot = s.substring(index1);
        String angle = s.substring(index2 + 1, index3);

        String diffAngle = chainDiff(angle, x);

        String res = diffAngle + " * -csc^2" + "(" + (angle) + ")";

        return res;
    }

    public static String SecDiff(String s, char x) {

        int /*index1,*/ index2, index3;

//        index1 = s.indexOf("sec");
        index2 = s.indexOf("(");
        index3 = s.indexOf(")");

//        String sec = s.substring(index1);
        String angle = s.substring(index2 + 1, index3);

        String diffAngle = chainDiff(angle, x);

        String res = diffAngle + " * sec" + "(" + (angle) + ")" + " * tan" + "(" + (angle) + ")";

        return shape(res);
    }

    public static String CscDiff(String s, char x) {

        int index1, index2, index3;

        index1 = s.indexOf("csc");
        index2 = s.indexOf("(");
        index3 = s.indexOf(")");

        String csc = s.substring(index1);
        String angle = s.substring(index2 + 1, index3);

        String diffAngle = chainDiff(angle, x);

        String res = diffAngle + " * -csc" + "(" + (angle) + ")" + " * cot" + "(" + (angle) + ")";

        return res;
    }

}
