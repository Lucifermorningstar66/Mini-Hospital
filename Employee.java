public class Employee {
    String name;
    String number;
    String age;
    String job;

    public Employee (String name, String number, String age, String job) {
        this.name = name;
        this.number = number;
        this.age = age;
        this.job = job;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getNumber () {
        return number;
    }

    public void setNumber (String number) {
        this.number = number;
    }

    public String getAge () {
        return age;
    }

    public void setAge (String age) {
        this.age = age;
    }

    public String getJob () {
        return job;
    }

    public void setJob (String job) {
        this.job = job;
    }

    @Override
    public String toString () {
        return "name='" + name + '\'' + ", number='" + number + '\'' + ", age='" + age + '\'' + ", job='" + job;
    }
}
