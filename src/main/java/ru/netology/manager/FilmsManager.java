package ru.netology.manager;

import ru.netology.domain.PurchaseItem;

public class FilmsManager {
    private PurchaseItem[] items = new PurchaseItem[0];
    private int maxFilms = 10;

    public FilmsManager(int maxFilms) {
        this.maxFilms = maxFilms;
    }

    public void add(PurchaseItem item) {
        int lenght = items.length + 1;
        PurchaseItem[] tmp = new PurchaseItem[lenght];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = item;
        items = tmp;
    }

    public PurchaseItem[] getAll() {
        PurchaseItem[] result = new PurchaseItem[items.length];
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }

    public PurchaseItem[] findLastFilms() {
        int lenght = maxFilms;
        if (lenght > items.length) {
            lenght = items.length;
        }

        PurchaseItem[] result = new PurchaseItem[lenght];

        for (int i = 0; i < lenght; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }
}
