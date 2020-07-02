# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Union
from . import utilities, tables


class CustomSsl(pulumi.CustomResource):
    custom_ssl_options: pulumi.Output[dict]
    """
    The certificate, private key and associated optional parameters, such as bundle_method, geo_restrictions, and type.

      * `bundle_method` (`str`) - Method of building intermediate certificate chain. A ubiquitous bundle has the highest probability of being verified everywhere, even by clients using outdated or unusual trust stores. An optimal bundle uses the shortest chain and newest intermediates. And the force bundle verifies the chain, but does not otherwise modify it. Valid values are `ubiquitous` (default), `optimal`, `force`.
      * `certificate` (`str`) - Certificate certificate and the intermediate(s)
      * `geo_restrictions` (`str`) - Specifies the region where your private key can be held locally. Valid values are `us`, `eu`, `highest_security`.
      * `private_key` (`str`) - Certificate's private key
      * `type` (`str`) - Whether to enable support for legacy clients which do not include SNI in the TLS handshake. Valid values are `legacy_custom` (default), `sni_custom`.
    """
    custom_ssl_priorities: pulumi.Output[list]
    expires_on: pulumi.Output[str]
    hosts: pulumi.Output[list]
    issuer: pulumi.Output[str]
    modified_on: pulumi.Output[str]
    priority: pulumi.Output[float]
    signature: pulumi.Output[str]
    status: pulumi.Output[str]
    uploaded_on: pulumi.Output[str]
    zone_id: pulumi.Output[str]
    """
    The DNS zone id to the custom ssl cert should be added.
    """
    def __init__(__self__, resource_name, opts=None, custom_ssl_options=None, custom_ssl_priorities=None, zone_id=None, __props__=None, __name__=None, __opts__=None):
        """
        Provides a Cloudflare custom ssl resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        config = pulumi.Config()
        cloudflare_zone_id = config.get("cloudflareZoneId")
        if cloudflare_zone_id is None:
            cloudflare_zone_id = "1d5fdc9e88c8a8c4518b068cd94331fe"
        # Add a custom ssl certificate to the domain
        foossl = cloudflare.CustomSsl("foossl",
            custom_ssl_options={
                "bundle_method": "ubiquitous",
                "certificate": "-----INSERT CERTIFICATE-----",
                "geo_restrictions": "us",
                "private_key": "-----INSERT PRIVATE KEY-----",
                "type": "legacy_custom",
            },
            zone_id=cloudflare_zone_id)
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[dict] custom_ssl_options: The certificate, private key and associated optional parameters, such as bundle_method, geo_restrictions, and type.
        :param pulumi.Input[str] zone_id: The DNS zone id to the custom ssl cert should be added.

        The **custom_ssl_options** object supports the following:

          * `bundle_method` (`pulumi.Input[str]`) - Method of building intermediate certificate chain. A ubiquitous bundle has the highest probability of being verified everywhere, even by clients using outdated or unusual trust stores. An optimal bundle uses the shortest chain and newest intermediates. And the force bundle verifies the chain, but does not otherwise modify it. Valid values are `ubiquitous` (default), `optimal`, `force`.
          * `certificate` (`pulumi.Input[str]`) - Certificate certificate and the intermediate(s)
          * `geo_restrictions` (`pulumi.Input[str]`) - Specifies the region where your private key can be held locally. Valid values are `us`, `eu`, `highest_security`.
          * `private_key` (`pulumi.Input[str]`) - Certificate's private key
          * `type` (`pulumi.Input[str]`) - Whether to enable support for legacy clients which do not include SNI in the TLS handshake. Valid values are `legacy_custom` (default), `sni_custom`.

        The **custom_ssl_priorities** object supports the following:

          * `id` (`pulumi.Input[str]`)
          * `priority` (`pulumi.Input[float]`)
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

            __props__['custom_ssl_options'] = custom_ssl_options
            __props__['custom_ssl_priorities'] = custom_ssl_priorities
            if zone_id is None:
                raise TypeError("Missing required property 'zone_id'")
            __props__['zone_id'] = zone_id
            __props__['expires_on'] = None
            __props__['hosts'] = None
            __props__['issuer'] = None
            __props__['modified_on'] = None
            __props__['priority'] = None
            __props__['signature'] = None
            __props__['status'] = None
            __props__['uploaded_on'] = None
        super(CustomSsl, __self__).__init__(
            'cloudflare:index/customSsl:CustomSsl',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name, id, opts=None, custom_ssl_options=None, custom_ssl_priorities=None, expires_on=None, hosts=None, issuer=None, modified_on=None, priority=None, signature=None, status=None, uploaded_on=None, zone_id=None):
        """
        Get an existing CustomSsl resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param str id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[dict] custom_ssl_options: The certificate, private key and associated optional parameters, such as bundle_method, geo_restrictions, and type.
        :param pulumi.Input[str] zone_id: The DNS zone id to the custom ssl cert should be added.

        The **custom_ssl_options** object supports the following:

          * `bundle_method` (`pulumi.Input[str]`) - Method of building intermediate certificate chain. A ubiquitous bundle has the highest probability of being verified everywhere, even by clients using outdated or unusual trust stores. An optimal bundle uses the shortest chain and newest intermediates. And the force bundle verifies the chain, but does not otherwise modify it. Valid values are `ubiquitous` (default), `optimal`, `force`.
          * `certificate` (`pulumi.Input[str]`) - Certificate certificate and the intermediate(s)
          * `geo_restrictions` (`pulumi.Input[str]`) - Specifies the region where your private key can be held locally. Valid values are `us`, `eu`, `highest_security`.
          * `private_key` (`pulumi.Input[str]`) - Certificate's private key
          * `type` (`pulumi.Input[str]`) - Whether to enable support for legacy clients which do not include SNI in the TLS handshake. Valid values are `legacy_custom` (default), `sni_custom`.

        The **custom_ssl_priorities** object supports the following:

          * `id` (`pulumi.Input[str]`)
          * `priority` (`pulumi.Input[float]`)
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["custom_ssl_options"] = custom_ssl_options
        __props__["custom_ssl_priorities"] = custom_ssl_priorities
        __props__["expires_on"] = expires_on
        __props__["hosts"] = hosts
        __props__["issuer"] = issuer
        __props__["modified_on"] = modified_on
        __props__["priority"] = priority
        __props__["signature"] = signature
        __props__["status"] = status
        __props__["uploaded_on"] = uploaded_on
        __props__["zone_id"] = zone_id
        return CustomSsl(resource_name, opts=opts, __props__=__props__)

    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop
