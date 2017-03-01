/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The GatewayRoute model.
 */
public class GatewayRoute {
    /**
     * The gateway's local address.
     */
    @JsonProperty(value = "localAddress", access = JsonProperty.Access.WRITE_ONLY)
    private String localAddress;

    /**
     * The route's network prefix.
     */
    @JsonProperty(value = "network", access = JsonProperty.Access.WRITE_ONLY)
    private String network;

    /**
     * The route's next hop.
     */
    @JsonProperty(value = "nextHop", access = JsonProperty.Access.WRITE_ONLY)
    private String nextHop;

    /**
     * The peer this route was learned from.
     */
    @JsonProperty(value = "sourcePeer", access = JsonProperty.Access.WRITE_ONLY)
    private String sourcePeer;

    /**
     * The source this route was learned from.
     */
    @JsonProperty(value = "origin", access = JsonProperty.Access.WRITE_ONLY)
    private String origin;

    /**
     * The route's AS path sequence.
     */
    @JsonProperty(value = "asPath", access = JsonProperty.Access.WRITE_ONLY)
    private String asPath;

    /**
     * The route's weight.
     */
    @JsonProperty(value = "weight", access = JsonProperty.Access.WRITE_ONLY)
    private Integer weight;

    /**
     * Get the localAddress value.
     *
     * @return the localAddress value
     */
    public String localAddress() {
        return this.localAddress;
    }

    /**
     * Get the network value.
     *
     * @return the network value
     */
    public String network() {
        return this.network;
    }

    /**
     * Get the nextHop value.
     *
     * @return the nextHop value
     */
    public String nextHop() {
        return this.nextHop;
    }

    /**
     * Get the sourcePeer value.
     *
     * @return the sourcePeer value
     */
    public String sourcePeer() {
        return this.sourcePeer;
    }

    /**
     * Get the origin value.
     *
     * @return the origin value
     */
    public String origin() {
        return this.origin;
    }

    /**
     * Get the asPath value.
     *
     * @return the asPath value
     */
    public String asPath() {
        return this.asPath;
    }

    /**
     * Get the weight value.
     *
     * @return the weight value
     */
    public Integer weight() {
        return this.weight;
    }

}
