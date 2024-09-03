
# 10.23 Create Helm Chart for Microservices
### Project Description:
Create 1 shared Helm Chart for all microservices(uses the config.yaml file from 10.21-22),
to reuse common Deployment and Service configurations for the services



# 10.24 Deploy Microservices with Helmfile
### Project Description:
Create 1 shared Helm Chart for all microservices(uses the config.yaml file from 10.21-22),
to reuse common Deployment and Service configurations for the services

### 1. Start Minikube

Begin by starting Minikube. This will set up a local Kubernetes cluster.

```bash
minikube start
```

### 2. Run helmfile


```bash
helmfile sync
```

### 3. Forward to local

Forward port to local

```bash
kubectl port-forward deployment/frontend 8080:8080
```

### 3. Uninstall

Forward port to local

```bash
helmfile destroy
```





