package org.CarConfig.Classes;

/**
 * Represents a company with a name.
 */

public class Company {
    private String name;

    /**
     * Constructs a new Company instance.
     *
     * @param name the name of the company
     */
    public Company(String name) {
        this.name = name;
    }

    /**
     * Gets the name of the company.
     *
     * @return the name of the company
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
