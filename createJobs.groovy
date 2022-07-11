pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}
pipelineJob('employee-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/hugojesusmr/employee.git'
                    }
                    branch 'main'
                }
            }
        }
    }
}  
pipelineJob('employee-job-dockerTwo') {
        definition {
            cpsScm {
                scm {
                    git {
                        remote {
                            url 'https://github.com/hugojesusmr/employee.git'
                        }
                        branch 'main'
                        scriptPath('Jenkinsfile-docker')
                }
            }
        }
    }  
}
pipelineJob('employee-job-kubernates') {
        definition {
            cpsScm {
                scm {
                    git {
                        remote {
                            url 'https://github.com/hugojesusmr/jenkins-demo.git'
                        }
                        branch 'main'
                        scriptPath('deploymentservice.yml')
                }
            }
        }
    }  
}
