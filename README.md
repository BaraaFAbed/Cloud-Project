# **AgriCloud - Cloud Computing Project**
Agricloud is a smart agriculture system with a cloud backend. The system was only partially implemented. This repository stores the source code for the Springboot web applications for our system that were deployed on Microsoft Azure.

There are three microservices implemented in this project:
1. AccountManager: Used to manage accounts for logins and registers.
2. NotificationManager: Used to notify the user when anomalies are detected from the system's sensors
3. DataCollectionManager: Used to store data collected from sensors, and also expose APIs for other microservices to access this data
