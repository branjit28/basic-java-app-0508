pipeline {
    agent any

    environment {
        JAVA_HOME = "C:\Program Files\JAVA_17"   
        PATH = "${env.JAVA_HOME}\\bin;${env.PATH}"
    }

    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/branjit28/basic-java-app-0508.git'
            }
        }

        stage('Compile') {
            steps {
                bat 'javac src\\basicapp.java'
            }
        }

        stage('Run') {
            steps {
                bat 'java -cp src basicapp'
            }
        }
    }
}
