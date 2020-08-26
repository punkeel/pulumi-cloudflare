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
    public sealed class PageRuleActionsCacheKeyFields
    {
        /// <summary>
        /// Controls what cookies go into Cache Key:
        /// </summary>
        public readonly Outputs.PageRuleActionsCacheKeyFieldsCookie Cookie;
        /// <summary>
        /// Controls what HTTP headers go into Cache Key:
        /// </summary>
        public readonly Outputs.PageRuleActionsCacheKeyFieldsHeader Header;
        /// <summary>
        /// Controls which Host header goes into Cache Key:
        /// </summary>
        public readonly Outputs.PageRuleActionsCacheKeyFieldsHost Host;
        /// <summary>
        /// Controls which URL query string parameters go into the Cache Key.
        /// </summary>
        public readonly Outputs.PageRuleActionsCacheKeyFieldsQueryString QueryString;
        /// <summary>
        /// Controls which end user-related features go into the Cache Key.
        /// </summary>
        public readonly Outputs.PageRuleActionsCacheKeyFieldsUser User;

        [OutputConstructor]
        private PageRuleActionsCacheKeyFields(
            Outputs.PageRuleActionsCacheKeyFieldsCookie cookie,

            Outputs.PageRuleActionsCacheKeyFieldsHeader header,

            Outputs.PageRuleActionsCacheKeyFieldsHost host,

            Outputs.PageRuleActionsCacheKeyFieldsQueryString queryString,

            Outputs.PageRuleActionsCacheKeyFieldsUser user)
        {
            Cookie = cookie;
            Header = header;
            Host = host;
            QueryString = queryString;
            User = user;
        }
    }
}