import java.util.Date;

public class Student extends Person {
    private Date data;

    public Student(String name, Date dataN){
        super(name);
        this.data = dataN;
    }

    @Override
    public String toString() {
        return super.toString() + "data: " + this.data;
    }

    public static void main(String[] args) {
        System.out.println(new Student("Luis",new Date()));
    }
}
