package builder;

public class LunchBuilderExample {
    public static void main(String[] args) {
        LunchBuilder.Builder builder = new LunchBuilder.Builder();
        builder.bread("Wheat")
                .condiments("Lettuce")
                .dressing("Mayo")
                .meat("Turkey");
        System.out.println("builder = " + builder);
        LunchBuilder lunchBuilder = builder.build();

        System.out.println(lunchBuilder.getBread());
        System.out.println(lunchBuilder.getCondiments());
        System.out.println(lunchBuilder.getDressing());
        System.out.println(lunchBuilder.getMeat());
    }
}
