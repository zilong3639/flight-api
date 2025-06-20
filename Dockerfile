

FROM eclipse-temurin:19-jre

WORKDIR /app

COPY target/*.jar /app/app.jar


EXPOSE 8080


CMD ["java", "-jar", "app.jar"]
