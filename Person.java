import java.time.LocalDate;
import java.time.Period;

class Person {
    public static void main(String[] args) {

        LocalDate pdt = LocalDate.of(2004, 07, 15);
        LocalDate tdt = LocalDate.now();
        Period diff = Period.between(pdt, tdt);
        System.out.println("Name: Anusha");
        System.out.println("Date of Birth : " + pdt);
        System.out.println("Age : " + diff.getYears());

    }
}
