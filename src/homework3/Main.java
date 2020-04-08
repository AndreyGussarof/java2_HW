package homework3;

public class Main {

    public static void main(String[] args) {

        Phonebook book = new Phonebook ();
book.add ("Иванов", 123);
book.add("Петров", 223);
book.add("Сидоров", 223);
book.add("Иванов", 423);
book.add("Петров", 523);

book.get("Иванов");
    }

}

