package dochia.sebastian.g1093.prototype;

public abstract class User implements Cloneable {

    private String id;
    protected String type;

    abstract void connect();
    abstract void disconnect();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Object clone() {
        Object clone = null;

        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }
}
