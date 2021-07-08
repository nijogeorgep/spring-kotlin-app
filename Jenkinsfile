pipeline {
    agent any
    environment {
        NEW_VERSION = env.GIT_COMMIT
    }
    stages {
        stage("build"){
            steps {
                echo 'Building the application'
                echo "Building version ${NEW_VERSION}"
            }
        }
        stage("test") {
            when {
                expression {
                    env.BRANCH_NAME == 'dev' || env.BRANCH_NAME != 'master'
                }
            }
            steps {
                echo 'Testing the application'
                echo "Testing version ${NEW_VERSION}"
            }
        }
        stage("deploy"){
            steps {
                echo 'Deploying the application'
                echo "Deploying version ${NEW_VERSION}"
             }
        }
    }
    post {
        always{
            echo 'Build Succeeded'
        }
        success {
            echo 'Build Succeeded for this App'
        }
    }
}