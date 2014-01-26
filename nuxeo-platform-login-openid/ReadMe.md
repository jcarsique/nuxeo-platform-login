

## About nuxeo-platform-login-openid

This module contribute a new Login Plugin that can use OpenID, OAuth or OAuth2 to authenticate the user.

OpenID providers links will added to the login screen.

## Google authentication

OAuth 2.0 implementation https://developers.google.com/accounts/docs/OAuth2Login

You must first declare your Nuxeo Web Application to Google so that you can get the clientId and ClientSecret.

Go to https://code.google.com/apis/console > API Access > Create > Web Application

### Sample configuration

Once you have the clientId/clientSecret, write an XML contribution like the following:

    <?xml version="1.0"?>
    <component name="nuxeo.oauth2.openid.google.sample" version="1.0">
      <require>org.nuxeo.ecm.platform.oauth2.openid.google</require>
      <extension target="org.nuxeo.ecm.platform.oauth2.openid.OpenIDConnectProviderRegistry" point="providers">
        <provider>
          <name>GoogleOpenIDConnect</name>
          <clientId><!--enter your clientId here --></clientId>
          <clientSecret><!--enter your clientSecret key here --></clientSecret>
        </provider>
      </extension>
    </component>

### Managed scopes

See http://www.subinsb.com/2013/04/list-google-oauth-scopes.html  
and https://developers.google.com/oauthplayground/

#### Email validation
https://www.googleapis.com/auth/userinfo.email (default: Userinfo - Email)  
=> https://www.googleapis.com/oauth2/v1/tokeninfo  

#### Basic account information (TODO)

https://www.googleapis.com/auth/userinfo.profile (Userinfo - Profile)
=> https://www.googleapis.com/oauth2/v3/userinfo  

#### Complementary user information (TODO)

https://www.googleapis.com/auth/plus.me (Google+)
https://www.googleapis.com/auth/plus.login (Google+ Friend list)  

### For developers

#### Google+ Sign-In & People API (TODO)

https://developers.google.com/+/

https://www.googleapis.com/plus/v1/people/me

https://developers.google.com/+/api/latest/people

#### Google APIs Discovery Service

https://developers.google.com/discovery/


## Configuration parameters (for nuxeo.conf)

openid.createuser: create user if needed, property is true and the user's openID is validated

