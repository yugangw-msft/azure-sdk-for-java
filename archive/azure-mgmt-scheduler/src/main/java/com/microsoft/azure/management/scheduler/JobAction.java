/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.scheduler;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The JobAction model.
 */
public class JobAction {
    /**
     * Gets or sets the job action type. Possible values include: 'Http',
     * 'Https', 'StorageQueue', 'ServiceBusQueue', 'ServiceBusTopic'.
     */
    @JsonProperty(value = "type")
    private JobActionType type;

    /**
     * Gets or sets the http requests.
     */
    @JsonProperty(value = "request")
    private HttpRequest request;

    /**
     * Gets or sets the storage queue message.
     */
    @JsonProperty(value = "queueMessage")
    private StorageQueueMessage queueMessage;

    /**
     * Gets or sets the service bus queue message.
     */
    @JsonProperty(value = "serviceBusQueueMessage")
    private ServiceBusQueueMessage serviceBusQueueMessage;

    /**
     * Gets or sets the service bus topic message.
     */
    @JsonProperty(value = "serviceBusTopicMessage")
    private ServiceBusTopicMessage serviceBusTopicMessage;

    /**
     * Gets or sets the retry policy.
     */
    @JsonProperty(value = "retryPolicy")
    private RetryPolicy retryPolicy;

    /**
     * Gets or sets the error action.
     */
    @JsonProperty(value = "errorAction")
    private JobErrorAction errorAction;

    /**
     * Get the type value.
     *
     * @return the type value
     */
    public JobActionType type() {
        return this.type;
    }

    /**
     * Set the type value.
     *
     * @param type the type value to set
     * @return the JobAction object itself.
     */
    public JobAction withType(JobActionType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the request value.
     *
     * @return the request value
     */
    public HttpRequest request() {
        return this.request;
    }

    /**
     * Set the request value.
     *
     * @param request the request value to set
     * @return the JobAction object itself.
     */
    public JobAction withRequest(HttpRequest request) {
        this.request = request;
        return this;
    }

    /**
     * Get the queueMessage value.
     *
     * @return the queueMessage value
     */
    public StorageQueueMessage queueMessage() {
        return this.queueMessage;
    }

    /**
     * Set the queueMessage value.
     *
     * @param queueMessage the queueMessage value to set
     * @return the JobAction object itself.
     */
    public JobAction withQueueMessage(StorageQueueMessage queueMessage) {
        this.queueMessage = queueMessage;
        return this;
    }

    /**
     * Get the serviceBusQueueMessage value.
     *
     * @return the serviceBusQueueMessage value
     */
    public ServiceBusQueueMessage serviceBusQueueMessage() {
        return this.serviceBusQueueMessage;
    }

    /**
     * Set the serviceBusQueueMessage value.
     *
     * @param serviceBusQueueMessage the serviceBusQueueMessage value to set
     * @return the JobAction object itself.
     */
    public JobAction withServiceBusQueueMessage(ServiceBusQueueMessage serviceBusQueueMessage) {
        this.serviceBusQueueMessage = serviceBusQueueMessage;
        return this;
    }

    /**
     * Get the serviceBusTopicMessage value.
     *
     * @return the serviceBusTopicMessage value
     */
    public ServiceBusTopicMessage serviceBusTopicMessage() {
        return this.serviceBusTopicMessage;
    }

    /**
     * Set the serviceBusTopicMessage value.
     *
     * @param serviceBusTopicMessage the serviceBusTopicMessage value to set
     * @return the JobAction object itself.
     */
    public JobAction withServiceBusTopicMessage(ServiceBusTopicMessage serviceBusTopicMessage) {
        this.serviceBusTopicMessage = serviceBusTopicMessage;
        return this;
    }

    /**
     * Get the retryPolicy value.
     *
     * @return the retryPolicy value
     */
    public RetryPolicy retryPolicy() {
        return this.retryPolicy;
    }

    /**
     * Set the retryPolicy value.
     *
     * @param retryPolicy the retryPolicy value to set
     * @return the JobAction object itself.
     */
    public JobAction withRetryPolicy(RetryPolicy retryPolicy) {
        this.retryPolicy = retryPolicy;
        return this;
    }

    /**
     * Get the errorAction value.
     *
     * @return the errorAction value
     */
    public JobErrorAction errorAction() {
        return this.errorAction;
    }

    /**
     * Set the errorAction value.
     *
     * @param errorAction the errorAction value to set
     * @return the JobAction object itself.
     */
    public JobAction withErrorAction(JobErrorAction errorAction) {
        this.errorAction = errorAction;
        return this;
    }

}
