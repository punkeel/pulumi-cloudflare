// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * ## Import
 *
 * # Import an account-scoped job.
 *
 * ```sh
 *  $ pulumi import cloudflare:index/logpushJob:LogpushJob example account/<account_id>/<job_id>
 * ```
 *
 * # Import a zone-scoped job.
 *
 * ```sh
 *  $ pulumi import cloudflare:index/logpushJob:LogpushJob example zone/<zone_id>/<job_id>
 * ```
 */
export class LogpushJob extends pulumi.CustomResource {
    /**
     * Get an existing LogpushJob resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: LogpushJobState, opts?: pulumi.CustomResourceOptions): LogpushJob {
        return new LogpushJob(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/logpushJob:LogpushJob';

    /**
     * Returns true if the given object is an instance of LogpushJob.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is LogpushJob {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === LogpushJob.__pulumiType;
    }

    /**
     * The account identifier to target for the resource. Must provide only one of `accountId`, `zoneId`.
     */
    public readonly accountId!: pulumi.Output<string | undefined>;
    /**
     * Uniquely identifies a resource (such as an s3 bucket) where data will be pushed. Additional configuration parameters supported by the destination may be included. See [Logpush destination documentation](https://developers.cloudflare.com/logs/reference/logpush-api-configuration#destination). Available values: `accessRequests`, `firewallEvents`, `httpRequests`, `spectrumEvents`, `nelReports`, `auditLogs`, `gatewayDns`, `gatewayHttp`, `gatewayNetwork`, `dnsLogs`, `networkAnalyticsLogs`.
     */
    public readonly dataset!: pulumi.Output<string>;
    /**
     * Uniquely identifies a resource (such as an s3 bucket) where data will be pushed. Additional configuration parameters supported by the destination may be included. See [Logpush destination documentation](https://developers.cloudflare.com/logs/reference/logpush-api-configuration#destination).
     */
    public readonly destinationConf!: pulumi.Output<string>;
    /**
     * Whether to enable the job.
     */
    public readonly enabled!: pulumi.Output<boolean | undefined>;
    /**
     * Use filters to select the events to include and/or remove from your logs. For more information, refer to [Filters](https://developers.cloudflare.com/logs/reference/logpush-api-configuration/filters/).
     */
    public readonly filter!: pulumi.Output<string | undefined>;
    /**
     * A higher frequency will result in logs being pushed on faster with smaller files. `low` frequency will push logs less often with larger files. Available values: `high`, `low`. Defaults to `high`.
     */
    public readonly frequency!: pulumi.Output<string | undefined>;
    /**
     * The kind of logpush job to create. Available values: `edge`, `instant-logs`, `""`.
     */
    public readonly kind!: pulumi.Output<string | undefined>;
    /**
     * Configuration string for the Logshare API. It specifies things like requested fields and timestamp formats. See [Logpull options documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#options).
     */
    public readonly logpullOptions!: pulumi.Output<string | undefined>;
    /**
     * The name of the logpush job to create.
     */
    public readonly name!: pulumi.Output<string | undefined>;
    /**
     * Ownership challenge token to prove destination ownership, required when destination is Amazon S3, Google Cloud Storage, Microsoft Azure or Sumo Logic. See [Developer documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#usage).
     */
    public readonly ownershipChallenge!: pulumi.Output<string | undefined>;
    /**
     * The zone identifier to target for the resource. Must provide only one of `accountId`, `zoneId`.
     */
    public readonly zoneId!: pulumi.Output<string | undefined>;

    /**
     * Create a LogpushJob resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: LogpushJobArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: LogpushJobArgs | LogpushJobState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as LogpushJobState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["dataset"] = state ? state.dataset : undefined;
            resourceInputs["destinationConf"] = state ? state.destinationConf : undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["filter"] = state ? state.filter : undefined;
            resourceInputs["frequency"] = state ? state.frequency : undefined;
            resourceInputs["kind"] = state ? state.kind : undefined;
            resourceInputs["logpullOptions"] = state ? state.logpullOptions : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["ownershipChallenge"] = state ? state.ownershipChallenge : undefined;
            resourceInputs["zoneId"] = state ? state.zoneId : undefined;
        } else {
            const args = argsOrState as LogpushJobArgs | undefined;
            if ((!args || args.dataset === undefined) && !opts.urn) {
                throw new Error("Missing required property 'dataset'");
            }
            if ((!args || args.destinationConf === undefined) && !opts.urn) {
                throw new Error("Missing required property 'destinationConf'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["dataset"] = args ? args.dataset : undefined;
            resourceInputs["destinationConf"] = args ? args.destinationConf : undefined;
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["filter"] = args ? args.filter : undefined;
            resourceInputs["frequency"] = args ? args.frequency : undefined;
            resourceInputs["kind"] = args ? args.kind : undefined;
            resourceInputs["logpullOptions"] = args ? args.logpullOptions : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["ownershipChallenge"] = args ? args.ownershipChallenge : undefined;
            resourceInputs["zoneId"] = args ? args.zoneId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(LogpushJob.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering LogpushJob resources.
 */
export interface LogpushJobState {
    /**
     * The account identifier to target for the resource. Must provide only one of `accountId`, `zoneId`.
     */
    accountId?: pulumi.Input<string>;
    /**
     * Uniquely identifies a resource (such as an s3 bucket) where data will be pushed. Additional configuration parameters supported by the destination may be included. See [Logpush destination documentation](https://developers.cloudflare.com/logs/reference/logpush-api-configuration#destination). Available values: `accessRequests`, `firewallEvents`, `httpRequests`, `spectrumEvents`, `nelReports`, `auditLogs`, `gatewayDns`, `gatewayHttp`, `gatewayNetwork`, `dnsLogs`, `networkAnalyticsLogs`.
     */
    dataset?: pulumi.Input<string>;
    /**
     * Uniquely identifies a resource (such as an s3 bucket) where data will be pushed. Additional configuration parameters supported by the destination may be included. See [Logpush destination documentation](https://developers.cloudflare.com/logs/reference/logpush-api-configuration#destination).
     */
    destinationConf?: pulumi.Input<string>;
    /**
     * Whether to enable the job.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Use filters to select the events to include and/or remove from your logs. For more information, refer to [Filters](https://developers.cloudflare.com/logs/reference/logpush-api-configuration/filters/).
     */
    filter?: pulumi.Input<string>;
    /**
     * A higher frequency will result in logs being pushed on faster with smaller files. `low` frequency will push logs less often with larger files. Available values: `high`, `low`. Defaults to `high`.
     */
    frequency?: pulumi.Input<string>;
    /**
     * The kind of logpush job to create. Available values: `edge`, `instant-logs`, `""`.
     */
    kind?: pulumi.Input<string>;
    /**
     * Configuration string for the Logshare API. It specifies things like requested fields and timestamp formats. See [Logpull options documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#options).
     */
    logpullOptions?: pulumi.Input<string>;
    /**
     * The name of the logpush job to create.
     */
    name?: pulumi.Input<string>;
    /**
     * Ownership challenge token to prove destination ownership, required when destination is Amazon S3, Google Cloud Storage, Microsoft Azure or Sumo Logic. See [Developer documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#usage).
     */
    ownershipChallenge?: pulumi.Input<string>;
    /**
     * The zone identifier to target for the resource. Must provide only one of `accountId`, `zoneId`.
     */
    zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a LogpushJob resource.
 */
export interface LogpushJobArgs {
    /**
     * The account identifier to target for the resource. Must provide only one of `accountId`, `zoneId`.
     */
    accountId?: pulumi.Input<string>;
    /**
     * Uniquely identifies a resource (such as an s3 bucket) where data will be pushed. Additional configuration parameters supported by the destination may be included. See [Logpush destination documentation](https://developers.cloudflare.com/logs/reference/logpush-api-configuration#destination). Available values: `accessRequests`, `firewallEvents`, `httpRequests`, `spectrumEvents`, `nelReports`, `auditLogs`, `gatewayDns`, `gatewayHttp`, `gatewayNetwork`, `dnsLogs`, `networkAnalyticsLogs`.
     */
    dataset: pulumi.Input<string>;
    /**
     * Uniquely identifies a resource (such as an s3 bucket) where data will be pushed. Additional configuration parameters supported by the destination may be included. See [Logpush destination documentation](https://developers.cloudflare.com/logs/reference/logpush-api-configuration#destination).
     */
    destinationConf: pulumi.Input<string>;
    /**
     * Whether to enable the job.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Use filters to select the events to include and/or remove from your logs. For more information, refer to [Filters](https://developers.cloudflare.com/logs/reference/logpush-api-configuration/filters/).
     */
    filter?: pulumi.Input<string>;
    /**
     * A higher frequency will result in logs being pushed on faster with smaller files. `low` frequency will push logs less often with larger files. Available values: `high`, `low`. Defaults to `high`.
     */
    frequency?: pulumi.Input<string>;
    /**
     * The kind of logpush job to create. Available values: `edge`, `instant-logs`, `""`.
     */
    kind?: pulumi.Input<string>;
    /**
     * Configuration string for the Logshare API. It specifies things like requested fields and timestamp formats. See [Logpull options documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#options).
     */
    logpullOptions?: pulumi.Input<string>;
    /**
     * The name of the logpush job to create.
     */
    name?: pulumi.Input<string>;
    /**
     * Ownership challenge token to prove destination ownership, required when destination is Amazon S3, Google Cloud Storage, Microsoft Azure or Sumo Logic. See [Developer documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#usage).
     */
    ownershipChallenge?: pulumi.Input<string>;
    /**
     * The zone identifier to target for the resource. Must provide only one of `accountId`, `zoneId`.
     */
    zoneId?: pulumi.Input<string>;
}
