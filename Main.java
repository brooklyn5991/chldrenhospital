public class Main {
    public static void main(String[] args) {

        HealthStation childrensHospital = new HealthStation();

        Person ethan = new Person("Ethan", 1, 110, 7);
        Person peter = new Person("Peter", 33, 176, 85);

        System.out.println("weighings performed: " + childrensHospital.weighings());

        childrensHospital.weigh(ethan);
        childrensHospital.weigh(peter);

        System.out.println("weighings performed: " + childrensHospital.weighings());

        childrensHospital.weigh(ethan);
        childrensHospital.weigh(ethan);
        childrensHospital.weigh(ethan);
        childrensHospital.weigh(ethan);

        System.out.println("weighings performed: " + childrensHospital.weighings());
    }
}











//public class Main {
//    public static void main(String[] args) {
//        PaymentCard petesCard = new PaymentCard(10);
//
//        System.out.println("money " + petesCard.balance());
//        boolean wasSuccessful = petesCard.takeMoney(8);
//        System.out.println("successfully withdrew: " + wasSuccessful);
//        System.out.println("money " + petesCard.balance());
//
//        wasSuccessful = petesCard.takeMoney(4);
//        System.out.println("successfully withdrew: " + wasSuccessful);
//        System.out.println("money " + petesCard.balance());
//    }
//}