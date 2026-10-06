#!/usr/bin/env bash

set -euo pipefail

# Run relative to this script so it works from any directory.
activity_dir="$(cd -- "$(dirname -- "${BASH_SOURCE[0]}")" && pwd)"
cd "$activity_dir"

mkdir -p bin

# Compile Driver.java, using the JAR files in lib as dependencies.
javac -d bin -cp "lib/*" src/cs1302/linkedlists/Driver.java

# Run the compiled Driver class with the same dependencies.
java -cp "bin:lib/*" cs1302.linkedlists.Driver
