// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.inputs.SplitTunnelTunnelArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SplitTunnelArgs extends com.pulumi.resources.ResourceArgs {

    public static final SplitTunnelArgs Empty = new SplitTunnelArgs();

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
     * The mode of the split tunnel policy. Available values: `include`, `exclude`.
     * 
     */
    @Import(name="mode", required=true)
    private Output<String> mode;

    /**
     * @return The mode of the split tunnel policy. Available values: `include`, `exclude`.
     * 
     */
    public Output<String> mode() {
        return this.mode;
    }

    /**
     * The settings policy for which to configure this split tunnel policy.
     * 
     */
    @Import(name="policyId")
    private @Nullable Output<String> policyId;

    /**
     * @return The settings policy for which to configure this split tunnel policy.
     * 
     */
    public Optional<Output<String>> policyId() {
        return Optional.ofNullable(this.policyId);
    }

    /**
     * The value of the tunnel attributes.
     * 
     */
    @Import(name="tunnels", required=true)
    private Output<List<SplitTunnelTunnelArgs>> tunnels;

    /**
     * @return The value of the tunnel attributes.
     * 
     */
    public Output<List<SplitTunnelTunnelArgs>> tunnels() {
        return this.tunnels;
    }

    private SplitTunnelArgs() {}

    private SplitTunnelArgs(SplitTunnelArgs $) {
        this.accountId = $.accountId;
        this.mode = $.mode;
        this.policyId = $.policyId;
        this.tunnels = $.tunnels;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SplitTunnelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SplitTunnelArgs $;

        public Builder() {
            $ = new SplitTunnelArgs();
        }

        public Builder(SplitTunnelArgs defaults) {
            $ = new SplitTunnelArgs(Objects.requireNonNull(defaults));
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
         * @param mode The mode of the split tunnel policy. Available values: `include`, `exclude`.
         * 
         * @return builder
         * 
         */
        public Builder mode(Output<String> mode) {
            $.mode = mode;
            return this;
        }

        /**
         * @param mode The mode of the split tunnel policy. Available values: `include`, `exclude`.
         * 
         * @return builder
         * 
         */
        public Builder mode(String mode) {
            return mode(Output.of(mode));
        }

        /**
         * @param policyId The settings policy for which to configure this split tunnel policy.
         * 
         * @return builder
         * 
         */
        public Builder policyId(@Nullable Output<String> policyId) {
            $.policyId = policyId;
            return this;
        }

        /**
         * @param policyId The settings policy for which to configure this split tunnel policy.
         * 
         * @return builder
         * 
         */
        public Builder policyId(String policyId) {
            return policyId(Output.of(policyId));
        }

        /**
         * @param tunnels The value of the tunnel attributes.
         * 
         * @return builder
         * 
         */
        public Builder tunnels(Output<List<SplitTunnelTunnelArgs>> tunnels) {
            $.tunnels = tunnels;
            return this;
        }

        /**
         * @param tunnels The value of the tunnel attributes.
         * 
         * @return builder
         * 
         */
        public Builder tunnels(List<SplitTunnelTunnelArgs> tunnels) {
            return tunnels(Output.of(tunnels));
        }

        /**
         * @param tunnels The value of the tunnel attributes.
         * 
         * @return builder
         * 
         */
        public Builder tunnels(SplitTunnelTunnelArgs... tunnels) {
            return tunnels(List.of(tunnels));
        }

        public SplitTunnelArgs build() {
            $.accountId = Objects.requireNonNull($.accountId, "expected parameter 'accountId' to be non-null");
            $.mode = Objects.requireNonNull($.mode, "expected parameter 'mode' to be non-null");
            $.tunnels = Objects.requireNonNull($.tunnels, "expected parameter 'tunnels' to be non-null");
            return $;
        }
    }

}