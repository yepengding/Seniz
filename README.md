# Seniz

Seniz is a framework for Formalism-Driven Development (FDD). This repository holds a sample implementation.

## Usage

### Standalone

```
usage: java -jar Seniz.jar [options] <source>
 -h,--help               print help.
 -n,--name <namespace>   Java root namespace.
 -o,--output <path>      output directory path.
 -v,--version            print current version.
```

Generate from a single source file

```shell
java -jar Seniz.jar -n org.veritasopher.seniz.generation example/Simple0.sz
```

Generate from a source directory

```shell
java -jar Seniz.jar -n org.veritasopher.seniz.generation example/Semaphore
```

### Library

1. Include `Seniz.jar` into a project
2. Initialize a set of source file paths

```java
String path="path_to_source";
        Set<String> sourceFilePaths=new HashSet<>();
// Parse Seniz source file paths into sourceFilePaths
```

3. Build global environment

```java
MasterController masterController=new MasterController();
        GlobalEnvironment env=masterController.compile(sourceFilePaths);
```

4. Generate Java programs

```java
JavaGenerator javaGenerator=new JavaGenerator(env);
        javaGenerator.generateToDir("namespace","output_path");
```

## Build

### Environment

- Java 17

## Compile

```
mvn clean compile assembly:single
```

## Related Project

- [Seniz GUI](https://github.com/yepengding/Seniz-GUI): a graphical interface for Seniz
- [Seniz Web](https://github.com/yepengding/Seniz-Web): web service to support Seniz GUI

## Reference

> Ding, Y., & Sato, H. (2022). Formalism-Driven Development: Concepts, Taxonomy, and Practice. Applied Sciences, 12(7), 3415.
> [MDPI](https://www.mdpi.com/2076-3417/12/7/3415)

---
This open-source project under [MIT License](https://github.com/yepengding/Seniz/blob/main/LICENSE) is only for
educational purposes.
