package HW_9_2;

/*
Необходимо создать класс Person с полями: имя, возраст, пол.
Класс должен иметь метод - getName, метод возвращает имя с префиксом “Mr. ”
если пол указан как мужской и префикс “Mrs. ” если женский.
 */

class Person {
    private String name;
    private int age;
    private char sex;

    public String getName() {
        if (sex == 'm') {
            return "Mr. " + name;
        } else {
            return "Mrs. " + name;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
}
