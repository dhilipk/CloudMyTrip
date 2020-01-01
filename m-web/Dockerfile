FROM openjdk:8-jdk-alpine
VOLUME [ "/tmp" ]
ARG DEPENDENCY=target/dependency
COPY ${DEPENDENCY}/META-INF /app/META-INF
COPY ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY ${DEPENDENCY}/BOOT-INF/classes app/
ENTRYPOINT [ "java", "-cp", "/app/lib/*", "com.oscar.mytrip.web.mweb.WebApplication" ]
