public class java_intro {
    public static void main(String[] args) {
        int x = 123;
        double y = 3.14; 
        String name = "John";
        boolean isStudent = true;
        char grade = 'A';
        byte age = 20;
        System.out.println(name + "is " + age + " years old and has a grade of " + grade);
        // Condition statement to print age category based on name
        if (name.equals("John")) {
            System.out.println(name + " is in the 18-25 age group");
        } else if (name.equals("Mary")) {
            System.out.println(name + " is in the 26-35 age group");
        } else if (name.equals("David")) {
            System.out.println(name + " is in the 36-45 age group");
        } else if (name.equals("Sarah")) {
            System.out.println(name + " is in the 46-55 age group");
        } else {
            System.out.println(name + " is in an unknown age group");
        }
     } 

}