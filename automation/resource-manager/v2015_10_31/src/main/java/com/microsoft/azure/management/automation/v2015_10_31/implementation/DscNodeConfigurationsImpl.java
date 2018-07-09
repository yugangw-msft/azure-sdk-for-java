/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.automation.v2015_10_31.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.automation.v2015_10_31.DscNodeConfigurations;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.automation.v2015_10_31.DscNodeConfiguration;

class DscNodeConfigurationsImpl extends WrapperImpl<DscNodeConfigurationsInner> implements DscNodeConfigurations {
    private final AutomationManager manager;

    DscNodeConfigurationsImpl(AutomationManager manager) {
        super(manager.inner().dscNodeConfigurations());
        this.manager = manager;
    }

    public AutomationManager manager() {
        return this.manager;
    }

    @Override
    public DscNodeConfigurationImpl define(String name) {
        return wrapModel(name);
    }

    private DscNodeConfigurationImpl wrapModel(DscNodeConfigurationInner inner) {
        return  new DscNodeConfigurationImpl(inner, manager());
    }

    private DscNodeConfigurationImpl wrapModel(String name) {
        return new DscNodeConfigurationImpl(name, this.manager());
    }

    @Override
    public Observable<DscNodeConfiguration> listByAutomationAccountAsync(final String resourceGroupName, final String automationAccountName) {
        DscNodeConfigurationsInner client = this.inner();
        return client.listByAutomationAccountAsync(resourceGroupName, automationAccountName)
        .flatMapIterable(new Func1<Page<DscNodeConfigurationInner>, Iterable<DscNodeConfigurationInner>>() {
            @Override
            public Iterable<DscNodeConfigurationInner> call(Page<DscNodeConfigurationInner> page) {
                return page.items();
            }
        })
        .map(new Func1<DscNodeConfigurationInner, DscNodeConfiguration>() {
            @Override
            public DscNodeConfiguration call(DscNodeConfigurationInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<DscNodeConfiguration> getAsync(String resourceGroupName, String automationAccountName, String nodeConfigurationName) {
        DscNodeConfigurationsInner client = this.inner();
        return client.getAsync(resourceGroupName, automationAccountName, nodeConfigurationName)
        .map(new Func1<DscNodeConfigurationInner, DscNodeConfiguration>() {
            @Override
            public DscNodeConfiguration call(DscNodeConfigurationInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String automationAccountName, String nodeConfigurationName) {
        DscNodeConfigurationsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, automationAccountName, nodeConfigurationName).toCompletable();
    }

}