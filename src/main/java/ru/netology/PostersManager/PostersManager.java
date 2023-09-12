package ru.netology.PostersManager;

public class PostersManager {
    private String[] posters = new String[0];
    private int limit;

    public PostersManager() {
        this.limit = 5;
    }

    public PostersManager(int limit) {
        this.limit = limit;
    }

    public void addNewFilm(String film) {
        String[] tmp = new String[posters.length + 1];
        for (int i = 0; i < posters.length; i++) {
            tmp[i] = posters[i];
        }
        tmp[tmp.length - 1] = film;
        this.posters = tmp;
    }

    public String[] findAll() {
        return posters;
    }

    public String[] FindLast() {
        int resultLength;
        if (posters.length < limit) {
            resultLength = posters.length;
        } else
            resultLength = limit;
        String[] result = new String[resultLength];

        for (int i = 0; i < resultLength; i++) {

            result[i] = posters[posters.length - i - 1];
        }
        return result;

    }

}
