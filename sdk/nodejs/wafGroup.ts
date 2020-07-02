// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a Cloudflare WAF rule group resource for a particular zone. This can be used to configure firewall behaviour for pre-defined firewall groups.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const honeyPot = new cloudflare.WafGroup("honey_pot", {
 *     groupId: "de677e5818985db1285d0e80225f06e5",
 *     mode: "on",
 *     zoneId: "ae36f999674d196762efcc5abb06b345",
 * });
 * ```
 */
export class WafGroup extends pulumi.CustomResource {
    /**
     * Get an existing WafGroup resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: WafGroupState, opts?: pulumi.CustomResourceOptions): WafGroup {
        return new WafGroup(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/wafGroup:WafGroup';

    /**
     * Returns true if the given object is an instance of WafGroup.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is WafGroup {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === WafGroup.__pulumiType;
    }

    /**
     * The WAF Rule Group ID.
     */
    public readonly groupId!: pulumi.Output<string>;
    /**
     * The mode of the group, can be one of ["on", "off"].
     */
    public readonly mode!: pulumi.Output<string | undefined>;
    /**
     * The ID of the WAF Rule Package that contains the group.
     */
    public readonly packageId!: pulumi.Output<string>;
    /**
     * The DNS zone ID to apply to.
     */
    public readonly zoneId!: pulumi.Output<string>;

    /**
     * Create a WafGroup resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: WafGroupArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: WafGroupArgs | WafGroupState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as WafGroupState | undefined;
            inputs["groupId"] = state ? state.groupId : undefined;
            inputs["mode"] = state ? state.mode : undefined;
            inputs["packageId"] = state ? state.packageId : undefined;
            inputs["zoneId"] = state ? state.zoneId : undefined;
        } else {
            const args = argsOrState as WafGroupArgs | undefined;
            if (!args || args.groupId === undefined) {
                throw new Error("Missing required property 'groupId'");
            }
            if (!args || args.zoneId === undefined) {
                throw new Error("Missing required property 'zoneId'");
            }
            inputs["groupId"] = args ? args.groupId : undefined;
            inputs["mode"] = args ? args.mode : undefined;
            inputs["packageId"] = args ? args.packageId : undefined;
            inputs["zoneId"] = args ? args.zoneId : undefined;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(WafGroup.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering WafGroup resources.
 */
export interface WafGroupState {
    /**
     * The WAF Rule Group ID.
     */
    readonly groupId?: pulumi.Input<string>;
    /**
     * The mode of the group, can be one of ["on", "off"].
     */
    readonly mode?: pulumi.Input<string>;
    /**
     * The ID of the WAF Rule Package that contains the group.
     */
    readonly packageId?: pulumi.Input<string>;
    /**
     * The DNS zone ID to apply to.
     */
    readonly zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a WafGroup resource.
 */
export interface WafGroupArgs {
    /**
     * The WAF Rule Group ID.
     */
    readonly groupId: pulumi.Input<string>;
    /**
     * The mode of the group, can be one of ["on", "off"].
     */
    readonly mode?: pulumi.Input<string>;
    /**
     * The ID of the WAF Rule Package that contains the group.
     */
    readonly packageId?: pulumi.Input<string>;
    /**
     * The DNS zone ID to apply to.
     */
    readonly zoneId: pulumi.Input<string>;
}
