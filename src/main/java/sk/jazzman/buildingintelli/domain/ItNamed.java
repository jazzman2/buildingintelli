package sk.jazzman.buildingintelli.domain;

/**
 * {@link It} with name
 */
public abstract class ItNamed extends It {
    private final String name;

    /**
     * Default constructor
     *
     * @param id
     * @param name
     */
    public ItNamed(Long id, String name) {
        super(id);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
