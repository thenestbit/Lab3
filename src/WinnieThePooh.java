public class WinnieThePooh extends Alive implements Moveable, IsAbleToWearBoots {
    private final String favoriteFood = "honey";

    public void performTask() {
        // Локальный класс, описывающий действие спасения маленькой пчелки
        class RescueAction {
            public void rescueBee() {
                System.out.println("Pooh rescues a little bee from honey pot!");
            }
        }

        // Используем локальный класс для спасения пчелки
        RescueAction rescue = new RescueAction();
        rescue.rescueBee();
    }

    public WinnieThePooh() {
        super("Winnie the Pooh");
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void prepareForAdventure(HikingBoots boots) {
        System.out.println(getName() + " is ready for an adventure with " + boots.getName() + "!");
    }

    @Override
    public void move(Location location) {
        System.out.println(getName() + " is moving to " + location.getDescription());
    }

    @Override
    public void equip(Item item) {
        System.out.println(getName() + " equips " + item.getName());
    }
}
