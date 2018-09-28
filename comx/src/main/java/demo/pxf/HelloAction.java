package demo.pxf;



import com.opensymphony.xwork2.ActionSupport;

public class HelloAction extends ActionSupport {

    private String username;
    private String password;

    @Override
    public String execute() {
        if (username.equals("admin") && password.equals("123")) {
            return SUCCESS;
        } else {
            return LOGIN;
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}