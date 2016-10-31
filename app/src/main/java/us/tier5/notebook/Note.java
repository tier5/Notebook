package us.tier5.notebook;

/**
 * Created by root on 31/10/16.
 */

public class Note {
    private String title, message;
    private long noteId, dateCreatedMili;
    private Category category;
    public enum Category {
        PERSONAL,
        TECHNICAL,
        QUOTE,
        FINANCE
    }
    public Note(String title, String message, Category category) {
        this.title = title;
        this.message = message;
        this.category = category;
        this.noteId = 0;
        this.dateCreatedMili = 0;
    }
    //overload constructor
    public Note(String title, String message, Category category, long noteId, long dateCreatedMili){
        this.title = title;
        this.message = message;
        this.category = category;
        this.noteId = noteId;
        this.dateCreatedMili = dateCreatedMili;
    }
    public String getTitle() {
        return title;
    }
    public String getMessage() {
        return message;
    }
    public Category getCategory(){
        return category;
    }
    public long getDate() {
        return dateCreatedMili;
    }
    public long getnoteId() {
        return noteId;
    }
    public String toString(){
        return "ID: " + noteId + "Title: " + title + "message: " + message + "IconId:" + category.name() + "Date: ";

    }
    public int getAssociatedDrawable(){
        return categoryToDrawable(category);
    }
    public static int categoryToDrawable(Category notecategory){
        return R.drawable.cog;
    }
}
