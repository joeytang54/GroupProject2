/*
We have to calculate the average of marks obtained in three subjects by student A and by student B.
Create class 'Marks' with an abstract method 'getAverage' that will be returning the average
percentage of marks. Provide implementation of abstract method in classes 'A' and 'B'.
The constructor of student A takes the marks in three subjects as its parameters and the marks
in four subjects as its parameters for student B. Test your code
 */

   abstract class Marks{
        abstract double getPercentage();

    }
    class A extends Marks {
        private double sub1;
        private double sub2;
        private double sub3;

        public A(double sub1, double sub2, double sub3) {
            this.sub1 = sub1;
            this.sub2 = sub2;
            this.sub3 = sub3;
        }
        @Override
        double getPercentage() {
            double average = (sub1 + sub2 + sub3) / 3;
            return average;
        }
    }
        class B extends Marks {
            private double sub1;
            private double sub2;
            private double sub3;
            private double sub4;
            B(double sub1, double sub2, double sub3, double sub4) {
                this.sub1 = sub1;
                this.sub2 = sub2;
                this.sub3 = sub3;
                this.sub4 = sub4;
            }
            @Override
            double getPercentage() {
                double average = (sub1 + sub2 + sub3 + sub4) / 4;
                return average;
            }
        }
        public class Task2 {
            public static void main(String[] args) {
                A a = new A(50, 80, 90);
                System.out.println(a.getPercentage());
            }
        }

