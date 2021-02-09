# Hello world with Java and docker

Just a simple program to test out Docker's multi-stage builds.

## Simple compile and run

```
docker run -ti -v "$PWD":/usr/src/app -w /usr/src/app openjdk:11 bash
```
