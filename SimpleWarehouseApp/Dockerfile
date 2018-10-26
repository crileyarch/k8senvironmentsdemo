FROM java:openjdk-8-jdk

RUN groupadd -g 999 appuser && \
    useradd -r -u 999 -g appuser appuser
USER appuser

VOLUME /home/appuser
ADD target/SimpleWarehouseApp-0.1.0.jar /home/appuser/app.jar
RUN bash -c 'touch /home/appuser/app.jar'
EXPOSE 8080

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/home/appuser/app.jar"]