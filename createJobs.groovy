pipelineJob('configservice') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/hugojesusmr/microservicesjenkins.git'
                    }
                    branch 'master'
                    scriptPath('config-server/Jenkinsfile')
                }
            }
        }
    }
}  
pipelineJob('serviceproduct') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/hugojesusmr/microservicesjenkins.git'
                    }
                    branch 'productservice'
                    scriptPath('product-service/Jenkinsfile')
                }
            }
        }
    }
}  



