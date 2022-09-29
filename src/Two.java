public class Two {
    static void display(int a,int b) {

        int multiplication = a * b;
        System.out.println("Static method returns multiplication:" + multiplication);
    }

    void display2(int a,int b) {
        int sum = a + b;
        int subtract = a - b;
        System.out.println("Instance add method returns sum:" + sum + " and returns subtraction:" + subtract);

    }

    public static void main(String[] args) {
        //TODO Auto-generated method stub
        MethodReferenceInterface methodreferenceinterface = Two::display;
        methodreferenceinterface.print(50,30);

        Two methodreference = new Two();
        MethodReferenceInterface methodreferenceinterface1 = methodreference::display2;
        methodreferenceinterface1.print(50,30);
    }
}

interface MethodReferenceInterface {
    void print(int a,int b);
}


