// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class DevicePostureRuleMatchGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The platform of the device. Available values: `windows`, `mac`, `linux`, `android`, `ios`, `chromeos`.
        /// </summary>
        [Input("platform")]
        public Input<string>? Platform { get; set; }

        public DevicePostureRuleMatchGetArgs()
        {
        }
        public static new DevicePostureRuleMatchGetArgs Empty => new DevicePostureRuleMatchGetArgs();
    }
}
