# 📦 Inventory Management System (Java)

![Java](https://img.shields.io/badge/Java-17+-blue)
![Application](https://img.shields.io/badge/Application-Console-green)
![Storage](https://img.shields.io/badge/Storage-File%20Serialization-orange)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen)

A simple and efficient **console-based Inventory Management System** built using Core Java.  
This project demonstrates Object-Oriented Programming (OOP), file handling, serialization, and basic inventory operations in a real-world scenario.

---

## 📌 Table of Contents

- [🚀 Features](#-features)
- [🛠️ Technologies Used](#️-technologies-used)
- [📂 Project Structure](#-project-structure)
- [📖 Project Overview](#-project-overview)
- [🖥️ Program Menu](#️-program-menu)
- [⚙️ How To Run](#️-how-to-run)
- [💡 Example Usage](#-example-usage)
- [🧠 Concepts Demonstrated](#-concepts-demonstrated)
- [📈 Future Improvements](#-future-improvements)
- [📜 License](#-license)

---

# 🚀 Features

- ✅ Add new products  
- 📋 Display all products  
- 🔍 Search product by ID  
- 💰 Calculate total inventory stock value  
- 💾 Persistent data storage using Java Serialization  
- 🖥️ User-friendly menu-driven console interface  

---

# 🛠️ Technologies Used

- Java (Core Java)
- Object-Oriented Programming (OOP)
- Java Collections Framework (`ArrayList`)
- File Handling
- Serialization (`ObjectOutputStream`, `ObjectInputStream`)
- Exception Handling

---

# 📂 Project Structure

```
InventoryManagementSystem.java
inventory.dat   (Auto-generated after first save)
```

---

# 📖 Project Overview

This Inventory Management System allows users to manage product records efficiently.  
All product data is stored persistently using Java serialization, ensuring that data remains saved even after the program exits.

---

## 🔹 Product Attributes

Each product contains:

- `id` → Unique product identifier  
- `name` → Product name  
- `quantity` → Available stock  
- `price` → Price per unit  

The total value of each product is calculated as:

```
Total Value = quantity × price
```

---

## 🔹 Data Persistence

The system:

- Saves inventory data into `inventory.dat`
- Loads saved data automatically when the program starts
- Creates a new inventory if the file does not exist

Implemented using:

```java
ObjectOutputStream
ObjectInputStream
Serializable
```

---

# 🖥️ Program Menu

When executed, the system displays:

```
===== Inventory Management System =====
1. Add Product
2. Display Products
3. Search Product by ID
4. Calculate Total Stock Value
5. Exit
```

---

# ⚙️ How To Run

## 1️⃣ Compile

```bash
javac InventoryManagementSystem.java
```

## 2️⃣ Run

```bash
java InventoryManagementSystem
```

> Make sure JDK 17 or above is installed.

---

# 💡 Example Usage

## ➤ Adding a Product

```
Enter Product ID: 101
Enter Product Name: Laptop
Enter Quantity: 5
Enter Price: 50000
Product added successfully!
```

## ➤ Searching for a Product

```
Enter Product ID to search: 101
Product Found:
ID: 101, Name: Laptop, Quantity: 5, Price: 50000.0
```

## ➤ Calculating Total Stock Value

```
Total Inventory Stock Value: 250000.0
```

---

# 🧠 Concepts Demonstrated

- Static Inner Classes  
- Encapsulation  
- File I/O Operations  
- Java Serialization  
- ArrayList Collection  
- Switch-Case Menu System  
- Looping Structures  
- Exception Handling  
- Persistent Storage Design  

---

# 📈 Future Improvements

- ✏️ Update product details  
- ❌ Delete product  
- 🔄 Modify stock quantity  
- 📊 Generate reports  
- 🗂️ Sort products by price or name  
- 🖼️ GUI version using JavaFX or Swing  
- 🗄️ Database integration (MySQL / PostgreSQL)  
- 🌐 Web-based version using Spring Boot  

---

# 📜 License

This project is open-source and free to use for educational purposes.

---

# 👨‍💻 Author

Developed as a Java practice project to demonstrate:

- Object-Oriented Programming  
- File Handling & Serialization  
- Real-world Inventory Management Logic  

---

⭐ If you found this project useful, consider giving it a star!
