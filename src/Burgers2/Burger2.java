public class Burger {
    private String bun;
    private String cutlet;
    private int amountOfMeat = 0;
    private String cheese;
    private String greens;
    private String mayo;

    private void burgers(String bun, int amountOfMeat,
                         String cutlet, String cheese, String greens,
                         String mayo) {
        this.bun = bun;
        this.cutlet = cutlet;
        this.amountOfMeat = amountOfMeat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayo = mayo;
    }

    public Burger(String bun, String cutlet, String cheese, String greens, String mayo) {
        this.burgers(bun,0, cutlet,cheese,greens,mayo);
        System.out.println("Classic burger: " + this.bun + " + " + this.cutlet + " + " + this.cheese + " + " + this.greens + " + " + this.mayo + "!");
    }

    public Burger (String bun, String cutlet, String cheese, String greens) {
        this.burgers(bun,0, cutlet,cheese,greens, null);
        System.out.println("Fitburger: " + this.bun + " + " + this.cutlet + " + " + this.cheese + " + " + this.greens + "!");
    }
    public Burger(String bun, int amountOfMeat, String cutlet, String cheese, String greens, String mayo) {
        this.burgers(bun, amountOfMeat, cutlet,cheese,greens, mayo);
        System.out.println("Dubbleburger: " + this.bun + " + " + this.amountOfMeat + " " +  this.cutlet + " + " + this.cheese + " + " + this.greens + " + " + this.mayo + "!");
    }
}

