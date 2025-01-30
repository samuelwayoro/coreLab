#### <font color=red>Exemple de l'utilisation de classe scellée dans une application spring boot </font>

Les classes scellées (sealed class) en Spring boot sont particulièrement utiles pour modéliser des <b> hiérarchies de
données
fermées</b>, comme :

* les types des utilisateurs (Admin,Client,Employé)
* Les états d'une commande (En attente,Validée,Expédiée)
* Les modes de paiements (Carte,Paypal,Virement)

***

<font color=red> Exemple concret : Modélisation des états d'une commande (orderStatus) </font>

Dans une application e-commerce, une commande peut avoir plusieurs états bien définis :

* Pending (En attente)
* Confirmed (Confirmée)
* Shipped (Expédiée)
* Delivered (Livrée)
* Canceled (Annulée)

Nous allons utiliser <b>une classe scellée</b> pour représenter ces états.

<b> 1. Définition d'une classe scellée (OrderStatus) et de ses sous-classes </b>

    package com.example.demo.model

    public sealed class OrderStatus permits Pending,Confirmed,Shipped,Delivered,Canceled {
        
        private final String status;

        protected OrderStatus (String status){
            this.status = status;
        }
        
        public String getStatus(){
            return status;
        }

    }

<b> 2. Définition des sous-classes de la classe OrderStatus </b>

sous-class Pending

    package com.example.demo.model

    public final class Pending {
    
        public Pending(){
            super("pending");
        }
    }

sous-class Confirmed

    package com.example.demo.model

    public final class Confirmed {
    
        public Confirmed(){
            super("confirmed");
        }
    }

sous-class Shipped

    package com.example.demo.model

    public final class Shipped {
    
        public Shipped(){
            super("shipped");
        }
    }

sous-class Delivered

    package com.example.demo.model

    public final class Delivered {
    
        public Delivered(){
            super("delivered");
        }
    }

sous-class Cancelled

    package com.example.demo.model

    public final class Cancelled {
    
        public Cancelled(){
            super("cancelled");
        }
    }


<b> 2. Utilisation dans une entité Order </b>

    classe Order.java 

    package com.example.demo.model;

    import jakarta.persistance.*;

    @Entity
    public class Order {
        
        @Id
        @GeneratedValue(strategy = Generationtype.IDENTITY)
        private Long id;
        
        private String customerName;

        @Transient // One ne stock pas directement l'objet scellé, mais son statut sous forme de string 
        private OrderStatus status = new Pending()

        public Order (){}

        public Order (String customer){
            this.customerName = customerName;
            this.status = new Pending();//Une commande commence tjrs en attente
        }

        public int getId(){ return Id;}
        public String getCustomerName () { return customerName;}
        public OrderStatus getStatus() { return status;}

        public void setStatus (OrderStatus status) { this.status = status}
    }


<b> 3. Implémentation du Service </b>

    package com.example.demo.service;

    import com.example.demo.model.*;
    import org.springframework.stereotype.Service;
    
    import java.util.HashMap;
    import java.util.Map;
    
    @Service
    public class OrderService {
    private final Map<Long, Order> orderDatabase = new HashMap<>();
    private long nextId = 1;
    
        public Order createOrder(String customerName) {
            Order order = new Order(customerName);
            orderDatabase.put(nextId, order);
            return order;
        }
    
        public Order updateOrderStatus(Long orderId, OrderStatus newStatus) {
            Order order = orderDatabase.get(orderId);
            if (order != null) {
                order.setStatus(newStatus);
            }
            return order;
        }
    }

✅ Cette approche empêche d'affecter un état invalide à une commande au update .


<b> 4. Utilisation dans un controller REST </b>

    
    package com.example.demo.controller;

    import com.example.demo.model.*;
    import com.example.demo.service.OrderService;
    import org.springframework.web.bind.annotation.*;
    
    @RestController
    @RequestMapping("/orders")
    public class OrderController {
    private final OrderService orderService;
    
        public OrderController(OrderService orderService) {
            this.orderService = orderService;
        }
    
        @PostMapping("/create")
        public Order createOrder(@RequestParam String customerName) {
            return orderService.createOrder(customerName);
        }
    
        @PutMapping("/{id}/status")
        public Order updateOrderStatus(@PathVariable Long id, @RequestParam String newStatus) {
            OrderStatus status;
            switch (newStatus.toLowerCase()) {
                case "confirmed" -> status = new Confirmed();
                case "shipped" -> status = new Shipped();
                case "delivered" -> status = new Delivered();
                case "cancelled" -> status = new Cancelled();
                default -> throw new IllegalArgumentException("Statut inconnu");
            }
            return orderService.updateOrderStatus(id, status);
        }
    }

✅ Seuls les statuts autorisés (Confirmed, Shipped, Delivered, Cancelled) peuvent être utilisés.

