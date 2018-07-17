/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicefabricmesh;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This type describes properties of a volume resource.
 */
public class VolumeProperties {
    /**
     * User readable description of the volume.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Provider of the volume.
     */
    @JsonProperty(value = "provider", required = true)
    private String provider;

    /**
     * This type describes a volume provided by an Azure Files file share.
     */
    @JsonProperty(value = "azureFileParameters")
    private VolumeProviderParametersAzureFile azureFileParameters;

    /**
     * Creates an instance of VolumeProperties class.
     */
    public VolumeProperties() {
        provider = "SFAzureFile";
    }

    /**
     * Get user readable description of the volume.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set user readable description of the volume.
     *
     * @param description the description value to set
     * @return the VolumeProperties object itself.
     */
    public VolumeProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get provider of the volume.
     *
     * @return the provider value
     */
    public String provider() {
        return this.provider;
    }

    /**
     * Set provider of the volume.
     *
     * @param provider the provider value to set
     * @return the VolumeProperties object itself.
     */
    public VolumeProperties withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * Get this type describes a volume provided by an Azure Files file share.
     *
     * @return the azureFileParameters value
     */
    public VolumeProviderParametersAzureFile azureFileParameters() {
        return this.azureFileParameters;
    }

    /**
     * Set this type describes a volume provided by an Azure Files file share.
     *
     * @param azureFileParameters the azureFileParameters value to set
     * @return the VolumeProperties object itself.
     */
    public VolumeProperties withAzureFileParameters(VolumeProviderParametersAzureFile azureFileParameters) {
        this.azureFileParameters = azureFileParameters;
        return this;
    }

}
