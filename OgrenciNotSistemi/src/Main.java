import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Ahmet" , "TRH" , "0555666");
        Teacher t2 = new Teacher("Osman" , "FZK" , "000");
        Teacher t3 = new Teacher("Mehmet" , "BIO" , "111");

        Course tarih = new Course("Tarih" , "101" , "TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik" , "102" ,"FZK");
        fizik.addTeacher(t2);

        Course biyo = new Course("Biyoloji" , "105" , "BIO");
        biyo.addTeacher(t3);

        Student s1 = new Student("Murat" , "123" , "4" , tarih , fizik , biyo);
        s1.addBulkExamNote(100,78,50);
        s1.addPerformanceNote(100,100,100);
        s1.isPass();


        Student s2 = new Student("Halit" , "111" , "4" , tarih , fizik , biyo);
        s2.addBulkExamNote(50,30,70);
        s2.addPerformanceNote(100,80,90);
        s2.isPass();


        Student s3 = new Student("Uğur" , "222" , "4" , tarih , fizik , biyo);
        s3.addBulkExamNote(30,45,40);
        s3.addPerformanceNote(100,80,80);
        s3.isPass();

    }
}
