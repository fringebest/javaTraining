package QuizEx;

public class QuizEx {

    public static int sum(int number) {
        boolean zigZag = true;
        int sum = 0;
        while(number > 0) {
            if (zigZag) {
                sum += number % 10;
                number /= 10;
            }
            zigZag = !zigZag;
        }
        return sum;
    }

            //quiz8 Ex4 -->recap
        public static int recursiveOp(int number) {
            if (number < 2) {
                return number;
            }
            return (number % 2 == 0
                    ? number + recursiveOp(number - 2)
                    : recursiveOp(number - 2));
        }

        //Quiz8 ex 5 --> recap
        public static int printSeries(int value) {
            if (value > 9) {
                return value;
            }

            value = printSeries(value + 1);
            System.out.print(value + " ");
            return value;
        }

        //Quiz10 ex5
        public static int staticField;

             public int getStaticField() {
                 return this.staticField;
        }

    public void setStaticField(int staticField) {
             this.staticField = staticField;
        }


        //Quiz12 ex2
        public static void printArray(String[] array) {
            for(int i=0; i< array.length; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }


    public static void main(String[] args) {
        System.out.println(sum(2123364));
        System.out.println(recursiveOp(7) + recursiveOp(8));
        printSeries(5);


        QuizEx o1 = new QuizEx();
        QuizEx o2 = new QuizEx();

        QuizEx.staticField = 10;
        o1.setStaticField(15);
        o2.setStaticField(20);

        System.out.println(QuizEx.staticField);
        System.out.println(o1.getStaticField());
        System.out.println(o2.getStaticField());


        //Quiz12 ex2
        String[] names = {"Dan", "Alina", "Mihai", "Roxana", "Daniel"};
        for (int i=0; i<names.length - 1; i++) {
            names[i] = names[i + 1];
            names[i + 1] = names[i];
        }
        printArray(names);
    }
    }
