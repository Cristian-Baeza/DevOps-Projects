#!/user/bin/env groovy

// using Docker class for reusability
import com.example.Docker

def call(String imageName){
    return new Docker(this).dockerPush(imageName)
}
