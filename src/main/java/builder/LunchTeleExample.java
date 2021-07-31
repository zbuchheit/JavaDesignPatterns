package builder;

public class LunchTeleExample {
    public static void main(String args[]){

        LunchTele lunchTele = new LunchTele("Wheat", "Lettuce","Mayo","Roast Beef");

//        lunchBuilder.setBread("Wheat");
//        lunchBuilder.setCondiments("Lettuce");
//        lunchBuilder.setDressing("Mayo");
//        lunchBuilder.setMeat("Roast Beef");

        System.out.println(lunchTele.getBread());
        System.out.println(lunchTele.getCondiments());
        System.out.println(lunchTele.getDressing());
        System.out.println(lunchTele.getMeat());
    }
}
