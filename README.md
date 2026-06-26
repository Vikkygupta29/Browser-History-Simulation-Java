# 🌐 Browser History Simulation in Java

A Java console-based project that simulates browser history using **three different data structure approaches**.

The goal of this project is to understand how different data structures solve the same problem and compare their advantages, disadvantages, and implementation complexity.

---

## 📌 Project Overview

This repository contains three implementations of a Browser History Simulation:

1. **LinkedList + ListIterator**
2. **ArrayList + Current Index**
3. **Two Stacks**

Each implementation supports:

- ✅ Visit a new page
- ✅ Go Back
- ✅ Go Forward
- ✅ Show Current Page
- ✅ Remove forward history after visiting a new page

---

## 📂 Repository Structure

```
Browser-History-Simulation-Java
│
├── BrowserHistory-ListIterator
│
├── BrowserHistory-ArrayList
│
├── BrowserHistory-TwoStacks
│
└── README.md
```

---

## 🚀 Implementations

### 1️⃣ BrowserHistory-ListIterator

**Data Structure Used**
- LinkedList
- ListIterator

**Concepts Learned**
- Bidirectional traversal
- Iterator operations
- Adding and removing elements
- Understanding iterator cursor positions

---

### 2️⃣ BrowserHistory-ArrayList

**Data Structure Used**
- ArrayList
- Current Index

**Concepts Learned**
- Index-based navigation
- Managing browser history using an index
- Removing forward history efficiently

---

### 3️⃣ BrowserHistory-TwoStacks

**Data Structure Used**
- Stack

**Concepts Learned**
- LIFO (Last In, First Out)
- Back navigation
- Forward navigation
- Real-world browser history logic

---

## 📊 Comparison

| Approach | Data Structure | Advantages | Limitation |
|-----------|----------------|------------|------------|
| LinkedList + ListIterator | LinkedList | Great for learning Java Collections and iterators | Cursor management is more complex |
| ArrayList + Current Index | ArrayList | Simple and easy to understand | Requires index management |
| Two Stacks | Stack | Closely models browser navigation | Uses two separate stacks |

---

## 🛠 Technologies Used

- Java
- Java Collections Framework
- LinkedList
- ArrayList
- Stack
- ListIterator
- Scanner
- Object-Oriented Programming (OOP)

---

## ▶️ How to Run

1. Clone this repository.

```bash
git clone https://github.com/Vikkygupta29/Browser-History-Simulation-Java.git
```

2. Open any of the three projects in IntelliJ IDEA or Eclipse.

3. Run the `BrowserHistory.java` file.

4. Follow the console menu.

---

## 📚 Learning Outcomes

This project helped me understand:

- Java Collections Framework
- LinkedList and ListIterator
- ArrayList
- Stack
- Iterator navigation
- Data structure selection
- Comparing multiple solutions for the same problem

---

## 🔮 Future Enhancements

### 📁 Java + File Storage
- Save browser history to a local file.
- Load browser history automatically when the application starts.
- Preserve browsing history even after the application is closed.

### 🌐 React + Spring Boot + MySQL
- Build a React-based user interface.
- Develop REST APIs using Spring Boot.
- Store browser history in a MySQL database.
- Display browser history in a modern web dashboard.
- Add search and filtering for visited pages.

---

## 👨‍💻 Author

**Vikky Kumar Gupta**

B.Tech Student | Aspiring Software Engineer | Java & DSA Learner

If you found this project useful, feel free to ⭐ the repository.
