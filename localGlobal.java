package ss22;

public class localGlobal {
    int x = 11;
    void localVariable() {
        int x = 22;
        System.out.println("Local variable a : " +x);
    }

    public static void main(String[] args) {
        localGlobal o = new localGlobal();
        System.out.println("Instance variable a : " + o.x);

        o.localVariable();
    }
}
