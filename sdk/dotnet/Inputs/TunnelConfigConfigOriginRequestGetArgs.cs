// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class TunnelConfigConfigOriginRequestGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("bastionMode")]
        public Input<bool>? BastionMode { get; set; }

        [Input("caPool")]
        public Input<string>? CaPool { get; set; }

        [Input("connectTimeout")]
        public Input<string>? ConnectTimeout { get; set; }

        [Input("disableChunkedEncoding")]
        public Input<bool>? DisableChunkedEncoding { get; set; }

        [Input("httpHostHeader")]
        public Input<string>? HttpHostHeader { get; set; }

        [Input("ipRules")]
        private InputList<Inputs.TunnelConfigConfigOriginRequestIpRuleGetArgs>? _ipRules;
        public InputList<Inputs.TunnelConfigConfigOriginRequestIpRuleGetArgs> IpRules
        {
            get => _ipRules ?? (_ipRules = new InputList<Inputs.TunnelConfigConfigOriginRequestIpRuleGetArgs>());
            set => _ipRules = value;
        }

        [Input("keepAliveConnections")]
        public Input<int>? KeepAliveConnections { get; set; }

        [Input("keepAliveTimeout")]
        public Input<string>? KeepAliveTimeout { get; set; }

        [Input("noHappyEyeballs")]
        public Input<bool>? NoHappyEyeballs { get; set; }

        [Input("noTlsVerify")]
        public Input<bool>? NoTlsVerify { get; set; }

        [Input("originServerName")]
        public Input<string>? OriginServerName { get; set; }

        [Input("proxyAddress")]
        public Input<string>? ProxyAddress { get; set; }

        [Input("proxyPort")]
        public Input<int>? ProxyPort { get; set; }

        [Input("proxyType")]
        public Input<string>? ProxyType { get; set; }

        [Input("tcpKeepAlive")]
        public Input<string>? TcpKeepAlive { get; set; }

        [Input("tlsTimeout")]
        public Input<string>? TlsTimeout { get; set; }

        public TunnelConfigConfigOriginRequestGetArgs()
        {
        }
        public static new TunnelConfigConfigOriginRequestGetArgs Empty => new TunnelConfigConfigOriginRequestGetArgs();
    }
}
