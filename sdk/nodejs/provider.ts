// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * The provider type for the cloudflare package. By default, resources use package-wide configuration
 * settings, however an explicit `Provider` instance may be created and passed during resource
 * construction to achieve fine-grained programmatic control over provider settings. See the
 * [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
 *
 * > This content is derived from https://github.com/terraform-providers/terraform-provider-cloudflare/blob/master/website/docs/index.html.markdown.
 */
export class Provider extends pulumi.ProviderResource {
    /** @internal */
    public static readonly __pulumiType = 'cloudflare';

    /**
     * Returns true if the given object is an instance of Provider.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Provider {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Provider.__pulumiType;
    }


    /**
     * Create a Provider resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: ProviderArgs, opts?: pulumi.ResourceOptions) {
        let inputs: pulumi.Inputs = {};
        {
            inputs["accountId"] = (args ? args.accountId : undefined) || utilities.getEnv("CLOUDFLARE_ACCOUNT_ID");
            inputs["apiClientLogging"] = pulumi.output((args ? args.apiClientLogging : undefined) || (utilities.getEnvBoolean("CLOUDFLARE_API_CLIENT_LOGGING") || false)).apply(JSON.stringify);
            inputs["apiKey"] = (args ? args.apiKey : undefined) || utilities.getEnv("CLOUDFLARE_API_TOKEN");
            inputs["apiToken"] = args ? args.apiToken : undefined;
            inputs["email"] = (args ? args.email : undefined) || utilities.getEnv("CLOUDFLARE_EMAIL");
            inputs["maxBackoff"] = pulumi.output((args ? args.maxBackoff : undefined) || (utilities.getEnvNumber("CLOUDFLARE_MAX_BACKOFF") || 30)).apply(JSON.stringify);
            inputs["minBackoff"] = pulumi.output((args ? args.minBackoff : undefined) || (utilities.getEnvNumber("CLOUDFLARE_MIN_BACKOFF") || 1)).apply(JSON.stringify);
            inputs["retries"] = pulumi.output((args ? args.retries : undefined) || (utilities.getEnvNumber("CLOUDFLARE_RETRIES") || 3)).apply(JSON.stringify);
            inputs["rps"] = pulumi.output((args ? args.rps : undefined) || (utilities.getEnvNumber("CLOUDFLARE_RPS") || 4)).apply(JSON.stringify);
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(Provider.__pulumiType, name, inputs, opts);
    }
}

/**
 * The set of arguments for constructing a Provider resource.
 */
export interface ProviderArgs {
    /**
     * Configure API client to always use that account.
     */
    readonly accountId?: pulumi.Input<string>;
    /**
     * Whether to print logs from the API client (using the default log library logger)
     */
    readonly apiClientLogging?: pulumi.Input<boolean>;
    /**
     * The API key for operations.
     */
    readonly apiKey?: pulumi.Input<string>;
    /**
     * The API Token for operations.
     */
    readonly apiToken?: pulumi.Input<string>;
    /**
     * A registered Cloudflare email address.
     */
    readonly email?: pulumi.Input<string>;
    /**
     * Maximum backoff period in seconds after failed API calls
     */
    readonly maxBackoff?: pulumi.Input<number>;
    /**
     * Minimum backoff period in seconds after failed API calls
     */
    readonly minBackoff?: pulumi.Input<number>;
    /**
     * Maximum number of retries to perform when an API request fails
     */
    readonly retries?: pulumi.Input<number>;
    /**
     * RPS limit to apply when making calls to the API
     */
    readonly rps?: pulumi.Input<number>;
}
