FROM tomcat:8.5.57-jdk11-openjdk

MAINTAINER sezayir dagtekin "sezayir99@gmail.com"

WORKDIR /usr/local/tomcat/webapps

EXPOSE 8080 
RUN rm -rf ./webapps/*

COPY maven/*.war .

ENV JAVA_OPTS="-Dspring.profiles.active=dev"



CMD ["catalina.sh", "run"]