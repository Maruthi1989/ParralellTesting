pipeline
{
    
    agent any
      stages
      {
     
       stage(build)
       {
        steps
        {
    
        echo "Buidling the code"
        bat "mvn clean"
    
         }

           steps
           {
               echo "Run the tests"
               bat "mvn test"
           }
         
       }
    
      }
    
    
    }
    

