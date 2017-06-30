 
package dao;
import java.util.List;
 import model.Faculty;
public interface IFaculty {
    
    int getSpecializationID(String lName,String fName,String mName);
    public List<Faculty>getAllFaculty();
    public List<Faculty>findByID();
    public List<Faculty>findByName();
    public List<Faculty>getAllSpecializationInfo();
    public boolean addFaculty(Faculty aFaculty);
    public boolean updateFaculty(Faculty aFaculty);
    public boolean addSpecialization(Faculty aFaculty);
    Faculty getFacultyByID(int aFacultyID); 
    
    
}
