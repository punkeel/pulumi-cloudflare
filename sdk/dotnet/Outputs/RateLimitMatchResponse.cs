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
    public sealed class RateLimitMatchResponse
    {
        public readonly ImmutableArray<ImmutableDictionary<string, string>> Headers;
        public readonly bool? OriginTraffic;
        public readonly ImmutableArray<int> Statuses;

        [OutputConstructor]
        private RateLimitMatchResponse(
            ImmutableArray<ImmutableDictionary<string, string>> headers,

            bool? originTraffic,

            ImmutableArray<int> statuses)
        {
            Headers = headers;
            OriginTraffic = originTraffic;
            Statuses = statuses;
        }
    }
}
