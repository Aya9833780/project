public abstract class Person  {
    private String id;
    private String name;
    private String email;

    public Person(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
    public String toString(){
        return "id student : " + id + "student name : " + name + "adress name for student : " + email;
    }
}
