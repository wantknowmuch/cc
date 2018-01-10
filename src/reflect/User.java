package reflect;

/**
 * @author haozt
 * @date 2018/1/8 16:56
 */
public class User {
    private String name;
    private  int age;

    public User(){

    }
    public User(int age) {
        this.age = age;
    }

    public User(String name) {
        this.name = name;
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String  toString(){
        return "User [ age = "+ age +",name="+ name +"]";
    }
}
