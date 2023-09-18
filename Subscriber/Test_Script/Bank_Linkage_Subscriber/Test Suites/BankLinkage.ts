<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteCollectionEntity>
   <description>This test suite collection will execute overall linkage features for both cash in, cash out and bank link and unlink.</description>
   <name>BankLinkage</name>
   <tag></tag>
   <delayBetweenInstances>0</delayBetweenInstances>
   <executionMode>SEQUENTIAL</executionMode>
   <maxConcurrentInstances>8</maxConcurrentInstances>
   <testSuiteRunConfigurations>
      <TestSuiteRunConfiguration>
         <configuration>
            <groupName>Mobile</groupName>
            <profileName>default</profileName>
            <requireConfigurationData>true</requireConfigurationData>
            <runConfigurationData>
               <entry>
                  <key>deviceName</key>
                  <value>samsung SM-A207F (Android 11)</value>
               </entry>
               <entry>
                  <key>deviceId</key>
                  <value>R9AM90XY9XJ</value>
               </entry>
            </runConfigurationData>
            <runConfigurationId>Android</runConfigurationId>
         </configuration>
         <runEnabled>true</runEnabled>
         <testSuiteEntity>Test Suites/Bank_Link_and_Unlink</testSuiteEntity>
      </TestSuiteRunConfiguration>
      <TestSuiteRunConfiguration>
         <configuration>
            <groupName>Mobile</groupName>
            <profileName>default</profileName>
            <requireConfigurationData>true</requireConfigurationData>
            <runConfigurationData>
               <entry>
                  <key>deviceName</key>
                  <value>samsung SM-A207F (Android 11)</value>
               </entry>
               <entry>
                  <key>deviceId</key>
                  <value>R9AM90XY9XJ</value>
               </entry>
            </runConfigurationData>
            <runConfigurationId>Android</runConfigurationId>
         </configuration>
         <runEnabled>true</runEnabled>
         <testSuiteEntity>Test Suites/Cash_In_And_Cash_Out</testSuiteEntity>
      </TestSuiteRunConfiguration>
   </testSuiteRunConfigurations>
</TestSuiteCollectionEntity>
