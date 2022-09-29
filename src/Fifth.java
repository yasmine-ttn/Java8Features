
    interface Clickable {
        default void click() {
            System.out.println("click");
        }
    }

    interface Accessible {
        default void access() {
            System.out.println("access");
        }
    }

    public class Fifth implements Clickable, Accessible {

        public static void main(String[] args) {
            Fifth button = new Fifth();
            button.click();
            button.access();
        }
    }

