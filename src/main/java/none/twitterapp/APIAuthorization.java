/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package none.twitterapp;
import java.io.*;
import java.io.IOException;
/**
 *
 * @author Noahb
 * IF YOU EDIT THIS CLASS YOU MUST REBUILD THE DAT FILES... SEE MAIN.
 */
public class APIAuthorization implements Serializable{
    static public String package_dir = "/src/main/java/none/twitterapp/";
    static public String header_key = "authorization";
    private boolean empty;
    private String API_KEY;
    private String API_SECRET_KEY;
    private String BEARER_TOKEN;
    private String ACCESS_TOKEN;
    private String ACCESS_TOKEN_SECRET; 
    
    public APIAuthorization (String api_key, String api_secret, String bearer_token, String access_token, String access_secret){
        API_KEY = api_key;
        API_SECRET_KEY = api_secret;
        BEARER_TOKEN = bearer_token;
        ACCESS_TOKEN = access_token;
        ACCESS_TOKEN_SECRET = access_secret; 
        isNull();
    }
    // Getters
    public String get_api_key(){
        return API_KEY;
    }
    public String get_api_secret(){
        return API_SECRET_KEY;
    }
    public String get_bearer_token(){
        return BEARER_TOKEN;
    }
    public String get_access_token(){
        return ACCESS_TOKEN;
    }
    public String get_access_secret(){
        return ACCESS_TOKEN_SECRET;
    }
    // Setters 
    public void set_api_key(String new_key){
        API_KEY = new_key;
    }
    public void set_api_secret(String new_key){
        API_SECRET_KEY = new_key;
    }
    public void set_bearer_token(String new_key){
        BEARER_TOKEN = new_key;
    }
    public void set_access_token(String new_key){
        ACCESS_TOKEN = new_key;
    }
    public void set_access_secret(String new_key){
        ACCESS_TOKEN_SECRET = new_key;
    }
    
    // Get Headers...
    public String get_bearer_header(){
        return "Bearer " + get_bearer_token();
    }
    
    // IO
    public void serialize_out(String file_name) throws IOException{
        file_name = System.getProperty("user.dir") + package_dir + file_name;
        file_name = file_name.replace('\\', '/');
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file_name));
        out.writeObject(this);
        out.close();
    }
    static public APIAuthorization serialize_in(String file_name) throws IOException, ClassNotFoundException{
        file_name = System.getProperty("user.dir") + package_dir + file_name;
        file_name = file_name.replace('\\', '/');
        System.out.println(file_name);
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(file_name));
        APIAuthorization temp_auth = (APIAuthorization) in.readObject();
        in.close();
        return temp_auth;
    }
    public void dump(){
        System.out.println(API_KEY);
        System.out.println(API_SECRET_KEY);
        System.out.println(BEARER_TOKEN);
        System.out.println(ACCESS_TOKEN);
        System.out.println(ACCESS_TOKEN_SECRET);
    }
    public boolean isNull(){
        empty = ( API_KEY.equals("") && API_SECRET_KEY.equals("") && BEARER_TOKEN.equals("") && ACCESS_TOKEN.equals("") && ACCESS_TOKEN_SECRET.equals(""));
        return empty;
    }
}
