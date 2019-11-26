package nine_personAndTeacher;

public class Person {
    private int idCard;
    private String name;

    public int getIdCard ( ) {
        return idCard;
    }
    public void setIdCard ( int idCard ) {
        this.idCard = idCard;
    }
    public String getName ( ) {
        return name;
    }
    public void setName ( String name ) {
        this.name = name;
    }
    public Person ( ) {
    }
    public Person ( int idCard, String name ) {
        this.idCard = idCard;
        this.name = name;
    }
    public void printInfo ( ) {
        System.out.println(
                "The person's idCard: is: " + this.idCard +"\n"+
                "The person's name is: " +this.name+"\n");
    }

}
