package DZ5;

public class Cat {
    private  String fio;
    private String jobtitle;
    private String mail;
    private String number;
    private float zp;
    private int age;
    public Cat(String fio,  String jobtitle,String mail,String number,float zp, int age) {

        this.fio = fio;
        this.jobtitle = jobtitle;
        this.mail = mail;
        this.number = number;
        this.zp=zp;
        this.age = age;
    }
    public int getAge() {

        return age;
    }
    public void setName(int age) {
        if (age >= 11) {
            this.age = age;
        }
        else {
            System.out.println("введите коректный возраст");
        }

    }




    @Override
    public String toString() {
        return "Cat{" +
                "fio='" + fio + '\'' +
                ", jobtitle='" + jobtitle + '\'' +
                ", mail='" + mail + '\'' +
                ", number='" + number + '\'' +
                ", zp=" + zp +
                ", age=" + age +
                '}';
    }
}
