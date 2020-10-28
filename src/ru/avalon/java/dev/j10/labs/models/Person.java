package ru.avalon.java.dev.j10.labs.models;

import ru.avalon.java.dev.j10.labs.commons.Addres;


/**
 * Представление о человеке.
 * <p>
 * С точки зрения задания человек представляется как сущность,
 * наделённая:
 * <ol>
 *     <li>паспортными данными;
 *     <li>пропиской по месту жительства.
 * </ol>
 */
public class Person {
    
    Passport pasData;
    Addres regAdres;

 
    public Person(String name, String surname, String patronymic, String secondname,
            String country, String city, String street, int houseNumber, int apartment) {
        this.pasData = new Passport(name,surname,patronymic,secondname);
        this.regAdres = new Addres(country,city,street,houseNumber,apartment);
    }

   
    public Passport getPasData() {
        return pasData;
    }

    public Addres getRegAdres() {
        return regAdres;
    }
    /**
     * Возврвщает полное имя человека.
     * <p>
     * Если у человека есть Имя, Фамилия и Отчество, то
     * возвращет Имя, Фимилию и Отчество, разделённые пробелом.
     * <p>
     * Если у человека нет Отчества, но есть второе имя, то
     * возвращает Имя, Первую букву второго имени, и Фамилию,
     * разделённые пробелом. После Инициала второго имени
     * должна стоять точка. Например, "Джером К. Джером".
     * <p>
     * Если у человека нет ни Отчества ни Второго имени, а
     * есть только Имя и Фамилия, то возвращает их, разделённые
     * пробелом.
     *
     * @return имя человека в виде строки.
     */
    public String getFullName() {
        String fullName = null;
        
        if (!pasData.getName().isEmpty() & !pasData.getSurname().isEmpty() & !pasData.getPatronymic().isEmpty())
            fullName = pasData.getName() + " " + pasData.getSurname() + " " + pasData.getPatronymic();
        if (pasData.getPatronymic().isEmpty() & !pasData.getSecondname().isEmpty())
            fullName = pasData.getName() + " " +  pasData.getSecondname().charAt(0) + ". " + pasData.getSurname();
        if (pasData.getPatronymic().isEmpty() & pasData.getSecondname().isEmpty())
            fullName = pasData.getName() + " " + pasData.getSurname();
       
        return fullName;
    }

    /**
     * Возвращает адрес, по которому проживает человек.
     * <p>
     * Возвращаемый адрес соответствует месту постоянной
     * регистрации человека, согласно паспортным данным.
     *
     * @return адрес регистрации в виде строки.
     */
    public String getAddress() {
        /*
         * TODO(Студент): Закончить определение метода 'getAddress()' класса 'Person'
         */
        return regAdres.FullAdress();
    }
}