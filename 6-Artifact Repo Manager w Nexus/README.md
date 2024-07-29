# Demo Project:

Run Nexus on Droplet and Publish Artifact to Nexus

## Technologies used:
Nexus, DigitalOcean, Linux, Java, Gradle, Maven

## Project Description:
Install and configure Nexus from scratch on a cloud server
Create new User on Nexus with relevant permissions
Java Gradle Project: Build Jar & Upload to Nexus
Java Maven Project: Build Jar & Upload to Nexus

# Steps

1. **Configure SSH keys**
2. **Create a Droplet with Linux Ubuntu distribution**
3. **Open SSH port 22 on server using firewall configuration**
4. **SSH into the server using its public IP address**


### Install and Run Nexus on Droplet

1. Installed Nexus on DigitalOcean Droplet
2. Created a new Linux User for Nexus
3. Changed permissions of Nexus executable and sonatype-work folder
4. Set Nexus configuration to run as Nexus User (nexus.rc file)
5. Started Nexus with Nexus User
6. Configured Firewall Rules to open port 8081 to access Nexus from browser

### Publish Artifact to Nexus

1. Created new User on Nexus with permission to upload artifacts
2. Java Gradle Project: Build Jar File & Upload Jar File to Nexus (configure the app repo and add nexus user credentials)
3. Java Maven Project: Build Jar File & Upload Jar File to Nexus ((configure the app repo and add nexus user credentials))


### Nexus Cleanup Policies

1. Created new cleanup policy
2. Attached to a repository
3. Execute task manually

