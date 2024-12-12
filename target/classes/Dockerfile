FROM openjdk:17-jdk-slim

# 设置工作目录
WORKDIR /app

# 复制JAR文件
COPY target/hospital-1.0-SNAPSHOT.jar /app/hospital-1.0-SNAPSHOT.jar

# 设置环境变量，例如这里设置Spring Boot应用的运行端口为8081，可按需修改
ENV SERVER_PORT=8088

# 启动命令中可以使用设置的环境变量来指定端口启动应用
ENTRYPOINT ["java", "-Dserver.port=${SERVER_PORT}", "-jar", "/app/hospital-1.0-SNAPSHOT.jar"]

# 容器暴露的端口，要与应用实际监听的端口（通过环境变量设置的端口）一致
EXPOSE 8088