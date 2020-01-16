public class AirCraftCarrier extends Ship {

    public class Escort{

        Ship Destroyer1 = new Ship();
        Ship Destroyer2 = new Ship();
        Ship Cruiser1 = new Ship();

    }

    public static class FleetOrders{

        String Orders;

        public String getOrders() {
            return Orders;
        }

        public void setOrders(String orders) {
            Orders = orders;
        }
    }
}
