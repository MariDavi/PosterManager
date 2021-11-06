package ru.netology.domain;

public class PosterManager {
    private PosterItem[] items = new PosterItem[0];
    private int resultLenght;

    public void setResultLenght(int resultLenght) {
        this.resultLenght = resultLenght;
    }


    public void add(PosterItem item) {
        int lenght = items.length + 1;
        PosterItem[] tmp = new PosterItem[lenght];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;

    }

    public PosterItem[] getAmount() {
        if (items.length < resultLenght) {
            resultLenght = items.length;
        }

        PosterItem[] result = new PosterItem[resultLenght];
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }

}
