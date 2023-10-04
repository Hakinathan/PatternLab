package be.nathan.model;

public class Clone implements Cloneable {
    private String name;
    private String legion;
    private String planet;

    public Clone(String name, String legion, String planet) {
        this.name = name;
        this.legion = legion;
        this.planet = planet;
    }

    public String getName() {
        return name;
    }

    public String getLegion() {
        return legion;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLegion(String legion) {
        this.legion = legion;
    }


    @Override
    public Clone clone() {
        try {
            return (Clone) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
