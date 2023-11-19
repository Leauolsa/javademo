FROM library/tomcat
WORKDIR /

RUN pwd

#FROM library/tomcat
USER root
WORKDIR /usr/local/tomcat/webapps/
COPY target/slpro-315.war /usr/local/tomcat/webapps/slpro.war
EXPOSE 8080
CMD ["catalina.sh", "run"]



# # Stage 1: Build the application
# FROM maven:3.8.5-openjdk-17 as builder
# WORKDIR /app
# COPY pom.xml .
# COPY src ./src
# RUN mvn clean package
# RUN ls -l /app/target

# # Stage 2: Create the runtime image
# # FROM openjdk:17.0.1-jdk-slim
# # WORKDIR /app
# # COPY --from=builder /app/target/my-app.jar ./my-app.jar
# EXPOSE 8080
# #CMD ["java", "-jar", "my-app.jar"]
# CMD ["sleep", "infinity"]