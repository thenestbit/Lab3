public class Song implements MusicalElement {
    private String title;
    private String melody;

    public Song(String title, String melody) {
        this.title = title;
        this.melody = melody;
    }

    public String getSong() {
        return title + melody;
    }

    @Override
    public void playMelody() {
        // Логика воспроизведения мелодии
        System.out.println("Humming the melody of the song");
    }
}
