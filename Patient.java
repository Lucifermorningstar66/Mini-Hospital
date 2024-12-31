public class Patient {
    String name;
    String number;
    String age;
    String room;

    public Patient (String name, String number, String age, String room) {
        this.name = name;
        this.number = number;
        this.age = age;
        this.room = room;
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

    public String getRoom () {
        return room;
    }

    public void setRoom (String room) {
        this.room = room;
    }

    @Override
    public String toString () {
        return "name='" + name + '\'' + ", number='" + number + '\'' + ", age='" + age + '\'' + ", room='" + room;
    }


}
