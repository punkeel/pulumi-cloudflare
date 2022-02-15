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
    public sealed class TeamsRuleRuleSettingsBisoAdminControls
    {
        public readonly bool? DisableCopyPaste;
        public readonly bool? DisablePrinting;

        [OutputConstructor]
        private TeamsRuleRuleSettingsBisoAdminControls(
            bool? disableCopyPaste,

            bool? disablePrinting)
        {
            DisableCopyPaste = disableCopyPaste;
            DisablePrinting = disablePrinting;
        }
    }
}
