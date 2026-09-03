# Benchmark

This repository includes two main benchmarks:

## 1. API Mapping Benchmark
- **File**: `ApiMappingBenchmark.json`
- **Description**: This file serves as the benchmark for API Mapping tasks.

## 2. Library Migration Benchmark
- **Folder**: `LibraryMigrationBenchmark/`
- **Description**: This directory contains 124 project folders, all in their pre-migration state.
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
