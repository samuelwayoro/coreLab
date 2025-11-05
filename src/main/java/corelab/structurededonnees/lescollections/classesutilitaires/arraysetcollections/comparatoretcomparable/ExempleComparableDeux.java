package corelab.structures_de_donnees.lescollections.classesutilitaires.arraysetcollections.comparatoretcomparable;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExempleComparableDeux {

    private static final Logger logger = LogManager.getLogger(ExempleComparableDeux.class);

    public static void main(String[] args) {
        // Exemple 1: Person
        List<Person> people = Arrays.asList(
                new Person("Alice", 30),
                new Person("Bob", 20),
                new Person("Charlie", 25)
        );
        Collections.sort(people);
        logger.info("People triés par âge : {}", people);

        // Exemple 2: Book
        List<Book> books = Arrays.asList(
                new Book("Java Programming", 29.99),
                new Book("Algorithms", 49.99),
                new Book("Data Structures", 39.99)
        );
        Collections.sort(books);
        logger.info("Books triés par titre : {}", books);

        // Exemple 3: Student
        List<Student> students = Arrays.asList(
                new Student("Sami", 15.5),
                new Student("Lea", 18.0),
                new Student("Omar", 12.0)
        );
        Collections.sort(students);
        logger.info("Students triés par moyenne décroissante : {} ", students);

        // Exemple 4: Product
        List<Product> products = Arrays.asList(
                new Product("Laptop", 999.99),
                new Product("Mouse", 19.99),
                new Product("Keyboard", 19.99)
        );
        Collections.sort(products);
        logger.info("Products triés par prix puis nom : {}", products);

        // Exemple 5: Task
        List<Task> tasks = Arrays.asList(
                new Task("Fix bug", 1, LocalDate.of(2023, 1, 10)),
                new Task("Write report", 2, LocalDate.of(2023, 1, 5)),
                new Task("Team meeting", 1, LocalDate.of(2023, 1, 8))
        );
        Collections.sort(tasks);
        logger.info("Tasks triées par priorité puis date : {}", tasks);
    }

    // 1. Classe Person (par âge croissant)
    static class Person implements Comparable<Person> {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public int compareTo(Person other) {
            return Integer.compare(this.age, other.age);
        }

        @Override
        public String toString() {
            return name + " (" + age + ")";
        }
    }

    // 2. Classe Book (par titre alphabétique)
    static class Book implements Comparable<Book> {
        private String title;
        private double price;

        public Book(String title, double price) {
            this.title = title;
            this.price = price;
        }

        @Override
        public int compareTo(Book other) {
            return this.title.compareTo(other.title);
        }

        @Override
        public String toString() {
            return title + " - " + price + "€";
        }
    }

    // 3. Classe Student (par moyenne décroissante)
    static class Student implements Comparable<Student> {
        private String name;
        private double average;

        public Student(String name, double average) {
            this.name = name;
            this.average = average;
        }

        @Override
        public int compareTo(Student other) {
            return Double.compare(other.average, this.average); // décroissant parce que usage de paramètre avant instance
        }

        @Override
        public String toString() {
            return name + " : " + average;
        }
    }

    // 4. Classe Product (par prix puis nom)
    static class Product implements Comparable<Product> {
        private String name;
        private double price;

        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        @Override
        public int compareTo(Product other) {
            int cmp = Double.compare(this.price, other.price);
            if (cmp == 0) {
                return this.name.compareTo(other.name);
            }
            return cmp;
        }

        @Override
        public String toString() {
            return name + " - " + price + "€";
        }
    }

    // 5. Classe Task (par priorité puis date de création)
    static class Task implements Comparable<Task> {
        private String description;
        private int priority; // 1 = haute, 2 = moyenne, 3 = basse
        private LocalDate createdAt;

        public Task(String description, int priority, LocalDate createdAt) {
            this.description = description;
            this.priority = priority;
            this.createdAt = createdAt;
        }

        @Override
        public int compareTo(Task other) {
            int cmp = Integer.compare(this.priority, other.priority);
            if (cmp == 0) {
                return this.createdAt.compareTo(other.createdAt);
            }
            return cmp;
        }

        @Override
        public String toString() {
            return description + " (P" + priority + " - " + createdAt + ")";
        }
    }

}
