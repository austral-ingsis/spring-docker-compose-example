# Docker example

## Run with Docker

### Build Command

`docker build -t <IMAGE_NAME> -f <PATH_TO_DOCKERFILE> .

### Run Command

`docker run --env-file <PATH_TO_ENV_FILE> -p <MACHINE_PORT>:<CONTAINER_PORT> <IMAGE_NAME>:<IMAGE_VERSION>`

### Steps

#### Run DB

`docker run --env-file .env -p 5432:5432 postgres:16`

#### Build the image

##### Using default

NOTE: In this project we do not have "Dockerfile" as-is so we need to declare which of the files to use, but it would
be:
`docker build -t spring-api .`

##### Using Development Dockerfile variation

`docker build -t spring-api -f Dockerfile.dev .`

##### Using Multi Stage Dockerfile variation

`docker build -t spring-api -f Dockerfile.multi .`

#### Check image creation

`docker images | grep spring-api`

#### Run container from image

`docker run --env-file .env -p 8080:8080 spring-api`

## Run with Docker compose

### Build images

`docker compose build`

This will build only the services with a `build` property

### Run services

`docker compose up -d`

### Verify processes running

`docker ps`

### Stop services

`docker compose down`
