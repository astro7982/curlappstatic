FROM openjdk:8-jre-alpine3.9
COPY target/curlapp-1.1-SNAPSHOT.jar /curlapp-1.1-SNAPSHOT.jar
COPY splunk-otel-javaagent.jar /splunk-otel-javaagent.jar
COPY run.sh /run.sh
ENTRYPOINT ["sh", "/run.sh"]
CMD ["/bin/bash"]