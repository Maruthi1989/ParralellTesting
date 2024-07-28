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
       }
        stage(Test)
        { 
         steps
         {
         echo "Testing the code......."
         bat "mvn test"
         }   
        }
      }

    }
    

