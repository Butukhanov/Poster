package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.manager.PosterManager;


public class PosterManagerTest {
    Poster first = new Poster(1, "Blade shot", "action movie");
    Poster second = new Poster(2, "Forward", "cartoon");
    Poster third = new Poster(3, "Hotel Belgrade", "comedy");
    Poster fourth = new Poster(4, "Gentlemen", "action movie");
    Poster fifth = new Poster(5, "The invisible man", "horror");
    Poster sixth = new Poster(6, "Trolls. World tour", "cartoon");
    Poster seventh = new Poster(7, "Number one", "comedy");
    Poster eigthth = new Poster(8, "Phone", "comedy");
    Poster ninth = new Poster(9, "Glass", "horror");
    Poster tenth = new Poster(10, "Fire", "action movie");

    @Test
    public void test(){
        PosterManager manager = new PosterManager();

        manager.add (first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);

        Poster[] actual = manager.findAll();
        Poster[] expected = {first, second, third, fourth, fifth, sixth, seventh};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test1(){
        PosterManager manager = new PosterManager();

        manager.add (first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eigthth);
        manager.add(ninth);
        manager.add(tenth);

        Poster[] actual = manager.findLast();
        Poster[] expected = {tenth, ninth, eigthth, seventh, sixth, fifth, fourth, third, second, first};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2(){
        PosterManager manager = new PosterManager(5);

        manager.add (first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eigthth);
        manager.add(ninth);
        manager.add(tenth);

        Poster[] actual = manager.findLast();
        Poster[] expected = {tenth, ninth, eigthth, seventh, sixth};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test3(){
        PosterManager manager = new PosterManager(50);

        manager.add (first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eigthth);
        manager.add(ninth);
        manager.add(tenth);

        Poster[] actual = manager.findLast();
        Poster[] expected = {tenth, ninth, eigthth, seventh, sixth, fifth, fourth, third, second, first};

        Assertions.assertArrayEquals(expected, actual);
    }
}
