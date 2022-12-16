// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ZoneArgs extends com.pulumi.resources.ResourceArgs {

    public static final ZoneArgs Empty = new ZoneArgs();

    /**
     * Account ID to manage the zone resource in.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return Account ID to manage the zone resource in.
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * Whether to scan for DNS records on creation. Ignored after zone is created.
     * 
     */
    @Import(name="jumpStart")
    private @Nullable Output<Boolean> jumpStart;

    /**
     * @return Whether to scan for DNS records on creation. Ignored after zone is created.
     * 
     */
    public Optional<Output<Boolean>> jumpStart() {
        return Optional.ofNullable(this.jumpStart);
    }

    /**
     * Whether this zone is paused (traffic bypasses Cloudflare). Defaults to `false`.
     * 
     */
    @Import(name="paused")
    private @Nullable Output<Boolean> paused;

    /**
     * @return Whether this zone is paused (traffic bypasses Cloudflare). Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> paused() {
        return Optional.ofNullable(this.paused);
    }

    /**
     * The name of the commercial plan to apply to the zone. Available values: `free`, `lite`, `pro`, `pro_plus`, `business`, `enterprise`, `partners_free`, `partners_pro`, `partners_business`, `partners_enterprise`.
     * 
     */
    @Import(name="plan")
    private @Nullable Output<String> plan;

    /**
     * @return The name of the commercial plan to apply to the zone. Available values: `free`, `lite`, `pro`, `pro_plus`, `business`, `enterprise`, `partners_free`, `partners_pro`, `partners_business`, `partners_enterprise`.
     * 
     */
    public Optional<Output<String>> plan() {
        return Optional.ofNullable(this.plan);
    }

    /**
     * A full zone implies that DNS is hosted with Cloudflare. A partial zone is typically a partner-hosted zone or a CNAME setup. Available values: `full`, `partial`. Defaults to `full`.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return A full zone implies that DNS is hosted with Cloudflare. A partial zone is typically a partner-hosted zone or a CNAME setup. Available values: `full`, `partial`. Defaults to `full`.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * The DNS zone name which will be added. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Import(name="zone", required=true)
    private Output<String> zone;

    /**
     * @return The DNS zone name which will be added. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<String> zone() {
        return this.zone;
    }

    private ZoneArgs() {}

    private ZoneArgs(ZoneArgs $) {
        this.accountId = $.accountId;
        this.jumpStart = $.jumpStart;
        this.paused = $.paused;
        this.plan = $.plan;
        this.type = $.type;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ZoneArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ZoneArgs $;

        public Builder() {
            $ = new ZoneArgs();
        }

        public Builder(ZoneArgs defaults) {
            $ = new ZoneArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId Account ID to manage the zone resource in.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId Account ID to manage the zone resource in.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param jumpStart Whether to scan for DNS records on creation. Ignored after zone is created.
         * 
         * @return builder
         * 
         */
        public Builder jumpStart(@Nullable Output<Boolean> jumpStart) {
            $.jumpStart = jumpStart;
            return this;
        }

        /**
         * @param jumpStart Whether to scan for DNS records on creation. Ignored after zone is created.
         * 
         * @return builder
         * 
         */
        public Builder jumpStart(Boolean jumpStart) {
            return jumpStart(Output.of(jumpStart));
        }

        /**
         * @param paused Whether this zone is paused (traffic bypasses Cloudflare). Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder paused(@Nullable Output<Boolean> paused) {
            $.paused = paused;
            return this;
        }

        /**
         * @param paused Whether this zone is paused (traffic bypasses Cloudflare). Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder paused(Boolean paused) {
            return paused(Output.of(paused));
        }

        /**
         * @param plan The name of the commercial plan to apply to the zone. Available values: `free`, `lite`, `pro`, `pro_plus`, `business`, `enterprise`, `partners_free`, `partners_pro`, `partners_business`, `partners_enterprise`.
         * 
         * @return builder
         * 
         */
        public Builder plan(@Nullable Output<String> plan) {
            $.plan = plan;
            return this;
        }

        /**
         * @param plan The name of the commercial plan to apply to the zone. Available values: `free`, `lite`, `pro`, `pro_plus`, `business`, `enterprise`, `partners_free`, `partners_pro`, `partners_business`, `partners_enterprise`.
         * 
         * @return builder
         * 
         */
        public Builder plan(String plan) {
            return plan(Output.of(plan));
        }

        /**
         * @param type A full zone implies that DNS is hosted with Cloudflare. A partial zone is typically a partner-hosted zone or a CNAME setup. Available values: `full`, `partial`. Defaults to `full`.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type A full zone implies that DNS is hosted with Cloudflare. A partial zone is typically a partner-hosted zone or a CNAME setup. Available values: `full`, `partial`. Defaults to `full`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param zone The DNS zone name which will be added. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder zone(Output<String> zone) {
            $.zone = zone;
            return this;
        }

        /**
         * @param zone The DNS zone name which will be added. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder zone(String zone) {
            return zone(Output.of(zone));
        }

        public ZoneArgs build() {
            $.zone = Objects.requireNonNull($.zone, "expected parameter 'zone' to be non-null");
            return $;
        }
    }

}
