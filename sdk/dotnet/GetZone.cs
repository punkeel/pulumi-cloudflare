// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare
{
    public static class GetZone
    {
        /// <summary>
        /// Use this data source to look up [zone] info. This is the singular alternative
        /// to `cloudflare.getZones`.
        /// 
        /// &gt; **Note** Cloudflare zone names **are not unique**. It is possible for multiple
        /// accounts to have the same zone created but in different states. If you are
        /// using this setup, it is advised to use the `account_id` attribute on this
        /// resource or swap to `cloudflare.getZones` to further filter the results.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Cloudflare = Pulumi.Cloudflare;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Cloudflare.GetZone.Invoke(new()
        ///     {
        ///         ZoneId = "0b6d347b01d437a092be84c2edfce72c",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% example %}}
        /// ### Example usage with other resources
        /// 
        /// The example below fetches the zone information for example.com and then is
        /// referenced in the `cloudflare.Record` section.
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Cloudflare = Pulumi.Cloudflare;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var exampleZone = Cloudflare.GetZone.Invoke(new()
        ///     {
        ///         Name = "example.com",
        ///     });
        /// 
        ///     var exampleRecord = new Cloudflare.Record("exampleRecord", new()
        ///     {
        ///         ZoneId = exampleZone.Apply(getZoneResult =&gt; getZoneResult.Id),
        ///         Name = "www",
        ///         Value = "203.0.113.1",
        ///         Type = "A",
        ///         Proxied = true,
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetZoneResult> InvokeAsync(GetZoneArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetZoneResult>("cloudflare:index/getZone:getZone", args ?? new GetZoneArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to look up [zone] info. This is the singular alternative
        /// to `cloudflare.getZones`.
        /// 
        /// &gt; **Note** Cloudflare zone names **are not unique**. It is possible for multiple
        /// accounts to have the same zone created but in different states. If you are
        /// using this setup, it is advised to use the `account_id` attribute on this
        /// resource or swap to `cloudflare.getZones` to further filter the results.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Cloudflare = Pulumi.Cloudflare;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Cloudflare.GetZone.Invoke(new()
        ///     {
        ///         ZoneId = "0b6d347b01d437a092be84c2edfce72c",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% example %}}
        /// ### Example usage with other resources
        /// 
        /// The example below fetches the zone information for example.com and then is
        /// referenced in the `cloudflare.Record` section.
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Cloudflare = Pulumi.Cloudflare;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var exampleZone = Cloudflare.GetZone.Invoke(new()
        ///     {
        ///         Name = "example.com",
        ///     });
        /// 
        ///     var exampleRecord = new Cloudflare.Record("exampleRecord", new()
        ///     {
        ///         ZoneId = exampleZone.Apply(getZoneResult =&gt; getZoneResult.Id),
        ///         Name = "www",
        ///         Value = "203.0.113.1",
        ///         Type = "A",
        ///         Proxied = true,
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetZoneResult> Invoke(GetZoneInvokeArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetZoneResult>("cloudflare:index/getZone:getZone", args ?? new GetZoneInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetZoneArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The account ID associated with the zone.
        /// </summary>
        [Input("accountId")]
        public string? AccountId { get; set; }

        /// <summary>
        /// The name of the zone. Conflicts with `"zone_id"`.
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        /// <summary>
        /// The zone ID. Conflicts with `"name"`.
        /// </summary>
        [Input("zoneId")]
        public string? ZoneId { get; set; }

        public GetZoneArgs()
        {
        }
        public static new GetZoneArgs Empty => new GetZoneArgs();
    }

    public sealed class GetZoneInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The account ID associated with the zone.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// The name of the zone. Conflicts with `"zone_id"`.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The zone ID. Conflicts with `"name"`.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public GetZoneInvokeArgs()
        {
        }
        public static new GetZoneInvokeArgs Empty => new GetZoneInvokeArgs();
    }


    [OutputType]
    public sealed class GetZoneResult
    {
        /// <summary>
        /// The account ID associated with the zone.
        /// </summary>
        public readonly string AccountId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The name of the zone.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Cloudflare assigned name servers. This is only populated for zones that use Cloudflare DNS.
        /// </summary>
        public readonly ImmutableArray<string> NameServers;
        /// <summary>
        /// `true` if cloudflare is enabled on the zone, otherwise `false`.
        /// </summary>
        public readonly bool Paused;
        /// <summary>
        /// The name of the plan associated with the zone.
        /// </summary>
        public readonly string Plan;
        /// <summary>
        /// Status of the zone. Values can be: `"active"`, `"pending"`, `"initializing"`, `"moved"`, `"deleted"`,
        /// or `"deactivated"`.
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// List of Vanity Nameservers (if set).
        /// </summary>
        public readonly ImmutableArray<string> VanityNameServers;
        public readonly string ZoneId;

        [OutputConstructor]
        private GetZoneResult(
            string accountId,

            string id,

            string name,

            ImmutableArray<string> nameServers,

            bool paused,

            string plan,

            string status,

            ImmutableArray<string> vanityNameServers,

            string zoneId)
        {
            AccountId = accountId;
            Id = id;
            Name = name;
            NameServers = nameServers;
            Paused = paused;
            Plan = plan;
            Status = status;
            VanityNameServers = vanityNameServers;
            ZoneId = zoneId;
        }
    }
}
