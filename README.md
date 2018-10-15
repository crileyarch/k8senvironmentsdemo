# k8senvironmentsdemo
Demonstration for using Kubernetes/Openshift to demonstrate environments via namespaces. Leverages the following technologies:
- Openshift 3.9.0
- ReadyAPI 2.5.0
- Spring Boot 1.3.2
- SwaggerHub 
- OpenAPI 3.0.0

This demonstration uses GitHub for managing the API and via Webhooks, creates an automated Docker build via Docker Hub. CI/CD solutions can then use Openshift API to trigger a deployment.
