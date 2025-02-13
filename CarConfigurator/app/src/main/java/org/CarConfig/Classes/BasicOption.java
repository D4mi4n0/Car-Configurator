package org.CarConfig.Classes;

import org.CarConfig.Interfaces.Option;

/**
 * Represents a basic option for a car configuration.
 */
public class BasicOption implements Option {
    private String label;

    /**
     * Constructs a BasicOption with the specified label.
     *
     * @param label the label of the option
     */
    public BasicOption(String label) {
        this.label = label;
    }

    /**
     * Returns the label of the option.
     *
     * @return the label of the option
     */
    @Override
    public String getLabel() {
        return label;
    }
}