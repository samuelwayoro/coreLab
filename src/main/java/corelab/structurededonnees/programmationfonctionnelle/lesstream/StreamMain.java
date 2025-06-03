package corelab.structurededonnees.programmationfonctionnelle.lesstream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        /**
         List<String> prenoms = new ArrayList<>();
         prenoms.add("Samuel");
         prenoms.add("Isaac");
         prenoms.add("Logan");
         prenoms.add("Arnold");
         prenoms.add("Jessica");

         Long val = prenoms.stream().count();

         System.out.println("la liste content   "+val+" donnees");

         prenoms.stream().filter(e->e.length()>6).forEach(System.out::println);
         **/
        System.out.println("UTILISATION DE LA FONCTION MAP SUR UN STREAM");

        List<Student> studentsList = createListOfStudents();
        //  List<String> nameList = studentsList.stream().map(Student::getName).collect(Collectors.toList());
        // nameList.forEach(System.out::println);

        int count = 0;
        int sum = 0 ;
        List<Student> plusAge = new ArrayList<>();
        for (Student student : studentsList) {
            if (student.getAge() > 20) {
                count++;//nbre total des étudiant ayant plus de 20 ans
                plusAge.add(student); //recup
                sum += student.getAge(); //sommation de leurs ages
            }
        }

        //retourner la moyenne des étudiant ayant plus de 20 ans
        int average = sum / count;

        System.out.println("** étudiant avec ayant plus de 20 ans ***");
        for (Student s : plusAge)
            System.out.println(s.getName());

        System.out.println("** donc nous avons en moyenne ** " + average + " étudiants ");

        /**
         * recuperer le resultat d'un stream dans une Map
         */
        Map<Integer, Long> result = studentsList.stream()
                .collect(Collectors.groupingBy(Student::getAge, Collectors.counting())); //regrouper les students par leur age...


        Optional<Map.Entry<Integer, Long>> opt = result.entrySet().stream().max(Map.Entry.comparingByValue());
        System.out.println(opt);


    }


    public static List<Student> createListOfStudents() {
        List<Student> listOfStudents = new ArrayList<>();
        Student s1 = new Student("Anchit", 20);
        Student s2 = new Student("Peter", 19);
        Student s3 = new Student("Martin", 22);
        Student s4 = new Student("Sam", 21);
        Student s5 = new Student("Oliver", 25);
        Student s6 = new Student("Karl", 21);
        Student s7 = new Student("Darius", 22);
        Student s8 = new Student("Oumar", 19);
        Student s9 = new Student("Denis", 22);

        listOfStudents.add(s1);
        listOfStudents.add(s2);
        listOfStudents.add(s3);
        listOfStudents.add(s4);
        listOfStudents.add(s5);
        listOfStudents.add(s6);
        listOfStudents.add(s7);
        listOfStudents.add(s8);
        listOfStudents.add(s9);


        return listOfStudents;
    }


}
