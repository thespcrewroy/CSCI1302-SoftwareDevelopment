#!/usr/bin/env bash

set -euo pipefail

# Always work from the directory containing this script.
activity_dir="$(cd -- "$(dirname -- "${BASH_SOURCE[0]}")" && pwd)"
cd "$activity_dir"

mkdir -p bin

javac -d bin -cp "cs1302-str-list.jar" List.java LinkedBasedList.java Driver.java
java -cp "bin:cs1302-str-list.jar" Driver
