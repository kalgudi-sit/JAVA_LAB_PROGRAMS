import java.util.Scanner;

class collide extends Exception {
    collide(String s) {
        super(s);
    }
}

class Carexception {
    public static void main(String args[]) {
        String t1 = null, t2 = null;
        try {
            Scanner inobj = new Scanner(System.in);
            System.out.println("Enter Truck 1 Directions");
            t1 = inobj.next();
            System.out.println("Enter Truck 2 directions");
            t2 = inobj.next();

            if (!t1.equals(t2))
                throw new collide("truck t2 have to go on " + t1 + "  direction");
            else
                System.out.println("No problem in Directions");
            inobj.close();
        } catch (collide e) {
            System.out.println(e);
            t2 = t1;
            System.out.println("avoided by redirecting");

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("No problem in Directions");

        }

        System.out.println("t1:" + t1 + "\nt2:" + t2);

    }
}
