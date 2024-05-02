public class Operators1 {
    public static void main(String[] args) {
        // 1.Arithmetic Operators (+ , / , * , - , %, ++, --)

        // Increment Operator(++)
        // a.Post Increment Operator
        
        int a = 5, b;
        b = a++;

        System.out.println(a);
        System.out.println(b);

        // b.Pre Increment Operator

        int x = 7, y;
        y = ++x;

        System.out.println(x);
        System.out.println(y);

        // Decrement Operator(--)
        // a.Post Decrement Operator

        int s = 5, t;
        t = s--;
        System.out.println(s);
        System.out.println(t);

        // b.Pre Decrement Operator

        int u = 8, v;
        v = --u;

        System.out.println(u);
        System.out.println(v);

        // Example of Increment and Decrement

        int c = 10, d;
        d = c-- - c++ + c-- - --c +  ++c - --c;
        System.out.println(d); 

        // 2.Assignment operator(=)

        int num1 = 5, num2 = 7, num3 = 5, num4 = 4, num5 = 8;
        num1 += 5;     // These are the compound assignment which comes under the category of Assignment Operator
        num2 -= 4;
        num3 *= 5;
        num4 /= 2;
        num5 %= 3;

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);

        // 3.Relational Operators or Comparison Operators(==, <=, >=, >, <, !=)

        int n1 = 5, n2 = 10;
        System.out.println(n1==n2);
        System.out.println(n1<=n2);
        System.out.println(n1>=n2);
        System.out.println(n1>n2);
        System.out.println(n1<n2);
        System.out.println(n1!=n2);







    }
}
