package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.PurchaseItem;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FilmsTest {
    PurchaseItem one = new PurchaseItem(1, "Name1", "genre");
    PurchaseItem two = new PurchaseItem(2, "Name2", "genre");
    PurchaseItem three = new PurchaseItem(3, "Name3", "genre");
    PurchaseItem four = new PurchaseItem(4, "Name4", "genre");
    PurchaseItem five = new PurchaseItem(5, "Name5", "genre");
    PurchaseItem six = new PurchaseItem(6, "Name6", "genre");
    PurchaseItem seven = new PurchaseItem(7, "Name7", "genre");
    PurchaseItem eight = new PurchaseItem(8, "Name8", "genre");
    PurchaseItem nine = new PurchaseItem(9, "Name9", "genre");
    PurchaseItem ten = new PurchaseItem(10, "Name10", "genre");

    @Test
    void shouldAddedFilm() {
        FilmsManager manager = new FilmsManager(4);
        manager.add(one);
        manager.add(two);
        manager.add(three);
        manager.add(four);
        PurchaseItem[] actual = manager.getAll();
        PurchaseItem[] expected = new PurchaseItem[] {four, three, two, one};
        assertArrayEquals (expected, actual);
    }

    @Test
    void shouldEmptyShow() {
        FilmsManager manager = new FilmsManager(10);
        PurchaseItem[] actual = manager.getAll();
        PurchaseItem[] expected = new PurchaseItem[]{};
        assertArrayEquals(expected, actual);
    }

    @Test
    void getCurrentFilms() {
        FilmsManager manager = new FilmsManager(5);
        manager.add(one);
        manager.add(two);
        manager.add(three);
        manager.add(four);
        manager.add(five);
        manager.add(six);
        manager.add(seven);
        manager.add(eight);
        manager.add(nine);
        manager.add(ten);
        PurchaseItem[] actual = manager.findLastFilms();
        PurchaseItem[] expected = new PurchaseItem[] {ten, nine, eight, seven, six};
        assertArrayEquals(expected, actual);
    }
}
