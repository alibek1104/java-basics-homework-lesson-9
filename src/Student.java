public class Student {
    private String name;
    private int ID;
    private int year;



    public Student(String name, int ID, int year) {
        this.name = name;
        this.ID = ID;
        this.year = year;
    }

    public String getName() {
        return name;
    }
    public int getID() {
        return ID;
    }
    public int getYear() {
        return year;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public void increaseYear() {
       year++;
    }


    public String toString() {
        return "Имя: " + name + ", ID: " + ID + ", Год обучения: " + year;
    }
}
