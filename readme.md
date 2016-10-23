mvn compile
mvn package


cd target
java -jar gs-maven-0.1.0.jar 


mvn test

-------------------------------------------------------                                                                                                                                          
 T E S T S                                                                                                                                                                                       
-------------------------------------------------------                                                                                                                                          
Running hello.GreeterTest                                                                                                                                                                        
Tests run: 1, Failures: 1, Errors: 0, Skipped: 0, Time elapsed: 0.152 sec <<< F                                                                                                                  
greeterSayHello(hello.GreeterTest)  Time elapsed: 0.026 sec  <<< FAILURE!                                                                                                                        
java.lang.AssertionError:                                                                                                                                                                        
Expected: a string containing "Helloworld."                                                                                                                                                      
     but: was "Hello,world."                                                                                                                                                                     
        at org.hamcrest.MatcherAssert.assertThat(MatcherAssert.java:20)                                                                                                                          
        at org.junit.Assert.assertThat(Assert.java:956)                                                                                                                                          
        at org.junit.Assert.assertThat(Assert.java:923)                                                                                                                                          
        at hello.GreeterTest.greeterSayHello(GreeterTest.java:13)                                                                                                                                
        at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)                                                                                                                           
        at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl                                                                                                                  
        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAcce                                                                                                                  
        at java.lang.reflect.Method.invoke(Method.java:497)                                                                                                                                      
        at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(Framewor                                                                                                                  
        at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCa                                                                                                                  
        at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkM                                                                                                                  
        at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMe                                                                                                                  
        at org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:325)                                                                                                                         
        at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRu                                                                                                                  
        at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRu                                                                                                                  
        at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)                                                                                                                           
        at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)                                                                                                                       
        at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)                                                                                                                     
        at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)                                                                                                                       
        at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)                                                                                                                      
        at org.junit.runners.ParentRunner.run(ParentRunner.java:363)                                                                                                                             
        at org.apache.maven.surefire.junit4.JUnit4Provider.execute(JUnit4Provid                                                                                                                  
        at org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit                                                                                                                  
        at org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provide                                                                                                                  
        at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)                                                                                                                           
        at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl                                                                                                                  
        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAcce                                                                                                                  
        at java.lang.reflect.Method.invoke(Method.java:497)                                                                                                                                      
        at org.apache.maven.surefire.util.ReflectionUtils.invokeMethodWithArray                                                                                                                  
        at org.apache.maven.surefire.booter.ProviderFactory$ProviderProxy.invok                                                                                                                  
        at org.apache.maven.surefire.booter.ProviderFactory.invokeProvider(Prov                                                                                                                  
        at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(For                                                                                                                  
        at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java                                                                                                                  
                                                                                                                                                                                                 
                                                                                                                                                                                                 
Results :                                                                                                                                                                                        
                                                                                                                                                                                                 
Failed tests:   greeterSayHello(hello.GreeterTest): (..)    
                                                                                                                                                                                                 
Tests run: 1, Failures: 1, Errors: 0, Skipped: 0                                                                                                                                                 
                                                                                                                                                                                                 
[INFO] ------------------------------------------------------------------------                                                                                                                  
[INFO] BUILD FAILURE                                                                                                                                                                             
[INFO] ------------------------------------------------------------------------                                                                                                                  
[INFO] Total time: 3.692 s                                                                                                                                                                       
[INFO] Finished at: 2016-10-23T17:29:46+08:00                                                                                                                                                    
[INFO] Final Memory: 15M/160M                                                                                                                                                                    
[INFO] ------------------------------------------------------------------------                                                                                                                  
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-surefire-plugin:2                                                                                                                  
: There are test failures.                                                                                                                                                                       
[ERROR]                                                                                                                                                                                          
[ERROR] Please refer to C:\codes\java\gs-maven\target\surefire-reports for the                                                                                                                   
individual test results.                                                                                                                                                                         
[ERROR] -> [Help 1]                                                                                                                                                                              
[ERROR]                                                                                                                                                                                          
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.                                                                                                              
[ERROR] Re-run Maven using the -X switch to enable full debug logging.                                                                                                                           
[ERROR]                                                                                                                                                                                          
[ERROR] For more information about the errors and possible solutions, please read the following articles:                                                                                        
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException                                                                                                           
                                                                                                                                     

                                                                                                     -------------------------------------------------------                                                                                                                                          
 T E S T S                                                                                                                                                                                       
-------------------------------------------------------                                                                                                                                          
Running hello.GreeterTest                                                                                                                                                                        
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.103 sec                                                                                                                        
                                                                                                                                                                                                 
Results :                                                                                                                                                                                        
                                                                                                                                                                                                 
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0                                                                                                                                                 
                                                                                                                                                                                                 
[INFO] ------------------------------------------------------------------------                                                                                                                  
[INFO] BUILD SUCCESS                                                                                                                                                                             
[INFO] ------------------------------------------------------------------------                                                                                                                  
                                                                                            