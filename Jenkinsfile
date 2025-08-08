pipeline {
    agent any

    environment {
        JAVA_HOME = "C:/Program Files/JAVA_17"
        PATH = "${env.JAVA_HOME}\\bin;${env.PATH}"
    }

    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/branjit28/basic-java-app-0508.git', branch: 'main'
            }
        }

        stage('Build and Run') {
            steps {
                bat '''
                    mkdir out
                    javac -d out src\\basicapp\\Main.java
                    java -cp out basicapp.Main
                '''
            }
        }
    }
}
