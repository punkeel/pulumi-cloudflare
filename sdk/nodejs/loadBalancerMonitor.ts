// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * If you're using Cloudflare's Load Balancing to load-balance across multiple origin servers or data centers, you configure one of these Monitors to actively check the availability of those servers over HTTP(S) or TCP.
 * 
 * ## Example Usage
 * 
 * ### HTTP Monitor
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 * 
 * const httpMonitor = new cloudflare.LoadBalancerMonitor("httpMonitor", {
 *     allowInsecure: false,
 *     description: "example http load balancer",
 *     expectedBody: "alive",
 *     expectedCodes: "2xx",
 *     followRedirects: true,
 *     headers: [{
 *         header: "Host",
 *         values: ["example.com"],
 *     }],
 *     interval: 60,
 *     method: "GET",
 *     path: "/health",
 *     retries: 5,
 *     timeout: 7,
 *     type: "http",
 * });
 * ```
 * 
 * ### TCP Monitor
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 * 
 * const tcpMonitor = new cloudflare.LoadBalancerMonitor("tcpMonitor", {
 *     description: "example tcp load balancer",
 *     interval: 60,
 *     method: "connectionEstablished",
 *     retries: 5,
 *     timeout: 7,
 *     type: "tcp",
 * });
 * ```
 *
 * > This content is derived from https://github.com/terraform-providers/terraform-provider-cloudflare/blob/master/website/docs/r/load_balancer_monitor.html.markdown.
 */
export class LoadBalancerMonitor extends pulumi.CustomResource {
    /**
     * Get an existing LoadBalancerMonitor resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: LoadBalancerMonitorState, opts?: pulumi.CustomResourceOptions): LoadBalancerMonitor {
        return new LoadBalancerMonitor(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/loadBalancerMonitor:LoadBalancerMonitor';

    /**
     * Returns true if the given object is an instance of LoadBalancerMonitor.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is LoadBalancerMonitor {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === LoadBalancerMonitor.__pulumiType;
    }

    /**
     * Do not validate the certificate when monitor use HTTPS. Only valid if `type` is "http" or "https".
     */
    public readonly allowInsecure!: pulumi.Output<boolean | undefined>;
    /**
     * The RFC3339 timestamp of when the load balancer monitor was created.
     */
    public /*out*/ readonly createdOn!: pulumi.Output<string>;
    /**
     * Free text description.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * A case-insensitive sub-string to look for in the response body. If this string is not found, the origin will be marked as unhealthy. Only valid and required if `type` is "http" or "https".
     */
    public readonly expectedBody!: pulumi.Output<string | undefined>;
    /**
     * The expected HTTP response code or code range of the health check. Eg `2xx`. Only valid and required if `type` is "http" or "https".
     */
    public readonly expectedCodes!: pulumi.Output<string | undefined>;
    /**
     * Follow redirects if returned by the origin. Only valid if `type` is "http" or "https".
     */
    public readonly followRedirects!: pulumi.Output<boolean | undefined>;
    /**
     * The header name.
     */
    public readonly headers!: pulumi.Output<{ header: string, values: string[] }[] | undefined>;
    /**
     * The interval between each health check. Shorter intervals may improve failover time, but will increase load on the origins as we check from multiple locations. Default: 60.
     */
    public readonly interval!: pulumi.Output<number | undefined>;
    /**
     * The method to use for the health check. Valid values are any valid HTTP verb if `type` is "http" or "https", or `connectionEstablished` if `type` is "tcp". Default: "GET" if `type` is "http" or "https", or "connectionEstablished" if `type` is "tcp" .
     */
    public readonly method!: pulumi.Output<string>;
    /**
     * The RFC3339 timestamp of when the load balancer monitor was last modified.
     */
    public /*out*/ readonly modifiedOn!: pulumi.Output<string>;
    /**
     * The endpoint path to health check against. Default: "/". Only valid if `type` is "http" or "https".
     */
    public readonly path!: pulumi.Output<string>;
    public readonly port!: pulumi.Output<number | undefined>;
    /**
     * The number of retries to attempt in case of a timeout before marking the origin as unhealthy. Retries are attempted immediately. Default: 2.
     */
    public readonly retries!: pulumi.Output<number | undefined>;
    /**
     * The timeout (in seconds) before marking the health check as failed. Default: 5.
     */
    public readonly timeout!: pulumi.Output<number | undefined>;
    /**
     * The protocol to use for the healthcheck. Currently supported protocols are 'HTTP', 'HTTPS' and 'TCP'. Default: "http".
     */
    public readonly type!: pulumi.Output<string | undefined>;

    /**
     * Create a LoadBalancerMonitor resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: LoadBalancerMonitorArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: LoadBalancerMonitorArgs | LoadBalancerMonitorState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as LoadBalancerMonitorState | undefined;
            inputs["allowInsecure"] = state ? state.allowInsecure : undefined;
            inputs["createdOn"] = state ? state.createdOn : undefined;
            inputs["description"] = state ? state.description : undefined;
            inputs["expectedBody"] = state ? state.expectedBody : undefined;
            inputs["expectedCodes"] = state ? state.expectedCodes : undefined;
            inputs["followRedirects"] = state ? state.followRedirects : undefined;
            inputs["headers"] = state ? state.headers : undefined;
            inputs["interval"] = state ? state.interval : undefined;
            inputs["method"] = state ? state.method : undefined;
            inputs["modifiedOn"] = state ? state.modifiedOn : undefined;
            inputs["path"] = state ? state.path : undefined;
            inputs["port"] = state ? state.port : undefined;
            inputs["retries"] = state ? state.retries : undefined;
            inputs["timeout"] = state ? state.timeout : undefined;
            inputs["type"] = state ? state.type : undefined;
        } else {
            const args = argsOrState as LoadBalancerMonitorArgs | undefined;
            inputs["allowInsecure"] = args ? args.allowInsecure : undefined;
            inputs["description"] = args ? args.description : undefined;
            inputs["expectedBody"] = args ? args.expectedBody : undefined;
            inputs["expectedCodes"] = args ? args.expectedCodes : undefined;
            inputs["followRedirects"] = args ? args.followRedirects : undefined;
            inputs["headers"] = args ? args.headers : undefined;
            inputs["interval"] = args ? args.interval : undefined;
            inputs["method"] = args ? args.method : undefined;
            inputs["path"] = args ? args.path : undefined;
            inputs["port"] = args ? args.port : undefined;
            inputs["retries"] = args ? args.retries : undefined;
            inputs["timeout"] = args ? args.timeout : undefined;
            inputs["type"] = args ? args.type : undefined;
            inputs["createdOn"] = undefined /*out*/;
            inputs["modifiedOn"] = undefined /*out*/;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(LoadBalancerMonitor.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering LoadBalancerMonitor resources.
 */
export interface LoadBalancerMonitorState {
    /**
     * Do not validate the certificate when monitor use HTTPS. Only valid if `type` is "http" or "https".
     */
    readonly allowInsecure?: pulumi.Input<boolean>;
    /**
     * The RFC3339 timestamp of when the load balancer monitor was created.
     */
    readonly createdOn?: pulumi.Input<string>;
    /**
     * Free text description.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * A case-insensitive sub-string to look for in the response body. If this string is not found, the origin will be marked as unhealthy. Only valid and required if `type` is "http" or "https".
     */
    readonly expectedBody?: pulumi.Input<string>;
    /**
     * The expected HTTP response code or code range of the health check. Eg `2xx`. Only valid and required if `type` is "http" or "https".
     */
    readonly expectedCodes?: pulumi.Input<string>;
    /**
     * Follow redirects if returned by the origin. Only valid if `type` is "http" or "https".
     */
    readonly followRedirects?: pulumi.Input<boolean>;
    /**
     * The header name.
     */
    readonly headers?: pulumi.Input<pulumi.Input<{ header: pulumi.Input<string>, values: pulumi.Input<pulumi.Input<string>[]> }>[]>;
    /**
     * The interval between each health check. Shorter intervals may improve failover time, but will increase load on the origins as we check from multiple locations. Default: 60.
     */
    readonly interval?: pulumi.Input<number>;
    /**
     * The method to use for the health check. Valid values are any valid HTTP verb if `type` is "http" or "https", or `connectionEstablished` if `type` is "tcp". Default: "GET" if `type` is "http" or "https", or "connectionEstablished" if `type` is "tcp" .
     */
    readonly method?: pulumi.Input<string>;
    /**
     * The RFC3339 timestamp of when the load balancer monitor was last modified.
     */
    readonly modifiedOn?: pulumi.Input<string>;
    /**
     * The endpoint path to health check against. Default: "/". Only valid if `type` is "http" or "https".
     */
    readonly path?: pulumi.Input<string>;
    readonly port?: pulumi.Input<number>;
    /**
     * The number of retries to attempt in case of a timeout before marking the origin as unhealthy. Retries are attempted immediately. Default: 2.
     */
    readonly retries?: pulumi.Input<number>;
    /**
     * The timeout (in seconds) before marking the health check as failed. Default: 5.
     */
    readonly timeout?: pulumi.Input<number>;
    /**
     * The protocol to use for the healthcheck. Currently supported protocols are 'HTTP', 'HTTPS' and 'TCP'. Default: "http".
     */
    readonly type?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a LoadBalancerMonitor resource.
 */
export interface LoadBalancerMonitorArgs {
    /**
     * Do not validate the certificate when monitor use HTTPS. Only valid if `type` is "http" or "https".
     */
    readonly allowInsecure?: pulumi.Input<boolean>;
    /**
     * Free text description.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * A case-insensitive sub-string to look for in the response body. If this string is not found, the origin will be marked as unhealthy. Only valid and required if `type` is "http" or "https".
     */
    readonly expectedBody?: pulumi.Input<string>;
    /**
     * The expected HTTP response code or code range of the health check. Eg `2xx`. Only valid and required if `type` is "http" or "https".
     */
    readonly expectedCodes?: pulumi.Input<string>;
    /**
     * Follow redirects if returned by the origin. Only valid if `type` is "http" or "https".
     */
    readonly followRedirects?: pulumi.Input<boolean>;
    /**
     * The header name.
     */
    readonly headers?: pulumi.Input<pulumi.Input<{ header: pulumi.Input<string>, values: pulumi.Input<pulumi.Input<string>[]> }>[]>;
    /**
     * The interval between each health check. Shorter intervals may improve failover time, but will increase load on the origins as we check from multiple locations. Default: 60.
     */
    readonly interval?: pulumi.Input<number>;
    /**
     * The method to use for the health check. Valid values are any valid HTTP verb if `type` is "http" or "https", or `connectionEstablished` if `type` is "tcp". Default: "GET" if `type` is "http" or "https", or "connectionEstablished" if `type` is "tcp" .
     */
    readonly method?: pulumi.Input<string>;
    /**
     * The endpoint path to health check against. Default: "/". Only valid if `type` is "http" or "https".
     */
    readonly path?: pulumi.Input<string>;
    readonly port?: pulumi.Input<number>;
    /**
     * The number of retries to attempt in case of a timeout before marking the origin as unhealthy. Retries are attempted immediately. Default: 2.
     */
    readonly retries?: pulumi.Input<number>;
    /**
     * The timeout (in seconds) before marking the health check as failed. Default: 5.
     */
    readonly timeout?: pulumi.Input<number>;
    /**
     * The protocol to use for the healthcheck. Currently supported protocols are 'HTTP', 'HTTPS' and 'TCP'. Default: "http".
     */
    readonly type?: pulumi.Input<string>;
}
