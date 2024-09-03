# Microservices Application Deployment

This guide provides step-by-step instructions to deploy the microservices application locally using Minikube and `kubectl`.

## Prerequisites

Before you begin, ensure you have the following installed on your local machine:

- [Minikube](https://minikube.sigs.k8s.io/docs/start/)
- [Kubectl](https://kubernetes.io/docs/tasks/tools/install-kubectl/)

## Getting Started

### 1. Start Minikube

Begin by starting Minikube. This will set up a local Kubernetes cluster.

```bash
minikube start
```

### 2. Apply Kubernetes Configuration

After starting Minikube, apply the `config.yaml` file to deploy the microservices.

```bash
kubectl apply -f config.yaml
```

### 3. Forward to local

Forward port to local

```bash
kubectl port-forward deployment/frontend 8080:8080
```
