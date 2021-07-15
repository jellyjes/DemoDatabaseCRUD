package sg.edu.rp.c346.id20047778.demodatabasecrud;

import java.io.Serializable;

public class Note {
    private int id;
    private String noteContent;

    public Note(int id, String noteContent) {
        this.id = id;
        this.noteContent = noteContent;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNoteContent(String noteContent) {
        this.noteContent = noteContent;
    }

    @Override
    public String toString() {
        return "ID:" + id + ", " +
                "noteContent= " + noteContent;
    }

    public int getId() {
        return id;
    }


    public String getNoteContent() {
        return noteContent;
    }

}
