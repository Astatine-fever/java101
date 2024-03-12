import java.util.*;

class ForEachExamples {
    public static void main(String[] args) {
        // Example 1: Iterating over an array
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Example 1: Iterating over an array");
        for (int num : numbers) {
            System.out.println(num);
        }
        System.out.println();

        // Example 2: Iterating over a list
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        System.out.println("Example 2: Iterating over a list");
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println();

        // Example 3: Iterating over a set
        Set<Integer> set = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Example 3: Iterating over a set");
        for (int num : set) {
            System.out.println(num);
        }
        System.out.println();

        // Example 4: Iterating over the characters of a string
        String message = "Hello, World!";
        System.out.println("Example 4: Iterating over the characters of a string");
        for (char ch : message.toCharArray()) {
            System.out.println(ch);
        }
        System.out.println();

        // Example 5: Iterating over the entries of a map
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 90);
        scores.put("Bob", 85);
        scores.put("Charlie", 95);
        System.out.println("Example 5: Iterating over the entries of a map");
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println();

        // Example 6: Iterating over a 2D array
        int[][] matrix = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        System.out.println("Example 6: Iterating over a 2D array");
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println();

        // Example 7: Iterating over elements of a collection of custom objects
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));
        System.out.println("Example 7: Iterating over elements of a collection of custom objects");
        for (Person person : people) {
            System.out.println(person);
        }
    }

    static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{name='" + name + "', age=" + age + '}';
        }
    }
}
