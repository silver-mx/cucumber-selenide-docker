FROM adoptopenjdk:11-jre-hotspot

RUN mkdir /opt/app

COPY build/libs/gs-securing-web-0.1.0.jar /opt/app

EXPOSE 8080

CMD ["java", "-jar", "/opt/app/gs-securing-web-0.1.0.jar"] 
