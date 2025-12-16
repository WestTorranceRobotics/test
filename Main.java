public class Main {
    public static void main(String args[]) {
      int grade = 90;
      String letterGrade;
      
      if (grade >= 90) {
        letterGrade = "A";
      } else if (grade >= 80) {
        letterGrade = "B";
      } else if (grade >= 70) {
        letterGrade = "C";
      } else if (grade >= 60) {
        letterGrade = "D";
      } else {
        letterGrade = "F";
      }
      System.out.println(letterGrade);
    }
}