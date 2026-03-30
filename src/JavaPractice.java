public class JavaPractice {

    public static void main(String[] args) {
         JavaPractice obj=new JavaPractice();
         obj.display();
    }


       void test() {
            System.out.println("current class2");
        }

        void display() {
          this.test();
        }
    }

