FROM tomcat:8.5.57-jdk11-openjdk

MAINTAINER sezayir dagtekin "sezayir99@gmail.com"

WORKDIR /usr/local/tomcat/webapps

EXPOSE 8080 
RUN rm -rf ./webapps/*

COPY maven/*.war .

ENV JAVA_OPTS="-Dspring.profiles.active=dev"

# Add docker-compose-wait tool -------------------
ENV WAIT_VERSION 2.7.2
ADD https://github.com/ufoscout/docker-compose-wait/releases/download/$WAIT_VERSION/wait /wait
RUN chmod +x /wait


CMD ["catalina.sh", "run"]