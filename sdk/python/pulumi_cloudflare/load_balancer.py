# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from . import utilities, tables

class LoadBalancer(pulumi.CustomResource):
    created_on: pulumi.Output[str]
    """
    The RFC3339 timestamp of when the load balancer was created.
    """
    default_pool_ids: pulumi.Output[list]
    """
    A list of pool IDs ordered by their failover priority. Used whenever region/pop pools are not defined.
    """
    description: pulumi.Output[str]
    """
    Free text description.
    """
    enabled: pulumi.Output[bool]
    """
    Enable or disable the load balancer. Defaults to `true` (enabled).
    """
    fallback_pool_id: pulumi.Output[str]
    """
    The pool ID to use when all other pools are detected as unhealthy.
    """
    modified_on: pulumi.Output[str]
    """
    The RFC3339 timestamp of when the load balancer was last modified.
    """
    name: pulumi.Output[str]
    """
    The DNS name (FQDN, including the zone) to associate with the load balancer.
    """
    pop_pools: pulumi.Output[list]
    """
    A set containing mappings of Cloudflare Point-of-Presence (PoP) identifiers to a list of pool IDs (ordered by their failover priority) for the PoP (datacenter). This feature is only available to enterprise customers. Fields documented below.
    
      * `poolIds` (`list`) - A list of pool IDs in failover priority to use for traffic reaching the given PoP.
      * `pop` (`str`) - A 3-letter code for the Point-of-Presence. Allowed values can be found in the list of datacenters on the [status page](https://www.cloudflarestatus.com/). Multiple entries should not be specified with the same PoP.
    """
    proxied: pulumi.Output[bool]
    """
    Whether the hostname gets Cloudflare's origin protection. Defaults to `false`.
    """
    region_pools: pulumi.Output[list]
    """
    A set containing mappings of region/country codes to a list of pool IDs (ordered by their failover priority) for the given region. Fields documented below.
    
      * `poolIds` (`list`) - A list of pool IDs in failover priority to use for traffic reaching the given PoP.
      * `region` (`str`) - A region code which must be in the list defined [here](https://support.cloudflare.com/hc/en-us/articles/115000540888-Load-Balancing-Geographic-Regions). Multiple entries should not be specified with the same region.
    """
    session_affinity: pulumi.Output[str]
    """
    Associates all requests coming from an end-user with a single origin. Cloudflare will set a cookie on the initial response to the client, such that consequent requests with the cookie in the request will go to the same origin, so long as it is available.
    """
    steering_policy: pulumi.Output[str]
    """
    Determine which method the load balancer uses to determine the fastest route to your origin. Valid values  are: `"off"`, `"geo"`, `"dynamic_latency"`, `"random"` or `""`. Default is `""`.
    """
    ttl: pulumi.Output[float]
    """
    Time to live (TTL) of this load balancer's DNS `name`. Conflicts with `proxied` - this cannot be set for proxied load balancers. Default is `30`.
    """
    zone_id: pulumi.Output[str]
    """
    The zone ID to add the load balancer to.
    """
    def __init__(__self__, resource_name, opts=None, default_pool_ids=None, description=None, enabled=None, fallback_pool_id=None, name=None, pop_pools=None, proxied=None, region_pools=None, session_affinity=None, steering_policy=None, ttl=None, zone_id=None, __props__=None, __name__=None, __opts__=None):
        """
        Provides a Cloudflare Load Balancer resource. This sits in front of a number of defined pools of origins and provides various options for geographically-aware load balancing. Note that the load balancing feature must be enabled in your Clouflare account before you can use this resource.
        
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[list] default_pool_ids: A list of pool IDs ordered by their failover priority. Used whenever region/pop pools are not defined.
        :param pulumi.Input[str] description: Free text description.
        :param pulumi.Input[bool] enabled: Enable or disable the load balancer. Defaults to `true` (enabled).
        :param pulumi.Input[str] fallback_pool_id: The pool ID to use when all other pools are detected as unhealthy.
        :param pulumi.Input[str] name: The DNS name (FQDN, including the zone) to associate with the load balancer.
        :param pulumi.Input[list] pop_pools: A set containing mappings of Cloudflare Point-of-Presence (PoP) identifiers to a list of pool IDs (ordered by their failover priority) for the PoP (datacenter). This feature is only available to enterprise customers. Fields documented below.
        :param pulumi.Input[bool] proxied: Whether the hostname gets Cloudflare's origin protection. Defaults to `false`.
        :param pulumi.Input[list] region_pools: A set containing mappings of region/country codes to a list of pool IDs (ordered by their failover priority) for the given region. Fields documented below.
        :param pulumi.Input[str] session_affinity: Associates all requests coming from an end-user with a single origin. Cloudflare will set a cookie on the initial response to the client, such that consequent requests with the cookie in the request will go to the same origin, so long as it is available.
        :param pulumi.Input[str] steering_policy: Determine which method the load balancer uses to determine the fastest route to your origin. Valid values  are: `"off"`, `"geo"`, `"dynamic_latency"`, `"random"` or `""`. Default is `""`.
        :param pulumi.Input[float] ttl: Time to live (TTL) of this load balancer's DNS `name`. Conflicts with `proxied` - this cannot be set for proxied load balancers. Default is `30`.
        :param pulumi.Input[str] zone_id: The zone ID to add the load balancer to.
        
        The **pop_pools** object supports the following:
        
          * `poolIds` (`pulumi.Input[list]`) - A list of pool IDs in failover priority to use for traffic reaching the given PoP.
          * `pop` (`pulumi.Input[str]`) - A 3-letter code for the Point-of-Presence. Allowed values can be found in the list of datacenters on the [status page](https://www.cloudflarestatus.com/). Multiple entries should not be specified with the same PoP.
        
        The **region_pools** object supports the following:
        
          * `poolIds` (`pulumi.Input[list]`) - A list of pool IDs in failover priority to use for traffic reaching the given PoP.
          * `region` (`pulumi.Input[str]`) - A region code which must be in the list defined [here](https://support.cloudflare.com/hc/en-us/articles/115000540888-Load-Balancing-Geographic-Regions). Multiple entries should not be specified with the same region.

        > This content is derived from https://github.com/terraform-providers/terraform-provider-cloudflare/blob/master/website/docs/r/load_balancer.html.markdown.
        """
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            if default_pool_ids is None:
                raise TypeError("Missing required property 'default_pool_ids'")
            __props__['default_pool_ids'] = default_pool_ids
            __props__['description'] = description
            __props__['enabled'] = enabled
            if fallback_pool_id is None:
                raise TypeError("Missing required property 'fallback_pool_id'")
            __props__['fallback_pool_id'] = fallback_pool_id
            if name is None:
                raise TypeError("Missing required property 'name'")
            __props__['name'] = name
            __props__['pop_pools'] = pop_pools
            __props__['proxied'] = proxied
            __props__['region_pools'] = region_pools
            __props__['session_affinity'] = session_affinity
            __props__['steering_policy'] = steering_policy
            __props__['ttl'] = ttl
            if zone_id is None:
                raise TypeError("Missing required property 'zone_id'")
            __props__['zone_id'] = zone_id
            __props__['created_on'] = None
            __props__['modified_on'] = None
        super(LoadBalancer, __self__).__init__(
            'cloudflare:index/loadBalancer:LoadBalancer',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name, id, opts=None, created_on=None, default_pool_ids=None, description=None, enabled=None, fallback_pool_id=None, modified_on=None, name=None, pop_pools=None, proxied=None, region_pools=None, session_affinity=None, steering_policy=None, ttl=None, zone_id=None):
        """
        Get an existing LoadBalancer resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.
        
        :param str resource_name: The unique name of the resulting resource.
        :param str id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] created_on: The RFC3339 timestamp of when the load balancer was created.
        :param pulumi.Input[list] default_pool_ids: A list of pool IDs ordered by their failover priority. Used whenever region/pop pools are not defined.
        :param pulumi.Input[str] description: Free text description.
        :param pulumi.Input[bool] enabled: Enable or disable the load balancer. Defaults to `true` (enabled).
        :param pulumi.Input[str] fallback_pool_id: The pool ID to use when all other pools are detected as unhealthy.
        :param pulumi.Input[str] modified_on: The RFC3339 timestamp of when the load balancer was last modified.
        :param pulumi.Input[str] name: The DNS name (FQDN, including the zone) to associate with the load balancer.
        :param pulumi.Input[list] pop_pools: A set containing mappings of Cloudflare Point-of-Presence (PoP) identifiers to a list of pool IDs (ordered by their failover priority) for the PoP (datacenter). This feature is only available to enterprise customers. Fields documented below.
        :param pulumi.Input[bool] proxied: Whether the hostname gets Cloudflare's origin protection. Defaults to `false`.
        :param pulumi.Input[list] region_pools: A set containing mappings of region/country codes to a list of pool IDs (ordered by their failover priority) for the given region. Fields documented below.
        :param pulumi.Input[str] session_affinity: Associates all requests coming from an end-user with a single origin. Cloudflare will set a cookie on the initial response to the client, such that consequent requests with the cookie in the request will go to the same origin, so long as it is available.
        :param pulumi.Input[str] steering_policy: Determine which method the load balancer uses to determine the fastest route to your origin. Valid values  are: `"off"`, `"geo"`, `"dynamic_latency"`, `"random"` or `""`. Default is `""`.
        :param pulumi.Input[float] ttl: Time to live (TTL) of this load balancer's DNS `name`. Conflicts with `proxied` - this cannot be set for proxied load balancers. Default is `30`.
        :param pulumi.Input[str] zone_id: The zone ID to add the load balancer to.
        
        The **pop_pools** object supports the following:
        
          * `poolIds` (`pulumi.Input[list]`) - A list of pool IDs in failover priority to use for traffic reaching the given PoP.
          * `pop` (`pulumi.Input[str]`) - A 3-letter code for the Point-of-Presence. Allowed values can be found in the list of datacenters on the [status page](https://www.cloudflarestatus.com/). Multiple entries should not be specified with the same PoP.
        
        The **region_pools** object supports the following:
        
          * `poolIds` (`pulumi.Input[list]`) - A list of pool IDs in failover priority to use for traffic reaching the given PoP.
          * `region` (`pulumi.Input[str]`) - A region code which must be in the list defined [here](https://support.cloudflare.com/hc/en-us/articles/115000540888-Load-Balancing-Geographic-Regions). Multiple entries should not be specified with the same region.

        > This content is derived from https://github.com/terraform-providers/terraform-provider-cloudflare/blob/master/website/docs/r/load_balancer.html.markdown.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()
        __props__["created_on"] = created_on
        __props__["default_pool_ids"] = default_pool_ids
        __props__["description"] = description
        __props__["enabled"] = enabled
        __props__["fallback_pool_id"] = fallback_pool_id
        __props__["modified_on"] = modified_on
        __props__["name"] = name
        __props__["pop_pools"] = pop_pools
        __props__["proxied"] = proxied
        __props__["region_pools"] = region_pools
        __props__["session_affinity"] = session_affinity
        __props__["steering_policy"] = steering_policy
        __props__["ttl"] = ttl
        __props__["zone_id"] = zone_id
        return LoadBalancer(resource_name, opts=opts, __props__=__props__)
    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

