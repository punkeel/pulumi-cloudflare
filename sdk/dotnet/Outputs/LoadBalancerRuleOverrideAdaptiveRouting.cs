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
    public sealed class LoadBalancerRuleOverrideAdaptiveRouting
    {
        /// <summary>
        /// Extends zero-downtime failover of requests to healthy origins from alternate pools, when no healthy alternate exists in the same pool, according to the failover order defined by traffic and origin steering. When set `false`, zero-downtime failover will only occur between origins within the same pool. Defaults to `false`.
        /// </summary>
        public readonly bool? FailoverAcrossPools;

        [OutputConstructor]
        private LoadBalancerRuleOverrideAdaptiveRouting(bool? failoverAcrossPools)
        {
            FailoverAcrossPools = failoverAcrossPools;
        }
    }
}
