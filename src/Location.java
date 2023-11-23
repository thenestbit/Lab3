public enum Location {
    FOREST("The Hundred Acre Wood"),
    HOUSE("Christopher Robin's house"),
    MEADOW("The sunny meadow");

    private final String description;

    Location(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
