
package questionone;

public class QuestionOne {

    public static void main(String[] args) {
        employee e1 = new employee("Zahra", "Developer", 10000, 
                2, "Bachlor", true, false);
        e1.display();
        System.out.println("-------------------");
        employee e2 = new employee("Ali", "Data Analyst", 55000, 
                15, "Bachlor", false, true);
        e2.display();
    }
    
}
