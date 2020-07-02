// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides a Cloudflare Zone resource. Zone is the basic resource for working with Cloudflare and is roughly equivalent to a domain name that the user purchases.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const example = new cloudflare.Zone("example", {
 *     zone: "example.com",
 * });
 * ```
 */
export class Zone extends pulumi.CustomResource {
    /**
     * Get an existing Zone resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ZoneState, opts?: pulumi.CustomResourceOptions): Zone {
        return new Zone(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/zone:Zone';

    /**
     * Returns true if the given object is an instance of Zone.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Zone {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Zone.__pulumiType;
    }

    /**
     * Boolean of whether to scan for DNS records on creation. Ignored after zone is created. Default: false.
     */
    public readonly jumpStart!: pulumi.Output<boolean | undefined>;
    public /*out*/ readonly meta!: pulumi.Output<outputs.ZoneMeta>;
    /**
     * Cloudflare-assigned name servers. This is only populated for zones that use Cloudflare DNS.
     */
    public /*out*/ readonly nameServers!: pulumi.Output<string[]>;
    /**
     * Boolean of whether this zone is paused (traffic bypasses Cloudflare). Default: false.
     */
    public readonly paused!: pulumi.Output<boolean | undefined>;
    /**
     * The name of the commercial plan to apply to the zone, can be updated once the one is created; one of `free`, `pro`, `business`, `enterprise`.
     */
    public readonly plan!: pulumi.Output<string>;
    /**
     * Status of the zone. Valid values: `active`, `pending`, `initializing`, `moved`, `deleted`, `deactivated`.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * A full zone implies that DNS is hosted with Cloudflare. A partial zone is typically a partner-hosted zone or a CNAME setup. Valid values: `full`, `partial`. Default is `full`.
     */
    public readonly type!: pulumi.Output<string | undefined>;
    /**
     * List of Vanity Nameservers (if set).
     * * `meta.wildcard_proxiable` - Indicates whether wildcard DNS records can receive Cloudflare security and performance features.
     * * `meta.phishing_detected` - Indicates if URLs on the zone have been identified as hosting phishing content.
     */
    public /*out*/ readonly vanityNameServers!: pulumi.Output<string[]>;
    /**
     * Contains the TXT record value to validate domain ownership. This is only populated for zones of type `partial`.
     */
    public /*out*/ readonly verificationKey!: pulumi.Output<string>;
    /**
     * The DNS zone name which will be added.
     */
    public readonly zone!: pulumi.Output<string>;

    /**
     * Create a Zone resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ZoneArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ZoneArgs | ZoneState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as ZoneState | undefined;
            inputs["jumpStart"] = state ? state.jumpStart : undefined;
            inputs["meta"] = state ? state.meta : undefined;
            inputs["nameServers"] = state ? state.nameServers : undefined;
            inputs["paused"] = state ? state.paused : undefined;
            inputs["plan"] = state ? state.plan : undefined;
            inputs["status"] = state ? state.status : undefined;
            inputs["type"] = state ? state.type : undefined;
            inputs["vanityNameServers"] = state ? state.vanityNameServers : undefined;
            inputs["verificationKey"] = state ? state.verificationKey : undefined;
            inputs["zone"] = state ? state.zone : undefined;
        } else {
            const args = argsOrState as ZoneArgs | undefined;
            if (!args || args.zone === undefined) {
                throw new Error("Missing required property 'zone'");
            }
            inputs["jumpStart"] = args ? args.jumpStart : undefined;
            inputs["paused"] = args ? args.paused : undefined;
            inputs["plan"] = args ? args.plan : undefined;
            inputs["type"] = args ? args.type : undefined;
            inputs["zone"] = args ? args.zone : undefined;
            inputs["meta"] = undefined /*out*/;
            inputs["nameServers"] = undefined /*out*/;
            inputs["status"] = undefined /*out*/;
            inputs["vanityNameServers"] = undefined /*out*/;
            inputs["verificationKey"] = undefined /*out*/;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(Zone.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Zone resources.
 */
export interface ZoneState {
    /**
     * Boolean of whether to scan for DNS records on creation. Ignored after zone is created. Default: false.
     */
    readonly jumpStart?: pulumi.Input<boolean>;
    readonly meta?: pulumi.Input<inputs.ZoneMeta>;
    /**
     * Cloudflare-assigned name servers. This is only populated for zones that use Cloudflare DNS.
     */
    readonly nameServers?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Boolean of whether this zone is paused (traffic bypasses Cloudflare). Default: false.
     */
    readonly paused?: pulumi.Input<boolean>;
    /**
     * The name of the commercial plan to apply to the zone, can be updated once the one is created; one of `free`, `pro`, `business`, `enterprise`.
     */
    readonly plan?: pulumi.Input<string>;
    /**
     * Status of the zone. Valid values: `active`, `pending`, `initializing`, `moved`, `deleted`, `deactivated`.
     */
    readonly status?: pulumi.Input<string>;
    /**
     * A full zone implies that DNS is hosted with Cloudflare. A partial zone is typically a partner-hosted zone or a CNAME setup. Valid values: `full`, `partial`. Default is `full`.
     */
    readonly type?: pulumi.Input<string>;
    /**
     * List of Vanity Nameservers (if set).
     * * `meta.wildcard_proxiable` - Indicates whether wildcard DNS records can receive Cloudflare security and performance features.
     * * `meta.phishing_detected` - Indicates if URLs on the zone have been identified as hosting phishing content.
     */
    readonly vanityNameServers?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Contains the TXT record value to validate domain ownership. This is only populated for zones of type `partial`.
     */
    readonly verificationKey?: pulumi.Input<string>;
    /**
     * The DNS zone name which will be added.
     */
    readonly zone?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Zone resource.
 */
export interface ZoneArgs {
    /**
     * Boolean of whether to scan for DNS records on creation. Ignored after zone is created. Default: false.
     */
    readonly jumpStart?: pulumi.Input<boolean>;
    /**
     * Boolean of whether this zone is paused (traffic bypasses Cloudflare). Default: false.
     */
    readonly paused?: pulumi.Input<boolean>;
    /**
     * The name of the commercial plan to apply to the zone, can be updated once the one is created; one of `free`, `pro`, `business`, `enterprise`.
     */
    readonly plan?: pulumi.Input<string>;
    /**
     * A full zone implies that DNS is hosted with Cloudflare. A partial zone is typically a partner-hosted zone or a CNAME setup. Valid values: `full`, `partial`. Default is `full`.
     */
    readonly type?: pulumi.Input<string>;
    /**
     * The DNS zone name which will be added.
     */
    readonly zone: pulumi.Input<string>;
}
