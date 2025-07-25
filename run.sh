#!/bin/zsh
echo "🚀 Starting Spring Boot application..."

JAR_FILE="d4m.acc.microservice/build/libs/d4m.acc.microservice-0.0.1.jar"
SPRING_PROFILES_ACTIVE=default
JAVA_OPTS=(-Xms512m -Xmx1024m)

java "${JAVA_OPTS[@]}" -jar "$JAR_FILE" --spring.profiles.active=$SPRING_PROFILES_ACTIVE || {
  echo "❌ Failed to start the application."
  exit 1
}

echo "✅ Application started."

