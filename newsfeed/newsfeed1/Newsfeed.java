public class Newsfeed {
    String[] topics = {"Opinion", "Tech", "Science", "Health"};
    int[] views = {0, 0, 0, 0};
    String[] favoriteArticles;

    public Newsfeed() {
        String[] favoritArticles = new String[10];
    }

public void setFavoriteArticle(int favoriteIndex, String newArticle) {
    favoriteArticles[favoriteIndex] = newArticle;
}
}