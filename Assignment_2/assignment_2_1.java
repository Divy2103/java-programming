package Assignment_2;

// Kaila Divy
// 21ce049

public class assignment_2_1 {
        double r=1;
        double Area;
        double Perimeter;
        assignment_2_1(){
            Area=3.14*r*r;

        }
        assignment_2_1(int x)
        {
            r=x;

        }
        void getArea()
        {
            Area=3.14*r*r;

            System.out.println("Your Area is "+Area);


        }
        void getPerimeter()
        {
            Perimeter=2*3.14*r;

            System.out.println("Your perimeter is "+Perimeter);

        }

        public static void main(String[] args) {

            assignment_2_1 A=new assignment_2_1();
            A.getArea();
            A.getPerimeter();

            int n=4;
            assignment_2_1 A1=new assignment_2_1(n);
            A1.getPerimeter();
            A1.getArea();
        }
}
