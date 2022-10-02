pipelineJob('employee-job-sonarqube') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/hugojesusmr/microservicesjenkins.git'
                    }
                    branch 'master'
                }
            }
        }
    }
}  
/* pipelineJob('employee-job-sonarqube') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {   
                        url 'https://github.com/hugojesusmr/registry-service.git'  
                    }
                    branch 'master'
                }
            }
        }
    }
}  
pipelineJob('employee-job-sonarqube') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/hugojesusmr/product-service.git'
                    }
                    branch 'master'
                }
            }
        }
    }
}  
 */


