# Benchmark

This repository contains the evaluation benchmarks for the paper **"FerryMan: LLM-Driven Library Migration via API Mapping"**. It accompanies the [FerryMan-Library-Migration](https://github.com/ferryman-oss/FerryMan-Library-Migration) repository, which provides the FerryMan implementation and its installation and execution instructions.

This repository includes two main benchmarks:

## 1. API Mapping Benchmark
- **File**: `ApiMappingBenchmark.json`
- **Description**: Ground-truth mappings used to evaluate API mapping in the paper, comprising 945 mappings (894 one-to-one and 51 one-to-many).

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
