#!/user/bin/env groovy
package com.example

// Extracting docker logic for reusability
class Docker implements Serializable{

    def script

    Docker (script) {
        this.script = script
    }

    def buildDockerImage(String imageName) {
        script.echo "building the docker image (from shared library)..."
        script.sh "docker build -t $imageName ." // build docker image
    }

    def dockerLogin() {
        script.withCredentials([script.usernamePassword(credentialsId: 'docker-hub-repo', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
            script.sh "echo '${script.PASS}' | docker login -u '${script.USER}' --password-stdin" // login to dockerhub
        }
    }

    def dockerPush(String imageName) {
        script.sh "docker push $imageName" // push image
    }

}
