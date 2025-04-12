### Run the Project

1. Clone the folder : Gemini6_D4_Login

2. Open the project

3. Go to src/main/resources/application.properties

4. Change the path at [REPLACE WITH ABSOLUTE PATH] to your path where the project was located on your computer.

5. Go to src/main/java/th/ac/mahidol/icy/gemini6

6. Run the project on "DemoApplication". The project will be run on localhost:8080

7. Add user to the database by using /localhost:8080/add?name=[name]&email=[email]
    e.g.name: Sarah, email: sarah@gmail.com => 
        http://localhost:8080/add?name=Sarah&email=sarah@gmail.com

9. Once added user, visit in browser:  http://localhost:8080/login

10. Try to login with the name and email added from 7.
    e.g. Username : Sarah
         Password : sarah@gmail.com
