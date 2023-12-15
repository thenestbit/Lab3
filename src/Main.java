import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        WinnieThePooh pooh = new WinnieThePooh();
        ChristopherRobin robin = new ChristopherRobin();

        HikingBoots boots = new HikingBoots();
        // Создаем объект вложенного класса BootsDetails через экземпляр HikingBoots
        HikingBoots.BootsDetails details = boots.new BootsDetails(42, "Trekking");

        Location meadow = Location.MEADOW;
        Location forest = Location.FOREST;
        Location house = Location.HOUSE;
        Item honeyPot = Item.HONEY_POT;
        Song song = new Song("Shumelka ","tu-tu-tu-pshh-boo");
        Song robinSong = new Song("Treschalka ", "brr skibidi dop dop dop yes yes");
        double itsTimeToEat = random.nextDouble();
        double poohCouldNotEquipBoots = random.nextDouble();



        try {

            // Бросаем checked исключение
            if (poohCouldNotEquipBoots > 0.7) {
                throw new AdventureTimeException("What a pity! Pooh couldn't equip his boots." + "\n" + "Now he is going to walk with no boots. Hurry up, Pooh!");
            }
            pooh.prepareForAdventure(boots);
            pooh.say("My boots are " + details.getSize() + " size and " + details.getStyle() + " style.");
            pooh.move(meadow);
            pooh.equip(honeyPot);
            pooh.sing(song);
            song.playMelody();
            pooh.say("I'm naughty Winnie Pooh I ran from Robin!");
            song.playMelody();
            pooh.say("La-la-la!");
            pooh.say("My favourite food is: " + pooh.getFavoriteFood());
            pooh.equip(honeyPot);
            pooh.move(forest);
            pooh.performTask();
        } catch (AdventureTimeException e) {
            System.out.println("Adventure preparing error: " + e.getMessage());
        }

        robin.prepareForAdventure(boots);
        robin.move(meadow);
        robin.sing(robinSong);
        robinSong.playMelody();

        // Бросаем unchecked исключение
        if (itsTimeToEat > 0.6) {
            throw new UnexpectedCharacterBehaviorException("RObin became hungry! Now song " + robinSong.getSong() + " is wrong :(");
        }

        robin.move(forest);

        pooh.say("Hi, Robin!");
        robin.say("Hi, Pooh! Let's go home");
        pooh.say("Let's go!");
        robin.singCustomSong();

        pooh.move(house);
        robin.move(house);
    }
}
