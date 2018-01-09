package sk.jazzman.buildingintelli.domain;

public class ItItem {
    Long id;
    String name;

    public ItItem(final Long id,final String name){
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
