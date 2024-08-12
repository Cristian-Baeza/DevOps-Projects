#!/user/bin/env groovy

// using Docker class for reusability
import com.example.Docker

def call(String imageName){
    return new Docker(this).buildDockerImage(imageName)
}


// With parameters
//def call(String imageName) {
//    echo "building the docker image (from shared library)..."
//    withCredentials([usernamePassword(credentialsId: 'docker-hub-repo', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
//      sh "docker build -t $imageName ." // build docker image
//      sh 'echo $PASS | docker login -u $USER --password-stdin' // login to dockerhub
//      sh "docker push $imageName" // push image
//    }
//}

// Without Parameters
//def call(String imageName) {
//    echo "building the docker image (from shared library)..."
//    withCredentials([usernamePassword(credentialsId: 'docker-hub-repo', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
//      sh 'docker build -t cbaeza1/demo-app:jma-2.0 .' // build docker image
//      sh 'echo $PASS | docker login -u $USER --password-stdin' // login to dockerhub
//      sh 'docker push cbaeza1/demo-app:jma-2.0' // push image
//    }
//}
