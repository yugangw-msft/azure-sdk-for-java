/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 2.3.31.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2016_06_01;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.azure.management.recoveryservices.backup.v2016_06_01.implementation.ProtectionContainerInner;

/**
 * Azure SQL workload-specific container.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "protectableObjectType")
@JsonTypeName("AzureSqlContainer")
public class AzureSqlContainer extends ProtectionContainerInner {
}