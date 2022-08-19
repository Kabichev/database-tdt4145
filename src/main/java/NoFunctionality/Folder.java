package NoFunctionality;

public final class Folder {

    private final int FolderID;
    private String FolderName; 
    private String CourseCode;
    private String ParentFolder;

    public int getFolderID() {
        return this.FolderID;
    }

    public void setFolderID(int FolderID) {
        this.FolderID = FolderID;
    }

    public String getFolderName() {
        return this.FolderName;
    }

    public void setFolderName(String FolderName) {
        this.FolderName = FolderName;
    }

    public String getCourseCode() {
        return this.CourseCode;
    }

    public void setCourseCode(String CourseCode) {
        this.CourseCode = CourseCode;
    }

    public String getParentFolder() {
        return this.ParentFolder;
    }

    public void setParentFolder(String ParentFolder) {
        this.ParentFolder = ParentFolder;
    }
}
