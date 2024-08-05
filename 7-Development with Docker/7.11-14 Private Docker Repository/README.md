
AWS ECR = elastic container repository

Simulate what Jenkins does (Push image to private repo)

**Demo Project:**

Dockerize Nodejs application and push to private Docker registry (ECR)

**Technologies used:**

Docker, Node.js, Amazon ECR, MongoDB

**Project Description:**

1. Write Dockerfile to build a Docker image for a Nodejs application
2. Create private Docker registry on AWS (Amazon ECR)
3. Push Docker image to this private repository
4. Copy Docker-compose file to remote server 
5. Login to private Docker registry on remote server to fetch our app image
6. Start our application container with MongoDB and MongoExpress services using docker compose
