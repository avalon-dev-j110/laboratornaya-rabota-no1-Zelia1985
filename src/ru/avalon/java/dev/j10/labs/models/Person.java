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
    Passport PassportDate;
    Addres Propiska;

    public Person(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Passport getPassportDate() {
        return PassportDate;
    }

    public Addres getPropiska() {
        return Propiska;
    }

    public Person(Passport PassportDate, Addres Propiska) {
        this.PassportDate = PassportDate;
        this.Propiska = Propiska;
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
//    public String getFullName() {
//       if (PassportDate.name!=null){
//         if (PassportDate.secondname!=null){
//            if (PassportDate.patronymic!=null){
//                String FullName = PassportDate.name+PassportDate.secondname;
//            }   
//           }   
//       }
//        /*
//         * TODO(Студент): Закончить определение метода 'getFullName()' класса 'Person'
//         */
//        return null;
//    }

    /**
     * Возвращает адрес, по которому проживает человек.
     * <p>
     * Возвращаемый адрес соответствует месту постоянной
     * регистрации человека, согласно паспортным данным.
     *
     * @return адрес регистрации в виде строки.
     */
    public String getAddress() {
        System.out.println(Propiska);
        /*
         * TODO(Студент): Закончить определение метода 'getAddress()' класса 'Person'
         */
        return null;
    }
}