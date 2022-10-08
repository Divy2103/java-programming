package Assignment_4;

class CheckIdException extends Exception
{
    public CheckIdException(String s)
    {
        super(s);
    }
}

public class assignment_4_2_throws {
    void CheckID(int ID) throws CheckIdException{
        if(ID<=0 || ID>999){
            throw new CheckIdException("   Entered ID is Invalid");
        }
        else {
            throw new CheckIdException("   Entered ID is valid");
        }
    }

    public static void main(String[] args) {

            assignment_4_2_throws ID = new assignment_4_2_throws();
            try
            {
                ID.CheckID(12);
            }
            catch (CheckIdException e)
            {
                System.out.println("checking id....");
                System.out.println(e.getMessage());
            }
    }
}
