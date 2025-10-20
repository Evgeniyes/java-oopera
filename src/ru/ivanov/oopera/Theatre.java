package ru.ivanov.oopera;

import ru.ivanov.oopera.persons.*;
import ru.ivanov.oopera.show.*;
import java.util.ArrayList;

public class Theatre {

    public static void main(String[] args) {

        //Создать трёх актеров и двух режиссёров. Также создайте одного автора музыки и одного хореографа
        Actor actor1 = new Actor("Алан", "Пробкин", Gender.MALE, 178);
        Actor actor2 = new Actor("Жанна", "Фрикаделькина", Gender.FEMALE, 155);
        Actor actor3 = new Actor("Михаил", "Капустин", Gender.MALE, 183);
        Person мusicAuthor = new Person("Саймон", "Фьюри", Gender.MALE);
        Person choreographer = new Person("Мария", "Тодесова", Gender.FEMALE);

        //Создать три спектакля: обычный, оперный и балет
        Director director = new Director("Ян", "Скедня", Gender.MALE, 1);
        Show performance = new Show("Шуршание сердец", 80,  director);

        Director director2 = new Director("Елизавета", "Сергеева", Gender.FEMALE, 71);
        Opera opera = new Opera("У котяток лапки", 70,  director2, мusicAuthor,
                "Кот-тенор пытается спеть арию, но ему на пузо плюхается котёнок.", 49);

        Director director3 = new Director("Роман", "Душный", Gender.MALE, 2);
        Ballet ballet = new Ballet("Капитан колготкин", 124,  director3,
                мusicAuthor, "Капитан Колготкин в трико в горошек исполняет пируэт, но ударяется "
        + "мизинцем о тумбочку на сцене.", choreographer);

        //Распределить актёров по спектаклям.
        performance.addActor(actor1);
        performance.addActor(actor3);

        opera.addActor(actor2);
        opera.addActor(actor3);

        ballet.addActor(actor1);
        ballet.addActor(actor2);
        ballet.addActor(actor3);

        //Для каждого спектакля выведите на экран список актёров.
        performance.printActors();
        opera.printActors();
        ballet.printActors();

        //Замените актёра в одном из спектаклей на актёра из другого спектакля
        // и ещё раз выведите для него список актёров.

        String surnameForChange = opera.getListOfActors().getFirst().getSurname();
        opera.changeActor(actor1, surnameForChange);
        opera.printActors();

        //Попробуйте заменить в другом спектакле несуществующего актёра
        performance.changeActor(actor1, "Невидимкин");

        //Для оперного и балетного спектакля выведите на экран текст либретто.
        opera.printLibrettoText();
        ballet.printLibrettoText();
    }
}
