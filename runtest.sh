#!/bin/bash

cd /home/gigavoice/eclipse-workspace/JenkinsDemo
java -cp "lib/*:bin" org.testng.TestNG testng.xml
