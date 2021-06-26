package DAO.Repository;

import DAO.DbContext.DatabaseConnection;
import Model.Consultation;
import Model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Login {
    User user=null;
    public Login() {
    }
    public User getUser(String email,String mdp){
        try{
            Connection connection= DatabaseConnection.getInstance().getConnection() ;
            if(connection != null){
                PreparedStatement preparedStatement=connection.prepareStatement("select * from user where email=? and mdp=?;");
                preparedStatement.setString(1,email);
                preparedStatement.setString(2,mdp);
                ResultSet r= preparedStatement.executeQuery();
                if (r.next()){
                    user =new User(r.getInt("id"),r.getString("nom"),r.getString("prenom"),
                            r.getString("email"),r.getString("mdp"), r.getString("role"),
                            r.getString("specialite"),r.getString("sexe"));
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return user;
    }
}
