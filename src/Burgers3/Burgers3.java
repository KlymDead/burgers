public class Burgers {

    private String bun;
    private String cutlet;
    private boolean cutletExtra ;
    private String cheese;

    private String greens;
    private String mayo;

    private Burgers ( String bun, String cutlet, String cheese){
        this.bun=bun;
        this.cutlet=cutlet;
        this.cheese=cheese;
    }

    public Burgers ( String bun, String cutlet, String cheese, String greens, String mayo ){
        this(bun,cutlet,cheese);
        this.greens = greens;
        this.mayo = mayo;
        System.out.println("Classic burger: " + bun + " + " + cutlet + " + " + cheese + " + " + this.greens + " + " + this.mayo + "!");
    }
    public Burgers ( String bun, String cutlet, String cheese, String greens){
        this(bun,cutlet,cheese);
        this.greens = greens;
        System.out.println("Fitburger: " + bun + " + " + cutlet + " + " + cheese + " + " + this.greens + "!");
    }
    public Burgers (String bun, boolean cutletExtra, String cutlet, String cheese, String greens, String mayo){
        this(bun,cutlet, cheese);
        this.mayo=mayo;
        this.greens=greens;
        this.cutletExtra = cutletExtra;
        String dubbleMeat = cutletExtra?"2":"1";
        System.out.println("Dubbleburger: " + bun + " + "  + dubbleMeat + " " +  cutlet + " + " + cheese + " + " + this.greens + " + " + this.mayo + "!");
    }
}

