package part2;

public class User {

    private String name;
    private double weight;
    private int age;
    private char sex;

//Constructor
    User(String name, double weight, int age, char sex)
    {
        this.name = name;
        this.weight = weight;
        this.age = age;
        setSex(sex);
        //Weight Watch
        if (sex == 'F' && weight > 100) {
            weight = weight - 100;

            System.out.println("schudnij!:  " + weight + "kg");
        }
    }
    // age + 10
    void ageInTen() {
        System.out.println(age + 10);
    }
    //sex Changer
    char changeSex(char sex) {
        if (sex == 'M') {
            sex = 'F';
        } else {
            sex = 'M';
        }
        return sex;
    }
    //Name repetition for given value
    void printName(int howMutch) {
        String[] tab = new String[howMutch];
        for (String imie : tab) {
            imie = name;
            System.out.println(imie);
        }
    }

    //GETTER I SETTER => Enkapsulacja
    // Get User Data
    void showUserData() {
        System.out.println("waga: " + weight +
                "\nwiek: " + age +
                "\nplec " + sex);
    }

    //GetSet Age
    int dajWiek() {
        return age;
    }

    void getNewAge(int newAge) {

        if (newAge > 120) {
            System.out.println("Good day to die");
        } else {
            this.age = newAge;
            System.out.println("Nowy wiek: " + newAge);
        }
    }
    //GetSet Name
    void setName(String noweImie) {
        this.name = noweImie;
    }

    String getName() {
        return name;
    }

    //GetSet Sex
    void setSex(char sex) {
        if(sex != 'M' && sex!='m' && sex!='F' && sex!='f')
        {
            System.out.println("Zly symbol");
        }else{
        this.sex = sex;}
    }
    char getSex() {
        return sex;
    }
    //Method OVERLOAD
    // przykład - metoda "println"

    void ShowMe (int value){

        for (int i = 0; i <value ; i++) {
            System.out.println(getName());

        }
    }
    void ShowMe (String value){
        System.out.println(value);
    }
    void ShowMe (char value){
        System.out.println(value);
    }
    void ShowMe (boolean direction, int howMutch){
        if(direction==true){
            for (int i = 0; i <howMutch ; i++) {
                System.out.println(i+1);
            }
        }else{
            for (int i = howMutch; i > 0; i--) {
                System.out.println(i);
            }
        }
    }
    void ShowMe(){

    }

}
