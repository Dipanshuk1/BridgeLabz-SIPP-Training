package multilevel_inheritance_package;


class Order {
 String orderId;
 String orderDate;


 Order(String orderId, String orderDate) {
     this.orderId = orderId;
     this.orderDate = orderDate;
 }

 
 String getOrderStatus() {
     return "Order placed";
 }

 public void displayOrderInfo() {
     System.out.println("Order ID: " + orderId);
     System.out.println("Order Date: " + orderDate);
 }
}


class ShippedOrder extends Order {
 String trackingNumber;

 ShippedOrder(String orderId, String orderDate, String trackingNumber) {
     super(orderId, orderDate);  
     this.trackingNumber = trackingNumber;
 }

 @Override
 String getOrderStatus() {
     return "Order shipped. Tracking Number: " + trackingNumber;
 }


 @Override
 public void displayOrderInfo() {
     super.displayOrderInfo();
     System.out.println("Tracking Number: " + trackingNumber);
 }
}


class DeliveredOrder extends ShippedOrder {
 String deliveryDate;

 
 DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
     super(orderId, orderDate, trackingNumber);  
     this.deliveryDate = deliveryDate;
 }

 // Override to show final delivery status
 @Override
 String getOrderStatus() {
     return "Order delivered on " + deliveryDate;
 }

 
 @Override
 public void displayOrderInfo() {
     super.displayOrderInfo(); 
     System.out.println("Delivery Date: " + deliveryDate);
 }
}


public class OnlineRetail {
 public static void main(String[] args) {
     DeliveredOrder order = new DeliveredOrder(
         "12345", 
         "2025-06-25", 
         "987654321", 
         "2025-06-30"
     );

     System.out.println("Order Details:");
     order.displayOrderInfo();

     System.out.println("\nOrder Status: " + order.getOrderStatus());
 }
}
