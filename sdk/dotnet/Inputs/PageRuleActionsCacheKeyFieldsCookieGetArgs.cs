// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class PageRuleActionsCacheKeyFieldsCookieGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("checkPresences")]
        private InputList<string>? _checkPresences;

        /// <summary>
        /// Check for presence of specified cookies, without including their actual values.
        /// </summary>
        public InputList<string> CheckPresences
        {
            get => _checkPresences ?? (_checkPresences = new InputList<string>());
            set => _checkPresences = value;
        }

        [Input("includes")]
        private InputList<string>? _includes;

        /// <summary>
        /// Use values of specified cookies in Cache Key.
        /// </summary>
        public InputList<string> Includes
        {
            get => _includes ?? (_includes = new InputList<string>());
            set => _includes = value;
        }

        public PageRuleActionsCacheKeyFieldsCookieGetArgs()
        {
        }
        public static new PageRuleActionsCacheKeyFieldsCookieGetArgs Empty => new PageRuleActionsCacheKeyFieldsCookieGetArgs();
    }
}
