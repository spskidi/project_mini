-- Customers
INSERT INTO Customers (name, phone, city, signup_date) VALUES
('Rahul', '9876543210', 'Bangalore', '2024-01-10'),
('Anjali', '9123456780', 'Hyderabad', '2024-02-15'),
('Vikram', '9988776655', 'Chennai', '2024-03-05');

-- Restaurants
INSERT INTO Restaurants (name, city, rating) VALUES
('Spicy Hub', 'Bangalore', 4.5),
('Food Palace', 'Hyderabad', 4.2),
('Tasty Corner', 'Chennai', 4.0);

-- Menu
INSERT INTO Menu (restaurant_id, item_name, price) VALUES
(1, 'Burger', 120),
(1, 'Pizza', 250),
(2, 'Biryani', 200),
(2, 'Fried Rice', 150),
(3, 'Dosa', 80),
(3, 'Idli', 60);

-- Orders
INSERT INTO Orders (customer_id, restaurant_id, order_date, status, total_amount) VALUES
(1, 1, '2024-04-01 10:30:00', 'Delivered', 370),
(2, 2, '2024-04-02 12:00:00', 'Pending', 200),
(3, 3, '2024-04-03 09:15:00', 'Delivered', 140);

-- Order Items
INSERT INTO Order_Items (order_id, item_id, quantity) VALUES
(1, 1, 1),
(1, 2, 1),
(2, 3, 1),
(3, 5, 1),
(3, 6, 1);

-- Delivery Agents
INSERT INTO Delivery_Agents (name, phone, vehicle_type) VALUES
('Ramesh', '9001', 'Bike'),
('Suresh', '9002', 'Scooter');

-- Deliveries
INSERT INTO Deliveries (order_id, agent_id, delivery_status, delivery_time) VALUES
(1, 1, 'Delivered', '2024-04-01 11:00:00'),
(2, 2, 'On the way', NULL),
(3, 1, 'Delivered', '2024-04-03 09:45:00');

-- Payments
INSERT INTO Payments (order_id, payment_method, payment_status) VALUES
(1, 'UPI', 'Success'),
(2, 'Cash', 'Pending'),
(3, 'Card', 'Success');

-- Reviews
INSERT INTO Reviews (customer_id, restaurant_id, rating, comment) VALUES
(1, 1, 5, 'Great food!'),
(2, 2, 4, 'Nice taste'),
(3, 3, 4, 'Good service');