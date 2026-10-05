#!/bin/bash -ex

mkdir -p bin

javac -d bin src/cs1302/model/Person.java
javac -d bin src/cs1302/util/Helper.java
javac -d bin -cp bin src/cs1302/exe/Driver.java
