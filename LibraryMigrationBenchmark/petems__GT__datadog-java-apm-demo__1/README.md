# datadog-java-apm-demo

Docker Hub: https://hub.docker.com/r/petems/datadog-java-apm-demo

* Forked from https://github.com/nilushancosta/datadog-java-apm-demo
* Adding support for AMD64 and ARM64 images and adding curl to image for easier triggering of traces
* Building and pushing automatically with Github actions

## Building 

```
docker buildx build .   --platform linux/arm64,linux/amd64   --tag petems/datadog-java-apm-demo:latest   --push
```

## Running locally

```
docker run --publish 8080:8080 $(docker build -q .)
```

# Future Plans

* Improve logs (move to log4j)