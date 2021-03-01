Feature:  Validating adding a product
Scenario: Verifying product is added or not
Given  payload for adding a product
When   Hit api with http  request "Post" method
And    validate prouduct is added or not with get request method


