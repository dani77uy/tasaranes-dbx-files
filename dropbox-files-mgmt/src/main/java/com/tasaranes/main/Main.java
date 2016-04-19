package com.tasaranes.main;

import com.dropbox.core.DbxAppInfo;
import com.dropbox.core.DbxAuthFinish;
import com.dropbox.core.DbxRequestConfig;
import com.dropbox.core.DbxWebAuthNoRedirect;
import com.dropbox.core.v1.DbxClientV1;
import com.dropbox.core.v1.DbxEntry;
import com.dropbox.core.v2.team.GroupAccessType;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;

/**
 * Created by T_DanielB6 on 18/04/2016.
 */
public class Main {

   public static void main(String[] args) throws Exception {
      /*final String APP_KEY = "m1lxe4a5ev83k0e";
      final String APP_SECRET = "j35ahxqgxn6m08p";
      DbxAppInfo appInfo = new DbxAppInfo(APP_KEY, APP_SECRET);
*/
      /*DbxWebAuthNoRedirect webAuth = new DbxWebAuthNoRedirect(config, appInfo);

      String authorizeUrl = webAuth.start();
      System.out.println("1. Go to: " + authorizeUrl);
      System.out.println("2. Click \"Allow\" (you might have to log in first)");
      System.out.println("3. Copy the authorization code.");
      String code = new BufferedReader(new InputStreamReader(System.in)).readLine().trim();

      DbxAuthFinish authFinish = webAuth.finish(code);
      String accessToken = authFinish.getAccessToken();
*/
      DbxRequestConfig config = new DbxRequestConfig("JavaTutorial/1.0", Locale.getDefault().toString());

      String accessToken = "DcA2PtzIg54AAAAAAAQro-Sw6RQz3at4dPcGaZq2h6L9WGzwbnLnjk8BCGWCTwsz";

      DbxClientV1 client = new DbxClientV1(config, accessToken);

      System.out.println("Linked account: " + client.getAccountInfo().displayName);

      String path = "/person@l/fotos";
      DbxEntry.WithChildren listing = client.getMetadataWithChildren(path);
      System.out.println("Files in the Tasaranes path: " + path);
      if (listing != null)
         for (DbxEntry child : listing.children) {
            System.out.println("	" + child.name + ": " + child.toString());
         }
   }

}
