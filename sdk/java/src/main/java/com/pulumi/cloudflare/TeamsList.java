// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.TeamsListArgs;
import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.inputs.TeamsListState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Cloudflare Teams List resource. Teams lists are referenced when creating secure web gateway policies or device posture rules.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.cloudflare.TeamsList;
 * import com.pulumi.cloudflare.TeamsListArgs;
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
 *         var corporateDevices = new TeamsList(&#34;corporateDevices&#34;, TeamsListArgs.builder()        
 *             .accountId(&#34;1d5fdc9e88c8a8c4518b068cd94331fe&#34;)
 *             .description(&#34;Serial numbers for all corporate devices.&#34;)
 *             .items(            
 *                 &#34;8GE8721REF&#34;,
 *                 &#34;5RE8543EGG&#34;,
 *                 &#34;1YE2880LNP&#34;)
 *             .name(&#34;Corporate devices&#34;)
 *             .type(&#34;SERIAL&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Teams lists can be imported using a composite ID formed of account ID and teams list ID.
 * 
 * ```sh
 *  $ pulumi import cloudflare:index/teamsList:TeamsList corporate_devices cb029e245cfdd66dc8d2e570d5dd3322/d41d8cd98f00b204e9800998ecf8427e
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/teamsList:TeamsList")
public class TeamsList extends com.pulumi.resources.CustomResource {
    /**
     * The account to which the teams list should be added.
     * 
     */
    @Export(name="accountId", type=String.class, parameters={})
    private Output<String> accountId;

    /**
     * @return The account to which the teams list should be added.
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }
    /**
     * The description of the teams list.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the teams list.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The items of the teams list.
     * 
     */
    @Export(name="items", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> items;

    /**
     * @return The items of the teams list.
     * 
     */
    public Output<Optional<List<String>>> items() {
        return Codegen.optional(this.items);
    }
    /**
     * Name of the teams list.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the teams list.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The teams list type. Valid values are `IP`, `SERIAL`, `URL`, `DOMAIN`, and `EMAIL`.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The teams list type. Valid values are `IP`, `SERIAL`, `URL`, `DOMAIN`, and `EMAIL`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TeamsList(String name) {
        this(name, TeamsListArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TeamsList(String name, TeamsListArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TeamsList(String name, TeamsListArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/teamsList:TeamsList", name, args == null ? TeamsListArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TeamsList(String name, Output<String> id, @Nullable TeamsListState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/teamsList:TeamsList", name, state, makeResourceOptions(options, id));
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
    public static TeamsList get(String name, Output<String> id, @Nullable TeamsListState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TeamsList(name, id, state, options);
    }
}