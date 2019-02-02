package net.my;

public class Something {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isNew() {
        if (id == null) return true;
        return false;
    }

    @Override
    public String toString() {
        return "Something{" +
                "id=" + id +
                '}';
    }
}
