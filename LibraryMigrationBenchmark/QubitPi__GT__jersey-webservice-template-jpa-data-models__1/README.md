Jersey Webservice Template JPA Data Models Example
==================================================

![Java Version Badge][Java Version Badge]
[![Javadoc][Javadoc Badge]][Javadoc URL]
[![Maven Central Version][Maven Central Version Badge]][Maven Central Version URL]
[![GitHub Workflow Status][GitHub Workflow Status]][GitHub Workflow Status URL]
[![Apache License][Apache License Badge]][Apache License, Version 2.0]

This project serves as an example of how to define JPA Data Model for JWT such as its
[Elide-based implementation][JPA Elide]; there also comes with a production-ready [test framework] to make sure the
model compiles with business requirements.

Its CI/CD, as part of this template, will trigger the CI/CD of [test framework] as well to make them a standard
pipeline. See [Jersey Webservice Template documentation][JWT CI/CD chain] on how to configure.

To install the data models locally, run:

> [!TIP]
>
> The local version will always be `1.0-SNAPSHOT` under
> `~/.m2/repository/io/github/qubitpi/jersey-webservice-template-jpa-data-models/`

```console
mvn clean install
```

The models in this example has also been published to [Maven Central][Maven Central Version URL] and can be imported
by specifying a semantic version

```xml
<dependency>
    <groupId>io.github.qubitpi</groupId>
    <artifactId>jersey-webservice-template-jpa-data-models</artifactId>
    <version>x.y.z</version>
    <scope>test</scope>
</dependency>
```

More information about the model can be found in [Javadoc page][Javadoc URL] <img src="https://github.com/QubitPi/QubitPi/blob/master/img/please-read-the-doc.png?raw=true" width="70px" />

License
-------

The use and distribution terms for [jersey-webservice-template-jpa-data-models] are covered by the
[Apache License, Version 2.0].

<div align="center">
    <a href="https://opensource.org/licenses">
        <img align="center" width="50%" alt="License Illustration" src="https://github.com/QubitPi/QubitPi/blob/master/img/apache-2.png?raw=true">
    </a>
</div>

[Apache License Badge]: https://img.shields.io/badge/Apache%202.0-F25910.svg?style=for-the-badge&logo=Apache&logoColor=white
[Apache License, Version 2.0]: https://www.apache.org/licenses/LICENSE-2.0

[GitHub Workflow Status]: https://img.shields.io/github/actions/workflow/status/QubitPi/jersey-webservice-template-jpa-data-models/ci-cd.yml?branch=master&logo=github&style=for-the-badge
[GitHub Workflow Status URL]: https://github.com/QubitPi/jersey-webservice-template-jpa-data-models/actions/workflows/ci-cd.yml

[Javadoc Badge]: https://img.shields.io/badge/Javadoc-000000.svg?style=for-the-badge&logo=openjdk&logoColor=white
[Javadoc URL]: http://jpa-model.qubitpi.org/
[Java Version Badge]: https://img.shields.io/badge/Java-17-brightgreen?style=for-the-badge&logo=OpenJDK&logoColor=white
[jersey-webservice-template-jpa-data-models]: https://github.com/QubitPi/jersey-webservice-template-jpa-data-models
[JPA Elide]: https://qubitpi.github.io/jersey-webservice-template/docs/crud/elide/data-model
[JWT CI/CD chain]: https://qubitpi.github.io/jersey-webservice-template/docs/crud/configuration#cicd-chain

[Maven Central Version Badge]: https://img.shields.io/maven-central/v/io.github.qubitpi/jersey-webservice-template-jpa-data-models?style=for-the-badge&logo=apachemaven&labelColor=1B1C30&color=4D9FEA
[Maven Central Version URL]: https://central.sonatype.com/artifact/io.github.qubitpi/jersey-webservice-template-jpa-data-models

[test framework]: https://github.com/QubitPi/jersey-webservice-template-jpa-data-models-acceptance-tests
