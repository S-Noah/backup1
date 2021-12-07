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
public class CanvasCourse {
    private int id;
    private String name;
    private int enrollment_term_id;
    private String course_code;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getEnrollment_term_id() {
        return enrollment_term_id;
    }

    public String getCourse_code() {
        return course_code;
    }
    
    
    public void dump(){
        System.out.println("id           : " + id);
        System.out.println("name         : " + name);
        System.out.println("enrollment_term_id   : " + enrollment_term_id);
        System.out.println("course_code: " + course_code);
    }
    @Override
    public String toString(){
        return course_code;
    }
    
}
