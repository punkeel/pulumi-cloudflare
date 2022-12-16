// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class GetLoadBalancerPoolsPoolLoadSheddingArgs : global::Pulumi.InvokeArgs
    {
        [Input("defaultPercent")]
        public double? DefaultPercent { get; set; }

        [Input("defaultPolicy")]
        public string? DefaultPolicy { get; set; }

        [Input("sessionPercent")]
        public double? SessionPercent { get; set; }

        [Input("sessionPolicy")]
        public string? SessionPolicy { get; set; }

        public GetLoadBalancerPoolsPoolLoadSheddingArgs()
        {
        }
        public static new GetLoadBalancerPoolsPoolLoadSheddingArgs Empty => new GetLoadBalancerPoolsPoolLoadSheddingArgs();
    }
}
