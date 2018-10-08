/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.v2.management.compute;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Specifies the network interfaces of the virtual machine.
 */
public final class NetworkProfile {
    /**
     * Specifies the list of resource Ids for the network interfaces associated
     * with the virtual machine.
     */
    @JsonProperty(value = "networkInterfaces")
    private List<NetworkInterfaceReference> networkInterfaces;

    /**
     * Get the networkInterfaces value.
     *
     * @return the networkInterfaces value.
     */
    public List<NetworkInterfaceReference> networkInterfaces() {
        return this.networkInterfaces;
    }

    /**
     * Set the networkInterfaces value.
     *
     * @param networkInterfaces the networkInterfaces value to set.
     * @return the NetworkProfile object itself.
     */
    public NetworkProfile withNetworkInterfaces(List<NetworkInterfaceReference> networkInterfaces) {
        this.networkInterfaces = networkInterfaces;
        return this;
    }
}