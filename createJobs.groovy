pipelineJob('serviceproduct') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/hugojesusmr/microservicesjenkins.git'
                    }
                    branch 'master'
                    scriptPath('product-service/Jenkinsfile')
                }
            }
        }
    }
}  
pipelineJob('servicediscovery') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/hugojesusmr/microservicesjenkins.git'
                    }
                    branch 'master'
                    scriptPath('discovery-service/Jenkinsfile')
                }
            }
        }
    }
}  
pipelineJob('servicegateway') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/hugojesusmr/microservicesjenkins.git'
                    }
                    branch 'master'
                    scriptPath('gateway-service/Jenkinsfile')
                }
            }
        }
    }
}  
pipelineJob('serviceinventory') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/hugojesusmr/microservicesjenkins.git'
                    }
                    branch 'master'
                    scriptPath('inventory-service/Jenkinsfile')
                }
            }
        }
    }
}  
pipelineJob('servicenotification') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/hugojesusmr/microservicesjenkins.git'
                    }
                    branch 'master'
                    scriptPath('notification-service/Jenkinsfile')
                }
            }
        }
    }
}  

pipelineJob('serviceorder') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/hugojesusmr/microservicesjenkins.git'
                    }
                    branch 'master'
                    scriptPath('order-service/Jenkinsfile')
                }
            }
        }
    }
}  
