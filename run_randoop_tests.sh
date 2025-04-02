#!/bin/bash

# Find the Joda-Time JAR file
JODA_LIB=$(find ./lib -name "joda-time*.jar" | head -n 1)
if [ -z "$JODA_LIB" ]; then
    echo "Error: Joda-Time JAR not found!"
    exit 1
fi

# Find the JUnit Console Launcher JAR file
JUNIT_LIB=$(find ./lib -name "junit-platform-console-standalone*.jar" | head -n 1)
if [ -z "$JUNIT_LIB" ]; then
    echo "Error: JUnit Console Launcher JAR not found!"
    exit 1
fi

# Set the classpath including JUnit, Joda-Time, and the test files directory
CLASSPATH=".:./randoop-tests:$JODA_LIB:$JUNIT_LIB"

# Loop through all the .class files in the randoop-tests directory
for test_file in ./randoop-tests/*.class; do
    # Extract the class name from the file path
    class_name=$(basename "$test_file" .class)

    # Run the test using JUnit 5 ConsoleLauncher
    echo "Running test: $class_name"
    java -cp "$CLASSPATH" org.junit.platform.console.ConsoleLauncher --select-class="$class_name"
    echo "---------------------------------------"
done
