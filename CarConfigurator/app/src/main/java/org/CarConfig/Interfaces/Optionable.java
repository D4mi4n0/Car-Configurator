package org.CarConfig.Interfaces;

import java.util.List;

/**
 * Represents an entity that can have options added to it.
 */
public interface Optionable {
    /**
     * Adds an option to the entity.
     *
     * @param option the option to add
     */
    void addOptions(Option option);

    /**
     * Returns the list of options of the entity.
     *
     * @return the list of options of the entity
     */
    List<Option> getOptions();
}
