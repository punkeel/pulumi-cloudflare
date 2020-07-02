# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Union
from . import utilities, tables


class AccessPolicy(pulumi.CustomResource):
    application_id: pulumi.Output[str]
    """
    The ID of the application the policy is
    associated with.
    """
    decision: pulumi.Output[str]
    """
    Defines the action Access will take if the policy matches the user.
    Allowed values: `allow`, `deny`, `non_identity`, `bypass`
    """
    excludes: pulumi.Output[list]
    """
    A series of access conditions, see [Access Groups](https://www.terraform.io/docs/providers/cloudflare/r/access_group.html#conditions).

      * `anyValidServiceToken` (`bool`)
      * `azures` (`list`)
        * `id` (`str`)
        * `identityProviderId` (`str`)

      * `certificate` (`bool`)
      * `commonName` (`str`)
      * `emailDomains` (`list`)
      * `emails` (`list`)
      * `everyone` (`bool`)
      * `githubs` (`list`)
        * `identityProviderId` (`str`)
        * `name` (`str`) - Friendly name of the Access Application.

      * `groups` (`list`)
      * `gsuites` (`list`)
        * `email` (`str`)
        * `identityProviderId` (`str`)

      * `ips` (`list`)
      * `oktas` (`list`)
        * `identityProviderId` (`str`)
        * `name` (`str`) - Friendly name of the Access Application.

      * `samls` (`list`)
        * `attributeName` (`str`)
        * `attributeValue` (`str`)
        * `identityProviderId` (`str`)

      * `serviceTokens` (`list`)
    """
    includes: pulumi.Output[list]
    """
    A series of access conditions, see [Access Groups](https://www.terraform.io/docs/providers/cloudflare/r/access_group.html#conditions).

      * `anyValidServiceToken` (`bool`)
      * `azures` (`list`)
        * `id` (`str`)
        * `identityProviderId` (`str`)

      * `certificate` (`bool`)
      * `commonName` (`str`)
      * `emailDomains` (`list`)
      * `emails` (`list`)
      * `everyone` (`bool`)
      * `githubs` (`list`)
        * `identityProviderId` (`str`)
        * `name` (`str`) - Friendly name of the Access Application.

      * `groups` (`list`)
      * `gsuites` (`list`)
        * `email` (`str`)
        * `identityProviderId` (`str`)

      * `ips` (`list`)
      * `oktas` (`list`)
        * `identityProviderId` (`str`)
        * `name` (`str`) - Friendly name of the Access Application.

      * `samls` (`list`)
        * `attributeName` (`str`)
        * `attributeValue` (`str`)
        * `identityProviderId` (`str`)

      * `serviceTokens` (`list`)
    """
    name: pulumi.Output[str]
    """
    Friendly name of the Access Application.
    """
    precedence: pulumi.Output[float]
    """
    The unique precedence for policies on a single application. Integer.
    """
    requires: pulumi.Output[list]
    """
    A series of access conditions, see [Access Groups](https://www.terraform.io/docs/providers/cloudflare/r/access_group.html#conditions).

      * `anyValidServiceToken` (`bool`)
      * `azures` (`list`)
        * `id` (`str`)
        * `identityProviderId` (`str`)

      * `certificate` (`bool`)
      * `commonName` (`str`)
      * `emailDomains` (`list`)
      * `emails` (`list`)
      * `everyone` (`bool`)
      * `githubs` (`list`)
        * `identityProviderId` (`str`)
        * `name` (`str`) - Friendly name of the Access Application.

      * `groups` (`list`)
      * `gsuites` (`list`)
        * `email` (`str`)
        * `identityProviderId` (`str`)

      * `ips` (`list`)
      * `oktas` (`list`)
        * `identityProviderId` (`str`)
        * `name` (`str`) - Friendly name of the Access Application.

      * `samls` (`list`)
        * `attributeName` (`str`)
        * `attributeValue` (`str`)
        * `identityProviderId` (`str`)

      * `serviceTokens` (`list`)
    """
    zone_id: pulumi.Output[str]
    """
    The DNS zone to which the access rule should be
    added.
    """
    def __init__(__self__, resource_name, opts=None, application_id=None, decision=None, excludes=None, includes=None, name=None, precedence=None, requires=None, zone_id=None, __props__=None, __name__=None, __opts__=None):
        """
        Provides a Cloudflare Access Policy resource. Access Policies are used
        in conjunction with Access Applications to restrict access to a
        particular resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        # Allowing access to `test@example.com` email address only
        test_policy_access_policy = cloudflare.AccessPolicy("testPolicyAccessPolicy",
            application_id="cb029e245cfdd66dc8d2e570d5dd3322",
            zone_id="d41d8cd98f00b204e9800998ecf8427e",
            name="staging policy",
            precedence="1",
            decision="allow",
            includes=[{
                "emails": ["test@example.com"],
            }])
        # Allowing `test@example.com` to access but only when coming from a
        # specific IP.
        test_policy_index_access_policy_access_policy = cloudflare.AccessPolicy("testPolicyIndex/accessPolicyAccessPolicy",
            application_id="cb029e245cfdd66dc8d2e570d5dd3322",
            zone_id="d41d8cd98f00b204e9800998ecf8427e",
            name="staging policy",
            precedence="1",
            decision="allow",
            includes=[{
                "emails": ["test@example.com"],
            }],
            requires={
                "ips": [var["office_ip"]],
            })
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] application_id: The ID of the application the policy is
               associated with.
        :param pulumi.Input[str] decision: Defines the action Access will take if the policy matches the user.
               Allowed values: `allow`, `deny`, `non_identity`, `bypass`
        :param pulumi.Input[list] excludes: A series of access conditions, see [Access Groups](https://www.terraform.io/docs/providers/cloudflare/r/access_group.html#conditions).
        :param pulumi.Input[list] includes: A series of access conditions, see [Access Groups](https://www.terraform.io/docs/providers/cloudflare/r/access_group.html#conditions).
        :param pulumi.Input[str] name: Friendly name of the Access Application.
        :param pulumi.Input[float] precedence: The unique precedence for policies on a single application. Integer.
        :param pulumi.Input[list] requires: A series of access conditions, see [Access Groups](https://www.terraform.io/docs/providers/cloudflare/r/access_group.html#conditions).
        :param pulumi.Input[str] zone_id: The DNS zone to which the access rule should be
               added.

        The **excludes** object supports the following:

          * `anyValidServiceToken` (`pulumi.Input[bool]`)
          * `azures` (`pulumi.Input[list]`)
            * `id` (`pulumi.Input[str]`)
            * `identityProviderId` (`pulumi.Input[str]`)

          * `certificate` (`pulumi.Input[bool]`)
          * `commonName` (`pulumi.Input[str]`)
          * `emailDomains` (`pulumi.Input[list]`)
          * `emails` (`pulumi.Input[list]`)
          * `everyone` (`pulumi.Input[bool]`)
          * `githubs` (`pulumi.Input[list]`)
            * `identityProviderId` (`pulumi.Input[str]`)
            * `name` (`pulumi.Input[str]`) - Friendly name of the Access Application.

          * `groups` (`pulumi.Input[list]`)
          * `gsuites` (`pulumi.Input[list]`)
            * `email` (`pulumi.Input[str]`)
            * `identityProviderId` (`pulumi.Input[str]`)

          * `ips` (`pulumi.Input[list]`)
          * `oktas` (`pulumi.Input[list]`)
            * `identityProviderId` (`pulumi.Input[str]`)
            * `name` (`pulumi.Input[str]`) - Friendly name of the Access Application.

          * `samls` (`pulumi.Input[list]`)
            * `attributeName` (`pulumi.Input[str]`)
            * `attributeValue` (`pulumi.Input[str]`)
            * `identityProviderId` (`pulumi.Input[str]`)

          * `serviceTokens` (`pulumi.Input[list]`)

        The **includes** object supports the following:

          * `anyValidServiceToken` (`pulumi.Input[bool]`)
          * `azures` (`pulumi.Input[list]`)
            * `id` (`pulumi.Input[str]`)
            * `identityProviderId` (`pulumi.Input[str]`)

          * `certificate` (`pulumi.Input[bool]`)
          * `commonName` (`pulumi.Input[str]`)
          * `emailDomains` (`pulumi.Input[list]`)
          * `emails` (`pulumi.Input[list]`)
          * `everyone` (`pulumi.Input[bool]`)
          * `githubs` (`pulumi.Input[list]`)
            * `identityProviderId` (`pulumi.Input[str]`)
            * `name` (`pulumi.Input[str]`) - Friendly name of the Access Application.

          * `groups` (`pulumi.Input[list]`)
          * `gsuites` (`pulumi.Input[list]`)
            * `email` (`pulumi.Input[str]`)
            * `identityProviderId` (`pulumi.Input[str]`)

          * `ips` (`pulumi.Input[list]`)
          * `oktas` (`pulumi.Input[list]`)
            * `identityProviderId` (`pulumi.Input[str]`)
            * `name` (`pulumi.Input[str]`) - Friendly name of the Access Application.

          * `samls` (`pulumi.Input[list]`)
            * `attributeName` (`pulumi.Input[str]`)
            * `attributeValue` (`pulumi.Input[str]`)
            * `identityProviderId` (`pulumi.Input[str]`)

          * `serviceTokens` (`pulumi.Input[list]`)

        The **requires** object supports the following:

          * `anyValidServiceToken` (`pulumi.Input[bool]`)
          * `azures` (`pulumi.Input[list]`)
            * `id` (`pulumi.Input[str]`)
            * `identityProviderId` (`pulumi.Input[str]`)

          * `certificate` (`pulumi.Input[bool]`)
          * `commonName` (`pulumi.Input[str]`)
          * `emailDomains` (`pulumi.Input[list]`)
          * `emails` (`pulumi.Input[list]`)
          * `everyone` (`pulumi.Input[bool]`)
          * `githubs` (`pulumi.Input[list]`)
            * `identityProviderId` (`pulumi.Input[str]`)
            * `name` (`pulumi.Input[str]`) - Friendly name of the Access Application.

          * `groups` (`pulumi.Input[list]`)
          * `gsuites` (`pulumi.Input[list]`)
            * `email` (`pulumi.Input[str]`)
            * `identityProviderId` (`pulumi.Input[str]`)

          * `ips` (`pulumi.Input[list]`)
          * `oktas` (`pulumi.Input[list]`)
            * `identityProviderId` (`pulumi.Input[str]`)
            * `name` (`pulumi.Input[str]`) - Friendly name of the Access Application.

          * `samls` (`pulumi.Input[list]`)
            * `attributeName` (`pulumi.Input[str]`)
            * `attributeValue` (`pulumi.Input[str]`)
            * `identityProviderId` (`pulumi.Input[str]`)

          * `serviceTokens` (`pulumi.Input[list]`)
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

            if application_id is None:
                raise TypeError("Missing required property 'application_id'")
            __props__['application_id'] = application_id
            if decision is None:
                raise TypeError("Missing required property 'decision'")
            __props__['decision'] = decision
            __props__['excludes'] = excludes
            if includes is None:
                raise TypeError("Missing required property 'includes'")
            __props__['includes'] = includes
            if name is None:
                raise TypeError("Missing required property 'name'")
            __props__['name'] = name
            __props__['precedence'] = precedence
            __props__['requires'] = requires
            if zone_id is None:
                raise TypeError("Missing required property 'zone_id'")
            __props__['zone_id'] = zone_id
        super(AccessPolicy, __self__).__init__(
            'cloudflare:index/accessPolicy:AccessPolicy',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name, id, opts=None, application_id=None, decision=None, excludes=None, includes=None, name=None, precedence=None, requires=None, zone_id=None):
        """
        Get an existing AccessPolicy resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param str id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] application_id: The ID of the application the policy is
               associated with.
        :param pulumi.Input[str] decision: Defines the action Access will take if the policy matches the user.
               Allowed values: `allow`, `deny`, `non_identity`, `bypass`
        :param pulumi.Input[list] excludes: A series of access conditions, see [Access Groups](https://www.terraform.io/docs/providers/cloudflare/r/access_group.html#conditions).
        :param pulumi.Input[list] includes: A series of access conditions, see [Access Groups](https://www.terraform.io/docs/providers/cloudflare/r/access_group.html#conditions).
        :param pulumi.Input[str] name: Friendly name of the Access Application.
        :param pulumi.Input[float] precedence: The unique precedence for policies on a single application. Integer.
        :param pulumi.Input[list] requires: A series of access conditions, see [Access Groups](https://www.terraform.io/docs/providers/cloudflare/r/access_group.html#conditions).
        :param pulumi.Input[str] zone_id: The DNS zone to which the access rule should be
               added.

        The **excludes** object supports the following:

          * `anyValidServiceToken` (`pulumi.Input[bool]`)
          * `azures` (`pulumi.Input[list]`)
            * `id` (`pulumi.Input[str]`)
            * `identityProviderId` (`pulumi.Input[str]`)

          * `certificate` (`pulumi.Input[bool]`)
          * `commonName` (`pulumi.Input[str]`)
          * `emailDomains` (`pulumi.Input[list]`)
          * `emails` (`pulumi.Input[list]`)
          * `everyone` (`pulumi.Input[bool]`)
          * `githubs` (`pulumi.Input[list]`)
            * `identityProviderId` (`pulumi.Input[str]`)
            * `name` (`pulumi.Input[str]`) - Friendly name of the Access Application.

          * `groups` (`pulumi.Input[list]`)
          * `gsuites` (`pulumi.Input[list]`)
            * `email` (`pulumi.Input[str]`)
            * `identityProviderId` (`pulumi.Input[str]`)

          * `ips` (`pulumi.Input[list]`)
          * `oktas` (`pulumi.Input[list]`)
            * `identityProviderId` (`pulumi.Input[str]`)
            * `name` (`pulumi.Input[str]`) - Friendly name of the Access Application.

          * `samls` (`pulumi.Input[list]`)
            * `attributeName` (`pulumi.Input[str]`)
            * `attributeValue` (`pulumi.Input[str]`)
            * `identityProviderId` (`pulumi.Input[str]`)

          * `serviceTokens` (`pulumi.Input[list]`)

        The **includes** object supports the following:

          * `anyValidServiceToken` (`pulumi.Input[bool]`)
          * `azures` (`pulumi.Input[list]`)
            * `id` (`pulumi.Input[str]`)
            * `identityProviderId` (`pulumi.Input[str]`)

          * `certificate` (`pulumi.Input[bool]`)
          * `commonName` (`pulumi.Input[str]`)
          * `emailDomains` (`pulumi.Input[list]`)
          * `emails` (`pulumi.Input[list]`)
          * `everyone` (`pulumi.Input[bool]`)
          * `githubs` (`pulumi.Input[list]`)
            * `identityProviderId` (`pulumi.Input[str]`)
            * `name` (`pulumi.Input[str]`) - Friendly name of the Access Application.

          * `groups` (`pulumi.Input[list]`)
          * `gsuites` (`pulumi.Input[list]`)
            * `email` (`pulumi.Input[str]`)
            * `identityProviderId` (`pulumi.Input[str]`)

          * `ips` (`pulumi.Input[list]`)
          * `oktas` (`pulumi.Input[list]`)
            * `identityProviderId` (`pulumi.Input[str]`)
            * `name` (`pulumi.Input[str]`) - Friendly name of the Access Application.

          * `samls` (`pulumi.Input[list]`)
            * `attributeName` (`pulumi.Input[str]`)
            * `attributeValue` (`pulumi.Input[str]`)
            * `identityProviderId` (`pulumi.Input[str]`)

          * `serviceTokens` (`pulumi.Input[list]`)

        The **requires** object supports the following:

          * `anyValidServiceToken` (`pulumi.Input[bool]`)
          * `azures` (`pulumi.Input[list]`)
            * `id` (`pulumi.Input[str]`)
            * `identityProviderId` (`pulumi.Input[str]`)

          * `certificate` (`pulumi.Input[bool]`)
          * `commonName` (`pulumi.Input[str]`)
          * `emailDomains` (`pulumi.Input[list]`)
          * `emails` (`pulumi.Input[list]`)
          * `everyone` (`pulumi.Input[bool]`)
          * `githubs` (`pulumi.Input[list]`)
            * `identityProviderId` (`pulumi.Input[str]`)
            * `name` (`pulumi.Input[str]`) - Friendly name of the Access Application.

          * `groups` (`pulumi.Input[list]`)
          * `gsuites` (`pulumi.Input[list]`)
            * `email` (`pulumi.Input[str]`)
            * `identityProviderId` (`pulumi.Input[str]`)

          * `ips` (`pulumi.Input[list]`)
          * `oktas` (`pulumi.Input[list]`)
            * `identityProviderId` (`pulumi.Input[str]`)
            * `name` (`pulumi.Input[str]`) - Friendly name of the Access Application.

          * `samls` (`pulumi.Input[list]`)
            * `attributeName` (`pulumi.Input[str]`)
            * `attributeValue` (`pulumi.Input[str]`)
            * `identityProviderId` (`pulumi.Input[str]`)

          * `serviceTokens` (`pulumi.Input[list]`)
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["application_id"] = application_id
        __props__["decision"] = decision
        __props__["excludes"] = excludes
        __props__["includes"] = includes
        __props__["name"] = name
        __props__["precedence"] = precedence
        __props__["requires"] = requires
        __props__["zone_id"] = zone_id
        return AccessPolicy(resource_name, opts=opts, __props__=__props__)

    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop
