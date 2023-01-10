// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ByoIpPrefixArgs extends com.pulumi.resources.ResourceArgs {

    public static final ByoIpPrefixArgs Empty = new ByoIpPrefixArgs();

    /**
     * The account identifier to target for the resource.
     * 
     */
    @Import(name="accountId", required=true)
    private Output<String> accountId;

    /**
     * @return The account identifier to target for the resource.
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }

    /**
     * Whether or not the prefix shall be announced. A prefix can be activated or deactivated once every 15 minutes (attempting more regular updates will trigger rate limiting). Available values: `on`, `off`.
     * 
     */
    @Import(name="advertisement")
    private @Nullable Output<String> advertisement;

    /**
     * @return Whether or not the prefix shall be announced. A prefix can be activated or deactivated once every 15 minutes (attempting more regular updates will trigger rate limiting). Available values: `on`, `off`.
     * 
     */
    public Optional<Output<String>> advertisement() {
        return Optional.ofNullable(this.advertisement);
    }

    /**
     * Description of the BYO IP prefix.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the BYO IP prefix.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The assigned Bring-Your-Own-IP prefix ID. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Import(name="prefixId", required=true)
    private Output<String> prefixId;

    /**
     * @return The assigned Bring-Your-Own-IP prefix ID. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<String> prefixId() {
        return this.prefixId;
    }

    private ByoIpPrefixArgs() {}

    private ByoIpPrefixArgs(ByoIpPrefixArgs $) {
        this.accountId = $.accountId;
        this.advertisement = $.advertisement;
        this.description = $.description;
        this.prefixId = $.prefixId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ByoIpPrefixArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ByoIpPrefixArgs $;

        public Builder() {
            $ = new ByoIpPrefixArgs();
        }

        public Builder(ByoIpPrefixArgs defaults) {
            $ = new ByoIpPrefixArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The account identifier to target for the resource.
         * 
         * @return builder
         * 
         */
        public Builder accountId(Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The account identifier to target for the resource.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param advertisement Whether or not the prefix shall be announced. A prefix can be activated or deactivated once every 15 minutes (attempting more regular updates will trigger rate limiting). Available values: `on`, `off`.
         * 
         * @return builder
         * 
         */
        public Builder advertisement(@Nullable Output<String> advertisement) {
            $.advertisement = advertisement;
            return this;
        }

        /**
         * @param advertisement Whether or not the prefix shall be announced. A prefix can be activated or deactivated once every 15 minutes (attempting more regular updates will trigger rate limiting). Available values: `on`, `off`.
         * 
         * @return builder
         * 
         */
        public Builder advertisement(String advertisement) {
            return advertisement(Output.of(advertisement));
        }

        /**
         * @param description Description of the BYO IP prefix.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the BYO IP prefix.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param prefixId The assigned Bring-Your-Own-IP prefix ID. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder prefixId(Output<String> prefixId) {
            $.prefixId = prefixId;
            return this;
        }

        /**
         * @param prefixId The assigned Bring-Your-Own-IP prefix ID. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder prefixId(String prefixId) {
            return prefixId(Output.of(prefixId));
        }

        public ByoIpPrefixArgs build() {
            $.accountId = Objects.requireNonNull($.accountId, "expected parameter 'accountId' to be non-null");
            $.prefixId = Objects.requireNonNull($.prefixId, "expected parameter 'prefixId' to be non-null");
            return $;
        }
    }

}