# Atlanmod Platform

This is a multi-module project aiming to gather useful metrics, in order to ensure their maintainability and consistency.

Here is a list of the tools used as of now :
- PMD plugin : detects code duplication and asserts the quality of the code by checking violations to specified rules. <br />
To change the ruleset, update the file at build-tools/pmd/ruleset.xml. 
- SonarCloud : offers metrics regarding the overall quality of the code. Results are available at https://sonarcloud.io/organizations/atlanmod/projects.

[![Build Status](https://travis-ci.org/atlanmod/atlanmod-platform.svg?branch=master)](https://travis-ci.org/atlanmod/atlanmod-platform)