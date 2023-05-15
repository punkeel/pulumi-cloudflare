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
    public sealed class DeviceDexTestData
    {
        /// <summary>
        /// The host URL for `http` test `kind`. For `traceroute`, it must be a valid hostname or IP address.
        /// </summary>
        public readonly string Host;
        /// <summary>
        /// The type of Device Dex Test. Available values: `http`, `traceroute`.
        /// </summary>
        public readonly string Kind;
        /// <summary>
        /// The http request method. Available values: `GET`.
        /// </summary>
        public readonly string? Method;

        [OutputConstructor]
        private DeviceDexTestData(
            string host,

            string kind,

            string? method)
        {
            Host = host;
            Kind = kind;
            Method = method;
        }
    }
}