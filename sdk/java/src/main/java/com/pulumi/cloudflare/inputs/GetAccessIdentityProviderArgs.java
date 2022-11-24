// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAccessIdentityProviderArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAccessIdentityProviderArgs Empty = new GetAccessIdentityProviderArgs();

    /**
     * The account for which to look for an Access Identity Provider. Conflicts with `zone_id`.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return The account for which to look for an Access Identity Provider. Conflicts with `zone_id`.
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * Access Identity Provider name to search for.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Access Identity Provider name to search for.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The Zone&#39;s ID. Conflicts with `account_id`.
     * 
     */
    @Import(name="zoneId")
    private @Nullable Output<String> zoneId;

    /**
     * @return The Zone&#39;s ID. Conflicts with `account_id`.
     * 
     */
    public Optional<Output<String>> zoneId() {
        return Optional.ofNullable(this.zoneId);
    }

    private GetAccessIdentityProviderArgs() {}

    private GetAccessIdentityProviderArgs(GetAccessIdentityProviderArgs $) {
        this.accountId = $.accountId;
        this.name = $.name;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAccessIdentityProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAccessIdentityProviderArgs $;

        public Builder() {
            $ = new GetAccessIdentityProviderArgs();
        }

        public Builder(GetAccessIdentityProviderArgs defaults) {
            $ = new GetAccessIdentityProviderArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The account for which to look for an Access Identity Provider. Conflicts with `zone_id`.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The account for which to look for an Access Identity Provider. Conflicts with `zone_id`.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param name Access Identity Provider name to search for.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Access Identity Provider name to search for.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param zoneId The Zone&#39;s ID. Conflicts with `account_id`.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(@Nullable Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        /**
         * @param zoneId The Zone&#39;s ID. Conflicts with `account_id`.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public GetAccessIdentityProviderArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
