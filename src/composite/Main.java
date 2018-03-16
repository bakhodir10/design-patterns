package composite;

public class Main {

    public static void main(String[] args) {
        Employee<Developer> manager1 = new Manager<>("Mike", 110000);
        Employee<Developer> manager2 = new Manager<>("John", 130000);

        Developer<Developer> developer1 = new Developer<>("Alex", 90000);
        Developer<Developer> developer2 = new Developer<>("Alex", 88000);

        Developer<Developer> subDeveloper1 = new Developer<>("Felix", 80000);
        Developer<Developer> subDeveloper2 = new Developer<>("Romie", 77000);

        developer1.addChild(subDeveloper1);
        developer1.addChild(subDeveloper2);

        manager1.addChild(developer1);
        manager1.addChild(developer2);

        print(manager1);

    }

    private static void print(Employee employee) {
//        if (employee == null) {
//            return;
//        }
//        System.out.println(employee.getName());
//        print(employee.getChild());
    }
}
