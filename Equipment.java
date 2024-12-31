public class Equipment {
    String number;
    String patNumber;

    public Equipment (String number, String patNumber) {
        this.number = number;
        this.patNumber = patNumber;
    }

    public String getNumber () {
        return number;
    }

    public void setNumber (String number) {
        this.number = number;
    }

    public String getPatNumber () {
        return patNumber;
    }

    public void setPatNumber (String patNumber) {
        this.patNumber = patNumber;
    }

    @Override
    public String toString () {
        return "Equipment{" + "number='" + number + '}';
    }
}
