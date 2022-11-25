# Gradle 多模組專案
* api 專案為另外建的 spring boot 專案放入
* domain 專案為 IntelliJ 生成的 Module (gradle)，加上插件 mockito、lombok

#### 測試 api 專案
```bash
.\gradlew api:build
.\gradlew api:bootRun
```
