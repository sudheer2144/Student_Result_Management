#Movie Booking Backend



• A Backend application created in Microservices architecture exposed using a RESTful API made with **SpringBoot**

• The entire project is divided into 3 modules i.e, User_Module, Wallet_Module, Transactions_Module.

Flow:
	1. When a new user is created the Wallet for that User will be automatically created by communicating the Wallet_Module with the help of Kafka. User and wallet will be stored is DB. and user will be stored in Redis with an expiry of 12-hours.
	2. To  make a transaction, an object with the details of sender username, receiver username and the amount which is converted as a String with the help of ObjectMapper will be sent from Transaction_Module to Wallet_Module. and transaction will be stored in DB with status of PENDING.
	3. After the message is received by the Wallet_Module it will be converted back to an object with the help of ObjectMapper and both the sender and receiver wallets will be checked whether sender has enough balance and receiver is exist.
	4. Once the walltes are updated a Kafka message with the ObjectMapper converted String transaction update message with status and transactionId to Transaction_Module then the stored transaction status will be updated in the Database based on the message.

• Tech Stack:
 SpringBoot
 JPA Hibernate(MYSQL DB),
Redis,
Kafka,
RestTemplate,
Microservices,
Maven,
IntelliJ.
