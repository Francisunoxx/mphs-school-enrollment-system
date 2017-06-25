 
package dao;
import java.util.List;
 import model.Faculty;
public interface IFaculty {
    
    int getId(String lastname, String firstname, String middlename);
    public List<Faculty>getAllFaculty();
    public List<Faculty>findByID();
    public List<Faculty>findByName();
    public boolean addFaculty(Faculty aFaculty);
    public boolean updateFaculty(Faculty aFaculty);
    
    
}
