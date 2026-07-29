# 🏏 IPL Cricbuzz Management System

A Java-based console application developed to manage IPL player records using **Hibernate ORM** and **MySQL**. The application follows a layered architecture and is being developed collaboratively using **Git** and **GitHub** by following professional software development practices.

---

## 📖 Project Description

IPL Cricbuzz Management System is designed to perform player management operations through a simple console-based interface.

The project demonstrates the implementation of Java Full Stack concepts including Hibernate ORM, MySQL database connectivity, Maven project management, and collaborative development using Git and GitHub.

---

## 🚀 Technology Stack

| Technology | Purpose |
|------------|---------|
| Java | Programming Language |
| Hibernate ORM | Database Mapping |
| MySQL | Database |
| Maven | Dependency Management |
| Git | Version Control |
| GitHub | Team Collaboration |
| Eclipse IDE | Development Environment |

---

## 📂 Project Structure

```text
batch433_IPL_crickbuzz_repo
│
├── src
│   ├── main
│   │   ├── java
│   │   │
│   │   ├── client
│   │   ├── controller
│   │   ├── dao
│   │   ├── entity
│   │   ├── service
│   │   └── utility
│   │
│   └── resources
│       └── hibernate.cfg.xml
│
├── pom.xml
└── README.md
```

---

## 🏗️ Application Architecture

```text
                User
                  │
                  ▼
           Client Layer
                  │
                  ▼
        Controller Layer
                  │
                  ▼
          Service Layer
                  │
                  ▼
             DAO Layer
                  │
                  ▼
          Hibernate ORM
                  │
                  ▼
           MySQL Database
```

---

## ✨ Available Operations

The application supports the following player management operations:

- Insert Player
- Update Player
- Delete Player
- Get Player By ID
- Get All Players
- Get Players By Team
- Get All Batsmen
- Get All Bowlers
- Get All All-Rounders
- Search Player By Name

---

## 💾 Database

Database Management System

```
MySQL
```

ORM Framework

```
Hibernate ORM
```

Configuration File

```
hibernate.cfg.xml
```

---

## ⚙️ Getting Started

### Clone Repository

```bash
git clone https://github.com/jbkatul/batch433_IPL_crickbuzz_repo.git
```

### Open Project

Import the project as an **Existing Maven Project** into Eclipse IDE.

### Configure Database

Update the database configuration inside:

```
src/main/resources/hibernate.cfg.xml
```

### Update Maven

```
Maven → Update Project
```

### Run Application

Execute the Client class to start the application.

---

## 🌿 Git Collaboration Workflow

This project follows a Feature Branch Workflow.

Development Process:

1. Clone Repository
2. Create Feature Branch
3. Implement Assigned Task
4. Commit Changes
5. Push Feature Branch
6. Create Pull Request
7. Code Review
8. Merge into Main Branch

---

## 📌 Coding Guidelines

- Follow Java Naming Conventions.
- Write clean and readable code.
- Keep methods simple and reusable.
- Use meaningful commit messages.
- Create Pull Requests for every feature.

---

## 🤝 Team Collaboration

This project is developed collaboratively.

Each contributor works independently on a separate feature branch and submits changes through Pull Requests before merging into the main branch.

---

## 👨‍💻 Developed For

**The Kiran Academy**

Java Full Stack Development Program

---

## 📄 License

This project is developed for learning and educational purposes only.

---

## ⭐ Thank You

Thank you for visiting this repository.

Happy Coding! 🚀