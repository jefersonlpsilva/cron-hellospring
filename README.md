mvn clean package spring-boot:repackage
java -jar target/hellospring-0.0.1-SNAPSHOT.jar --spring.profiles.active=prod
