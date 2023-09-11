public class Person {

    private String name;
    private int age;
    private int dBirth;

    public Person() {
        this(500,1999);
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(int age,int dBirth) {
        this.age = age;
        this.dBirth = dBirth;
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

        if(age > 0 ) this.age = age;
    }

    public int getdBirth() {
        return dBirth;
    }

    public void setdBirth(int dBirth) {
        this.dBirth = dBirth;
    }
}
