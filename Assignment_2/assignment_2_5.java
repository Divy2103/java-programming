package Assignment_2;

// Kaila Divy
// 21ce049

public class assignment_2_5 {
    int a;
    int b;
    int maths;
    void Maths(int x,int y)
    {
        a=x;
        b=y;

        maths=a+b;
        System.out.println("Your sum is "+maths);
    }
    void Maths(int x)
    {
        a=x;

        maths=a*a;
        System.out.println("your square is "+maths);
    }

    public static void main(String[] args) {
        assignment_2_5 A=new assignment_2_5();
        A.Maths(4);
        A.Maths(4,5);
    }
}
