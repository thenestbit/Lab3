public enum Item {
    HIKING_BOOTS("Hiking Boots"),
    HONEY_POT("Honey Pot"),
    MAP("Map");

    private final String name;

    Item(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
