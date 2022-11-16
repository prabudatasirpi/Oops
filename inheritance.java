class Parent {
    public void first() {
        System.out.println("Hello");
    }
}
class firsthand extends Parent {
    public void second() {
        System.out.println("How are you");
    }
}
class secondarily extends firsthand {
            public void third() {
                System.out.println("Your name");
            }
        }

            public class inheritance {
                public static void main(String args[]) {
                    secondarily rr = new secondarily();
                    rr.first();
                    rr.second();
                    rr.third();

                }
            }