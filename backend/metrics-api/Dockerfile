# === Stage 1: Build the app ===
FROM maven:3.9.6-eclipse-temurin-21 AS build
WORKDIR /app

# Copy only pom.xml first (for dependency caching)
COPY pom.xml .
RUN mvn dependency:go-offline -B

# Copy the source code and build the JAR
COPY src ./src
RUN mvn clean package -DskipTests -B


# === Stage 2: Run the app (minimal runtime) ===
FROM eclipse-temurin:21-jre-jammy
WORKDIR /app

# Copy the built JAR from the previous stage
COPY --from=build /app/target/*.jar app.jar

# Environment variables (from .env at runtime)
ENV MONGO_USER=""
ENV MONGO_PASS=""
ENV CLUSTER=""
ENV MONGO_DB=""

# Expose port
EXPOSE 8081

# Run the app
ENTRYPOINT ["java", "-jar", "app.jar"]
