FROM tomcat:8.5.57-jdk11-openjdk

WORKDIR /usr/local/tomcat/webapps

RUN rm -rf ./webapps/*

COPY ./target/*.war .

ENV JAVA_OPTS="-Dspring.profiles.active=dev"

EXPOSE 8080

CMD ["catalina.sh", "run"]