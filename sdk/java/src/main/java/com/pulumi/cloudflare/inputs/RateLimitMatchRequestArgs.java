// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RateLimitMatchRequestArgs extends com.pulumi.resources.ResourceArgs {

    public static final RateLimitMatchRequestArgs Empty = new RateLimitMatchRequestArgs();

    @Import(name="methods")
    private @Nullable Output<List<String>> methods;

    public Optional<Output<List<String>>> methods() {
        return Optional.ofNullable(this.methods);
    }

    @Import(name="schemes")
    private @Nullable Output<List<String>> schemes;

    public Optional<Output<List<String>>> schemes() {
        return Optional.ofNullable(this.schemes);
    }

    @Import(name="urlPattern")
    private @Nullable Output<String> urlPattern;

    public Optional<Output<String>> urlPattern() {
        return Optional.ofNullable(this.urlPattern);
    }

    private RateLimitMatchRequestArgs() {}

    private RateLimitMatchRequestArgs(RateLimitMatchRequestArgs $) {
        this.methods = $.methods;
        this.schemes = $.schemes;
        this.urlPattern = $.urlPattern;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RateLimitMatchRequestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RateLimitMatchRequestArgs $;

        public Builder() {
            $ = new RateLimitMatchRequestArgs();
        }

        public Builder(RateLimitMatchRequestArgs defaults) {
            $ = new RateLimitMatchRequestArgs(Objects.requireNonNull(defaults));
        }

        public Builder methods(@Nullable Output<List<String>> methods) {
            $.methods = methods;
            return this;
        }

        public Builder methods(List<String> methods) {
            return methods(Output.of(methods));
        }

        public Builder methods(String... methods) {
            return methods(List.of(methods));
        }

        public Builder schemes(@Nullable Output<List<String>> schemes) {
            $.schemes = schemes;
            return this;
        }

        public Builder schemes(List<String> schemes) {
            return schemes(Output.of(schemes));
        }

        public Builder schemes(String... schemes) {
            return schemes(List.of(schemes));
        }

        public Builder urlPattern(@Nullable Output<String> urlPattern) {
            $.urlPattern = urlPattern;
            return this;
        }

        public Builder urlPattern(String urlPattern) {
            return urlPattern(Output.of(urlPattern));
        }

        public RateLimitMatchRequestArgs build() {
            return $;
        }
    }

}
