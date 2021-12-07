/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package none.twitterapp;
import com.google.gson.Gson;
import java.io.IOException;
import java.util.ArrayList;
/**
 *
 * @author Noahb
 */
public class Main {
    static ChangeAuthorization changeAuthWin;
    /**
     * @param args the command line arguments
     * @throws IOException
     * @throws ClassNotFoundException         
     */
    
    static String APIUrl(String host, String fx, String key){
        return host + fx + "?access_token=" + key;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        
        // Load User Authorization Data.
        APIAuthorization auth = APIAuthorization.serialize_in("Auth_1.dat");
        //ApiCallWin testWin = new ApiCallWin(auth);
        //testWin.setVisible(true);
        
        Gson gson = new Gson();
        MakeRequest get = new MakeRequest();
        
        CanvasStudentWin csWin;
        CanvasStudent testStudent = null;
        CanvasCourse[] testCourses;
        
        String host = "https://canvas.endicott.edu";
        String token = "2548~dC4Ut73ZZ26vD3zzb1Pf2H0lJoEwRwu65XYysZHywUeni2FAfyVD6Dqh4SssYilc";
        String response;
        
        
        // User Data 
        response = get.request(APIUrl(host, "/api/v1/users/self", token));
        testStudent = gson.fromJson(response, CanvasStudent.class);
        //Courses
        response = get.request(APIUrl(host, "/api/v1/courses", token));
        testCourses = gson.fromJson(response, CanvasCourse[].class);
        testStudent.setCourses(testCourses);
       
        //Enrollments
        //response = get.request(APIUrl(host, "/api/v1/users/self/enrollments", token));
        //System.out.println(response);
        
        response = get.request(APIUrl(host, "/api/v1/courses/33821/assignments", token));
        System.out.println(response);
        
        
        
        csWin = new CanvasStudentWin(testStudent);
        csWin.setVisible(true);
        
  
        /*
        ChangeAuthorization changeAuthWin = new ChangeAuthorization(auth);
        changeAuthWin.setVisible(true); 
        */
        // https://api.twitter.com/2/users/by/username/NSargeDev?user.fields=&expansions=&tweet.fields=
        // {"data":{"id":"1346559671004499976","name":"nsarge@mail.endicott.edu","username":"NSargeDev"}}
        
        //https://canvas.instructure.com/api/v1/courses?access_token=2548~dC4Ut73ZZ26vD3zzb1Pf2H0lJoEwRwu65XYysZHywUeni2FAfyVD6Dqh4SssYilc
        //https://canvas.instructure.com/api/lti/accounts/:account_id
        //Make a request, passing the URL and API Authorization.
        /*
        String url = "https://api.twitter.com/2/tweets/search/recent?tweet.fields=&query=\"Endicott College\""; 
        
        MakeRequest get = new MakeRequest();
        String strResponse = get.requestURL(url, auth);
        System.out.println(strResponse);
        */
        /*
        //This creates and saves an authorization. Makes a .dat file.
        APIAuthorization auth = new APIAuthorization(
                "zfIhgFKGitQNiAmHalDmiSYCz",
                "HvZXLl9co5zwbCEQBmbUwRjzkpAR3Lmx9NkVzMCtQVK1iWHfAs",
                "AAAAAAAAAAAAAAAAAAAAADcuLQEAAAAA%2BSGqnFmI8GfFS%2FLhtcZ5IqGRKec%3DO3EyXFmY5jHoM5r4AMNRmkrTDFQ7RXUOQTu3o9BK1L6Yu2wmZc",
                "1346559671004499976-C3jdNexrkWzxdb5dMrD4PBVegPdwS6",
                "4ilofXH8nDatYhPZ7I25zBrEdy5QEpO0jkRAcegYN6Jmn"        
        );
        auth.serialize_out("Auth.dat");
        */
        // This creates a nulled out APIauthorization used for users before they input keys.
        //APIAuthorization auth = new APIAuthorization("", "", "", "", ""); // Creates a null auth.
        //auth.serialize_out("NullAuth.dat");
        
        /*
        //Reads in an auth file, Populates the window, pass null inside the serialize_in fx.
        APIAuthorization auth = APIAuthorization.serialize_in("NullAuth.dat");
        ChangeAuthorization changeAuthWin = new ChangeAuthorization(auth);
        changeAuthWin.setVisible(true); 
        */
        
        
    }
}
