public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    double avarageEnd;
    boolean isPass;
    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.avarageEnd =0.0;
        this.isPass = false;
    }
    void addBulkExamNote(int note1, int note2, int note3) {
        if (note1 >= 0 && note1 <= 100) {
            this.c1.note = note1;
        }
        if (note2 >= 0 && note2 <= 100) {
            this.c2.note = note2;
        }
        if (note3 >= 0 && note3 <= 100) {
            this.c3.note = note3;
        }
    }
    void addPerformanceNote(int prfNote1, int prfNote2, int prfNote3) {
        if (prfNote1 >= 0 && prfNote1 <= 100) {
            this.c1.prfNote = prfNote1;
        }
        if (prfNote2 >= 0 && prfNote2 <= 100) {
            this.c2.prfNote = prfNote2;
        }
        if (prfNote3 >= 0 && prfNote3 <= 100) {
            this.c3.prfNote = prfNote3;
        }
    }
    void isPass() {
        c1.avarage = (0.8* (c1.note)+0.2*(c1.prfNote));
        c2.avarage = (0.8* (c2.note)+0.2*(c2.prfNote));
        c3.avarage = (0.8* (c3.note)+0.2*(c3.prfNote));
        System.out.println("=============");
        this.avarageEnd = (this.c1.avarage + this.c2.avarage + this.c3.avarage) / 3.0;
        if (this.avarageEnd > 55) {
            System.out.println("Sınıfı Geçtiniz.");
            this.isPass = true;
        } else {
            System.out.println("Sınıfta Kaldınız.");
            this.isPass = false;
        }
        printNote();
    }
    public void printNote() {

        System.out.println(this.c1.name + " Notu:" + this.c1.note + " // " + this.c1.name + " Sözlü Notu:" + this.c1.prfNote);
        System.out.println(this.c2.name + " Notu:" + this.c2.note + " // " + this.c2.name + " Sözlü Notu:" + this.c2.prfNote);
        System.out.println(this.c3.name + " Notu:" + this.c3.note + " // " + this.c3.name + " Sözlü Notu:" + this.c3.prfNote);

        System.out.println("Ortalamanız: " + this.avarageEnd);
    }

}
