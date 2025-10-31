# springboot-demo-starter

一个基于 Spring Boot 的入门示例项目，演示 Spring Boot + Spring Data JPA + Thymeleaf + MySQL 的基本整合与运行方式。适合作为初学者练手项目。

## 主要功能
- Spring Boot 启动器配置
- Spring Data JPA 与 MySQL 集成（runtime: mysql-connector）
- 前端模板：Thymeleaf
- 简单的 CRUD 示例（可自行扩展）

## 运行前提
- JDK 8
- Maven
- 本地或远程 MySQL 数据库

## 快速开始
1. 克隆仓库：
   git clone https://github.com/<your-username>/springboot-demo-starter.git

2. 配置数据库（application.properties 或 application.yml）：
   spring.datasource.url=jdbc:mysql://localhost:3306/your_db?useSSL=false&serverTimezone=UTC
   spring.datasource.username=your_user
   spring.datasource.password=your_password
   spring.jpa.hibernate.ddl-auto=update

3. 使用 Maven 构建并运行：
   mvn spring-boot:run

## 项目结构（简述）
- src/main/java - 应用源码（Controller / Service / Repository / Entity）
- src/main/resources/templates - Thymeleaf 模板
- src/main/resources/application.properties - 配置文件
- pom.xml - 依赖与构建配置

## 推荐 GitHub Topics（标签）
spring-boot, spring-data-jpa, thymeleaf, mysql, java, beginner, demo

## 许可证
MIT（可根据需要替换为其他许可证）
<img width="2559" height="1371" alt="屏幕截图 2025-10-31 131736" src="https://github.com/user-attachments/assets/446c4031-16b6-4775-9be9-43716b079d40" />
<img width="2559" height="1377" alt="屏幕截图 2025-10-31 131748" src="https://github.com/user-attachments/assets/b9e58845-39ae-447f-8231-496420a4c3d5" />
<img width="2559" height="1377" alt="屏幕截图 2025-10-31 131757" src="https://github.com/user-attachments/assets/55081dc3-a556-495e-b1b3-3bfc7ef3fb5d" />

