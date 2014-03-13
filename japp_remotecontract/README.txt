==============
INSTRUCTIONS:
=============
The generation of the remote contract classes is done using CXF
See JAPP_remotecontract.properties to change the parameters

Step 1: To generate the WSDL from the Model
	Comment the cxf-codegen-plugin on the POM.xml
	Execute mvn clean process-classes	
	
Step 2: To generate The Jaxb classes from the WSDL
	Execute mvn clean generate-sources 