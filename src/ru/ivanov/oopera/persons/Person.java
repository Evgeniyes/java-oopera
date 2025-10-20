package ru.ivanov.oopera.persons;

import ru.ivanov.oopera.Gender;
import java.util.Objects;


public class Person {
    private String name;
    private String surname;
    private Gender gender;

    public Person(String name, String surname, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person actor = (Person) o;
        return name.equals(actor.getName()) && surname.equals(actor.getSurname()) && gender == actor.getGender();
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, gender);
    }

}
