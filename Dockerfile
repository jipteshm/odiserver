FROM java:8
LABEL maintainer=“jiptesh@gmail.com”
EXPOSE 8761
ADD target/odiserver.jar odiserver.jar
ENTRYPOINT ["java","-jar","odiserver.jar"]