#In this example all the resources starting with /api/** are protected
#So only the authenticated users can access these protected resources
#Any third party application whose client id is registered in the AuthorizationServerConfig can request for these protected resources
#http://localhost:8080/oauth/authorize?client_id=sampleClientId&response_type=code&scope=read
#It will be redirected to the redirect uri configured in AuthorizationServerConfig and granted access token upon presenting the authorization code granted by the authorization server
#If the access token is provided as authorization header in the request it will get access to the protected resources.