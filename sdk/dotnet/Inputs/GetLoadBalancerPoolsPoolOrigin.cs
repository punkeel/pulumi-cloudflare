// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class GetLoadBalancerPoolsPoolOriginArgs : global::Pulumi.InvokeArgs
    {
        [Input("address", required: true)]
        public string Address { get; set; } = null!;

        [Input("enabled")]
        public bool? Enabled { get; set; }

        [Input("headers")]
        private List<Inputs.GetLoadBalancerPoolsPoolOriginHeaderArgs>? _headers;
        public List<Inputs.GetLoadBalancerPoolsPoolOriginHeaderArgs> Headers
        {
            get => _headers ?? (_headers = new List<Inputs.GetLoadBalancerPoolsPoolOriginHeaderArgs>());
            set => _headers = value;
        }

        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        [Input("weight")]
        public double? Weight { get; set; }

        public GetLoadBalancerPoolsPoolOriginArgs()
        {
        }
        public static new GetLoadBalancerPoolsPoolOriginArgs Empty => new GetLoadBalancerPoolsPoolOriginArgs();
    }
}
