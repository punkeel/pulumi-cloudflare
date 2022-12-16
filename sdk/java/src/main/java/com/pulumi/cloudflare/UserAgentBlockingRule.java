// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.UserAgentBlockingRuleArgs;
import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.inputs.UserAgentBlockingRuleState;
import com.pulumi.cloudflare.outputs.UserAgentBlockingRuleConfiguration;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a resource to manage User Agent Blocking Rules.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.cloudflare.UserAgentBlockingRule;
 * import com.pulumi.cloudflare.UserAgentBlockingRuleArgs;
 * import com.pulumi.cloudflare.inputs.UserAgentBlockingRuleConfigurationArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var example1 = new UserAgentBlockingRule(&#34;example1&#34;, UserAgentBlockingRuleArgs.builder()        
 *             .configuration(UserAgentBlockingRuleConfigurationArgs.builder()
 *                 .target(&#34;ua&#34;)
 *                 .value(&#34;Chrome&#34;)
 *                 .build())
 *             .description(&#34;My description 1&#34;)
 *             .mode(&#34;js_challenge&#34;)
 *             .paused(false)
 *             .zoneId(&#34;0da42c8d2132a9ddaf714f9e7c920711&#34;)
 *             .build());
 * 
 *         var example2 = new UserAgentBlockingRule(&#34;example2&#34;, UserAgentBlockingRuleArgs.builder()        
 *             .configuration(UserAgentBlockingRuleConfigurationArgs.builder()
 *                 .target(&#34;ua&#34;)
 *                 .value(&#34;Mozilla&#34;)
 *                 .build())
 *             .description(&#34;My description 22&#34;)
 *             .mode(&#34;challenge&#34;)
 *             .paused(true)
 *             .zoneId(&#34;0da42c8d2132a9ddaf714f9e7c920711&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/userAgentBlockingRule:UserAgentBlockingRule")
public class UserAgentBlockingRule extends com.pulumi.resources.CustomResource {
    /**
     * The configuration object for the current rule.
     * 
     */
    @Export(name="configuration", type=UserAgentBlockingRuleConfiguration.class, parameters={})
    private Output<UserAgentBlockingRuleConfiguration> configuration;

    /**
     * @return The configuration object for the current rule.
     * 
     */
    public Output<UserAgentBlockingRuleConfiguration> configuration() {
        return this.configuration;
    }
    /**
     * An informative summary of the rule.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return An informative summary of the rule.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * The action to apply to a matched request. Available values: `block`, `challenge`, `js_challenge`, `managed_challenge`.
     * 
     */
    @Export(name="mode", type=String.class, parameters={})
    private Output<String> mode;

    /**
     * @return The action to apply to a matched request. Available values: `block`, `challenge`, `js_challenge`, `managed_challenge`.
     * 
     */
    public Output<String> mode() {
        return this.mode;
    }
    /**
     * When true, indicates that the rule is currently paused.
     * 
     */
    @Export(name="paused", type=Boolean.class, parameters={})
    private Output<Boolean> paused;

    /**
     * @return When true, indicates that the rule is currently paused.
     * 
     */
    public Output<Boolean> paused() {
        return this.paused;
    }
    /**
     * The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Export(name="zoneId", type=String.class, parameters={})
    private Output<String> zoneId;

    /**
     * @return The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public UserAgentBlockingRule(String name) {
        this(name, UserAgentBlockingRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public UserAgentBlockingRule(String name, UserAgentBlockingRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public UserAgentBlockingRule(String name, UserAgentBlockingRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/userAgentBlockingRule:UserAgentBlockingRule", name, args == null ? UserAgentBlockingRuleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private UserAgentBlockingRule(String name, Output<String> id, @Nullable UserAgentBlockingRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/userAgentBlockingRule:UserAgentBlockingRule", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static UserAgentBlockingRule get(String name, Output<String> id, @Nullable UserAgentBlockingRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new UserAgentBlockingRule(name, id, state, options);
    }
}
