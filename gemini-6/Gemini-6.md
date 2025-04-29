
# Science Plan Portal

This project is a Science Plan Portal application. Follow the steps below to get it up and running.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

* Java Development Kit (JDK) 17

* Gradle build tool (usually included with the project wrapper `./gradlew`)


### Cloning the Repository

First, clone the repository to your local machine using the following command:

```
git clone https://github.com/ICT-Mahidol/2024-ITCS431-Gemini6.git
```

Navigate into the cloned project directory:

```
cd 2024-ITCS431-Gemini6/gemini-6/implementations
```

### Building the Project

Use the Gradle wrapper included in the project to build the application. This will download dependencies and compile the code.

```
run build.gradle
```


### Running the Application

After a successful build, you can run the main application class. The entry point is typically the `DemoApplication` class located in the specified path.


```
Gemini6/src/main/java/com/example/demo/DemoApplication.java
```

The application should start, and you will see logs indicating that it's running, usually on port 8080.

## Accessing the Application

Once the application is running, open your web browser and navigate to the following address:

```
http://localhost:8080/login
```

You will see the login page.

![Screenshot 2025-04-29 224632](https://github.com/user-attachments/assets/75af7b3a-e978-43bf-8d8f-19af511fe5f9)


Login to the application using one of the following test accounts:

* **Account 1:**
    * **Username:** `asty`
    * **Password:** `asty123`

* **Account 2:**
    * **Username:** `johnny walker`
    * **Password:** `john`

After successfully logging in, you will be directed to the application's home page.

![Screenshot 2025-04-29 225544](https://github.com/user-attachments/assets/90ee465f-e8db-44a7-bac6-cb17e1b30ec7)

Features
Once logged in, you will find the following options in the navigation bar:

Create Plan
Click on Create Plan to begin adding a new plan. Fill in the necessary fields, and submit the form.
![Screenshot 2025-04-29 225814](https://github.com/user-attachments/assets/8e5de233-b874-4a62-bfb5-b083c6920efa)


Test Plan
Once a plan is created, you can test it by selecting Test Plan from the navigation bar. This will initiate the testing of the selected plan.
![Screenshot 2025-04-29 225839](https://github.com/user-attachments/assets/60ab88d7-d999-4c46-9a3e-1a2cdf52941c)


Submit Plan
After testing, you can submit the plan for approval.

Here’s an example of the Test Result:
![Screenshot 2025-04-29 230259](https://github.com/user-attachments/assets/20aca4a5-b6d8-4b7a-a941-ecb45ced25b8)

make adjustment follow the Test Result [hint for JaneDuun:start month should be January, and end month should be December, the contrast should be numbers between 1-5]

If the test is approved, you will see a message similar to this:
![Screenshot 2025-04-29 230444](https://github.com/user-attachments/assets/04eeeee0-172b-4c5e-aa8a-8b6df4c79ede)

Once submitted, the plan’s status will be updated, and you’ll see it in the plans list with the new status:
![Screenshot 2025-04-29 230556](https://github.com/user-attachments/assets/bfd7502d-e8bf-405b-b68b-66da5caefe28)





