FROM java:openjdk-8-jdk

RUN groupadd -g 999 appuser && \
    useradd -r -u 999 -g appuser appuser
USER appuser

VOLUME /tmp
ADD target/SimpleWarehouseApp-0.1.0.jar app.jar
RUN bash -c 'touch /app.jar'
EXPOSE 8080

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]