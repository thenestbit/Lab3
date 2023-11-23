public class ChristopherRobin extends Alive implements Moveable, IsAbleToWearBoots {
    public ChristopherRobin() {
        super("Christopher Robin");
    }

    @Override
    public void move(Location location) {
        System.out.println(getName() + " is moving to " + location.getDescription());
    }

    @Override
    public void equip(Item item) {
        System.out.println(getName() + " equips " + item.getName());
    }

    @Override
    public void prepareForAdventure(HikingBoots boots) {
        System.out.println(getName() + " equips " + boots.getName());
    }
}
