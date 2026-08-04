public class data_type {
    public static void main(String[] args) {
        //Primitives data types
        int age = 20;  // 4 bytes
        byte b = 100; // 1 byte
        short s = 10000; // 2 bytes
        long l = 100000L; // 8 bytes
        float f = 10.5f; // 4 bytes
        double d = 20.99; // 8 bytes
        char c = 'A'; // 2 bytes
        boolean isStudent = true; // 1 byte

        // Non-Primitives data types
        String name = "Sarbeswar Panda"; // Reference type
        int[] numbers = {1, 2, 3, 4, 5}; // Array (Reference type)
        class Person { // Class (Reference type)
            String firstName;
            String lastName;

            Person(String firstName, String lastName) {
                this.firstName = firstName;
                this.lastName = lastName;
            }
        }
        Person person = new Person("Sarbeswar", "Panda"); // Object (Reference type)

        // Printing variable values
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + f);
        System.out.println("Is Student: " + isStudent);
        System.out.println("Numbers: " + java.util.Arrays.toString(numbers));
        System.out.println("Person: " + person.firstName + " " + person.lastName);

    }
}
