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

# Compile the abstract parent class to bin
javac -d bin         src/cs1302/shapes/Shape.java

# Compile the child classes
javac -d bin -cp bin src/cs1302/shapes/Ellipse.java
javac -d bin -cp bin src/cs1302/shapes/Circle.java
javac -d bin -cp bin src/cs1302/shapes/Rectangle.java

# Compile the Driver
javac -d bin -cp bin src/cs1302/shapes/Driver.java

# Run the Driver
java -cp bin cs1302.shapes.Driver
