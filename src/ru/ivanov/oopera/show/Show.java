package ru.ivanov.oopera.show;

import ru.ivanov.oopera.persons.Actor;
import ru.ivanov.oopera.persons.Director;
import java.util.ArrayList;
import java.util.List;

public class Show {
    private String title;
    private int duration;
    private Director director;
    private List<Actor> listOfActors;

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public Director getDirector() {
        return director;
    }

    public List<Actor> getListOfActors() {
        return listOfActors;
    }

    public void printDirector(){
        System.out.println(director);
    }

    public void printActors(){
        System.out.println("Актеры спектакля \"" + title + "\"");
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
        System.out.println();
    }

    public void addActor(Actor actor){
        if(listOfActors.contains(actor)){
            System.out.println("Данный актер уже есть в списке актеров");
        } else {
            listOfActors.add(actor);
        }
    }

    public void changeActor(Actor actor, String surname){
        int index = -1;
        for (int i = 0; i < listOfActors.size(); i++) {
            if(listOfActors.get(i).getSurname().equals(surname)) {
                index = i;
                break;
            }
        }

        if(index>=0) {
            listOfActors.set(index, actor);
            System.out.println("Актера " + surname + " заменили на " + actor.getSurname());
        } else
            System.out.println("Актера " + surname + " нет в списке");

        System.out.println();
    }
}
