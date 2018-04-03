public class Human {
    // properties/ attributes
    char gender;
    String name;
    Date birthdate;
    double height;
    double weight;

    // constructor
    public Human (char gender, String name, Date birthdate, double height, double weight) {
        this.gender = gender;
        this.name = name;
        this.birthdate = birthdate;
        this.height = height;
        this.weight = weight;
    }

    // methods
    public void speak(String words) {
        System.out.println(words);
    }

    public void listen(String words) {
        memory += words;
    }

}