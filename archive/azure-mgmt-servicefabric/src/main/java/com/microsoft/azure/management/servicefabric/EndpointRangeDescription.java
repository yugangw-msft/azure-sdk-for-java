/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicefabric;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Port range details.
 */
public class EndpointRangeDescription {
    /**
     * Starting port of a range of ports.
     */
    @JsonProperty(value = "startPort", required = true)
    private int startPort;

    /**
     * End port of a range of ports.
     */
    @JsonProperty(value = "endPort", required = true)
    private int endPort;

    /**
     * Get the startPort value.
     *
     * @return the startPort value
     */
    public int startPort() {
        return this.startPort;
    }

    /**
     * Set the startPort value.
     *
     * @param startPort the startPort value to set
     * @return the EndpointRangeDescription object itself.
     */
    public EndpointRangeDescription withStartPort(int startPort) {
        this.startPort = startPort;
        return this;
    }

    /**
     * Get the endPort value.
     *
     * @return the endPort value
     */
    public int endPort() {
        return this.endPort;
    }

    /**
     * Set the endPort value.
     *
     * @param endPort the endPort value to set
     * @return the EndpointRangeDescription object itself.
     */
    public EndpointRangeDescription withEndPort(int endPort) {
        this.endPort = endPort;
        return this;
    }

}
