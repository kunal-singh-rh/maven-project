# Jenkins + SonarQube + Maven Demo

A simple Java Maven project designed for Jenkins and SonarQube integration.

## Environment

- Jenkins: http://13.207.28.218:8080
- SonarQube: http://13.207.28.218:9000
- Nexus: http://13.207.28.218:8081

Nexus is not used by this Jenkinsfile yet. It can be added later for artifact upload.

## Jenkins configuration

### 1. SonarQube token

Create a token in SonarQube and store it in Jenkins:

- Kind: Secret text
- ID: `sonarqube-token`

### 2. Configure SonarQube server

Jenkins:
`Manage Jenkins -> System -> SonarQube servers`

Configure:

- Name: `SonarQube`
- Server URL: `http://13.207.28.218:9000`
- Authentication token: `sonarqube-token`

### 3. Configure Maven

Jenkins:
`Manage Jenkins -> Tools -> Maven installations`

Create:

- Name: `Maven-3`

Make sure the name exactly matches the Jenkinsfile.

### 4. SonarQube webhook

SonarQube:
`Administration -> Configuration -> Webhooks`

Create:

`http://13.207.28.218:8080/sonarqube-webhook/`

The trailing `/` is important.

## Pipeline

The Jenkinsfile performs:

1. Git checkout
2. Maven clean test
3. SonarQube analysis
4. Wait for SonarQube Quality Gate
5. Maven package
6. Archive the JAR and JUnit results

## GitHub

Push this entire directory to a GitHub repository and configure Jenkins:

- Definition: Pipeline script from SCM
- SCM: Git
- Repository URL: your GitHub repository URL
- Branch: `*/main`
- Script Path: `Jenkinsfile`
