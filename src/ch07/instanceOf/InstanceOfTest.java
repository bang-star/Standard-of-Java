package ch07.instanceOf;

class InstanceOfTest {

    public static void main(String[] args) {
        FireEngine fireEngine = new FireEngine();

        if(fireEngine instanceof FireEngine){
            System.out.println("This is FireEngine instance");
        }

        if(fireEngine instanceof Car) {
            System.out.println("This is Car instance");
        }

        if(fireEngine instanceof Object) {
            System.out.println("This is Object instance");
        }

        System.out.println(fireEngine.getClass());
    }
}