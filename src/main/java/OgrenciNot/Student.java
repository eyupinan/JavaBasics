package OgrenciNot;

public class Student {
    //name,stuNo,classes,course1,course2,course3,average,isPass
    public String name;
    public String stuNo;
    public int classes;
    public Course mat;
    public Course fizik;
    public Course kimya;
    public float average;
    public boolean isPass;
    // Student(), addBulkExamNote(), isPass(), calcAvarage(), printNote()

    public Student(String name, String stuNo, int classes, Course mat, Course fizik, Course kimya) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        this.calcAverage();
        this.isPass = false;
    }

    public void addBulkExamNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }

    }
    public void addBulkSozluNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.sozluNote = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.sozluNote = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.sozluNote = kimya;
        }

    }
    public void calcAverage(){
        this.average = (this.getFizik()+getKimya()+getMat()) / 3;
    }
    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + getMat());
        System.out.println("Fizik Notu : " + getFizik());
        System.out.println("Kimya Notu : " + getKimya());
    }



    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.average);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }
    public boolean isCheckPass() {
        this.calcAverage();
        return this.average > 55;
    }
    public float getMat(){
        return (this.mat.note*(1-this.mat.sozluEtki) + this.mat.sozluNote*this.mat.sozluEtki);
    }
    public float getFizik(){
        return (this.fizik.note*(1-this.fizik.sozluEtki) + this.fizik.sozluNote*this.fizik.sozluEtki);
    }
    public float getKimya(){
        return (this.kimya.note*(1-this.kimya.sozluEtki) + this.kimya.sozluNote*this.kimya.sozluEtki);
    }


}
