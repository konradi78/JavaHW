public class ShopAvailability {
    public static boolean isEdekaOpen = true;
    public static boolean isReweOpen = false;

    public static boolean canBuy() {
        return isEdekaOpen || isReweOpen;
    }

    public static void main(String[] args) {
        boolean canBuyFood = canBuy();
        System.out.println("Я могу купить еду, это " + canBuyFood);
    }
}