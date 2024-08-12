#!/user/bin/env groovy

// using Docker class for reusability
import com.example.Docker

def call(){
    return new Docker(this).dockerLogin()
}
