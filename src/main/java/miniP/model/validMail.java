/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniP.model;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class validMail {
public static boolean isValid(String email)
    {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                            "[a-zA-Z0-9_+&*-]+)*@" +
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                            "A-Z]{2,7}$";
                              
        Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
    }
public static boolean isNumeric(String str) { 
  try {  
    Integer.parseInt(str);  
    return true;
  } catch(NumberFormatException e){  
    return false;  
  }  
  
}
}
