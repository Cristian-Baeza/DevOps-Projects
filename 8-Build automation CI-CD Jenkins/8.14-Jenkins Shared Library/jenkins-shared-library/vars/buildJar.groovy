#!/user/bin/env groovy

def call() {
    echo "building the application (from shared library)...for branch $BRANCH_NAME"
    sh 'mvn package'
}
