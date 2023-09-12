package ru.netology.PostersManager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PostersManagerTest {
        PostersManager manager = new PostersManager();

        @Test
        public void addNewFilm() {
            String[] expected = {};
            String[] actual = manager.findAll();
            Assertions.assertArrayEquals(expected, actual);
        }

        @Test
        public void checkEmptyManager() {
            String[] expected = {};
            String[] actual = manager.FindLast();
            Assertions.assertArrayEquals(expected, actual);
        }

        @Test
        public void addNewFilms9() {
            manager.addNewFilm("Film1");
            manager.addNewFilm("Film2");
            manager.addNewFilm("Film3");
            manager.addNewFilm("Film4");
            manager.addNewFilm("Film5");
            manager.addNewFilm("Film6");
            manager.addNewFilm("Film7");
            manager.addNewFilm("Film8");
            manager.addNewFilm("Film9");
            String[] expected = {"Film1", "Film2", "Film3", "Film4", "Film5", "Film6", "Film7", "Film8", "Film9"};
            String[] actual = manager.findAll();
            Assertions.assertArrayEquals(expected, actual);
        }

        @Test
        public void shouldReversed5LastFilms() {
            manager.addNewFilm("Film1");
            manager.addNewFilm("Film2");
            manager.addNewFilm("Film3");
            manager.addNewFilm("Film4");
            manager.addNewFilm("Film5");
            manager.addNewFilm("Film6");
            manager.addNewFilm("Film7");
            manager.addNewFilm("Film8");
            manager.addNewFilm("Film9");
            String[] expected = {"Film9", "Film8", "Film7", "Film6", "Film5"};
            String[] actual = manager.FindLast();
            Assertions.assertArrayEquals(expected, actual);
        }

        @Test
        public void shouldReversed3LastFilms() {
            PostersManager manager = new PostersManager(3);
            manager.addNewFilm("Film1");
            manager.addNewFilm("Film2");
            manager.addNewFilm("Film3");
            manager.addNewFilm("Film4");
            manager.addNewFilm("Film5");
            manager.addNewFilm("Film6");
            manager.addNewFilm("Film7");
            manager.addNewFilm("Film8");
            manager.addNewFilm("Film9");
            String[] expected = {"Film9", "Film8", "Film7"};
            String[] actual = manager.FindLast();
            Assertions.assertArrayEquals(expected, actual);
        }

        @Test
        public void shouldReversedAllLastFilms() {
            PostersManager manager = new PostersManager(9);
            manager.addNewFilm("Film1");
            manager.addNewFilm("Film2");
            manager.addNewFilm("Film3");
            manager.addNewFilm("Film4");
            manager.addNewFilm("Film5");
            manager.addNewFilm("Film6");
            manager.addNewFilm("Film7");
            manager.addNewFilm("Film8");
            manager.addNewFilm("Film9");
            String[] expected = {"Film9", "Film8", "Film7", "Film6", "Film5", "Film4", "Film3", "Film2", "Film1"};
            String[] actual = manager.FindLast();
            Assertions.assertArrayEquals(expected, actual);
        }
}
