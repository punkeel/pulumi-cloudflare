// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class RulesetRuleActionParametersCacheKeyCustomKeyGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("cookie")]
        public Input<Inputs.RulesetRuleActionParametersCacheKeyCustomKeyCookieGetArgs>? Cookie { get; set; }

        [Input("header")]
        public Input<Inputs.RulesetRuleActionParametersCacheKeyCustomKeyHeaderGetArgs>? Header { get; set; }

        [Input("host")]
        public Input<Inputs.RulesetRuleActionParametersCacheKeyCustomKeyHostGetArgs>? Host { get; set; }

        [Input("queryString")]
        public Input<Inputs.RulesetRuleActionParametersCacheKeyCustomKeyQueryStringGetArgs>? QueryString { get; set; }

        [Input("user")]
        public Input<Inputs.RulesetRuleActionParametersCacheKeyCustomKeyUserGetArgs>? User { get; set; }

        public RulesetRuleActionParametersCacheKeyCustomKeyGetArgs()
        {
        }
        public static new RulesetRuleActionParametersCacheKeyCustomKeyGetArgs Empty => new RulesetRuleActionParametersCacheKeyCustomKeyGetArgs();
    }
}
