package nine_personAndTeacher;

public class Teacher extends Person{

    private String position;
    private String salary;

    public Teacher ( ) {
    }
    public Teacher ( String position, String salary ) {
        this.position = position;
        this.salary = salary;
    }
    public Teacher ( int idCard, String name, String position, String salary ) {
        super( idCard, name );
        this.position = position;
        this.salary = salary;
    }
    public void printInfo ( ) {
        System.out.println(
                "The teacher's idCard: is: " + super.getIdCard() +"\n"+
                "The teacher's name is: " +super.getName()+"\n"+
                "The teacher's position: is: " + this.position +"\n"+
                "The teacher's salary is: " +this.salary+"\n");
    }
}
