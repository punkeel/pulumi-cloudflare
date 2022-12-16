// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class GetLoadBalancerPoolsPoolOriginInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("address", required: true)]
        public Input<string> Address { get; set; } = null!;

        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("headers")]
        private InputList<Inputs.GetLoadBalancerPoolsPoolOriginHeaderInputArgs>? _headers;
        public InputList<Inputs.GetLoadBalancerPoolsPoolOriginHeaderInputArgs> Headers
        {
            get => _headers ?? (_headers = new InputList<Inputs.GetLoadBalancerPoolsPoolOriginHeaderInputArgs>());
            set => _headers = value;
        }

        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("weight")]
        public Input<double>? Weight { get; set; }

        public GetLoadBalancerPoolsPoolOriginInputArgs()
        {
        }
        public static new GetLoadBalancerPoolsPoolOriginInputArgs Empty => new GetLoadBalancerPoolsPoolOriginInputArgs();
    }
}
