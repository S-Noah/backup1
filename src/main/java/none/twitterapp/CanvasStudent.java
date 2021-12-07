/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package none.twitterapp;

/**
 *
 * @author Noahb
 */
public class CanvasStudent {
    private int id;
    private String name;
    private String created_at;
    private String sortable_name;
    private String avatar_url;
    
    private CanvasCourse[] courses;
    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCreated_at() {
        return created_at;
    }

    public String getSortable_name() {
        return sortable_name;
    }

    public String getAvatar_url() {
        return avatar_url;
    }
    public CanvasCourse[] getCourses(){
        return this.courses;
    }
    
    public void setCourses(CanvasCourse[] courses){
        this.courses = courses;
        System.out.println("courses Length: " + this.courses.length);
    }
    
    public void dump(){
        System.out.println("id           : " + id);
        System.out.println("name         : " + name);
        System.out.println("created_at   : " + created_at);
        System.out.println("sortable_name: " + sortable_name);
        System.out.println("avatar_url   : " + avatar_url);
    }
    
}
