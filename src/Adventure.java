public class Adventure {
    public static void main(String[] args) {
        WinnieThePooh pooh = new WinnieThePooh();
        ChristopherRobin robin = new ChristopherRobin();
        HikingBoots boots = new HikingBoots();
        Location meadow = Location.MEADOW;
        Location forest = Location.FOREST;
        Location house = Location.HOUSE;
        Item honeyPot = Item.HONEY_POT;
        Song song = new Song("Shumelka ","tu-tu-tu-pshh-boo");
        Song robinSong = new Song("Treschalka ", "brr skibidi dop dop dop yes yes");

        pooh.prepareForAdventure(boots);
        pooh.move(meadow);
        pooh.equip(honeyPot);
        pooh.sing(song);
        song.playMelody();
        pooh.say("I'm naughty Winnie Pooh I ran from Robin!");
        song.playMelody();
        pooh.say("La-la-la!");
        pooh.move(forest);

        robin.prepareForAdventure(boots);
        robin.move(meadow);
        robin.sing(robinSong);
        robinSong.playMelody();
        robin.say("Where tf is the Pooh?!");
        robin.move(forest);

        pooh.say("Hi, Robin!");
        robin.say("Hi, Pooh! Let's go home");
        pooh.say("Let's go!");

        pooh.move(house);
        robin.move(house);

    }
}
