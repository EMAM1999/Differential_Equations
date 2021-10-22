
package maths.project;

public class simplfecation {

    public static double power(double m, int n) {
        double x = 1;
        for (int i = 0; i < n; i++) {
            x *= m;
        }
        return x;
    }

    public static double roundTo(double num, int n) {
        double x = power(10, n);
        num = ((int) (num * x)) / x;
        return num;
    }

    public static String multiply(String f1, String f2) {
        if (f1 == "0" || f2 == "0") {
            return "0";
        }
        f1 = shape(f1);
        f2 = shape(f2);
        double A;
        double a;
        String x = "";
        String A1 = "";
        String x1 = "";
        String a1 = "";
        String A2 = "";
        String x2 = "";
        String a2 = "";
        String q = "";
        for (int i = 0; i < f1.length(); i++) {
            switch (f1.charAt(i)) {
                case 'x':
                case '^':
                    x1 += f1.charAt(i);
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
                case '-':
                    if (x1 == "") {
                        A1 += f1.charAt(i);
                    } else {
                        a1 += f1.charAt(i);
                    }

            }
        }
        for (int i = 0; i < f2.length(); i++) {
            switch (f2.charAt(i)) {
                case 'x':
                case '^':
                    x2 += f2.charAt(i);
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
                case '-':
                    if (x2 == "") {
                        A2 += f2.charAt(i);
                    } else {
                        a2 += f2.charAt(i);
                    }
            }
        }
        A = Double.parseDouble((A1 == "") ? ("1") : (A1)) * Double.parseDouble((A2 == "") ? ("1") : (A2));
        a = Double.parseDouble((a1 == "") ? ((x1 == "") ? ("0") : ("1")) : (a1)) + Double.parseDouble((a2 == "") ? ((x2 == "") ? ("0") : ("1")) : (a2));
        x = ((x1 == "") ? ((x2 == "") ? ("") : ("x")) : ("x"));
        q += ((A > 0) ? ("+" + A) : (A)) + x + ((a == 0) ? ("") : ("^(" + a + ")"));
        return shape(q);
    }

    public static String dividing(String f1, String f2) {
        f1 = shape(f1);
        f2 = shape(f2);
        if (f1 == "0") {
            return "0";
        }
        if (f2 == "0") {
            return "ERROR";
        }
        if (f2.contains("+")) {
            return f1 + "/" + f2;
        } else if (!f1.contains("+")) {
            double A;
            double a;
            String x = "";
            String A1 = "";
            String x1 = "";
            String a1 = "";
            String A2 = "";
            String x2 = "";
            String a2 = "";
            String q = "";
            for (int i = 0; i < f1.length(); i++) {
                switch (f1.charAt(i)) {
                    case 'x':
                    case '^':
                        x1 += f1.charAt(i);
                        break;
                    case '-':
                        if (a1 != "" || (a1 == "" && x1.contains("^"))) {
                            q += dividing((A1 + x1 + a1), f2);
                            A1 = "-";
                            x1 = a1 = "";
                            break;
                        }
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
                        if (x1 == "") {
                            A1 += f1.charAt(i);
                        } else {
                            a1 += f1.charAt(i);
                        }
                }
            }
            for (int i = 0; i < f2.length(); i++) {
                switch (f2.charAt(i)) {
                    case 'x':
                    case '^':
                        x2 += f2.charAt(i);
                        break;
                    case '-':
                        if (a2 != "" || (a1 == "" && x1.contains("^"))) {
                            q += dividing((A2 + x2 + a2), f2);
                            A2 = "-";
                            x2 = a2 = "";
                            break;
                        }
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
                        if (x2 == "") {
                            A2 += f2.charAt(i);
                        } else {
                            a2 += f2.charAt(i);
                        }
                }
            }

            A = Double.parseDouble((A1 == "") ? ("1") : (A1))
                    / Double.parseDouble((A2 == "") ? ("1") : (A2));
            a = Double.parseDouble((a1 == "") ? ((x1 == "") ? ("0") : ("1")) : (a1)) - Double.parseDouble((a2 == "") ? ((x2 == "") ? ("0") : ("1")) : (a2));
            x = ((x1 == "") ? ((x2 == "") ? ("") : ("x")) : (((x2.equals(x1)) && (a1 == a2)) ? ("") : ("x")));
            q += ((A > 0) ? ("+" + A) : (A)) + x + ((a == 0) ? ("") : ("^(" + a + ")"));
            return q;
        } else {
            String q = "";
            String[] s = f1.split("\\+");
            for (int i = 0; i < s.length; i++) {
                q += dividing(s[i], f2);
            }
            return q;
        }
    }

    public static String bracketsquare(String f) {
        f = shape(f);
        String x = "";
        String y = "";
        String q = "";
        for (int i = 0; i < f.length(); i++) {
            switch (f.charAt(i)) {
                case '+':
                case '-':
                    if (i == 1) {
                        y += f.charAt(i);
                    } else {
                        x = y;
                        y = "";
                    }
                    break;
                case '(':
                case ')':
                    break;
                default:
                    y += f.charAt(i);
            }
        }
        System.out.println(x + "\n" + y + "\n" + multiply(multiply(x, y), "2"));
        q += power_function(x, 2) + multiply(multiply(x, y), "2") //     <<<<<<<<<
                + "+" + power_function(y, 2);
        return q;
    }

    public static String power_function(String f, int power) {
        f = shape(f);
        char[] array = f.toCharArray();
        String q = "";
        String A = "";
        String x = "";
        String a = "";
        String B = "";
        String b = "";
        for (int i = 0; i < array.length; i++) {
            switch (array[i]) {
//                case '-':
//                case '+':
//                    if (A == "") {
//                        B += c;
//                    } else {
//                        B += power(Integer.parseInt(A), Integer.parseInt(c));
//                    }
//                    if (!x.contains("^")) {
//                        x += "^(" + c + ")";
//                    } else {
//                        b += "(" + (Integer.parseInt(a) * Integer.parseInt(c)) + ")";
//
//                    }
//                    q += "+" + B + x + b;
//                    x = a = A = B = b = "";
//                    break;

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
                        A += array[i];
                    } else {
                        a += array[i];
                    }
                    break;
                case 'x':
                case '^':
                    x += array[i];
                    break;

            }
        }

        if (A == "") {
            B += power;
        } else {
            B += power(Integer.parseInt(A), power);
        }

        if (!x.contains("^")) {
            x += "^(" + power + ")";
        } else {
            b += "(" + (Integer.parseInt(a) * power) + ")";

        }

        q += "+" + B + x + b;
        return shape(q);
    }

    public static String sqrt_function(String f) {
        String q = "";
        f = shape(f.replace(" ", ""));
        if (!f.contains("+")) {
//            if (f.contains("-")&&) {
            String x = "";
            String a = "0";
            String A = f.substring(6, f.indexOf("x"));
            if (A.isEmpty()) {
                A = "1";
            }
            if (A.equals("-")) {
                return "ERROR";
            }
            if (f.contains("x")) {
                x += "x^";
                if (f.contains("^")) {
                    if (f.substring((f.indexOf("^") + 1), f.lastIndexOf(")") - 1).contains("-")) {
                        return f;
                    } else {
                        a += f.substring(f.indexOf("^") + 1, f.lastIndexOf(")") - 1);
                    }
                } else {
                    x += "\b";
                }
            }
//            for (int i = f.indexOf("x"); i < f.length(); i++) {
//                switch (f.charAt(i)) {
//                    case 'x':
//                    case '^':
//                    case '(':
//                        x += f.charAt(i);
//                        break;
//                }
//            }
//            if (f.contains("^")) {
//                
//            }
            q += Math.sqrt(Double.parseDouble(A)) + x
                    + (((Double.parseDouble(a) / 2) == 1) ? ("\b") : ("(" + (Double.parseDouble(a) / 2) + ")"));
            return shape(q);
//            }
        } else {
            return f;
        }
    }

    public static String shape(String f) {
        String finalShape = "";
        f += " ";
        char[] charsArray = f.toCharArray();
        for (int i = 0; i < charsArray.length; i++) {
            if (charsArray[0] == '+') {
                charsArray[0] = ' ';
            }
            if (charsArray[0] == '(' && charsArray[1] == '+') {
                charsArray[1] = ' ';
            }

            if (charsArray[i] == '^' && charsArray[i + 1] == '('
                    && charsArray[i + 2] == '1' && charsArray[i + 3] == '.'
                    && charsArray[i + 4] == '0' && charsArray[i + 5] == ')') {
                charsArray[i] = ' ';
                charsArray[i + 1]
                        = charsArray[i + 2] = charsArray[i + 3]
                        = charsArray[i + 4]
                        = charsArray[i + 5] = ' ';
            }
            if (charsArray[i] == '.' && charsArray[i + 1] == '0') {
                if (charsArray[i - 1] == '1') {
                    if (i == 1 || charsArray[i - 2] == '+' || charsArray[i - 2] == '-'
                            || charsArray[i + 2] == 'x' || charsArray[i + 2] == 'c' || i == 2) {
                        charsArray[i - 1] = charsArray[i] = charsArray[i + 1] = ' ';
                    }
                } else if ((i + 2) == charsArray.length - 1 || charsArray[i + 2] == 'c'
                        || charsArray[i + 2] == '+' || charsArray[i + 2] == '-'
                        || charsArray[i + 2] == ')' || charsArray[i + 2] == 's'
                        || charsArray[i + 2] == 'x' || charsArray[i + 2] == 'e'/*|| charsArray[i + 2] == 't'
                        || charsArray[i + 2] == 'a'|| charsArray[i + 2] == 'y'*/) {
                    charsArray[i] = charsArray[i + 1] = ' ';

                }
            }
        }
        for (int i = 0; i < charsArray.length; i++) {
            if (charsArray[i] != ' ') {
                finalShape += charsArray[i];
            }
            if (charsArray[i] == '1') {
                if (charsArray[i + 1] == 'x' || charsArray[i + 1] == 'c') {
                    if (i == 1) {
                        charsArray[i] = ' ';
                    } else if (charsArray[i - 1] == '+' || charsArray[i - 1] == '-') {
                        charsArray[i] = ' ';
                    }
                }

            }
        }
        return finalShape;
    }

}

/*  public String sum(String f) {
        String AA = "";
        String cc = "";
        String x = "";
        String A = "";
        String c = "";
        String finalShape = "";
        char[] array = f.toCharArray();
        int [] index = new int [10];
        for (int i = 0; i < array.length; i++) {
            switch (array[i]) {
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
                    c += array[i];
                    
                    break;
                case 'x':
                case '^':
                    x += array[i];
                    A = c;
                    c = "";
                    break;
                case '+':
                    if (x == "") {
                        A = c;
                        c = "";
                    }
                    AA = A;
                    cc = c;
                    A = c = "";
                    break;
            }
            if (cc == c) {
                AA += A;
            }
                
        }
        return finalShape;
    }*/
