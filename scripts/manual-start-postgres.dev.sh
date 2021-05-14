#!/usr/bin/env bash

# Start a postgres 12 container named postgres_db in port 5432
# user: sa, password: password
# db: compose-db
docker run --name=postgres_db --rm -p 5432:5432 -e POSTGRES_PASSWORD=password -e POSTGRES_USER=sa -e POSTGRES_DB=compose-db postgres:12
