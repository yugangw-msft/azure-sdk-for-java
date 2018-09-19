/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2017_03_30.implementation;

import com.microsoft.azure.management.compute.v2017_03_30.VirtualMachine;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import java.util.Map;
import com.microsoft.azure.management.compute.v2017_03_30.Plan;
import com.microsoft.azure.management.compute.v2017_03_30.HardwareProfile;
import com.microsoft.azure.management.compute.v2017_03_30.StorageProfile;
import com.microsoft.azure.management.compute.v2017_03_30.OSProfile;
import com.microsoft.azure.management.compute.v2017_03_30.NetworkProfile;
import com.microsoft.azure.management.compute.v2017_03_30.DiagnosticsProfile;
import com.microsoft.azure.SubResource;
import java.util.List;
import com.microsoft.azure.management.compute.v2017_03_30.VirtualMachineIdentity;
import com.microsoft.azure.management.compute.v2017_03_30.VirtualMachineInstanceView;
import java.util.ArrayList;
import com.microsoft.azure.management.compute.v2017_03_30.VirtualMachineExtension;

class VirtualMachineImpl extends CreatableUpdatableImpl<VirtualMachine, VirtualMachineInner, VirtualMachineImpl> implements VirtualMachine, VirtualMachine.Definition, VirtualMachine.Update {
    private final ComputeManager manager;
    private String resourceGroupName;
    private String vmName;

    VirtualMachineImpl(String name, ComputeManager manager) {
        super(name, new VirtualMachineInner());
        this.manager = manager;
        // Set resource name
        this.vmName = name;
        //
    }

    VirtualMachineImpl(VirtualMachineInner inner, ComputeManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.vmName = inner.name();
        // resource ancestor names
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.vmName = IdParsingUtils.getValueFromIdByName(inner.id(), "virtualMachines");
        //
    }

    @Override
    public ComputeManager manager() {
        return this.manager;
    }

    @Override
    public Observable<VirtualMachine> createResourceAsync() {
        VirtualMachinesInner client = this.manager().inner().virtualMachines();
        return client.createOrUpdateAsync(this.resourceGroupName, this.vmName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<VirtualMachine> updateResourceAsync() {
        VirtualMachinesInner client = this.manager().inner().virtualMachines();
        return client.createOrUpdateAsync(this.resourceGroupName, this.vmName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<VirtualMachineInner> getInnerAsync() {
        VirtualMachinesInner client = this.manager().inner().virtualMachines();
        return null; // NOP getInnerAsync implementation as get is not supported
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public SubResource availabilitySet() {
        return this.inner().availabilitySet();
    }

    @Override
    public DiagnosticsProfile diagnosticsProfile() {
        return this.inner().diagnosticsProfile();
    }

    @Override
    public HardwareProfile hardwareProfile() {
        return this.inner().hardwareProfile();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public VirtualMachineIdentity identity() {
        return this.inner().identity();
    }

    @Override
    public VirtualMachineInstanceView instanceView() {
        VirtualMachineInstanceViewInner inner = this.inner().instanceView();
        if (inner != null) {
            return  new VirtualMachineInstanceViewImpl(inner, manager());
        } else {
            return null;
        }
    }

    @Override
    public String licenseType() {
        return this.inner().licenseType();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public NetworkProfile networkProfile() {
        return this.inner().networkProfile();
    }

    @Override
    public OSProfile osProfile() {
        return this.inner().osProfile();
    }

    @Override
    public Plan plan() {
        return this.inner().plan();
    }

    @Override
    public String provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public List<VirtualMachineExtension> resources() {
        List<VirtualMachineExtension> lst = new ArrayList<VirtualMachineExtension>();
        if (this.inner().resources() != null) {
            for (VirtualMachineExtensionInner inner : this.inner().resources()) {
                lst.add( new VirtualMachineExtensionImpl(inner, manager()));
            }
        }
        return lst;
    }

    @Override
    public StorageProfile storageProfile() {
        return this.inner().storageProfile();
    }

    @Override
    public Map<String, String> tags() {
        return this.inner().getTags();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public String vmId() {
        return this.inner().vmId();
    }

    @Override
    public List<String> zones() {
        return this.inner().zones();
    }

    @Override
    public VirtualMachineImpl withExistingLocation(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    @Override
    public VirtualMachineImpl withLocation(String location) {
        this.inner().withLocation(location);
        return this;
    }

    @Override
    public VirtualMachineImpl withAvailabilitySet(SubResource availabilitySet) {
        this.inner().withAvailabilitySet(availabilitySet);
        return this;
    }

    @Override
    public VirtualMachineImpl withDiagnosticsProfile(DiagnosticsProfile diagnosticsProfile) {
        this.inner().withDiagnosticsProfile(diagnosticsProfile);
        return this;
    }

    @Override
    public VirtualMachineImpl withHardwareProfile(HardwareProfile hardwareProfile) {
        this.inner().withHardwareProfile(hardwareProfile);
        return this;
    }

    @Override
    public VirtualMachineImpl withIdentity(VirtualMachineIdentity identity) {
        this.inner().withIdentity(identity);
        return this;
    }

    @Override
    public VirtualMachineImpl withLicenseType(String licenseType) {
        this.inner().withLicenseType(licenseType);
        return this;
    }

    @Override
    public VirtualMachineImpl withNetworkProfile(NetworkProfile networkProfile) {
        this.inner().withNetworkProfile(networkProfile);
        return this;
    }

    @Override
    public VirtualMachineImpl withOsProfile(OSProfile osProfile) {
        this.inner().withOsProfile(osProfile);
        return this;
    }

    @Override
    public VirtualMachineImpl withPlan(Plan plan) {
        this.inner().withPlan(plan);
        return this;
    }

    @Override
    public VirtualMachineImpl withStorageProfile(StorageProfile storageProfile) {
        this.inner().withStorageProfile(storageProfile);
        return this;
    }

    @Override
    public VirtualMachineImpl withTags(Map<String, String> tags) {
        this.inner().withTags(tags);
        return this;
    }

    @Override
    public VirtualMachineImpl withZones(List<String> zones) {
        this.inner().withZones(zones);
        return this;
    }

}
