package OgrenciNot;

public class main {
    public static void main(String[] args) {
        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("İnek Şaban",  "140144015",4, mat, fizik, kimya);
        s1.addBulkExamNote(50,20,40);
        s1.addBulkSozluNote(60,70,30);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi",  "2211133",4, mat, fizik, kimya);
        s2.addBulkExamNote(100,50,40);
        s2.addBulkSozluNote(50,75,45);
        s2.isPass();

        Student s3 = new Student("Hayta İsmail",  "221121312",4, mat, fizik, kimya);
        s3.addBulkExamNote(50,30,40);
        s3.addBulkSozluNote(80,90,70);
        s3.isPass();
    }
}
