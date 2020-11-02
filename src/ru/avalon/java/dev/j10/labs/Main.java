package ru.avalon.java.dev.j10.labs;
//тест №2

import ru.avalon.java.dev.j10.labs.models.Person;

public class Main {

    /*
     * FIXME(Студент): Измените определение метода так, чтобы он стал точкой входа в приложение.
     */
    public static void main(String[] args) {

        Person ivanov = new Person("Иван","Иванов","","","РФ","Курск","ул. Ленина",1,2);
        Person smith = new Person("John","Edvard","Smith","Von","США","Нью-йорк","Гагарина стрит",1,2);
        
       String fullNameIvanov;
       String fullNameSmith;

       String fullAdressIvanov;
       String fullAdressSmith;
       
       
       fullNameIvanov = ivanov.getFullName();
       System.out.println(fullNameIvanov);
       
       fullNameSmith = smith.getFullName();
       System.out.println(fullNameSmith);
       
       
       fullAdressIvanov = ivanov.getAddress();
       System.out.println(fullAdressIvanov);
       
       fullAdressSmith = smith.getAddress();
       System.out.println(fullAdressSmith);
        /*
         * TODO(Студент): Создайте экземпляры класса 'Person'
         *
         * 1. Проинициализируейте переменную 'ivanov', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'Иванов Иван Иванович'.
         *
         * 2. Проинициализируейте переменную 'smith', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'John Edvard Smith'.
         */

        /*
         * TODO(Студент): Создайте несколько строковых переменных:
         *
         * 1. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         *
         * 2. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         *
         * 3. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         *
         * 4. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         */

        /*
         * TODO(Студент): Выведите в консоль значения созданных строковых переменных:
         *
         * Значение каждой переменной должно быть выведено на
         * отдельной строке.
         */
    }
}
