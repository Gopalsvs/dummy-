FROM openjdk:8
MAINTAINER gopalsvs uiqwerty726@gmail.com
COPY ./target/SciCal-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-cp", "SciCal-1.0-SNAPSHOT-jar-with-dependencies.jar", "SciCal.My_Main"]
