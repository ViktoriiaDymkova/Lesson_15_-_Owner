1. Для локального запуска на chrome:
```
./gradlew clean test --tests WebTest -Dconfig-test=CHROME
```


2. Для удаленного запуска на selenoid:
```
 ./gradlew clean test --tests WebTest -Dconfig-test=selenoid
```
