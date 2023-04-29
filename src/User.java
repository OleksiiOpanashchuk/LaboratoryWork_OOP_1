public class User {
    private int id;
    private int age;
    private String name;
    private String surname;
    private double weight;
    private double height;

    public User(int id, int age, String name, String surname, double weight, double height) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.surname = surname;
        this.weight = weight;
        this.height = height;
    }

    public static void main(String[] args) {
        User[] users = {
                new User(1, 19, "Oleksii", "Opanashchuk", 75, 183),
                new User(2, 17, "Olesya", "Filipova", 65, 180),
                new User(3, 18, "Mykola", "Debera", 70, 178),
                new User(4, 20, "Oleh", "Panasiuk", 77, 175),
                new User(5, 19, "Oleksandr", "Volodko", 70, 195),
                new User(6, 19, "Bogdan", "Starosta", 71, 176),
                new User(7, 21, "Vasyl", "Vozniy", 73, 179),
                new User(8, 18, "Roman", "Shtoika", 75, 185),
                new User(9, 17, "Maksym", "Formanchuk", 78, 182),
                new User(10, 19, "Vlad", "Tkachenko", 80, 197)
        };

        int totalAge = 0;
        int totalWeight = 0;
        int totalHeight = 0;

        for (User user : users) {
            totalAge += user.age;
            totalWeight += user.weight;
            totalHeight += user.height;
        }

        System.out.println("The total age value of this users is: " + totalAge);
        System.out.println("The total weight value of this users is: " + totalWeight);
        System.out.println("The total height value of this users is: " + totalHeight);
    }
}