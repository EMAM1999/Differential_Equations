
package maths.project;

//import static maths.project.simplfecation.*;
import static maths.project.differentiation.*;
import static maths.project.Trigonometric_functions.*;
import static maths.project.Trigonometric_reverse_functions.*;

public class Advanced {

    public static String AdvancedDiff(String f, char x) {
        String s = "";
        if (f.contains(")+")) {
            String[] ss = f.split("\\+");
            for (int i = 0; i < ss.length; i++) {
                s += AdvancedDiff(ss[i], x);
            }
        } else if (f.contains("*")) {
            s = multiplyDiff(f, x);
        } else if (f.contains("sqrt")) {
            s = SqrtDiff(f, x);
        } else if (f.contains("exp")) {
            s = expDiff(f, x);
        } else if (f.contains("sin")) {
            if (f.contains("sinh")) {
                if (f.contains("arcsinh")) {
                    s = arcSinhDiff(f, x);
                } else {
                    s = sinhDiff(f, x);
                }
            } else {
                s = sinDiff(f, x);
            }
        } else if (f.contains("cos")) {
            if (f.contains("cosh")) {
                if (f.contains("arccosh")) {
                    s = arcCoshDiff(f, x);
                } else {
                    s = coshDiff(f, x);
                }
            } else {
                s = cosDiff(f, x);
            }
        } else if (f.contains("tan")) {
            if (f.contains("tanh")) {
                if (f.contains("arctanh")) {
                    s = arcTanhDiff(f, x);
                } else {
                    tanhDiff(f, x);
                }
            } else {
                TanDiff(f, x);
            }
        } else if (f.contains("cot")) {
            if (f.contains("coth")) {
                if (f.contains("arccoth")) {
                    s = arcCothDiff(f, x);
                } else {
                    cothDiff(f, x);
                }
            } else {
                CotDiff(f, x);
            }
        } else if (f.contains("sec")) {
            if (f.contains("sech")) {
                if (f.contains("arcsech")) {
                    s = arcSechDiff(f, x);
                } else {
                    sechDiff(f, x);
                }
            } else {
                SecDiff(f, x);
            }
        } else if (f.contains("csc")) {
            if (f.contains("csch")) {
                if (f.contains("arccsch")) {
                    s = arcCschDiff(f, x);
                } else {
                    cschDiff(f, x);
                }
            } else {
                CscDiff(f, x);
            }
        } else {
            s = chainDiff(f, x);
        }
        return s;
    }

    public static String Advanced_Multiply_Sim(String f1, String f2) {
        String s = "";
        if (f1.contains("exp") && !f2.contains("exp")) {
            if (f1.substring(0, f1.indexOf("e")) == "(") {
                return f1 + f2;
            } else {
                s += Advanced_Multiply_Sim(f1.substring(0, f1.indexOf("e")), f2)
                        + f1.substring(f1.indexOf("e"));
            }
        } else if (f2.contains("exp") && !f1.contains("exp")) {
            if (f2.substring(0, f2.indexOf("e")) == "(") {
                return f2 + f1;
            } else {
                s += Advanced_Multiply_Sim(f2.substring(0, f2.indexOf("e")), f1)
                        + f2.substring(f2.indexOf("e"));
            }
        } else if (f1.contains("sin") && !f2.contains("sin")) {
            if (f1.substring(0, f1.indexOf("s")) == "(") {
                return f1 + f2;
            } else {
                s += Advanced_Multiply_Sim(f1.substring(0, f1.indexOf("s")), f2)
                        + f1.substring(f1.indexOf("s"));
            }
        } else if (f2.contains("sin") && !f1.contains("sin")) {
            if (f2.substring(0, f2.indexOf("s")) == "(") {
                return f2 + f1;
            } else {
                s += Advanced_Multiply_Sim(f2.substring(0, f2.indexOf("s")), f1)
                        + f2.substring(f2.indexOf("s"));
            }
        } else if (f1.contains("cos") && !f2.contains("cos")) {
            if (f1.substring(0, f1.indexOf("c")) == "(") {
                return f1 + f2;
            } else {
                s += Advanced_Multiply_Sim(f1.substring(0, f1.indexOf("c")), f2)
                        + f1.substring(f1.indexOf("c"));
            }
        } else if (f2.contains("cos") && !f1.contains("cos")) {
            if (f2.substring(0, f2.indexOf("c")) == "(") {
                return f2 + f1;
            } else {
                s += Advanced_Multiply_Sim(f2.substring(0, f2.indexOf("c")), f1)
                        + f2.substring(f2.indexOf("c"));
            }
        } else {
            s = simplfecation.multiply(f1, f2);
        }
        return s;
    }
}
