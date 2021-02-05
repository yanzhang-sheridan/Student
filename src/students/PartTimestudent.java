package students;



/**
 *This class +++Insert Description here+++
 *
 * @author Yan Zhang
 */
public class PartTimeStudent extends Students{
    
    private int numCourses;
    
    public PartTimeStudent(int nc){
            //super(name);
            numCourses = nc;
    }

    public int getNumCourses() {
        return numCourses;
    }

    public void setNumCourses(int numCourses) {
        this.numCourses = numCourses;
    }
    
    

}
