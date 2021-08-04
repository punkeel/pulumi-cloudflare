// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare
{
    /// <summary>
    /// Provides a Cloudflare record resource.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Cloudflare = Pulumi.Cloudflare;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         // Add a record to the domain
    ///         var foobar = new Cloudflare.Record("foobar", new Cloudflare.RecordArgs
    ///         {
    ///             ZoneId = @var.Cloudflare_zone_id,
    ///             Name = "terraform",
    ///             Value = "192.168.0.11",
    ///             Type = "A",
    ///             Ttl = 3600,
    ///         });
    ///         // Add a record requiring a data map
    ///         var _sipTls = new Cloudflare.Record("_sipTls", new Cloudflare.RecordArgs
    ///         {
    ///             ZoneId = @var.Cloudflare_zone_id,
    ///             Name = "_sip._tls",
    ///             Type = "SRV",
    ///             Data = new Cloudflare.Inputs.RecordDataArgs
    ///             {
    ///                 Service = "_sip",
    ///                 Proto = "_tls",
    ///                 Name = "terraform-srv",
    ///                 Priority = 0,
    ///                 Weight = 0,
    ///                 Port = 443,
    ///                 Target = "example.com",
    ///             },
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// Records can be imported using a composite ID formed of zone ID and record ID, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import cloudflare:index/record:Record default ae36f999674d196762efcc5abb06b345/d41d8cd98f00b204e9800998ecf8427e
    /// ```
    /// 
    ///  where* `ae36f999674d196762efcc5abb06b345` - the zone ID * `d41d8cd98f00b204e9800998ecf8427e` - record ID as returned by [API](https://api.cloudflare.com/#dns-records-for-a-zone-list-dns-records)
    /// </summary>
    [CloudflareResourceType("cloudflare:index/record:Record")]
    public partial class Record : Pulumi.CustomResource
    {
        [Output("allowOverwrite")]
        public Output<bool?> AllowOverwrite { get; private set; } = null!;

        /// <summary>
        /// The RFC3339 timestamp of when the record was created
        /// </summary>
        [Output("createdOn")]
        public Output<string> CreatedOn { get; private set; } = null!;

        /// <summary>
        /// Map of attributes that constitute the record value. Primarily used for LOC and SRV record types. Either this or `value` must be specified
        /// </summary>
        [Output("data")]
        public Output<Outputs.RecordData?> Data { get; private set; } = null!;

        /// <summary>
        /// The FQDN of the record
        /// </summary>
        [Output("hostname")]
        public Output<string> Hostname { get; private set; } = null!;

        /// <summary>
        /// A key-value map of string metadata Cloudflare associates with the record
        /// </summary>
        [Output("metadata")]
        public Output<ImmutableDictionary<string, object>> Metadata { get; private set; } = null!;

        /// <summary>
        /// The RFC3339 timestamp of when the record was last modified
        /// </summary>
        [Output("modifiedOn")]
        public Output<string> ModifiedOn { get; private set; } = null!;

        /// <summary>
        /// The name of the record
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The priority of the record
        /// </summary>
        [Output("priority")]
        public Output<int?> Priority { get; private set; } = null!;

        /// <summary>
        /// Shows whether this record can be proxied, must be true if setting `proxied=true`
        /// </summary>
        [Output("proxiable")]
        public Output<bool> Proxiable { get; private set; } = null!;

        /// <summary>
        /// Whether the record gets Cloudflare's origin protection; defaults to `false`.
        /// </summary>
        [Output("proxied")]
        public Output<bool?> Proxied { get; private set; } = null!;

        /// <summary>
        /// The TTL of the record ([automatic: '1'](https://api.cloudflare.com/#dns-records-for-a-zone-create-dns-record))
        /// </summary>
        [Output("ttl")]
        public Output<int> Ttl { get; private set; } = null!;

        /// <summary>
        /// The type of the record
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;

        /// <summary>
        /// The (string) value of the record. Either this or `data` must be specified
        /// </summary>
        [Output("value")]
        public Output<string> Value { get; private set; } = null!;

        /// <summary>
        /// The DNS zone ID to add the record to
        /// </summary>
        [Output("zoneId")]
        public Output<string> ZoneId { get; private set; } = null!;


        /// <summary>
        /// Create a Record resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Record(string name, RecordArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/record:Record", name, args ?? new RecordArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Record(string name, Input<string> id, RecordState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/record:Record", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Record resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Record Get(string name, Input<string> id, RecordState? state = null, CustomResourceOptions? options = null)
        {
            return new Record(name, id, state, options);
        }
    }

    public sealed class RecordArgs : Pulumi.ResourceArgs
    {
        [Input("allowOverwrite")]
        public Input<bool>? AllowOverwrite { get; set; }

        /// <summary>
        /// Map of attributes that constitute the record value. Primarily used for LOC and SRV record types. Either this or `value` must be specified
        /// </summary>
        [Input("data")]
        public Input<Inputs.RecordDataArgs>? Data { get; set; }

        /// <summary>
        /// The name of the record
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The priority of the record
        /// </summary>
        [Input("priority")]
        public Input<int>? Priority { get; set; }

        /// <summary>
        /// Whether the record gets Cloudflare's origin protection; defaults to `false`.
        /// </summary>
        [Input("proxied")]
        public Input<bool>? Proxied { get; set; }

        /// <summary>
        /// The TTL of the record ([automatic: '1'](https://api.cloudflare.com/#dns-records-for-a-zone-create-dns-record))
        /// </summary>
        [Input("ttl")]
        public Input<int>? Ttl { get; set; }

        /// <summary>
        /// The type of the record
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        /// <summary>
        /// The (string) value of the record. Either this or `data` must be specified
        /// </summary>
        [Input("value")]
        public Input<string>? Value { get; set; }

        /// <summary>
        /// The DNS zone ID to add the record to
        /// </summary>
        [Input("zoneId", required: true)]
        public Input<string> ZoneId { get; set; } = null!;

        public RecordArgs()
        {
        }
    }

    public sealed class RecordState : Pulumi.ResourceArgs
    {
        [Input("allowOverwrite")]
        public Input<bool>? AllowOverwrite { get; set; }

        /// <summary>
        /// The RFC3339 timestamp of when the record was created
        /// </summary>
        [Input("createdOn")]
        public Input<string>? CreatedOn { get; set; }

        /// <summary>
        /// Map of attributes that constitute the record value. Primarily used for LOC and SRV record types. Either this or `value` must be specified
        /// </summary>
        [Input("data")]
        public Input<Inputs.RecordDataGetArgs>? Data { get; set; }

        /// <summary>
        /// The FQDN of the record
        /// </summary>
        [Input("hostname")]
        public Input<string>? Hostname { get; set; }

        [Input("metadata")]
        private InputMap<object>? _metadata;

        /// <summary>
        /// A key-value map of string metadata Cloudflare associates with the record
        /// </summary>
        public InputMap<object> Metadata
        {
            get => _metadata ?? (_metadata = new InputMap<object>());
            set => _metadata = value;
        }

        /// <summary>
        /// The RFC3339 timestamp of when the record was last modified
        /// </summary>
        [Input("modifiedOn")]
        public Input<string>? ModifiedOn { get; set; }

        /// <summary>
        /// The name of the record
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The priority of the record
        /// </summary>
        [Input("priority")]
        public Input<int>? Priority { get; set; }

        /// <summary>
        /// Shows whether this record can be proxied, must be true if setting `proxied=true`
        /// </summary>
        [Input("proxiable")]
        public Input<bool>? Proxiable { get; set; }

        /// <summary>
        /// Whether the record gets Cloudflare's origin protection; defaults to `false`.
        /// </summary>
        [Input("proxied")]
        public Input<bool>? Proxied { get; set; }

        /// <summary>
        /// The TTL of the record ([automatic: '1'](https://api.cloudflare.com/#dns-records-for-a-zone-create-dns-record))
        /// </summary>
        [Input("ttl")]
        public Input<int>? Ttl { get; set; }

        /// <summary>
        /// The type of the record
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// The (string) value of the record. Either this or `data` must be specified
        /// </summary>
        [Input("value")]
        public Input<string>? Value { get; set; }

        /// <summary>
        /// The DNS zone ID to add the record to
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public RecordState()
        {
        }
    }
}
