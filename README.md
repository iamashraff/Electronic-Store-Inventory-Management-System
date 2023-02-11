
# Electronic Store Inventory Management System (ESIMS)

***ESIMS*** is a simple inventory management system for **desktop application** written using **Java** and implementing **Java Swing GUI**. This project is the requirement of Software Design & Integration - ISB26504 course at the Universiti Kuala Lumpur (UniKL). The project requires for creativity and problem-solving skills in analyzing and designing a software project solution where need we need to apply **MVC** concept in the solution. 

Also, this project requires to implement at least two design patterns; in this case we are choosing **Singleton** and **Builder** design patterns. The implementation of these design pattern are only using a simplest way possible but also ensuring that the code are effective without needing to rewrite the same code all over again throughout each java file.

## License

The source code has been published on GitHub Repository under  _MIT License_.  
Please visit  `LICENSE`  file to read the details about the license.

## About the project
**Language**
- Java

**Toolkit**
- Java Swing GUI

**IDE**
- Netbeans 12 IDE

**Dependencies & Libraries**
- MySQL Connector 5.1.18
- JDK 17

## 1. Module

**This project consists of two (2) modules.**
Module 1: User Management
Module 2: Product Management

![enter image description here](https://raw.githubusercontent.com/iamashraff/ElectronicStoreInventoryManagementSystemMVC/main/img/Module.png)

Below is the summary of these two module:
**Module 1: User Management**
- Handle authorization of staff and admin login.
- Require staff and admin to input login details.
- Identify the login roles are either staff or admin.
- Admin can add, edit, view and delete staff and their login details.
- Admin can search by specific staff ID.

**Module 2: Product Management**
- Add, edit, delete, view and search product.
- Staff can add product by selecting product category, type and all related details.
- Staff can delete existing product.
- Staff can edit and save product details changes.
- Staff can search specific product.
- Staff can view list of products in the main menu interface.


## 2. Use Case

![enter image description here](https://raw.githubusercontent.com/iamashraff/ElectronicStoreInventoryManagementSystemMVC/main/img/Use%20Case.jpg)



## 3. System Flow
![enter image description here](https://raw.githubusercontent.com/iamashraff/ElectronicStoreInventoryManagementSystemMVC/main/img/Flowchart.png)


## 4. Interface Description

**4.1 This project uses MVC architecture (Model, View, Controller).**<br>
User Interface (UI) is a View. In the View, the user input data or value which the value will be going through Controller. The Controller should send the value to the model. However, if the value in Model is not valid, an error message will be generated. Otherwise, the Model will send an output to the Controller. Finally, Controller will display the result to View so that the user could view the results.  For both module 1 and module 2, we group each classes in packages named Model, View, and Controller so that we can identify their function.

**4.2 This project uses CRUD function**<br>
CRUD refer to four functions which are Create, Read, Update and Delete which are to implement a persistent storage known as storage. For this project we refer the storage as database. The type of database that we are using relational databases and the application is MySQL.  All the data of users and products will be stored in the database and reused to view in the application for data manipulation.

## 5. User Interface (UI)

**5.1 Module 1: User Management**

5.1.1 Login

![enter image description here](https://raw.githubusercontent.com/iamashraff/ElectronicStoreInventoryManagementSystemMVC/main/img/Login.png)


5.1.2 View Users

![enter image description here](https://raw.githubusercontent.com/iamashraff/ElectronicStoreInventoryManagementSystemMVC/main/img/View_Users.png)


5.1.3 Add User

![enter image description here](https://raw.githubusercontent.com/iamashraff/ElectronicStoreInventoryManagementSystemMVC/main/img/Add_User.png)


5.1.4 Edit User

![enter image description here](https://raw.githubusercontent.com/iamashraff/ElectronicStoreInventoryManagementSystemMVC/main/img/Edit_User.png)


5.1.5 Delete User

![enter image description here](https://raw.githubusercontent.com/iamashraff/ElectronicStoreInventoryManagementSystemMVC/main/img/Delete_User.png)

<hr>

**5.2 Module 2: Product Management**

5.2.1 View Product

![enter image description here](https://raw.githubusercontent.com/iamashraff/ElectronicStoreInventoryManagementSystemMVC/main/img/View_Product.png)


5.2.2 Add Product

![enter image description here](https://raw.githubusercontent.com/iamashraff/ElectronicStoreInventoryManagementSystemMVC/main/img/Add_Product.png)


5.2.3 Edit Product

![enter image description here](https://raw.githubusercontent.com/iamashraff/ElectronicStoreInventoryManagementSystemMVC/main/img/Edit_Product.png)


5.2.4 Delete Product

![enter image description here](https://raw.githubusercontent.com/iamashraff/ElectronicStoreInventoryManagementSystemMVC/main/img/Delete_Product.png)

## 6. Design Patterns

6.1 Singleton<br>
- The Singleton design pattern has been implemented in **Module 1: User Management.** <br>
- It is to ensure that `User` class only has one instance. <br>
- We only create object once and then we can reuse the same object throughout our application without having need to instantiate multiple times.<br>

![enter image description here](https://raw.githubusercontent.com/iamashraff/Electronic-Store-Inventory-Management-System/main/img/Singleton1.jpg)

![enter image description here](https://raw.githubusercontent.com/iamashraff/Electronic-Store-Inventory-Management-System/main/img/Singleton2.jpg)

![enter image description here](https://raw.githubusercontent.com/iamashraff/Electronic-Store-Inventory-Management-System/main/img/Singleton3.jpg)

6.2 Builder<br>
- The Builder design pattern has been implemented in **Module 2: Product Management.** <br>

![enter image description here](https://raw.githubusercontent.com/iamashraff/Electronic-Store-Inventory-Management-System/main/img/Builder1.jpg)

- A computer may have many data field. To create an instance of computer class we have to use a constructor. However, sometimes we may not need to fill or passing all the information to the constructor. <br>
- We could create multiple overloaded constructor. However, the problem will lead to unnecessary constructor in the code.<br>

![enter image description here](https://raw.githubusercontent.com/iamashraff/Electronic-Store-Inventory-Management-System/main/img/Builder2.jpg)

- Builder patterns allow us to extract object code of its own class and move to it to separate objects called builder.<br>
- So, we add another class called `ComputerBuilder`.<br>

![enter image description here](https://raw.githubusercontent.com/iamashraff/Electronic-Store-Inventory-Management-System/main/img/Builder3.jpg)

![enter image description here](https://raw.githubusercontent.com/iamashraff/Electronic-Store-Inventory-Management-System/main/img/Builder4.jpg)


## Credit

**Developed by :**  
_Muhamad Ashraff Othman_  
© 2022 All rights reserved.
