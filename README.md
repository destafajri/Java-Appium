# Java-Appium
My Source Code of Java-Appium for mobile testing

How to Install appium

    Installing appium with Node.js

    Step 1 : Check if node.js is installed on your system    node --version    npm --version

    Step 2 : Download node.js installer    https://nodejs.org/en/download/

    Step 3 : Run the installer & install node.js & npm

    Step 4 : Check if node.js & npm are installed
        node --version    npm --version
        where node
        where npm

    Step 5 : Install appium with node.js
        npm install -g appium

    Step 6 : Check if appium is installed
        appium -v
        where appium

    Step 7 : Start appium
        appium

Installing appium with APPIUM DESKTOP CLIENT

    Step 1 : Download appium desktop client
       http://appium.io/
       https://github.com/appium/appium-desk...

    Step 2 : Install appium desktop client

    Step 3 : Start appium through appium desktop client

    To check appium installation & dependencies
    Install appium-doctor
    https://github.com/appium/appium-doctor
    npm install appium-doctor -g
    appium-doctor -h
    appium-doctor --android



How to run appium with emulator
    https://www.seleniumeasy.com/appium-tutorials/running-appium-tests-on-android-emulator

    I suggest you to download Android Studio, because it inclucded SDK
    And dont forget to make System variable on the Environment system
    ANDROID_HOME	C:\Users\ASUS\AppData\Local\Android\Sdk

    and also PATH
    %ANDROID_HOME%\platform-tools
    %ANDROID_HOME%\tools

if you got "error has terminated solution for emulator img" you can check
https://stackoverflow.com/questions/57122856/error-while-downloading-google-apis-intel-x86-atom-system-image
https://blog.andevindo.com/the-emulator-process-for-avd-has-terminated-error-log/
https://www.youtube.com/watch?v=bOURCXjmXlg


How to make appium project

    Step 1 : Open Eclipse IDE

    Step 2 : Create a Java maven project

    Step 3 : Add libraries
       Selenium java
       Appium java client 
       https://mvnrepository.com/

    Step 4 : Connect device
       run command : adb devices

    Step 5 : Start appium server
       can do from command line or appium desktop client

    Step 6 : Add code to start automation on mobile device
       Set desired capabilities
        deviceName
        udid
        platformName
        platformVersion

        appPackage
        appActivity

        this is the URL http://127.0.0.1:4723/wd/hub
       Start application

    Step 7 : Run and validate
