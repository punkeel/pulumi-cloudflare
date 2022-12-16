// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FilterState extends com.pulumi.resources.ResourceArgs {

    public static final FilterState Empty = new FilterState();

    /**
     * A note that you can use to describe the purpose of the filter.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A note that you can use to describe the purpose of the filter.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The filter expression to be used.
     * 
     */
    @Import(name="expression")
    private @Nullable Output<String> expression;

    /**
     * @return The filter expression to be used.
     * 
     */
    public Optional<Output<String>> expression() {
        return Optional.ofNullable(this.expression);
    }

    /**
     * Whether this filter is currently paused.
     * 
     */
    @Import(name="paused")
    private @Nullable Output<Boolean> paused;

    /**
     * @return Whether this filter is currently paused.
     * 
     */
    public Optional<Output<Boolean>> paused() {
        return Optional.ofNullable(this.paused);
    }

    /**
     * Short reference tag to quickly select related rules.
     * 
     */
    @Import(name="ref")
    private @Nullable Output<String> ref;

    /**
     * @return Short reference tag to quickly select related rules.
     * 
     */
    public Optional<Output<String>> ref() {
        return Optional.ofNullable(this.ref);
    }

    /**
     * The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Import(name="zoneId")
    private @Nullable Output<String> zoneId;

    /**
     * @return The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Optional<Output<String>> zoneId() {
        return Optional.ofNullable(this.zoneId);
    }

    private FilterState() {}

    private FilterState(FilterState $) {
        this.description = $.description;
        this.expression = $.expression;
        this.paused = $.paused;
        this.ref = $.ref;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FilterState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FilterState $;

        public Builder() {
            $ = new FilterState();
        }

        public Builder(FilterState defaults) {
            $ = new FilterState(Objects.requireNonNull(defaults));
        }

        /**
         * @param description A note that you can use to describe the purpose of the filter.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A note that you can use to describe the purpose of the filter.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param expression The filter expression to be used.
         * 
         * @return builder
         * 
         */
        public Builder expression(@Nullable Output<String> expression) {
            $.expression = expression;
            return this;
        }

        /**
         * @param expression The filter expression to be used.
         * 
         * @return builder
         * 
         */
        public Builder expression(String expression) {
            return expression(Output.of(expression));
        }

        /**
         * @param paused Whether this filter is currently paused.
         * 
         * @return builder
         * 
         */
        public Builder paused(@Nullable Output<Boolean> paused) {
            $.paused = paused;
            return this;
        }

        /**
         * @param paused Whether this filter is currently paused.
         * 
         * @return builder
         * 
         */
        public Builder paused(Boolean paused) {
            return paused(Output.of(paused));
        }

        /**
         * @param ref Short reference tag to quickly select related rules.
         * 
         * @return builder
         * 
         */
        public Builder ref(@Nullable Output<String> ref) {
            $.ref = ref;
            return this;
        }

        /**
         * @param ref Short reference tag to quickly select related rules.
         * 
         * @return builder
         * 
         */
        public Builder ref(String ref) {
            return ref(Output.of(ref));
        }

        /**
         * @param zoneId The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder zoneId(@Nullable Output<String> zoneId) {
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

        public FilterState build() {
            return $;
        }
    }

}
