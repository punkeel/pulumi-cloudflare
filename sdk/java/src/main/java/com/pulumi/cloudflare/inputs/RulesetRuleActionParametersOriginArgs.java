// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RulesetRuleActionParametersOriginArgs extends com.pulumi.resources.ResourceArgs {

    public static final RulesetRuleActionParametersOriginArgs Empty = new RulesetRuleActionParametersOriginArgs();

    @Import(name="host")
    private @Nullable Output<String> host;

    public Optional<Output<String>> host() {
        return Optional.ofNullable(this.host);
    }

    @Import(name="port")
    private @Nullable Output<Integer> port;

    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    private RulesetRuleActionParametersOriginArgs() {}

    private RulesetRuleActionParametersOriginArgs(RulesetRuleActionParametersOriginArgs $) {
        this.host = $.host;
        this.port = $.port;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RulesetRuleActionParametersOriginArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RulesetRuleActionParametersOriginArgs $;

        public Builder() {
            $ = new RulesetRuleActionParametersOriginArgs();
        }

        public Builder(RulesetRuleActionParametersOriginArgs defaults) {
            $ = new RulesetRuleActionParametersOriginArgs(Objects.requireNonNull(defaults));
        }

        public Builder host(@Nullable Output<String> host) {
            $.host = host;
            return this;
        }

        public Builder host(String host) {
            return host(Output.of(host));
        }

        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        public RulesetRuleActionParametersOriginArgs build() {
            return $;
        }
    }

}