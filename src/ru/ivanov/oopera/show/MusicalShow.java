package ru.ivanov.oopera.show;

import ru.ivanov.oopera.persons.Director;
import ru.ivanov.oopera.persons.Person;


public class MusicalShow extends Show{
    private Person musicAuthor;
    private String librettoText;

    public MusicalShow(String title, int duration, Director director, Person musicAuthor, String librettoText) {
        super(title, duration, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public Person getMusicAuthor() {
        return musicAuthor;
    }

    public String getLibrettoText() {
        return librettoText;
    }

    public void printLibrettoText(){
        System.out.println("Либретто спектакля \"" + getTitle() + "\"");
        System.out.println(librettoText);
        System.out.println();
    }
}
