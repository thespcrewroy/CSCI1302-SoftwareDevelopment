#!/bin/bash -e

echo "#"
echo "# This is an example of an interpreter script."
echo "# You can read about how to create your own in"
echo "# the 'Interpreter Scripts' section under 'Tools'"
echo "# in the book."
echo "#"

# Turn on command echoing
set -x

# Exit the script if any errors are encountered
set -e

# Delete old class files
rm -rf bin

# Compile the interface to bin
javac -d bin         src/cs1302/draw/Drawable.java

# Compile the implementing classes
javac -d bin -cp bin src/cs1302/draw/Tree.java
javac -d bin -cp bin src/cs1302/draw/Airplane.java
javac -d bin -cp bin src/cs1302/draw/Person.java
javac -d bin -cp bin src/cs1302/draw/Flower.java
javac -d bin -cp bin src/cs1302/draw/Meme.java

# Compile the Utility class
javac -d bin -cp bin src/cs1302/draw/Utility.java

# Compile the Driver
javac -d bin -cp bin src/cs1302/draw/Driver.java

# Run the Driver
java -cp bin cs1302.draw.Driver
