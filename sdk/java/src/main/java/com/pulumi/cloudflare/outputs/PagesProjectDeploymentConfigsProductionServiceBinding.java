// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PagesProjectDeploymentConfigsProductionServiceBinding {
    private @Nullable String environment;
    /**
     * @return Name of the project.
     * 
     */
    private String name;
    private String service;

    private PagesProjectDeploymentConfigsProductionServiceBinding() {}
    public Optional<String> environment() {
        return Optional.ofNullable(this.environment);
    }
    /**
     * @return Name of the project.
     * 
     */
    public String name() {
        return this.name;
    }
    public String service() {
        return this.service;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PagesProjectDeploymentConfigsProductionServiceBinding defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String environment;
        private String name;
        private String service;
        public Builder() {}
        public Builder(PagesProjectDeploymentConfigsProductionServiceBinding defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.environment = defaults.environment;
    	      this.name = defaults.name;
    	      this.service = defaults.service;
        }

        @CustomType.Setter
        public Builder environment(@Nullable String environment) {
            this.environment = environment;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder service(String service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }
        public PagesProjectDeploymentConfigsProductionServiceBinding build() {
            final var o = new PagesProjectDeploymentConfigsProductionServiceBinding();
            o.environment = environment;
            o.name = name;
            o.service = service;
            return o;
        }
    }
}