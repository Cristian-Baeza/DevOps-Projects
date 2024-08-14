FROM amazoncorretto:8-alpine3.17-jre

EXPOSE 8080

COPY ./target/java-maven-app-*.jar /usr/app/
WORKDIR /usr/app

#executed as strings not shell command so need to change how we run it to CMD
#ENTRYPOINT ["java", "-jar", "java-maven-app-1.0-SNAPSHOT.jar"]

#executed as shell command
CMD java -jar -java-maven-app-*.jar
