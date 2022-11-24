// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class LoadBalancerRuleOverrideCountryPoolGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A country code which can be determined with the Load Balancing Regions API described [here](https://developers.cloudflare.com/load-balancing/reference/region-mapping-api/). Multiple entries should not be specified with the same country.
        /// </summary>
        [Input("country", required: true)]
        public Input<string> Country { get; set; } = null!;

        [Input("poolIds", required: true)]
        private InputList<string>? _poolIds;

        /// <summary>
        /// A list of pool IDs in failover priority to use in the given country.
        /// </summary>
        public InputList<string> PoolIds
        {
            get => _poolIds ?? (_poolIds = new InputList<string>());
            set => _poolIds = value;
        }

        public LoadBalancerRuleOverrideCountryPoolGetArgs()
        {
        }
        public static new LoadBalancerRuleOverrideCountryPoolGetArgs Empty => new LoadBalancerRuleOverrideCountryPoolGetArgs();
    }
}
