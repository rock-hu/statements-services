FROM dragonwell-registry.cn-hangzhou.cr.aliyuncs.com/dragonwell/dragonwell:17
# RUN addgroup -S spring && adduser -S spring -G spring
# USER spring:spring
ADD ./target/statements-services.jar statements-services.jar
ENTRYPOINT ["java","-jar","/statements-services.jar"]
