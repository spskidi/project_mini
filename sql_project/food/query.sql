--  All orders with customer & restaurant
SELECT o.order_id, c.name AS customer, r.name AS restaurant, o.status
FROM Orders o
JOIN Customers c ON o.customer_id = c.customer_id
JOIN Restaurants r ON o.restaurant_id = r.restaurant_id;

--  Top restaurant (most orders)
SELECT r.name, COUNT(*) AS total_orders
FROM Orders o
JOIN Restaurants r ON o.restaurant_id = r.restaurant_id
GROUP BY r.name
ORDER BY total_orders DESC;

--  Revenue per restaurant
SELECT r.name, SUM(o.total_amount) AS revenue
FROM Orders o
JOIN Restaurants r ON o.restaurant_id = r.restaurant_id
WHERE o.status = 'Delivered'
GROUP BY r.name;

--  Delivery status
SELECT o.order_id, d.delivery_status
FROM Orders o
LEFT JOIN Deliveries d ON o.order_id = d.order_id;

-- Most ordered item
SELECT m.item_name, SUM(oi.quantity) AS total_ordered
FROM Order_Items oi
JOIN Menu m ON oi.item_id = m.item_id
GROUP BY m.item_name
ORDER BY total_ordered DESC;

-- Pending orders
SELECT * FROM Orders
WHERE status = 'Pending';

--  Customer order count
SELECT c.name, COUNT(o.order_id) AS total_orders
FROM Customers c
JOIN Orders o ON c.customer_id = o.customer_id
GROUP BY c.name;