/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2018_09_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.containerregistry.v2018_09_01.implementation.TaskInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.containerregistry.v2018_09_01.implementation.ContainerRegistryManager;
import java.util.Map;
import org.joda.time.DateTime;

/**
 * Type representing Task.
 */
public interface Task extends HasInner<TaskInner>, Indexable, Refreshable<Task>, Updatable<Task.Update>, HasManager<ContainerRegistryManager> {
    /**
     * @return the agentConfiguration value.
     */
    AgentProperties agentConfiguration();

    /**
     * @return the creationDate value.
     */
    DateTime creationDate();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the platform value.
     */
    PlatformProperties platform();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the status value.
     */
    TaskStatus status();

    /**
     * @return the step value.
     */
    TaskStepProperties step();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the timeout value.
     */
    Integer timeout();

    /**
     * @return the trigger value.
     */
    TriggerProperties trigger();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the Task definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithRegistry, DefinitionStages.WithLocation, DefinitionStages.WithPlatform, DefinitionStages.WithStep, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of Task definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a Task definition.
         */
        interface Blank extends WithRegistry {
        }

        /**
         * The stage of the task definition allowing to specify Registry.
         */
        interface WithRegistry {
           /**
            * Specifies resourceGroupName, registryName.
            */
            WithLocation withExistingRegistry(String resourceGroupName, String registryName);
        }

        /**
         * The stage of the task definition allowing to specify Location.
         */
        interface WithLocation {
           /**
            * Specifies location.
            */
            WithPlatform withLocation(String location);
        }

        /**
         * The stage of the task definition allowing to specify Platform.
         */
        interface WithPlatform {
           /**
            * Specifies platform.
            */
            WithStep withPlatform(PlatformProperties platform);
        }

        /**
         * The stage of the task definition allowing to specify Step.
         */
        interface WithStep {
           /**
            * Specifies step.
            */
            WithCreate withStep(TaskStepProperties step);
        }

        /**
         * The stage of the task definition allowing to specify AgentConfiguration.
         */
        interface WithAgentConfiguration {
            /**
             * Specifies agentConfiguration.
             */
            WithCreate withAgentConfiguration(AgentProperties agentConfiguration);
        }

        /**
         * The stage of the task definition allowing to specify Status.
         */
        interface WithStatus {
            /**
             * Specifies status.
             */
            WithCreate withStatus(TaskStatus status);
        }

        /**
         * The stage of the task definition allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the task definition allowing to specify Timeout.
         */
        interface WithTimeout {
            /**
             * Specifies timeout.
             */
            WithCreate withTimeout(Integer timeout);
        }

        /**
         * The stage of the task definition allowing to specify Trigger.
         */
        interface WithTrigger {
            /**
             * Specifies trigger.
             */
            WithCreate withTrigger(TriggerProperties trigger);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<Task>, DefinitionStages.WithAgentConfiguration, DefinitionStages.WithStatus, DefinitionStages.WithTags, DefinitionStages.WithTimeout, DefinitionStages.WithTrigger {
        }
    }
    /**
     * The template for a Task update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<Task>, UpdateStages.WithAgentConfiguration, UpdateStages.WithPlatform, UpdateStages.WithStatus, UpdateStages.WithStep, UpdateStages.WithTags, UpdateStages.WithTimeout, UpdateStages.WithTrigger {
    }

    /**
     * Grouping of Task update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the task update allowing to specify AgentConfiguration.
         */
        interface WithAgentConfiguration {
            /**
             * Specifies agentConfiguration.
             */
            Update withAgentConfiguration(AgentProperties agentConfiguration);
        }

        /**
         * The stage of the task update allowing to specify Platform.
         */
        interface WithPlatform {
            /**
             * Specifies platform.
             */
            Update withPlatform(PlatformUpdateParameters platform);
        }

        /**
         * The stage of the task update allowing to specify Status.
         */
        interface WithStatus {
            /**
             * Specifies status.
             */
            Update withStatus(TaskStatus status);
        }

        /**
         * The stage of the task update allowing to specify Step.
         */
        interface WithStep {
            /**
             * Specifies step.
             */
            Update withStep(TaskStepUpdateParameters step);
        }

        /**
         * The stage of the task update allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             */
            Update withTags(Map<String, String> tags);
        }

        /**
         * The stage of the task update allowing to specify Timeout.
         */
        interface WithTimeout {
            /**
             * Specifies timeout.
             */
            Update withTimeout(Integer timeout);
        }

        /**
         * The stage of the task update allowing to specify Trigger.
         */
        interface WithTrigger {
            /**
             * Specifies trigger.
             */
            Update withTrigger(TriggerUpdateParameters trigger);
        }

    }
}