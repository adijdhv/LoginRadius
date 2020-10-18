<?php
//initialize the Loginradius credentials here
define('LR_API_KEY', 'LOGINRADIUS_API_KEY_HERE');
define('LR_API_SECRET', 'LOGINRADIUS_API_SECRET_HERE');

require_once "src/LoginRadiusSDK/Utility/Functions.php";
require_once "src/LoginRadiusSDK/LoginRadiusException.php";
require_once "src/LoginRadiusSDK/Clients/IHttpClientInterface.php";
require_once "src/LoginRadiusSDK/Clients/DefaultHttpClient.php";
require_once "src/LoginRadiusSDK/CustomerRegistration/Authentication/AuthenticationAPI.php";

use \LoginRadiusSDK\CustomerRegistration\Authentication\AuthenticationAPI;

$access_token = $_REQUEST["access_token"];
$authenticationAPI = new AuthenticationAPI();
$response = $authenticationAPI->getProfileByAccessToken($access_token);

?>
