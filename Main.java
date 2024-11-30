//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

Course studentone = new Course("biology", "125694", 125, "hdfg12", "aya khalil", "ayakhalil@1258");

Course studenttwo = new Course("math", "125dd", 1222,"hgss12", "mohamed abdo", "mihamed@gmail");
studenttwo.addcourse(studenttwo);
studentone.addcourse(studentone);
studentone.printCourse();
studenttwo.printCourse();




    }
}