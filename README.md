 reference i learned this project:
 - https://www.youtube.com/playlist?list=PLBNb67lT6eELiDgH97xpdJeKM624Zm7li
 
 1. install Appium Dekstop: 
     - https://github.com/appium/appium-desktop
 2. Install Appium inspector: 
     - https://github.com/appium/appium-inspector
 3. Demo App android(apk)
     - https://github.com/webdriverio/native-demo-app/releases
     
     ![Screenshot 2023-03-11 at 15 47 36](https://user-images.githubusercontent.com/69374541/224508052-cf89e053-b6bb-4108-9c48-bf0cbd8afb5c.png)
      <br/>  - Configuration Appium inspector  <br/> 
     ![Screenshot 2023-03-11 at 15 56 19](https://user-images.githubusercontent.com/69374541/224508076-11dffceb-c227-4eae-8057-55c05ba561ee.png)

 4.  configration server: <br/>
  ![Screenshot 2023-03-11 at 15 46 54](https://user-images.githubusercontent.com/69374541/224508064-129328c5-d355-43be-9616-03ab9f234aad.png)




Making first project with java + Appium:
  - Create poject without Maven:
     
     Appium Java Client: 
       - https://mvnrepository.com/artifact/io.appium/java-client
       Guava Google:
       - https://mvnrepository.com/artifact/com.google.guava/guava/31.1-jre
       Apache Commons Lang:
       - https://mvnrepository.com/artifact/org.apache.commons/commons-lang3/3.12.0
       Selenium Java Binding
       - https://www.selenium.dev/downloads

      Full Documentation on Youtube:
      https://www.youtube.com/watch?v=wAeblsCzlNs&list=PLBNb67lT6eELiDgH97xpdJeKM624Zm7li&index=6
      
       - Install APP in ur Emulator 
         1. Show the active emulators <br/>
         
          <img width="295" alt="Screenshot 2023-03-11 at 01 44 44" src="https://user-images.githubusercontent.com/69374541/224508332-e9a7016b-d6e2-486a-80dc-516cbfa5b2be.png">

        2. inject application to the emulator by your file local system <br/>
       
       <img width="563" alt="Screenshot 2023-03-11 at 01 45 14" src="https://user-images.githubusercontent.com/69374541/224508418-5fb61fd1-34dd-4e40-9faa-300a77f911d2.png">

        
       3. to Enter in device emulator or real
        
       ```
       adb -s emulator-5554 shell
       ``` 
       ```
       dumpsys window | grep -E 'mCurrentFocus'  // to see activity running 
       ``` 
   
      <img width="576" alt="Screenshot 2023-03-11 at 15 43 07" src="https://user-images.githubusercontent.com/69374541/224508401-4ef560c4-03e4-4558-bac5-79ae700c2f95.png">


        
        
      
    - Create a project 
      ![image](https://user-images.githubusercontent.com/69374541/224508131-8d111b8e-aa3f-4686-a04f-f2fdc554fc57.png)
      
    - Choose java and next
      <img width="802" alt="Screenshot 2023-03-11 at 23 36 43" src="https://user-images.githubusercontent.com/69374541/224508153-45d44e7d-b255-4ae2-b9db-df49d017a754.png">


      How to add new modules (Denpendcies) 
      - install mudules(Denpendcies) 
      <img width="423" alt="Screenshot 2023-03-11 at 23 37 13" src="https://user-images.githubusercontent.com/69374541/224508178-0cf828a3-8501-4dfe-bafa-0d824567db6c.png">

      - Select Modules
      <img width="845" alt="Screenshot 2023-03-11 at 23 37 44" src="https://user-images.githubusercontent.com/69374541/224508189-b7bce16d-d02b-40f3-8688-fe352a005bf8.png">


