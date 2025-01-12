// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.TunnelConfigConfigIngressRule;
import com.pulumi.cloudflare.outputs.TunnelConfigConfigOriginRequest;
import com.pulumi.cloudflare.outputs.TunnelConfigConfigWarpRouting;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TunnelConfigConfig {
    /**
     * @return Each incoming request received by cloudflared causes cloudflared to send a request to a local service. This section configures the rules that determine which requests are sent to which local services. [Read more](https://developers.cloudflare.com/cloudflare-one/connections/connect-apps/install-and-setup/tunnel-guide/local/local-management/ingress/).
     * 
     */
    private List<TunnelConfigConfigIngressRule> ingressRules;
    private @Nullable TunnelConfigConfigOriginRequest originRequest;
    /**
     * @return If you&#39;re exposing a [private network](https://developers.cloudflare.com/cloudflare-one/connections/connect-apps/private-net/), you need to add the `warp-routing` key and set it to `true`.
     * 
     */
    private @Nullable TunnelConfigConfigWarpRouting warpRouting;

    private TunnelConfigConfig() {}
    /**
     * @return Each incoming request received by cloudflared causes cloudflared to send a request to a local service. This section configures the rules that determine which requests are sent to which local services. [Read more](https://developers.cloudflare.com/cloudflare-one/connections/connect-apps/install-and-setup/tunnel-guide/local/local-management/ingress/).
     * 
     */
    public List<TunnelConfigConfigIngressRule> ingressRules() {
        return this.ingressRules;
    }
    public Optional<TunnelConfigConfigOriginRequest> originRequest() {
        return Optional.ofNullable(this.originRequest);
    }
    /**
     * @return If you&#39;re exposing a [private network](https://developers.cloudflare.com/cloudflare-one/connections/connect-apps/private-net/), you need to add the `warp-routing` key and set it to `true`.
     * 
     */
    public Optional<TunnelConfigConfigWarpRouting> warpRouting() {
        return Optional.ofNullable(this.warpRouting);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TunnelConfigConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<TunnelConfigConfigIngressRule> ingressRules;
        private @Nullable TunnelConfigConfigOriginRequest originRequest;
        private @Nullable TunnelConfigConfigWarpRouting warpRouting;
        public Builder() {}
        public Builder(TunnelConfigConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ingressRules = defaults.ingressRules;
    	      this.originRequest = defaults.originRequest;
    	      this.warpRouting = defaults.warpRouting;
        }

        @CustomType.Setter
        public Builder ingressRules(List<TunnelConfigConfigIngressRule> ingressRules) {
            this.ingressRules = Objects.requireNonNull(ingressRules);
            return this;
        }
        public Builder ingressRules(TunnelConfigConfigIngressRule... ingressRules) {
            return ingressRules(List.of(ingressRules));
        }
        @CustomType.Setter
        public Builder originRequest(@Nullable TunnelConfigConfigOriginRequest originRequest) {
            this.originRequest = originRequest;
            return this;
        }
        @CustomType.Setter
        public Builder warpRouting(@Nullable TunnelConfigConfigWarpRouting warpRouting) {
            this.warpRouting = warpRouting;
            return this;
        }
        public TunnelConfigConfig build() {
            final var o = new TunnelConfigConfig();
            o.ingressRules = ingressRules;
            o.originRequest = originRequest;
            o.warpRouting = warpRouting;
            return o;
        }
    }
}
