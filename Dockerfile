FROM tomcat:jre8

ARG nxhost
ARG version

ENV CATALINA_HOME /usr/local/tomcat

WORKDIR $CATALINA_HOME/webapps

RUN curl -o test.war "http://${nxhost}:8081/nexus/content/repositories/test/${version}/test.war"

EXPOSE 8080
