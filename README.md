API Automation Framework – REST Assured

This repository contains a Java-based API Automation Framework built using REST Assured, TestNG, and Maven.
It is designed to test RESTful APIs with a clean, scalable, and maintainable structure.

🔧 Tech Stack

Java (JDK 11+)

REST Assured – API testing

TestNG – Test execution & assertions

Maven – Build & dependency management

Jackson / Gson – Serialization & deserialization

Log4j2 – Logging

Extent Reports – Test reporting

📁 Project Structure
API_Automation_RestAssured
│
├── src
│   └── test
│       ├── java
│       │   ├── api.endpoints      # API endpoint URLs
│       │   ├── api.payload        # POJO classes
│       │   ├── api.test           # Test classes
│       │   └── api.utilities      # Utilities (DataProvider, Excel, etc.)
│       └── resources
│           ├── log4j2.xml
│           └── testng.xml
│
├── pom.xml
├── config.properties
├── README.md
└── .gitignore

🚀 Features

CRUD operations testing (GET, POST, PUT, DELETE)

Data-driven testing using TestNG DataProvider

POJO-based request & response handling

Centralized endpoint management

Detailed logging using Log4j2

Extent HTML test reports

Maven lifecycle support

▶️ How to Run Tests
1️⃣ Prerequisites

Java installed (java -version)

Maven installed (mvn -version)

IDE (IntelliJ / Eclipse)

2️⃣ Run via Maven
mvn clean test

3️⃣ Run via TestNG

Open testng.xml

Right-click → Run

📊 Reports

After execution:

Extent Report → /reports/

TestNG Report → /test-output/

(These folders should be ignored in Git)

🧪 Sample API Tested

Example: Swagger Petstore

https://petstore.swagger.io/v2

⚙️ Configuration

Update environment values in:

config.properties


Example:

base.url=https://petstore.swagger.io/v2

🧹 Best Practices Followed

No hard-coded test data

Separation of concerns

Reusable utilities

Clean Git history

Maven-friendly structure

🔮 Future Enhancements

CI integration (GitHub Actions / Jenkins)

Parallel execution

Schema validation

OAuth / Token-based auth

Docker support

👤 Author

Sanjeev Prasad
API Automation | REST Assured | Java | TestNG

📜 License

This project is licensed under the Apache 2.0 License.
