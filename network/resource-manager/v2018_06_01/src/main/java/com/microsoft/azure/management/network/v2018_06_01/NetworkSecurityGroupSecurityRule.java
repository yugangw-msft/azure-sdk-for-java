/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_06_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.network.v2018_06_01.implementation.SecurityRuleInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2018_06_01.implementation.NetworkManager;
import java.util.List;
import com.microsoft.azure.management.network.v2018_06_01.implementation.ApplicationSecurityGroupInner;

/**
 * Type representing NetworkSecurityGroupSecurityRule.
 */
public interface NetworkSecurityGroupSecurityRule extends HasInner<SecurityRuleInner>, Indexable, Refreshable<NetworkSecurityGroupSecurityRule>, Updatable<NetworkSecurityGroupSecurityRule.Update>, HasManager<NetworkManager> {
    /**
     * @return the access value.
     */
    SecurityRuleAccess access();

    /**
     * @return the description value.
     */
    String description();

    /**
     * @return the destinationAddressPrefix value.
     */
    String destinationAddressPrefix();

    /**
     * @return the destinationAddressPrefixes value.
     */
    List<String> destinationAddressPrefixes();

    /**
     * @return the destinationApplicationSecurityGroups value.
     */
    List<ApplicationSecurityGroup> destinationApplicationSecurityGroups();

    /**
     * @return the destinationPortRange value.
     */
    String destinationPortRange();

    /**
     * @return the destinationPortRanges value.
     */
    List<String> destinationPortRanges();

    /**
     * @return the direction value.
     */
    SecurityRuleDirection direction();

    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the priority value.
     */
    Integer priority();

    /**
     * @return the protocol value.
     */
    SecurityRuleProtocol protocol();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * @return the sourceAddressPrefix value.
     */
    String sourceAddressPrefix();

    /**
     * @return the sourceAddressPrefixes value.
     */
    List<String> sourceAddressPrefixes();

    /**
     * @return the sourceApplicationSecurityGroups value.
     */
    List<ApplicationSecurityGroup> sourceApplicationSecurityGroups();

    /**
     * @return the sourcePortRange value.
     */
    String sourcePortRange();

    /**
     * @return the sourcePortRanges value.
     */
    List<String> sourcePortRanges();

    /**
     * The entirety of the NetworkSecurityGroupSecurityRule definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithNetworkSecurityGroup, DefinitionStages.WithAccess, DefinitionStages.WithDirection, DefinitionStages.WithProtocol, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of NetworkSecurityGroupSecurityRule definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a NetworkSecurityGroupSecurityRule definition.
         */
        interface Blank extends WithNetworkSecurityGroup {
        }

        /**
         * The stage of the networksecuritygroupsecurityrule definition allowing to specify NetworkSecurityGroup.
         */
        interface WithNetworkSecurityGroup {
           /**
            * Specifies resourceGroupName, networkSecurityGroupName.
            */
            WithAccess withExistingNetworkSecurityGroup(String resourceGroupName, String networkSecurityGroupName);
        }

        /**
         * The stage of the networksecuritygroupsecurityrule definition allowing to specify Access.
         */
        interface WithAccess {
           /**
            * Specifies access.
            */
            WithDirection withAccess(SecurityRuleAccess access);
        }

        /**
         * The stage of the networksecuritygroupsecurityrule definition allowing to specify Direction.
         */
        interface WithDirection {
           /**
            * Specifies direction.
            */
            WithProtocol withDirection(SecurityRuleDirection direction);
        }

        /**
         * The stage of the networksecuritygroupsecurityrule definition allowing to specify Protocol.
         */
        interface WithProtocol {
           /**
            * Specifies protocol.
            */
            WithCreate withProtocol(SecurityRuleProtocol protocol);
        }

        /**
         * The stage of the networksecuritygroupsecurityrule definition allowing to specify Description.
         */
        interface WithDescription {
            /**
             * Specifies description.
             */
            WithCreate withDescription(String description);
        }

        /**
         * The stage of the networksecuritygroupsecurityrule definition allowing to specify DestinationAddressPrefix.
         */
        interface WithDestinationAddressPrefix {
            /**
             * Specifies destinationAddressPrefix.
             */
            WithCreate withDestinationAddressPrefix(String destinationAddressPrefix);
        }

        /**
         * The stage of the networksecuritygroupsecurityrule definition allowing to specify DestinationAddressPrefixes.
         */
        interface WithDestinationAddressPrefixes {
            /**
             * Specifies destinationAddressPrefixes.
             */
            WithCreate withDestinationAddressPrefixes(List<String> destinationAddressPrefixes);
        }

        /**
         * The stage of the networksecuritygroupsecurityrule definition allowing to specify DestinationApplicationSecurityGroups.
         */
        interface WithDestinationApplicationSecurityGroups {
            /**
             * Specifies destinationApplicationSecurityGroups.
             */
            WithCreate withDestinationApplicationSecurityGroups(List<ApplicationSecurityGroupInner> destinationApplicationSecurityGroups);
        }

        /**
         * The stage of the networksecuritygroupsecurityrule definition allowing to specify DestinationPortRange.
         */
        interface WithDestinationPortRange {
            /**
             * Specifies destinationPortRange.
             */
            WithCreate withDestinationPortRange(String destinationPortRange);
        }

        /**
         * The stage of the networksecuritygroupsecurityrule definition allowing to specify DestinationPortRanges.
         */
        interface WithDestinationPortRanges {
            /**
             * Specifies destinationPortRanges.
             */
            WithCreate withDestinationPortRanges(List<String> destinationPortRanges);
        }

        /**
         * The stage of the networksecuritygroupsecurityrule definition allowing to specify Etag.
         */
        interface WithEtag {
            /**
             * Specifies etag.
             */
            WithCreate withEtag(String etag);
        }

        /**
         * The stage of the networksecuritygroupsecurityrule definition allowing to specify Id.
         */
        interface WithId {
            /**
             * Specifies id.
             */
            WithCreate withId(String id);
        }

        /**
         * The stage of the networksecuritygroupsecurityrule definition allowing to specify Name.
         */
        interface WithName {
            /**
             * Specifies name.
             */
            WithCreate withName(String name);
        }

        /**
         * The stage of the networksecuritygroupsecurityrule definition allowing to specify Priority.
         */
        interface WithPriority {
            /**
             * Specifies priority.
             */
            WithCreate withPriority(Integer priority);
        }

        /**
         * The stage of the networksecuritygroupsecurityrule definition allowing to specify ProvisioningState.
         */
        interface WithProvisioningState {
            /**
             * Specifies provisioningState.
             */
            WithCreate withProvisioningState(String provisioningState);
        }

        /**
         * The stage of the networksecuritygroupsecurityrule definition allowing to specify SourceAddressPrefix.
         */
        interface WithSourceAddressPrefix {
            /**
             * Specifies sourceAddressPrefix.
             */
            WithCreate withSourceAddressPrefix(String sourceAddressPrefix);
        }

        /**
         * The stage of the networksecuritygroupsecurityrule definition allowing to specify SourceAddressPrefixes.
         */
        interface WithSourceAddressPrefixes {
            /**
             * Specifies sourceAddressPrefixes.
             */
            WithCreate withSourceAddressPrefixes(List<String> sourceAddressPrefixes);
        }

        /**
         * The stage of the networksecuritygroupsecurityrule definition allowing to specify SourceApplicationSecurityGroups.
         */
        interface WithSourceApplicationSecurityGroups {
            /**
             * Specifies sourceApplicationSecurityGroups.
             */
            WithCreate withSourceApplicationSecurityGroups(List<ApplicationSecurityGroupInner> sourceApplicationSecurityGroups);
        }

        /**
         * The stage of the networksecuritygroupsecurityrule definition allowing to specify SourcePortRange.
         */
        interface WithSourcePortRange {
            /**
             * Specifies sourcePortRange.
             */
            WithCreate withSourcePortRange(String sourcePortRange);
        }

        /**
         * The stage of the networksecuritygroupsecurityrule definition allowing to specify SourcePortRanges.
         */
        interface WithSourcePortRanges {
            /**
             * Specifies sourcePortRanges.
             */
            WithCreate withSourcePortRanges(List<String> sourcePortRanges);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<NetworkSecurityGroupSecurityRule>, DefinitionStages.WithDescription, DefinitionStages.WithDestinationAddressPrefix, DefinitionStages.WithDestinationAddressPrefixes, DefinitionStages.WithDestinationApplicationSecurityGroups, DefinitionStages.WithDestinationPortRange, DefinitionStages.WithDestinationPortRanges, DefinitionStages.WithEtag, DefinitionStages.WithId, DefinitionStages.WithName, DefinitionStages.WithPriority, DefinitionStages.WithProvisioningState, DefinitionStages.WithSourceAddressPrefix, DefinitionStages.WithSourceAddressPrefixes, DefinitionStages.WithSourceApplicationSecurityGroups, DefinitionStages.WithSourcePortRange, DefinitionStages.WithSourcePortRanges {
        }
    }
    /**
     * The template for a NetworkSecurityGroupSecurityRule update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<NetworkSecurityGroupSecurityRule>, UpdateStages.WithDescription, UpdateStages.WithDestinationAddressPrefix, UpdateStages.WithDestinationAddressPrefixes, UpdateStages.WithDestinationApplicationSecurityGroups, UpdateStages.WithDestinationPortRange, UpdateStages.WithDestinationPortRanges, UpdateStages.WithEtag, UpdateStages.WithId, UpdateStages.WithName, UpdateStages.WithPriority, UpdateStages.WithProvisioningState, UpdateStages.WithSourceAddressPrefix, UpdateStages.WithSourceAddressPrefixes, UpdateStages.WithSourceApplicationSecurityGroups, UpdateStages.WithSourcePortRange, UpdateStages.WithSourcePortRanges {
    }

    /**
     * Grouping of NetworkSecurityGroupSecurityRule update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the networksecuritygroupsecurityrule update allowing to specify Description.
         */
        interface WithDescription {
            /**
             * Specifies description.
             */
            Update withDescription(String description);
        }

        /**
         * The stage of the networksecuritygroupsecurityrule update allowing to specify DestinationAddressPrefix.
         */
        interface WithDestinationAddressPrefix {
            /**
             * Specifies destinationAddressPrefix.
             */
            Update withDestinationAddressPrefix(String destinationAddressPrefix);
        }

        /**
         * The stage of the networksecuritygroupsecurityrule update allowing to specify DestinationAddressPrefixes.
         */
        interface WithDestinationAddressPrefixes {
            /**
             * Specifies destinationAddressPrefixes.
             */
            Update withDestinationAddressPrefixes(List<String> destinationAddressPrefixes);
        }

        /**
         * The stage of the networksecuritygroupsecurityrule update allowing to specify DestinationApplicationSecurityGroups.
         */
        interface WithDestinationApplicationSecurityGroups {
            /**
             * Specifies destinationApplicationSecurityGroups.
             */
            Update withDestinationApplicationSecurityGroups(List<ApplicationSecurityGroupInner> destinationApplicationSecurityGroups);
        }

        /**
         * The stage of the networksecuritygroupsecurityrule update allowing to specify DestinationPortRange.
         */
        interface WithDestinationPortRange {
            /**
             * Specifies destinationPortRange.
             */
            Update withDestinationPortRange(String destinationPortRange);
        }

        /**
         * The stage of the networksecuritygroupsecurityrule update allowing to specify DestinationPortRanges.
         */
        interface WithDestinationPortRanges {
            /**
             * Specifies destinationPortRanges.
             */
            Update withDestinationPortRanges(List<String> destinationPortRanges);
        }

        /**
         * The stage of the networksecuritygroupsecurityrule update allowing to specify Etag.
         */
        interface WithEtag {
            /**
             * Specifies etag.
             */
            Update withEtag(String etag);
        }

        /**
         * The stage of the networksecuritygroupsecurityrule update allowing to specify Id.
         */
        interface WithId {
            /**
             * Specifies id.
             */
            Update withId(String id);
        }

        /**
         * The stage of the networksecuritygroupsecurityrule update allowing to specify Name.
         */
        interface WithName {
            /**
             * Specifies name.
             */
            Update withName(String name);
        }

        /**
         * The stage of the networksecuritygroupsecurityrule update allowing to specify Priority.
         */
        interface WithPriority {
            /**
             * Specifies priority.
             */
            Update withPriority(Integer priority);
        }

        /**
         * The stage of the networksecuritygroupsecurityrule update allowing to specify ProvisioningState.
         */
        interface WithProvisioningState {
            /**
             * Specifies provisioningState.
             */
            Update withProvisioningState(String provisioningState);
        }

        /**
         * The stage of the networksecuritygroupsecurityrule update allowing to specify SourceAddressPrefix.
         */
        interface WithSourceAddressPrefix {
            /**
             * Specifies sourceAddressPrefix.
             */
            Update withSourceAddressPrefix(String sourceAddressPrefix);
        }

        /**
         * The stage of the networksecuritygroupsecurityrule update allowing to specify SourceAddressPrefixes.
         */
        interface WithSourceAddressPrefixes {
            /**
             * Specifies sourceAddressPrefixes.
             */
            Update withSourceAddressPrefixes(List<String> sourceAddressPrefixes);
        }

        /**
         * The stage of the networksecuritygroupsecurityrule update allowing to specify SourceApplicationSecurityGroups.
         */
        interface WithSourceApplicationSecurityGroups {
            /**
             * Specifies sourceApplicationSecurityGroups.
             */
            Update withSourceApplicationSecurityGroups(List<ApplicationSecurityGroupInner> sourceApplicationSecurityGroups);
        }

        /**
         * The stage of the networksecuritygroupsecurityrule update allowing to specify SourcePortRange.
         */
        interface WithSourcePortRange {
            /**
             * Specifies sourcePortRange.
             */
            Update withSourcePortRange(String sourcePortRange);
        }

        /**
         * The stage of the networksecuritygroupsecurityrule update allowing to specify SourcePortRanges.
         */
        interface WithSourcePortRanges {
            /**
             * Specifies sourcePortRanges.
             */
            Update withSourcePortRanges(List<String> sourcePortRanges);
        }

    }
}