# Docker example

## Steps

### Run DB

`docker run --env-file .env -p 5432:5432 postgres:12`

### Build the image 

` docker build -t api_dev -f Dockerfile.multi .`

### Check image creation

`docker image ls | grep api_dev`

## Run container from image

`docker run --env-file .env -p 8080:8080 api_dev`

# Run with Docker compose

## Build images

`docker compose build`

This will build only the services with a `build` property

## Run services

`docker compose up`

## Verify processes running

`docker ps`