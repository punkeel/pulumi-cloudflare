// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkerRouteArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkerRouteArgs Empty = new WorkerRouteArgs();

    /**
     * The [route pattern](https://developers.cloudflare.com/workers/about/routes/) to associate the Worker with.
     * 
     */
    @Import(name="pattern", required=true)
    private Output<String> pattern;

    /**
     * @return The [route pattern](https://developers.cloudflare.com/workers/about/routes/) to associate the Worker with.
     * 
     */
    public Output<String> pattern() {
        return this.pattern;
    }

    /**
     * Worker script name to invoke for requests that match the route pattern.
     * 
     */
    @Import(name="scriptName")
    private @Nullable Output<String> scriptName;

    /**
     * @return Worker script name to invoke for requests that match the route pattern.
     * 
     */
    public Optional<Output<String>> scriptName() {
        return Optional.ofNullable(this.scriptName);
    }

    /**
     * The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Import(name="zoneId", required=true)
    private Output<String> zoneId;

    /**
     * @return The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    private WorkerRouteArgs() {}

    private WorkerRouteArgs(WorkerRouteArgs $) {
        this.pattern = $.pattern;
        this.scriptName = $.scriptName;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkerRouteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkerRouteArgs $;

        public Builder() {
            $ = new WorkerRouteArgs();
        }

        public Builder(WorkerRouteArgs defaults) {
            $ = new WorkerRouteArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param pattern The [route pattern](https://developers.cloudflare.com/workers/about/routes/) to associate the Worker with.
         * 
         * @return builder
         * 
         */
        public Builder pattern(Output<String> pattern) {
            $.pattern = pattern;
            return this;
        }

        /**
         * @param pattern The [route pattern](https://developers.cloudflare.com/workers/about/routes/) to associate the Worker with.
         * 
         * @return builder
         * 
         */
        public Builder pattern(String pattern) {
            return pattern(Output.of(pattern));
        }

        /**
         * @param scriptName Worker script name to invoke for requests that match the route pattern.
         * 
         * @return builder
         * 
         */
        public Builder scriptName(@Nullable Output<String> scriptName) {
            $.scriptName = scriptName;
            return this;
        }

        /**
         * @param scriptName Worker script name to invoke for requests that match the route pattern.
         * 
         * @return builder
         * 
         */
        public Builder scriptName(String scriptName) {
            return scriptName(Output.of(scriptName));
        }

        /**
         * @param zoneId The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder zoneId(Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        /**
         * @param zoneId The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public WorkerRouteArgs build() {
            $.pattern = Objects.requireNonNull($.pattern, "expected parameter 'pattern' to be non-null");
            $.zoneId = Objects.requireNonNull($.zoneId, "expected parameter 'zoneId' to be non-null");
            return $;
        }
    }

}