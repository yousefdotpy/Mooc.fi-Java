public class Book {
    private String title;
    private int RecommendedAge;

    public Book(String title, int recommendedAge) {
        this.title = title;
        RecommendedAge = recommendedAge;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setRecommendedAge(int recommendedAge) {
        RecommendedAge = recommendedAge;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", RecommendedAge=" + RecommendedAge +
                '}';
    }

    public int getRecommendedAge() {
        return RecommendedAge;
    }
}
