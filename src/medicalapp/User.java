/**
 * @author JonathanBlum
 * CSE 216 - user class
 */

public class User{
    private int id;

    public User(int id){
        this.id = id;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String toString() {
        return "User{" + "id=" + id + '}';
    }
       
  
}
