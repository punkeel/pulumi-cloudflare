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
    public sealed class TeamsAccountLoggingSettingsByRuleType
    {
        public readonly Outputs.TeamsAccountLoggingSettingsByRuleTypeDns Dns;
        public readonly Outputs.TeamsAccountLoggingSettingsByRuleTypeHttp Http;
        public readonly Outputs.TeamsAccountLoggingSettingsByRuleTypeL4 L4;

        [OutputConstructor]
        private TeamsAccountLoggingSettingsByRuleType(
            Outputs.TeamsAccountLoggingSettingsByRuleTypeDns dns,

            Outputs.TeamsAccountLoggingSettingsByRuleTypeHttp http,

            Outputs.TeamsAccountLoggingSettingsByRuleTypeL4 l4)
        {
            Dns = dns;
            Http = http;
            L4 = l4;
        }
    }
}