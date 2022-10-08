package Assignment_3;
interface car{
       default void Wheels(){
           System.out.println("car has 4 wheels");
       }
       void fuel();
}

public class assignment_3_7  implements car{
    @Override
    public void fuel() {
        System.out.println("car requires petrol or diesel");
    }

    public static void main(String[] args) {
            car c = new assignment_3_7();
            c.Wheels();
            c.fuel();
    }
}
