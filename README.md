### Lombok Mapstruct and Kapt

Try to have both lombok and kapt in the same project.
So that we can use lombok in java code and kapt in kotlin code.
But it seems to be impossible to have both in the same project.

It means that we cannot gradually migrate from java to kotlin.

```shell
./gradlew clean build -xtest
```

```shell
./gradlew clean build
```

