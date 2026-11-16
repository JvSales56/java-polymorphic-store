public final class VideoGame extends Product {

    public VideoGame() {
        super("Video Game", 3000.00);
    }

    @Override
    public String getCategory() {
        return "Video Game";
    }
}