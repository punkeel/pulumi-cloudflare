// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Outputs
{

    [OutputType]
    public sealed class LoadBalancerPoolLoadShedding
    {
        /// <summary>
        /// Percent of traffic to shed 0 - 100.
        /// </summary>
        public readonly double? DefaultPercent;
        /// <summary>
        /// Method of shedding traffic "", "hash" or "random".
        /// </summary>
        public readonly string? DefaultPolicy;
        /// <summary>
        /// Percent of session traffic to shed 0 - 100.
        /// </summary>
        public readonly double? SessionPercent;
        /// <summary>
        /// Method of shedding session traffic "" or "hash".
        /// </summary>
        public readonly string? SessionPolicy;

        [OutputConstructor]
        private LoadBalancerPoolLoadShedding(
            double? defaultPercent,

            string? defaultPolicy,

            double? sessionPercent,

            string? sessionPolicy)
        {
            DefaultPercent = defaultPercent;
            DefaultPolicy = defaultPolicy;
            SessionPercent = sessionPercent;
            SessionPolicy = sessionPolicy;
        }
    }
}
