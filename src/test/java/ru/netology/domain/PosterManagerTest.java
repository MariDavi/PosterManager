package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class PosterManagerTest {

    @Test
    public void shoudAddPoster() {
        PosterManager manager = new PosterManager();
        PosterItem first = new PosterItem(123, "img/pic1.jpg", "Блэдшот", "action");
        manager.add(first);
    }

    @Test
    public void shoudGetAmount3() {
        PosterManager manager = new PosterManager();
        manager.setResultLenght(3);
        PosterItem first = new PosterItem(123, "img/pic1.jpg", "Блэдшот", "action");
        PosterItem second = new PosterItem(126, "img/pic2.jpg", "Вперед", "movie");
        PosterItem third = new PosterItem(128, "img/pic3.jpg", "Отель", "comedy");
        manager.add(first);
        manager.add(second);
        manager.add(third);

        PosterItem[] actual = manager.getAmount();
        PosterItem[] expected = new PosterItem[]{third, second, first};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shoudGetAmount1() {
        PosterManager manager = new PosterManager();
        manager.setResultLenght(1);
        PosterItem first = new PosterItem(123, "img/pic1.jpg", "Блэдшот", "action");
        PosterItem second = new PosterItem(126, "img/pic2.jpg", "Вперед", "movie");
        PosterItem third = new PosterItem(128, "img/pic3.jpg", "Отель", "comedy");
        manager.add(first);
        manager.add(second);
        manager.add(third);

        PosterItem[] actual = manager.getAmount();
        PosterItem[] expected = new PosterItem[]{third};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shoudGetAmount1obj() {
        PosterManager manager = new PosterManager();
        manager.setResultLenght(3);
        PosterItem first = new PosterItem(123, "img/pic1.jpg", "Блэдшот", "action");
        PosterItem second = new PosterItem(126, "img/pic2.jpg", "Вперед", "movie");
        manager.add(first);
        manager.add(second);


        PosterItem[] actual = manager.getAmount();
        PosterItem[] expected = new PosterItem[]{second, first};

        assertArrayEquals(expected, actual);
    }
}