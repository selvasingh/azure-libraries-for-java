/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.v2.management.network;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Properties of an application rule.
 */
public final class AzureFirewallApplicationRule {
    /**
     * Name of the application rule.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Description of the rule.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * List of source IP addresses for this rule.
     */
    @JsonProperty(value = "sourceAddresses")
    private List<String> sourceAddresses;

    /**
     * Array of ApplicationRuleProtocols.
     */
    @JsonProperty(value = "protocols")
    private List<AzureFirewallApplicationRuleProtocol> protocols;

    /**
     * List of URLs for this rule.
     */
    @JsonProperty(value = "targetUrls")
    private List<String> targetUrls;

    /**
     * Get the name value.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set.
     * @return the AzureFirewallApplicationRule object itself.
     */
    public AzureFirewallApplicationRule withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the description value.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description value.
     *
     * @param description the description value to set.
     * @return the AzureFirewallApplicationRule object itself.
     */
    public AzureFirewallApplicationRule withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the sourceAddresses value.
     *
     * @return the sourceAddresses value.
     */
    public List<String> sourceAddresses() {
        return this.sourceAddresses;
    }

    /**
     * Set the sourceAddresses value.
     *
     * @param sourceAddresses the sourceAddresses value to set.
     * @return the AzureFirewallApplicationRule object itself.
     */
    public AzureFirewallApplicationRule withSourceAddresses(List<String> sourceAddresses) {
        this.sourceAddresses = sourceAddresses;
        return this;
    }

    /**
     * Get the protocols value.
     *
     * @return the protocols value.
     */
    public List<AzureFirewallApplicationRuleProtocol> protocols() {
        return this.protocols;
    }

    /**
     * Set the protocols value.
     *
     * @param protocols the protocols value to set.
     * @return the AzureFirewallApplicationRule object itself.
     */
    public AzureFirewallApplicationRule withProtocols(List<AzureFirewallApplicationRuleProtocol> protocols) {
        this.protocols = protocols;
        return this;
    }

    /**
     * Get the targetUrls value.
     *
     * @return the targetUrls value.
     */
    public List<String> targetUrls() {
        return this.targetUrls;
    }

    /**
     * Set the targetUrls value.
     *
     * @param targetUrls the targetUrls value to set.
     * @return the AzureFirewallApplicationRule object itself.
     */
    public AzureFirewallApplicationRule withTargetUrls(List<String> targetUrls) {
        this.targetUrls = targetUrls;
        return this;
    }
}