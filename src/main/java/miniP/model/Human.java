package miniP.model;

public class Human {
    protected String login ;
    protected String password;
    protected int num;
    protected String email;


    public Human(String login, int num, String email, String name) {
        this.login = login;
        this.num = num;
        this.email = email;

    }
    public Human (){
        this.email="";
       this.login="";

       this.num=0;
       this.password="";
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

        public String getPassword() {
        return password;
    }
    
    public int getNum() {
        return num;
    }

    public String getEmail() {
        return email;
    }



    public void setLogin(String login) {
        this.login = login;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    
}
