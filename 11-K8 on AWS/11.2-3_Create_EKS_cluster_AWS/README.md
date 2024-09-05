# **11.2 - Create EKS cluster with AWS Management Console Part 1**

- **Demo executed - Create EKS cluster Part 1:**
    - Created EKS Role
    - Created VPC with Cloudformation Template (EKS cluster needs specific network configuration)
    -  Created EKS cluster
    -  Connected to EKS cluster with kubectl locally
    -  Created Node Group Role
    -  Created Node Group (EC2 Instances - Worker Nodes)
    
    # **11.3 - Configure Autoscaling in EKS cluster Part 2**
    
    Continuation of 11.2
    
    -  Configure Auto-Scaling - Deployed cluster-autoscaler Pod
        - Created new Policy for Auto-Scaling Permission
        - Attached new Policy to existing Node Group Role
        - Deployed Auscaler Component in EKS cluster
    - Deployed Example application
        - Deployed nginx Pod
        - Deployed nginx Service
        - Started 20 Pods - see autoscaling in action
