// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a Cloudflare Access Application resource. Access Applications
 * are used to restrict access to a whole application using an
 * authorisation gateway managed by Cloudflare.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const stagingApp = new cloudflare.AccessApplication("staging_app", {
 *     domain: "staging.example.com",
 *     name: "staging application",
 *     sessionDuration: "24h",
 *     zoneId: "1d5fdc9e88c8a8c4518b068cd94331fe",
 * });
 * ```
 */
export class AccessApplication extends pulumi.CustomResource {
    /**
     * Get an existing AccessApplication resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AccessApplicationState, opts?: pulumi.CustomResourceOptions): AccessApplication {
        return new AccessApplication(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/accessApplication:AccessApplication';

    /**
     * Returns true if the given object is an instance of AccessApplication.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AccessApplication {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AccessApplication.__pulumiType;
    }

    /**
     * Application Audience (AUD) Tag of the application
     */
    public /*out*/ readonly aud!: pulumi.Output<string>;
    /**
     * The complete URL of the asset you wish to put
     * Cloudflare Access in front of. Can include subdomains or paths. Or both.
     */
    public readonly domain!: pulumi.Output<string>;
    /**
     * Friendly name of the Access Application.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * How often a user will be forced to
     * re-authorise. Must be one of `30m`, `6h`, `12h`, `24h`, `168h`, `730h`.
     */
    public readonly sessionDuration!: pulumi.Output<string | undefined>;
    /**
     * The DNS zone to which the access rule should be added.
     */
    public readonly zoneId!: pulumi.Output<string>;

    /**
     * Create a AccessApplication resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AccessApplicationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AccessApplicationArgs | AccessApplicationState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as AccessApplicationState | undefined;
            inputs["aud"] = state ? state.aud : undefined;
            inputs["domain"] = state ? state.domain : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["sessionDuration"] = state ? state.sessionDuration : undefined;
            inputs["zoneId"] = state ? state.zoneId : undefined;
        } else {
            const args = argsOrState as AccessApplicationArgs | undefined;
            if (!args || args.domain === undefined) {
                throw new Error("Missing required property 'domain'");
            }
            if (!args || args.name === undefined) {
                throw new Error("Missing required property 'name'");
            }
            if (!args || args.zoneId === undefined) {
                throw new Error("Missing required property 'zoneId'");
            }
            inputs["domain"] = args ? args.domain : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["sessionDuration"] = args ? args.sessionDuration : undefined;
            inputs["zoneId"] = args ? args.zoneId : undefined;
            inputs["aud"] = undefined /*out*/;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(AccessApplication.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AccessApplication resources.
 */
export interface AccessApplicationState {
    /**
     * Application Audience (AUD) Tag of the application
     */
    readonly aud?: pulumi.Input<string>;
    /**
     * The complete URL of the asset you wish to put
     * Cloudflare Access in front of. Can include subdomains or paths. Or both.
     */
    readonly domain?: pulumi.Input<string>;
    /**
     * Friendly name of the Access Application.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * How often a user will be forced to
     * re-authorise. Must be one of `30m`, `6h`, `12h`, `24h`, `168h`, `730h`.
     */
    readonly sessionDuration?: pulumi.Input<string>;
    /**
     * The DNS zone to which the access rule should be added.
     */
    readonly zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AccessApplication resource.
 */
export interface AccessApplicationArgs {
    /**
     * The complete URL of the asset you wish to put
     * Cloudflare Access in front of. Can include subdomains or paths. Or both.
     */
    readonly domain: pulumi.Input<string>;
    /**
     * Friendly name of the Access Application.
     */
    readonly name: pulumi.Input<string>;
    /**
     * How often a user will be forced to
     * re-authorise. Must be one of `30m`, `6h`, `12h`, `24h`, `168h`, `730h`.
     */
    readonly sessionDuration?: pulumi.Input<string>;
    /**
     * The DNS zone to which the access rule should be added.
     */
    readonly zoneId: pulumi.Input<string>;
}
