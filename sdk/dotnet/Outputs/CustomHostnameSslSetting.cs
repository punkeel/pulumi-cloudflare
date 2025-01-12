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
    public sealed class CustomHostnameSslSetting
    {
        public readonly ImmutableArray<string> Ciphers;
        public readonly string? EarlyHints;
        public readonly string? Http2;
        public readonly string? MinTlsVersion;
        public readonly string? Tls13;

        [OutputConstructor]
        private CustomHostnameSslSetting(
            ImmutableArray<string> ciphers,

            string? earlyHints,

            string? http2,

            string? minTlsVersion,

            string? tls13)
        {
            Ciphers = ciphers;
            EarlyHints = earlyHints;
            Http2 = http2;
            MinTlsVersion = minTlsVersion;
            Tls13 = tls13;
        }
    }
}
