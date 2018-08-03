pipeline {

    agent {
        docker {
            image 'maven:3.3-jdk-8' 
            args '-v /root/.m2:/root/.m2' 
            args '--network documentos_bridge'	//mvn va por un docker externo y hay que asignarle a nuestra red para que vea a los demas
        }
        
    }
    

    stages {

        stage('Build') { 
            steps {
                sh 'mvn -B -DskipTests clean package' 
            }
	    }
	
		stage('Test') { 
	            steps {
	                sh 'mvn test' 
	            }
	            post {
	                always {
	                    junit 'target/surefire-reports/*.xml' 
	                }
	            }
	    }
	
		stage('Example') {
	            input {
	                message "Should we continue?"
	                ok "Yes, we should."
	                //submitter "alice,bob"
	                parameters {
	                    string(name: 'PERSON', defaultValue: 'Mr Jenkins', description: 'Who should I say hello to?')
	                }
	            }
	            steps {
	                echo "Hello, ${PERSON}, nice to meet you!!."
	                echo "Integrating liquibase"
	                sh 'mvn liquibase:status'
	            }
		    post{
				always{
				     echo 'I always say Hello al final'
				}
		    }
		    
	    }
	
		stage('Deliver') {
	            steps {
	                sh './jenkins/scripts/deliver.sh'	
	            }
	    }

	
	
    }

}
