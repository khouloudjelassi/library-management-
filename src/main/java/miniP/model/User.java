package miniP.model;

import java.sql.SQLException;
import miniP.controler.Register;

public class User extends Human{
     private String adresse;

    public User(String login, int num, String email, String name, String adresse) {
        super(login, num, email, name);
        this.adresse=adresse;
    }

    public User(){
       this.adresse="";
       
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    
  
  
  
  public boolean verifierLogin( ) throws ClassNotFoundException, SQLException{
  return Register.RegisterLog(login);
  }
  
    public boolean verifierPassword( ) throws ClassNotFoundException, SQLException{
  return Register.RegisterPass(password);
  }
    
      public boolean verifierEmail( ) throws ClassNotFoundException, SQLException{
  return Register.RegisterEmail(email);
  }
      
        public boolean verifierNum( ) throws ClassNotFoundException, SQLException{
  return Register.RegisterNum(num);
  }
        public void register() throws ClassNotFoundException, SQLException{
            Register.register(login, password, email, adresse, num);
             
        }
        

        
}
