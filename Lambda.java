@FunctionalInterface
interface Cab {
    double bookCab(String source, String destination); // when an interface is having excatly 1 method then its called
                                                       // functional
    // inteface.
    // by default its a public abstract method.

}

// class UberX implements Cab {
// /*
// * (non-Javadoc)
// *
// * @see Cab#bookCab()
// */
// public void bookCab() {
// System.out.println("Uber is booked.");
// }
// }

public class Lambda {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // 2.anonyomous Calss implementation
        // Cab c = new Cab() {

        // @Override
        // public void bookCab() {
        // System.out.println("Cab");
        // }

        // };
        // c.bookCab();

        // 3.Lambda Expresions
        Cab c = (source, destination) -> {
            System.out.println("Cab Booked from" + " " + source + " " + "to" + " " + destination);
            return 987.69;
        };
        double fare = c.bookCab("Bhagalpur", "Bangalore");
        System.out.println("Fare is:" + " " + fare);
    }
}
