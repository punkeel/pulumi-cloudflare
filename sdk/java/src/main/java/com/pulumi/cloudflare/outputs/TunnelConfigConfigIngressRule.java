// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TunnelConfigConfigIngressRule {
    private @Nullable String hostname;
    private @Nullable String path;
    private String service;

    private TunnelConfigConfigIngressRule() {}
    public Optional<String> hostname() {
        return Optional.ofNullable(this.hostname);
    }
    public Optional<String> path() {
        return Optional.ofNullable(this.path);
    }
    public String service() {
        return this.service;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TunnelConfigConfigIngressRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String hostname;
        private @Nullable String path;
        private String service;
        public Builder() {}
        public Builder(TunnelConfigConfigIngressRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostname = defaults.hostname;
    	      this.path = defaults.path;
    	      this.service = defaults.service;
        }

        @CustomType.Setter
        public Builder hostname(@Nullable String hostname) {
            this.hostname = hostname;
            return this;
        }
        @CustomType.Setter
        public Builder path(@Nullable String path) {
            this.path = path;
            return this;
        }
        @CustomType.Setter
        public Builder service(String service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }
        public TunnelConfigConfigIngressRule build() {
            final var o = new TunnelConfigConfigIngressRule();
            o.hostname = hostname;
            o.path = path;
            o.service = service;
            return o;
        }
    }
}