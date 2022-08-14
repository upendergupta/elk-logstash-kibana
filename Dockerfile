FROM openjdk:8
EXPOSE 8080
AND target/docker-build-push-bygit.jar
ENTRYPOINT ["java","-jar","docker-build-push-bygit.jar"]