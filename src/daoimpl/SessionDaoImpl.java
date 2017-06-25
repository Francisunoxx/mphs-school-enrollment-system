
package daoimpl;

import database_utility.DBType;
import database_utility.DBUtil;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Session;


public class SessionDaoImpl {
    
    public List<Session> getAll(){
        List<Session> sessionList = new ArrayList<>();
        String SQL = "{ CALL getSessions() }";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
                try(ResultSet rs = cs.executeQuery();){
                    while(rs.next()){
                        Session session = new Session();
                        session.setSessionTitle(rs.getString("title"));
                        sessionList.add(session);
                    }
                }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error at: "+e.getClass().getSimpleName()+"\n"+e.getErrorCode()+"\n"+e.getMessage() );
        }
        return sessionList;
    }
    
    public int getIdBySessionName(String aSessionName){
        int aSessionId = 0;
        String SQL = "{CALL getIdBySessionName(?) }";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
            CallableStatement cs = con.prepareCall(SQL);){
            cs.setString(1,aSessionName);
            try(ResultSet rs = cs.executeQuery();){
                while (rs.next()) {
                    aSessionId = rs.getInt("session_id");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error : "+e.getMessage()+"\n"+e.getErrorCode() );
        }
        return aSessionId;
    }
}
