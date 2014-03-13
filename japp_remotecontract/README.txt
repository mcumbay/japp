==============
INSTRUCTIONS:
=============
The generation of the remote contract classes is done using CXF
See JAPP_remotecontract.properties to change the parameters

Step 1: To generate the WSDL from the Model
	Execute mvn process-classes
	{TODO: fixed error}
	
Step 2: To generate The Jaxb classes from the WSDL
	Execute mvn generate-sources 