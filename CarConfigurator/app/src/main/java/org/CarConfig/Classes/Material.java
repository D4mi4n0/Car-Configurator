package org.CarConfig.Classes;

import org.CarConfig.Interfaces.Option;

/**
 * Represents a material option for a car configuration.
 */
public class Material implements Option {
    private String label;

    /**
     * Constructs a Material with the specified label.
     *
     * @param label the label of the material
     */
    public Material(String label) {
        this.label = label;
    }

    /**
     * Returns the label of the material.
     *
     * @return the label of the material
     */
    @Override
    public String getLabel() {
        return label;
    }
}
