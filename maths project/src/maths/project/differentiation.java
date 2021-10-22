
package maths.project;

import static maths.project.simplfecation.*;

public class differentiation {

    public static String chainDiff(String y, char x) {
        String A = "", fx = "", a = "", dy = "";
        y = y.replaceAll(" ", "");
        if (y.charAt(0) == '(') {
            y.substring(1, y.length() - 1);
        }
        double B, b;
        for (int i = 0; i < y.length(); i++) {
            switch (y.charAt(i)) {
                case '-':
                    if (i == 0) {
                        if (y.charAt(1) != 'x') {
                            A += y.charAt(i);
                        } else {
                            A = "-1";
                        }
                    } else if (y.charAt(i - 1) == '^') {

                        a += y.charAt(i);

                    } else {
                        if (A == "") {
                            if (a == "") {
                                dy += "+" + 1;
                            } else {
                                b = Double.parseDouble(a) - 1;
                                B = Double.parseDouble(a);
                                dy += ((B < 0) ? (B) : ((B == 1) ? ("+") : ("+" + B))) + fx + "(" + ((b == 1) ? ("\\b\\b") : (b + ")"));
                            }

                        } else if (fx == "") {
                        } else if (a == "") {
                            B = Double.parseDouble(A);
                            dy += ((B < 0) ? (B) : ((B == 1) ? ("+") : ("+" + B)));

                        } else {
                            b = (Double.parseDouble(a)) - 1;
                            B = Double.parseDouble(a) * Double.parseDouble(A);
                            dy += ((B < 0) ? (B) : ((B == 1) ? ("+") : ("+" + B))) + fx + "(" + ((b == 1) ? ("\b\b") : (b + ")"));
                        }
                        A = fx = a = "";
                        if (y.charAt(i + 1) == 'x') {
                            A = "-1";
                        } else {
                            A += y.charAt(i);
                        }
                    }
                    break;
                case '+':
                    if (A == "") {
                        if (a == "") {
                            dy += 1;
                        } else {
                            b = Double.parseDouble(a) - 1;
                            B = Double.parseDouble(a);
                            dy += ((B < 0) ? (B) : ((B == 1) ? ("+") : ("+" + B))) + fx + "(" + ((b == 1) ? ("\b\b") : (b + ")"));
                        }
                    } else if (fx == "") {
                    } else if (a == "") {
                        B = Double.parseDouble(A);
                        dy += ((B < 0) ? (B) : ((B == 1) ? ("+") : ("+" + B)));
                    } else {
                        b = (Double.parseDouble(a)) - 1;
                        B = Double.parseDouble(a) * Double.parseDouble(A);
                        dy += ((B < 0) ? (B) : ((B == 1) ? ("+") : ("+" + B))) + fx + "(" + ((b == 1) ? ("\b\b") : (b + ")"));
                    }
                    A = fx = a = "";
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                case '.':
                    if (fx == "") {
                        A += y.charAt(i);
                    } else {
                        a += y.charAt(i);
                    }
                    break;
                case 'x':
                    if (x == 'x') {
                        fx += y.charAt(i);
                    }
                case 'y':
                    if (x == 'y') {
                        fx += y.charAt(i);
                    }
                    break;
                case '^':
                    fx += y.charAt(i);
            }
        }
        if (A == "") {
            if (a == "") {
                dy += "+" + 1;
            } else {
                b = (Double.parseDouble(a)) - 1;
                B = Double.parseDouble(a);
                dy += ((B < 0) ? (B) : ((B == 1) ? ("+") : ("+" + B))) + fx + "(" + ((b == 1) ? ("\b\b") : (b + ")"));
            }
        } else if (fx == "") {
            if (dy == "") {
                dy = "0";
            }
        } else if (a == "") {
            B = Double.parseDouble(A);
            dy += ((B < 0) ? (B) : ((B == 1) ? ("+") : ("+" + B)));
        } else {
            b = (Double.parseDouble(a)) - 1;
            B = Double.parseDouble(a) * Double.parseDouble(A);
            dy += ((B < 0) ? (B) : ((B == 1) ? ("+") : ("+" + B))) + fx + "(" + ((b == 1) ? ("\b\b") : (b + ")"));
        }
        return dy;
    }

    public static String multiplyDiff(String s, char x) {
        String[] split = s.split("\\*");
        String res = "";
        String diff[] = new String[split.length];
        for (int i = 0; i < split.length; i++) {
            diff[i] = Advanced.AdvancedDiff(split[i], x);
        }
//        res += split[0] + "*" + simplfecation.shape(diff[1]) + "+"
        res += Advanced.Advanced_Multiply_Sim(split[0], simplfecation.shape(diff[1]))
                //                + split[1] + "*" + simplfecation.shape(diff[0]);
                + Advanced.Advanced_Multiply_Sim(simplfecation.shape(diff[0]), split[1]);

        return res;
    }

    public static String devDiff(String s, char x) {
        String[] split = s.split("\\/");
        String res = "(";
//        if (Integer.parseInt(split[1].trim()) != 0) {
        String diff[] = new String[split.length];
        for (int i = 0; i < split.length; i++) {
            diff[i] = chainDiff(split[i], x);
        }
        res += simplfecation.multiply(split[1], diff[0]) + "-" + split[0] + "*" + diff[1] + ")" + "/" + "(" + split[1] + ")" + "^(2)";
        return simplfecation.shape(res);
//        } else {
//            return null;
//        }
    }

    public static String SqrtDiff(String s, char x) {
        s = s.replaceAll(" ", "");
        if (s.startsWith("sqrt")) {
            s = simplfecation.sqrt_function(s);  //<<<<
//            int e = 0;
//            for (int i = 6;i<s.length(); i++) {
//                if (s.charAt(i) == ')') {
//                    e = i;
//                    break;
//                }
//            }
            if (s.contains("sqrt")) {
                String timp = s.substring(6, s.lastIndexOf(")"));
                String diff = chainDiff(timp, x); //  String diff = added(timp);
                String res = simplfecation.dividing(diff, "2") + "/" + s;
                return simplfecation.shape(res);
            } else if (s.contains("ERROR")) {
                return "ERROR -> sqrt(-)";
            } else {
                String timp = s.substring(1, s.lastIndexOf(")"));
                return simplfecation.shape(chainDiff(timp, x));
            }
        } else {
            return "please write (sqrt)";
        }
    }

    public static String powerDiff(String s, char x) {
        int i = s.indexOf(")^");
        String f = s.substring(1, i);
        String diff = chainDiff(f, x);  // String diff = added(f);

        String sub = s.substring(i + 3, s.length() - 1);
        int pow = Integer.parseInt(sub.trim());

        String res = pow + "(" + "(" + f + ")" + "^(" + (pow - 1) + ")" + ")" + "*" + "(" + diff + ")";
        return res;

    }

    public static String expDiff(String s, char x) {
        String A = "";
        String res = "";
        int i = s.indexOf("exp");
        String F = s.substring(i + 3, s.lastIndexOf(")"));
        String eF = s.substring(i, s.lastIndexOf(")") + 1);  // String diff = added(f);
        if (i != 0) {
            A = s.substring(0, i);
            res += chainDiff(A, x) + eF;
        }
        res += simplfecation.multiply(chainDiff(F, x), A) + eF;
        return res;
//        return res;
//        return res;
    }

    public static String logDiff(String s, char x) {
        int i = s.indexOf("log");
//        String A = s.substring(0, i + 1);
        String F = s.substring(i + 3, s.lastIndexOf(")"));
        String eF = s.substring(i, s.lastIndexOf(")") + 1);

//        String res = (1/(ln(10)*f))*chainDiff(F, x);
        String res = simplfecation.multiply((simplfecation.multiply(eF, "0.434")), chainDiff(F, x));
        return simplfecation.shape(res);
    }

    public static String fun_power_x_Diff(String s, char x) {
        int i = s.indexOf("^(");
        String f = s.substring(0, i);
        String power = s.substring(i + 2, s.length() - 1);
        String diff = simplfecation.shape(chainDiff(power, x));
        // string res = ln(f)*f(x)*
        String res = "ln(" + f + ")*(" + s + ")*" + diff;
        return simplfecation.shape(res);

    }
}
