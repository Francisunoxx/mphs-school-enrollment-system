 
package dao;
import java.util.List;
 import model.Faculty;
public interface IFaculty {
    
    
    public List<Faculty>getAllFaculty();
    public List<Faculty>findByName();
    int getSpecializationID(String title, String description);
    public List<Faculty>getAllSpecializationInfo();
    public boolean addFaculty(Faculty aFaculty);
    public boolean updateFaculty(Faculty aFaculty);
    public boolean addSpecialization(Faculty aFaculty);
    public boolean updateSpecialization(Faculty aFaculty);
    public List<Faculty> getFacultyAndSpecializationByFacultyID(int aFacultyID); 
    Faculty getSpecializationByID(int aSpecializationID);
    
  
}
