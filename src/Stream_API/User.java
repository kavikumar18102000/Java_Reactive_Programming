package Stream_API;


public class User {

    int uno;
    String name;
    public int getUno() {
        return uno;
    }
    public void setUno(int uno) {
        this.uno = uno;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public User() {
    }
    public User(int uno, String name) {
        this.uno = uno;
        this.name = name;
    }
    @Override
    public String toString() {
        return "User [uno=" + uno + ", name=" + name + "]";
    }   
    
    
}
