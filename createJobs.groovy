pipelineJob('employee-job-sonarqube') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {   
                        url 'https://github.com/hugojesusmr/employee.git'  
                    }
                    branch 'master'
                }
            }
        }
    }
}  
 
 


