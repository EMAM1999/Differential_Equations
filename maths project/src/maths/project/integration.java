
package maths.project;

import static maths.project.Advanced.AdvancedDiff;
import static maths.project.differentiation.*;
import static maths.project.simplfecation.*;

public class integration {

//    private simplfecation sim = new simplfecation();
//    private differentiation diff = new differentiation();
    public static String chainInt(String dy, char q) {
        String A = "", x = "", a = "", y = "";
        double B, b;
        for (int i = 0; i < dy.length(); i++) {
            switch (dy.charAt(i)) {
                case '-':
                    if (i == 0) {
                        if (dy.charAt(1) != 'x' && dy.charAt(1) != 'X') {
                            A += dy.charAt(i);
                        } else {
                            A = "-1";
                        }
                    } else if (dy.charAt(i - 1) == '^') {

                        a += dy.charAt(i);

                    } else {
                        if (A == "") {
                            if (a == "") {
                                y += "+" + 0.5 + "x^" + 2;
                            } else {
                                b = Double.parseDouble(a) + 1;
                                y += ((b > 0) ? ("+" + ("(1/" + b + ")")) : ("(1/" + b + ")")) + x + "(" + b + ")";
                            }

                        } else if (x == "") {
                            y += ((Integer.parseInt(A) == 1) ? ("+x") : ((Integer.parseInt(A) == 0) ? ("") : ("+" + A + "x")));
                        } else if (a == "") {
                            b = Double.parseDouble("2");
                            B = Double.parseDouble(A) / b;
                            B = roundTo(B, 3);
                            y += ((B > 0) ? ("+" + B) : (B)) + x + "(" + b + ")";
//                            if ((B % 1) == 0) {
//                                y += ((B < 0) ? (B) : ((B == 1) ? ("+") : ("+" + B))) + x + "(" + b + ")";
//                            } else {
//                                y += ((B > 0) ? ("+(" + A + "/" + b + ")") : ("(" + A + "/" + b + ")")) + x + "(" + b + ")";
//                            }
                        } else {
                            b = (Double.parseDouble(a)) + 1;
                            B = Double.parseDouble(A) / b;
                            if ((B % 1) == 0) {
                                y += ((B < 0) ? (B) : ((B == 1) ? ("+") : ("+" + B))) + x + "(" + b + ")";
                            } else {
                                y += ((B > 0) ? ("+(" + A + "/" + b + ")") : ("(" + A + "/" + b + ")")) + x + "(" + b + ")";
                            }
                        }
                        A = x = a = "";
                        if (dy.charAt(i + 1) == 'x' || dy.charAt(i + 1) == 'X') {
                            A = "-1";
                        } else {
                            A += dy.charAt(i);
                        }
                    }
                    break;
                case '+':
                    if (A == "") {
                        if (a == "") {
                            y += "+" + 0.5 + "x^" + 2;
                        } else {
                            b = Double.parseDouble(a) + 1;
                            y += ((b > 0) ? ("+" + ("(1/" + b + ")")) : ("(1/" + b + ")")) + x + "(" + b + ")";
                        }
                    } else if (x == "") {
                        y += ((A == "1") ? ("+") : ("+" + A)) + "x";
                    } else if (a == "") {
                        b = Double.parseDouble("2");
                        B = Double.parseDouble(A) / b;
                        B = roundTo(B, 3);
                        y += ((B > 0) ? ("+" + B) : (B)) + x + "^(" + b + ")";
//                        if ((B % 1) == 0) {
//                            y += ((B < 0) ? (B) : ((B == 1) ? ("+") : ("+" + B))) + x + "^(" + b + ")";
//                        } else {
//                            y += ((B > 0) ? ("+(" + A + "/" + b + ")") : ("(" + A + "/" + b + ")")) + x + "^(" + b + ")";
//                        }
                    } else {
                        b = (Double.parseDouble(a)) + 1;
                        B = Double.parseDouble(A) / b;
                        B = roundTo(B, 3);
                        y += ((B > 0) ? ("+" + B) : (B)) + x + "(" + b + ")";
//                        if ((B % 1) == 0) {
//                            y += ((B < 0) ? (B) : ((B == 1) ? ("+") : ("+" + B))) + x + "(" + b + ")";
//                        } else {
//                            y += ((B > 0) ? ("+(" + A + "/" + b + ")") : ("(" + A + "/" + b + ")")) + x + "(" + b + ")";
//                        }
                    }
                    A = x = a = "";
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
                    if (x == "") {
                        A += dy.charAt(i);
                    } else {
                        a += dy.charAt(i);
                    }
                    break;
                case 'x':
                    if (q == 'x') {
                        x += dy.charAt(i);
                    }
                    break;
                case 'y':
                    if (q == 'y') {
                        x += dy.charAt(i);
                    }
                    break;
                case '^':
                    x += dy.charAt(i);
                    break;
            }
        }
        if (A == "") {
            if (a == "") {
                if (x != "") {
                    y += "+(1/2)x^2";
                }
            } else {
                b = (Double.parseDouble(a)) + 1;
                y += ((b > 0) ? ("+" + ("(1/" + b + ")")) : ("(1/" + b + ")")) + x + "(" + b + ")";
            }
        } else if (x == "") {
            y += ((Integer.parseInt(A) == 1) ? ("+x") : ((Integer.parseInt(A) == 0) ? ("") : ("+" + A + "x")));
        } else if (a == "") {
            b = Double.parseDouble("2");
            B = Double.parseDouble(A) / b;
            B = roundTo(B, 3);
            y += ((B > 0) ? ("+" + B) : (B)) + x + "^(" + b + ")";
//            if ((B % 1) == 0) {
//                y += ((B > 0) ? ("+" + B) : (B)) + x + "^(" + b + ")";
//            } else {
//                y += ((B > 0) ? ("+(" + A + "/" + b + ")") : ("(" + A + "/" + b + ")")) + x + "^(" + b + ")";
//            }
        } else {
            b = (Double.parseDouble(a)) + 1;
            B = Double.parseDouble(A) / b;
            B = roundTo(B, 3);
            y += ((B > 0) ? ("+" + B) : (B)) + x + "(" + b + ")";
//            if ((B % 1) == 0) {
//                y += ((B > 0) ? ("+" + B) : (B)) + x + "(" + b + ")";
//            } else {
//                y += ((B > 0) ? ("+(" + A + "/" + b + ")") : ("(" + A + "/" + b + ")")) + x + "(" + b + ")";
//            }
        }
        return shape(y + "+c");
    }

    public static String sinInt(String s, char x) {
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
//            res += ((chainDiff(A, x) == "1") ? (eF) : ((chainDiff(A, x) == "0") ? ("") : (chainDiff(A, x) + eF)));
        } else if (F == "(x)") {
            A = "+1";
        }
        if (A == chainDiff(F, x)) {
            res += s.replace("sin", "-cos");
        } else {
            return "Sorry. Cannot Do This Operation !";
        }
//        res += simplfecation.multiply(chainDiff(F, x), A) + "cos" + F;
        return shape(res);
    }

    public static String expInt(String equation, char x) {
        int i = equation.indexOf("exp");
        String eF = equation.substring(i, equation.lastIndexOf(")") + 1);
        String diff = equation.substring(0, i);
        System.out.println(differentiation.expDiff(eF, x));
        if (equation.equalsIgnoreCase(differentiation.expDiff(eF, x))) {
            return eF;
        } else {
            return null;
        }
    }

    public static String logInt(String equation, char x) {
        //        String equation = (1/(ln(10)*f))*chainDiff(F, x);    
        int i = equation.indexOf("ln");
        String equ = equation.substring(i + 7, equation.lastIndexOf("))"));
        String f = "log(" + equ + ")";
        if (equation.equalsIgnoreCase(differentiation.logDiff(f, x))) {
            return f;
        }
        return null;
    }

    public static String cosInt(String s, char x) {
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
//            res += ((chainDiff(A, x) == "1") ? (eF) : ((chainDiff(A, x) == "0") ? ("") : (chainDiff(A, x) + eF)));
        } else if (F.equals("(x)")) {
            A = "+1";
        }
        if (A.equals(chainDiff(F, x))) {
            res += s.replace("cos", "sin");
        } else {
            return "Sorry. Cannot Do This Operation !";
        }
//        res += simplfecation.multiply(chainDiff(F, x), A) + "cos" + F;
        return shape(res);
    }

    public static String SqrtInt(String s, char x) {
        int i = s.indexOf("/");
        String A = s.substring(0, i);
        String b = "(";
        String F = "";    // f`(x)/sqrt(f(x))
        String ef = "";
        String res;
        F += s.substring(i + 6, s.length() - 1);
        ef += s.substring(i + 1, s.length());
        b += shape(chainDiff(F, x)) + ")";
        System.out.println(A + "\n" + F + "\n" + b);
        if (A == b) {
            res = "2" + ef + "+C";
        } else {
            return "Sorry. Cannot Do This Operation !";
        }
        return res;
    }

    public static String integByParts(String eq, char x) {
        eq = eq.toLowerCase().trim();
        String[] terms = eq.split("\\*");
        int index1 = 0;
        int index2 = 1;
        if (terms[1].contains("s") || terms[0].contains("^") || terms[1].contains("e") || terms[1].contains("c") || terms[1].contains("n")) {
            index1 = 1;
            index2 = 0;
        }
        String integration = chainInt(terms[index1], x)+"\b\b";System.out.println(integration);
        return shape(multiply(terms[index2] , integration) +"-"+ chainInt(multiply(integration , shape(AdvancedDiff(terms[index2], x))), x));
    }

    public static String divInt(String equation, char x) {
        // ((y`)/(y))
        int i = equation.indexOf(")/(");
        String eq_diff = equation.substring(2, i);
        String eq = equation.substring(i + 3, equation.length() - 2);
        if (chainDiff(eq, x).equals(eq_diff)) {
            String res = "(" + "ln(" + eq + ")" + 'c';
            return res;
        } else {
            return "Sorry. Cannot Do This Operation !";
        }
    }
//    public static String lnInt(String equation, char x) {
//        //        String equation =  ln(2)*(2^(3x))*3*(2^(3x))
//        int i = equation.indexOf("ln");
//        String equ = equation.substring(i + 7, equation.lastIndexOf(")*"));
//        String number = equation.substring(0, i);
//        if (equation.equalsIgnoreCase(differentiation.fun_power_x_Diff(equ, x))) {
//            return equ;
//        }
//        return null;
//    }
//    ***************************************
//    public static String function_Int(String equation, char x) {
//        // ((y)^(p))*y`        ((2x)^(2))*(x^2)
//        int i = equation.indexOf(")^(");
//        String eq = equation.substring(2, i);
//        String eq_diff = equation.substring(i + 8, equation.length() - 1);
//        String power = equation.substring(i + 3, equation.indexOf('*') - 2);
//        //        System.out.println(eq_diff);
//        System.out.println(shape(differentiation.chainDiff(eq, x)));
//
//        if (shape(differentiation.chainDiff(eq, x)) == (eq_diff)) {
//            String npower = "";
//            npower += Integer.parseInt(power) + 1;
//            String res = (1 + "/" + (npower)) + "(" + eq + ")" + "^(" + (npower) + ")";
//            return res;
//        } else {
//            return "Sorry. Cannot Do This Operation !";
//        }
//    }
//    *****************************************************
//    ************************************
//    public String cscSquare(String eq) {
//        eq = eq.toLowerCase();
//        String[] terms = eq.split("\\*");
//        int index1 = 0;
//        int index2 = 1;
//        if (!terms[0].contains("csc")) {
//            index1 = 1;
//            index2 = 0;
//        }
//        String[] csc = terms[index1].split("^");
//        String power = terms[index1].substring(terms[index1].lastIndexOf("^") + 1, terms[index1].length());
////        power = deletPrackets(power);
//        if (Integer.parseInt(power) != 2) {
//            return integByParts(eq);
//        }
//        String fx = terms[index1].substring(terms[index1].indexOf("("), terms[index1].length() - 6);
//        String div = تفاضل(fx);
//        div = deletPrackets(div);
//        terms[index2] = deletPrackets(terms[index2]);
//        if (!div.equals(terms[index2])) {
//            return integByParts(eq);
//        }
//        return "[-sec(" + fx + ")]+c";
//    }
//}
//    ***********************************************
//    public static String cscInt(String s, char x) {
//        String res = "";
//        String[] arr = s.split("\\*");
//        int i = s.indexOf("csc(");
////        int j = s.indexOf("cot(");
//        String F1 = arr[0].substring(i+4,);
//        String F2= 
//        if (s.contains("csc") && s.contains("cot")) {
//
//        } else {
//            return "Sorry. Cannot Do This Operation !";
//        }
//        return res;
//    }
}
