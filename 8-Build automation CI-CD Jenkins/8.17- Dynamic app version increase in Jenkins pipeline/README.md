# Demo Project:
- Configure Webhook to trigger CI Pipeline automatically on every change
- Dynamically Increment Application version in Jenkins Pipeline

**Technologies used:**

Jenkins, Docker, Github, Git, Java, Maven

**Project Description:**

1. Configure CI step: Increment patch version 
2. Configure CI step: Build Java application and clean old artifacts 
3. Configure CI step: Build Image with dynamic Docker Image Tag 
4. Configure CI step: Push Image to private DockerHub repository 
5. Configure CI step: Commit version update of Jenkins back to Git repository 
6. Configure Jenkins pipeline to not trigger automatically on CI build commit to avoid commit loop

(Uses 8.15-8.17 to Configure Webhook to trigger CI Pipeline automatically on every change)
