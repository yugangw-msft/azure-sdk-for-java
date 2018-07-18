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

import rx.Completable;
import com.microsoft.azure.management.recoveryservices.backup.v2016_06_01.implementation.ItemLevelRecoveryConnectionsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing ItemLevelRecoveryConnections.
 */
public interface ItemLevelRecoveryConnections extends HasInner<ItemLevelRecoveryConnectionsInner> {
    /**
     * Revokes an iSCSI connection which can be used to download a script. Executing this script opens a file explorer displaying all recoverable files and folders. This is an asynchronous operation.
     *
     * @param vaultName The name of the Recovery Services vault.
     * @param resourceGroupName The name of the resource group associated with the Recovery Services vault.
     * @param fabricName The fabric name associated with the backup items. The value allowed is Azure.
     * @param containerName The container name associated with the backup items.
     * @param protectedItemName The name of the backup items whose files or folders will be restored.
     * @param recoveryPointId The string that identifies the recovery point. The iSCSI connection will be revoked for this protected data.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable revokeAsync(String vaultName, String resourceGroupName, String fabricName, String containerName, String protectedItemName, String recoveryPointId);

    /**
     * Provisions a script which invokes an iSCSI connection to the backup data. Executing this script opens File Explorer which displays the recoverable files and folders. This is an asynchronous operation. To get the provisioning status, call GetProtectedItemOperationResult API.
     *
     * @param vaultName The name of the Recovery Services vault.
     * @param resourceGroupName The name of the resource group associated with the Recovery Services vault.
     * @param fabricName The fabric name associated with the backup items.
     * @param containerName The container name associated with the backup items.
     * @param protectedItemName The name of the backup item whose files or folders are to be restored.
     * @param recoveryPointId The recovery point ID for backup data. The iSCSI connection will be provisioned for this backup data.
     * @param resourceILRRequest The resource Item Level Recovery (ILR) request.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable provisionAsync(String vaultName, String resourceGroupName, String fabricName, String containerName, String protectedItemName, String recoveryPointId, ILRRequestResource resourceILRRequest);

}