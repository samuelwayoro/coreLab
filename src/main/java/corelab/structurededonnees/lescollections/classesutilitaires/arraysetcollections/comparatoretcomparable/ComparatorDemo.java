package corelab.structures_de_donnees.lescollections.classesutilitaires.arraysetcollections.comparatoretcomparable;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {

    private static Logger logger = LogManager.getLogger(ComparatorDemo.class);

    public static void main(String[] args) {

        // 1. Person : tri par âge
        List<Person> peoples = Arrays.asList(
                new Person("Alice", 30),
                new Person("Bob", 20),
                new Person("Charlie", 25)
        );


        peoples.sort(Comparator.comparingInt(p -> p.age));

        //autre écriture valable de la comparaison
        Collections.sort(peoples, Comparator.comparingInt(p -> p.age));

        logger.info("people trié par age : {}", peoples);

        // 2. Book : tri par titre alphabétique
        List<Book> books = Arrays.asList(
                new Book("Java Programming", 29.99),
                new Book("Algorithms", 49.99),
                new Book("Data Structures", 39.99)
        );

        books.sort(Comparator.comparing(b -> b.title));
        logger.info("Books trié par titre  {}", books);

        // 3. Student : tri par moyenne décroissante
        List<Student> students = Arrays.asList(
                new Student("Sami", 15.5),
                new Student("Lea", 18.0),
                new Student("Omar", 12.0)
        );

        students.sort(Comparator.comparingDouble((Student s) -> s.average).reversed());
        logger.info("Students triés par moyenne décroissante : {}", students);


        // 4. Product : tri par prix puis nom
        List<Product> products = Arrays.asList(
                new Product("Laptop", 999.99),
                new Product("Mouse", 19.99),
                new Product("Keyboard", 19.99)
        );

        products.sort(Comparator.comparingDouble((Product p) -> (p.price)).thenComparing(p -> p.name));
        logger.info("products trié par prix puis par noms : {}", products);

        // 5. Task : tri par priorité puis date
        List<Task> tasks = Arrays.asList(
                new Task("Fix bug", 1, LocalDate.of(2023, 1, 10)),
                new Task("Write report", 2, LocalDate.of(2023, 1, 5)),
                new Task("Team meeting", 1, LocalDate.of(2023, 1, 8))
        );

        tasks.sort(Comparator.comparingInt((Task t) -> (t.priority)).thenComparing(t -> t.createdAt));
        logger.info("tasks trié par priorité puis par date : {}", tasks);

    }

    static class Person {
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    static class Book {
        String title;
        Double price;

        public Book(String title, Double price) {
            this.title = title;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Book{" +
                    "title='" + title + '\'' +
                    ", price=" + price +
                    '}';
        }
    }

    static class Student {
        String name;
        double average;

        public Student(String name, double average) {
            this.name = name;
            this.average = average;
        }

        public String toString() {
            return name + " : " + average;
        }
    }

    static class Product {
        String name;
        double price;

        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String toString() {
            return name + " - " + price + "€";
        }
    }

    static class Task {
        String description;
        int priority; // 1 = haute, 2 = moyenne, 3 = basse
        LocalDate createdAt;

        public Task(String description, int priority, LocalDate createdAt) {
            this.description = description;
            this.priority = priority;
            this.createdAt = createdAt;
        }

        public String toString() {
            return description + " (P" + priority + " - " + createdAt + ")";
        }
    }

}
