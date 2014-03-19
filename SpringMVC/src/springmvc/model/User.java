package springmvc.model;

import javax.validation.constraints.Size;

/**
 * Description Here
 *
 * @author Benjamin O'Flaherty
 * @date Created on: 19/03/14
 * @project SpringMVC
 */
public class User {

    @Size(min=1, max=30)
    private String firstName;
    @Size(min=1, max=50)
    private String lastName;
    @Size(min=5, max=50)
    private String username;
    @Size(min=5, max=15)
    private String password;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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
