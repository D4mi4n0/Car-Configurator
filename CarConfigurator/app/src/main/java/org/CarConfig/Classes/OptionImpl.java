package org.CarConfig.Classes;

import org.CarConfig.Interfaces.Option;

/**
 * Represents an implementation of the Option interface.
 */
public class OptionImpl implements Option {
    private String label;

    /**
     * Constructs an OptionImpl with the specified label.
     *
     * @param label the label of the option
     */
    public OptionImpl(String label) {
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
