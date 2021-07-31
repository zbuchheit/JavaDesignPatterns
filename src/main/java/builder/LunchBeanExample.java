package builder;

public class LunchBeanExample {
    public static void main(String args[]){

        LunchBean lunchBean = new LunchBean();

        lunchBean.setBread("Wheat");
        lunchBean.setCondiments("Lettuce");
        lunchBean.setDressing("Mayo");
        lunchBean.setMeat("Roast Beef");

        System.out.println(lunchBean.getBread());
        System.out.println(lunchBean.getCondiments());
        System.out.println(lunchBean.getDressing());
        System.out.println(lunchBean.getMeat());
    }
}
