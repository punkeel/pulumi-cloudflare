// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PagesProjectDeploymentConfigsProductionServiceBindingArgs extends com.pulumi.resources.ResourceArgs {

    public static final PagesProjectDeploymentConfigsProductionServiceBindingArgs Empty = new PagesProjectDeploymentConfigsProductionServiceBindingArgs();

    @Import(name="environment")
    private @Nullable Output<String> environment;

    public Optional<Output<String>> environment() {
        return Optional.ofNullable(this.environment);
    }

    /**
     * Name of the project. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name of the project. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    @Import(name="service", required=true)
    private Output<String> service;

    public Output<String> service() {
        return this.service;
    }

    private PagesProjectDeploymentConfigsProductionServiceBindingArgs() {}

    private PagesProjectDeploymentConfigsProductionServiceBindingArgs(PagesProjectDeploymentConfigsProductionServiceBindingArgs $) {
        this.environment = $.environment;
        this.name = $.name;
        this.service = $.service;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PagesProjectDeploymentConfigsProductionServiceBindingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PagesProjectDeploymentConfigsProductionServiceBindingArgs $;

        public Builder() {
            $ = new PagesProjectDeploymentConfigsProductionServiceBindingArgs();
        }

        public Builder(PagesProjectDeploymentConfigsProductionServiceBindingArgs defaults) {
            $ = new PagesProjectDeploymentConfigsProductionServiceBindingArgs(Objects.requireNonNull(defaults));
        }

        public Builder environment(@Nullable Output<String> environment) {
            $.environment = environment;
            return this;
        }

        public Builder environment(String environment) {
            return environment(Output.of(environment));
        }

        /**
         * @param name Name of the project. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the project. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder service(Output<String> service) {
            $.service = service;
            return this;
        }

        public Builder service(String service) {
            return service(Output.of(service));
        }

        public PagesProjectDeploymentConfigsProductionServiceBindingArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.service = Objects.requireNonNull($.service, "expected parameter 'service' to be non-null");
            return $;
        }
    }

}
