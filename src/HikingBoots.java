public class HikingBoots {
    private String name = "Hiking Boots";

    public class BootsDetails {
        private int size;
        private String style;

        public BootsDetails(int size, String style) {
            this.size = size;
            this.style = style;
        }

        public int getSize() {
            return this.size;
        }

        public String getStyle() {
            return this.style;
        }
    }

    public String getName() {
        return name;
    }

    public void wear() {
        System.out.println("The " + name + " are being worn.");
    }
}
