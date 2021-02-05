

package students;

/**
 *This class +++Insert Description here+++
 *
 * @author Yan Zhang
 * 
 * for pull -- command added
 * this command was added on 5th Feb for revise week2 concepts 
 */
public class StudentList {
    
    public static void main(String[] args){
        Students[] sl = new Students[2];
        
        Students su1 = new Students();
        su1.setName("yan");
        
        Students su2 = new Students();
        su2.setName("yan2");
        
       sl[0] = su1;
       sl[1] = su2;
       
       for (Students s:sl){
           System.out.println(s.getName());
       }
       
        
    }

}
