package NoFunctionality;
public class Post {

    private final int postID;
    private int name;

    public Post(int Name, int postID) {
        this.postID = IDGenerator.createPostID();
        this.name = Name;
    }

    public int getPostID() {
        return this.postID;
    }

    public int getName() {
        return this.name;
    }

    public void setName(int Name) {
        this.name = Name;
    }

}
