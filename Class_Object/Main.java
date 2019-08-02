
package day1;

/**
 *
 * @author Azhar
 */
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        
        student1.name = "Azharul Islam";
        student1.id = 161412317;
        student1.cgpa = 3.5;
        student1.dept = "CSE";
        
        System.out.println("Name : "+student1.name);
        System.out.println("Id : "+student1.id);
        System.out.println("CGPA : "+student1.cgpa);
        System.out.println("Department : "+student1.dept);
        
        
        
        Student student2 = new Student();
        
        student2.name = "Majadul Islam";
        student2.id = 412317;
        student2.cgpa = 3.6;
        student2.dept = "Biology";
        
        System.out.println("Name : "+student2.name);
        System.out.println("Id : "+student2.id);
        System.out.println("CGPA : "+student2.cgpa);
        System.out.println("Department : "+student2.dept);
    }
    
}
