package DZ5;

public class HomeWorkApp5 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Gunev Dniil", "menager", "qaswer@yan.ru", "89784323344", 23000, 21);
               System.out.println(cat1);
        person();
        //System.out.println("��������� ���: " + cat1.fio + " ���������: " + cat1.jobtitle + " �����: " + cat1.age + " ������� " + cat1.number + " �������� " + cat1.zp + " ������� " + cat1.age);

    }

    public static void person() {
        Cat[] person = new Cat[5];
        person[0] = new Cat("jason Dan", "menager", "qaswer@yan.ru", "89787523384", 23000, 21);
        person[1] = new Cat("Guvob Fare", "menager", "qaswer@yan.ru", "89767523344", 23000, 45);
        person[2] = new Cat("Larsen Daniil", "menager", "qaswer@yan.ru", "89785673304", 23000, 61);
        person[3] = new Cat("Dom Daniil", "menager", "qaswer@yan.ru", "89784323344", 23000, 36);
        person[4] = new Cat("Gunev Daniil", "menager", "qaswer@yan.ru", "89784323304", 23000, 54);
        for (int j = 0; j < person.length; j++) {
            if (40 < person[j].getAge()) {
                System.out.println(person[j]);
            }
        }
    }
    }

