Feature:  Validating Place Api's
#Scenario Outline:: Verifying place is added succesfully using Addplace api
#Given     Add place payload "<Accuracy>" "<Name>"
#When      User calls "Add Place Api" with Post http request
#Then      Response statuscode should be "200" 
#And       Scope in reponsebody is "App" 

#Examples:

 # |Accuracy | Name | 
 # |200 |    | World street|
