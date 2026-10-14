# Benchmark

This repository contains the evaluation benchmarks for the paper **"FerryMan: LLM-Driven Library Migration via API Mapping"**. It accompanies the [FerryMan-Library-Migration](https://github.com/ferryman-oss/FerryMan-Library-Migration) repository, which provides the FerryMan implementation and its installation and execution instructions.

This repository includes two main benchmarks:

## 1. API Mapping Benchmark
- **File**: `ApiMappingBenchmark.json`
- **Description**: Ground-truth mappings used to evaluate API mapping in the paper, comprising 945 mappings (894 one-to-one and 51 one-to-many).

### One-to-many mapping results by library pair

The 51 one-to-many mappings are grouped into 23 library pairs using the source and target APIs' library coordinates, ignoring versions. These groups describe API mappings rather than whole-project migration types. The table compares FerryMan with KGE4AR, the strongest API mapping baseline in the paper. A mapping counts as a hit at `Hit@5` only if **all required target APIs** appear among the top five recommendations. Results are reported as **hits/number of mappings (percentage)**.

| Source library (`groupId:artifactId`) | Target library (`groupId:artifactId`) | #Mappings | KGE4AR Hit@5 | FerryMan Hit@5 |
|---|---|---:|---:|---:|
| `org.junit.jupiter:junit-jupiter-api` | `org.assertj:assertj-core` | 13 | 3/13 (23.1%) | 8/13 (61.5%) |
| `com.github.f4b6a3:uuid-creator` | `com.fasterxml.uuid:java-uuid-generator` | 3 | 0/3 (0.0%) | 2/3 (66.7%) |
| `log4j:log4j` | `ch.qos.logback:logback-core` | 3 | 0/3 (0.0%) | 3/3 (100.0%) |
| `org.eclipse.mylyn.github:org.eclipse.egit.github.core` | `org.kohsuke:github-api` | 3 | 0/3 (0.0%) | 1/3 (33.3%) |
| `org.json:json` | `com.google.code.gson:gson` | 3 | 1/3 (33.3%) | 2/3 (66.7%) |
| `com.google.code.gson:gson` | `com.fasterxml.jackson.core:jackson-databind` | 2 | 0/2 (0.0%) | 2/2 (100.0%) |
| `commons-httpclient:commons-httpclient` | `org.apache.httpcomponents:httpclient` | 2 | 0/2 (0.0%) | 1/2 (50.0%) |
| `commons-httpclient:commons-httpclient` | `org.apache.httpcomponents:httpcore` | 2 | 0/2 (0.0%) | 1/2 (50.0%) |
| `easymock:easymock` | `org.mockito:mockito-core` | 2 | 0/2 (0.0%) | 2/2 (100.0%) |
| `net.sf.flexjson:flexjson` | `com.google.code.gson:gson` | 2 | 1/2 (50.0%) | 1/2 (50.0%) |
| `org.ini4j:ini4j` | `org.apache.commons:commons-configuration2` | 2 | 0/2 (0.0%) | 1/2 (50.0%) |
| `org.iq80.snappy:snappy` | `io.airlift:aircompressor` | 2 | 0/2 (0.0%) | 0/2 (0.0%) |
| `org.jdom:jdom` | `org.dom4j:dom4j` | 2 | 0/2 (0.0%) | 2/2 (100.0%) |
| `com.amazonaws:aws-java-sdk-s3` | `software.amazon.awssdk:s3` | 1 | 0/1 (0.0%) | 0/1 (0.0%) |
| `com.beust:jcommander` | `info.picocli:picocli` | 1 | 0/1 (0.0%) | 1/1 (100.0%) |
| `com.itextpdf:html2pdf` | `org.xhtmlrenderer:flying-saucer-pdf` | 1 | 0/1 (0.0%) | 1/1 (100.0%) |
| `com.sparkjava:spark-core` | `io.javalin:javalin` | 1 | 0/1 (0.0%) | 0/1 (0.0%) |
| `gov.adlnet:jxapi` | `com.yetanalytics:xapi-tools` | 1 | 0/1 (0.0%) | 1/1 (100.0%) |
| `io.findify:s3mock_2.13` | `io.github.robothy:local-s3-rest` | 1 | 0/1 (0.0%) | 0/1 (0.0%) |
| `log4j:log4j` | `ch.qos.logback:logback-classic` | 1 | 0/1 (0.0%) | 1/1 (100.0%) |
| `org.hamcrest:hamcrest` | `org.assertj:assertj-core` | 1 | 0/1 (0.0%) | 1/1 (100.0%) |
| `org.seleniumhq.selenium:selenium-api` | `com.microsoft.playwright:playwright` | 1 | 0/1 (0.0%) | 1/1 (100.0%) |
| `org.seleniumhq.selenium:selenium-support` | `com.microsoft.playwright:playwright` | 1 | 0/1 (0.0%) | 0/1 (0.0%) |
| **Overall** | | **51** | **5/51 (9.8%)** | **32/51 (62.7%)** |

FerryMan achieves higher `Hit@5` in 17 library pairs and ties KGE4AR in the remaining six. Ten pairs contain only one mapping, so their rates should be interpreted alongside the sample counts.

## 2. Library Migration Benchmark
- **Folder**: `LibraryMigrationBenchmark/`
- **Description**: This directory contains 124 project folders, all in their pre-migration state, representing the project-level library migration samples evaluated in the paper. Each folder can be used as a client-project input to FerryMan; see the main repository's [How to Run](https://github.com/ferryman-oss/FerryMan-Library-Migration#how-to-run) section.
- **Project Structure**:
  - `.java-version`: Specifies the JDK version required for the project.
  - `__GT_info.json`: Contains details regarding the library migration for the project.

## 3. API Mapping Functional Tests
- **Folder**: `ApiMappingFunctionalTests/`
- **Description**: Executable functional tests that validate the 36 newly added one-to-many API mappings.
- **Structure**: 36 folders (`01_xxx` – `36_xxx`), each containing:
  - `before/`: the pre-migration implementation.
  - `after/`: the post-migration implementation.
  - `test/`: the functional test, run against both implementations.
  - `mapping.json`: the corresponding one-to-many API mapping.
