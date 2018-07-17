/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicefabricmesh.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.azure.management.servicefabricmesh.ServiceReplicaProperties;

/**
 * This type describes a replica of a service resource.
 */
public class ServiceReplicaDescriptionInner extends ServiceReplicaProperties {
    /**
     * Name of the replica.
     */
    @JsonProperty(value = "replicaName")
    private String replicaName;

    /**
     * Get name of the replica.
     *
     * @return the replicaName value
     */
    public String replicaName() {
        return this.replicaName;
    }

    /**
     * Set name of the replica.
     *
     * @param replicaName the replicaName value to set
     * @return the ServiceReplicaDescriptionInner object itself.
     */
    public ServiceReplicaDescriptionInner withReplicaName(String replicaName) {
        this.replicaName = replicaName;
        return this;
    }

}
