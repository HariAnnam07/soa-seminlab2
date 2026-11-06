TOURIST MICROSERVICE - EUREKA + API GATEWAY LOAD BALANCING
Requirements: JDK 17, Apache Maven 3.8+, internet for first dependency download.

1) Open Command Prompt in this folder and run:
   mvn clean install

2) Open FOUR separate Command Prompt windows in this folder.

Window 1:
   cd eureka-server
   mvn spring-boot:run

Window 2:
   cd tourist-service
   mvn spring-boot:run

Window 3 (start a second instance):
   cd tourist-service
   mvn spring-boot:run

Window 4:
   cd api-gateway
   mvn spring-boot:run

Wait 30-60 seconds. Open http://localhost:8761 and confirm TOURIST-SERVICE
has TWO registered instances.

Test in browser:
   http://localhost:8080/tourist-service/tourists

Refresh several times. The response should show different dynamically
assigned ports, demonstrating load balancing.

Notes:
- Start Eureka before the other applications.
- Check installation with: java -version and mvn -version
- First run needs internet to download Maven dependencies.
- If only one service instance appears, ensure you started it in two
  separate Command Prompt windows.
