# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['FilterArgs', 'Filter']

@pulumi.input_type
class FilterArgs:
    def __init__(__self__, *,
                 expression: pulumi.Input[str],
                 zone_id: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None,
                 paused: Optional[pulumi.Input[bool]] = None,
                 ref: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Filter resource.
        :param pulumi.Input[str] expression: The filter expression to be used.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] description: A note that you can use to describe the purpose of the filter.
        :param pulumi.Input[bool] paused: Whether this filter is currently paused.
        :param pulumi.Input[str] ref: Short reference tag to quickly select related rules.
        """
        pulumi.set(__self__, "expression", expression)
        pulumi.set(__self__, "zone_id", zone_id)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if paused is not None:
            pulumi.set(__self__, "paused", paused)
        if ref is not None:
            pulumi.set(__self__, "ref", ref)

    @property
    @pulumi.getter
    def expression(self) -> pulumi.Input[str]:
        """
        The filter expression to be used.
        """
        return pulumi.get(self, "expression")

    @expression.setter
    def expression(self, value: pulumi.Input[str]):
        pulumi.set(self, "expression", value)

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Input[str]:
        """
        The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "zone_id")

    @zone_id.setter
    def zone_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "zone_id", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        A note that you can use to describe the purpose of the filter.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def paused(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether this filter is currently paused.
        """
        return pulumi.get(self, "paused")

    @paused.setter
    def paused(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "paused", value)

    @property
    @pulumi.getter
    def ref(self) -> Optional[pulumi.Input[str]]:
        """
        Short reference tag to quickly select related rules.
        """
        return pulumi.get(self, "ref")

    @ref.setter
    def ref(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ref", value)


@pulumi.input_type
class _FilterState:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[str]] = None,
                 expression: Optional[pulumi.Input[str]] = None,
                 paused: Optional[pulumi.Input[bool]] = None,
                 ref: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Filter resources.
        :param pulumi.Input[str] description: A note that you can use to describe the purpose of the filter.
        :param pulumi.Input[str] expression: The filter expression to be used.
        :param pulumi.Input[bool] paused: Whether this filter is currently paused.
        :param pulumi.Input[str] ref: Short reference tag to quickly select related rules.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        if description is not None:
            pulumi.set(__self__, "description", description)
        if expression is not None:
            pulumi.set(__self__, "expression", expression)
        if paused is not None:
            pulumi.set(__self__, "paused", paused)
        if ref is not None:
            pulumi.set(__self__, "ref", ref)
        if zone_id is not None:
            pulumi.set(__self__, "zone_id", zone_id)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        A note that you can use to describe the purpose of the filter.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def expression(self) -> Optional[pulumi.Input[str]]:
        """
        The filter expression to be used.
        """
        return pulumi.get(self, "expression")

    @expression.setter
    def expression(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "expression", value)

    @property
    @pulumi.getter
    def paused(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether this filter is currently paused.
        """
        return pulumi.get(self, "paused")

    @paused.setter
    def paused(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "paused", value)

    @property
    @pulumi.getter
    def ref(self) -> Optional[pulumi.Input[str]]:
        """
        Short reference tag to quickly select related rules.
        """
        return pulumi.get(self, "ref")

    @ref.setter
    def ref(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ref", value)

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> Optional[pulumi.Input[str]]:
        """
        The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "zone_id")

    @zone_id.setter
    def zone_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "zone_id", value)


class Filter(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 expression: Optional[pulumi.Input[str]] = None,
                 paused: Optional[pulumi.Input[bool]] = None,
                 ref: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Filter expressions that can be referenced across multiple features,
        e.g. Firewall Rules. See [what is a filter](https://developers.cloudflare.com/firewall/api/cf-filters/what-is-a-filter/)
        for more details and available fields and operators.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        wordpress = cloudflare.Filter("wordpress",
            description="Wordpress break-in attempts that are outside of the office",
            expression="(http.request.uri.path ~ \\".*wp-login.php\\" or http.request.uri.path ~ \\".*xmlrpc.php\\") and ip.src ne 192.0.2.1",
            zone_id="0da42c8d2132a9ddaf714f9e7c920711")
        ```

        ## Import

        ```sh
         $ pulumi import cloudflare:index/filter:Filter example <zone_id>/<filter_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: A note that you can use to describe the purpose of the filter.
        :param pulumi.Input[str] expression: The filter expression to be used.
        :param pulumi.Input[bool] paused: Whether this filter is currently paused.
        :param pulumi.Input[str] ref: Short reference tag to quickly select related rules.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: FilterArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Filter expressions that can be referenced across multiple features,
        e.g. Firewall Rules. See [what is a filter](https://developers.cloudflare.com/firewall/api/cf-filters/what-is-a-filter/)
        for more details and available fields and operators.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        wordpress = cloudflare.Filter("wordpress",
            description="Wordpress break-in attempts that are outside of the office",
            expression="(http.request.uri.path ~ \\".*wp-login.php\\" or http.request.uri.path ~ \\".*xmlrpc.php\\") and ip.src ne 192.0.2.1",
            zone_id="0da42c8d2132a9ddaf714f9e7c920711")
        ```

        ## Import

        ```sh
         $ pulumi import cloudflare:index/filter:Filter example <zone_id>/<filter_id>
        ```

        :param str resource_name: The name of the resource.
        :param FilterArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(FilterArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 expression: Optional[pulumi.Input[str]] = None,
                 paused: Optional[pulumi.Input[bool]] = None,
                 ref: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = FilterArgs.__new__(FilterArgs)

            __props__.__dict__["description"] = description
            if expression is None and not opts.urn:
                raise TypeError("Missing required property 'expression'")
            __props__.__dict__["expression"] = expression
            __props__.__dict__["paused"] = paused
            __props__.__dict__["ref"] = ref
            if zone_id is None and not opts.urn:
                raise TypeError("Missing required property 'zone_id'")
            __props__.__dict__["zone_id"] = zone_id
        super(Filter, __self__).__init__(
            'cloudflare:index/filter:Filter',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            description: Optional[pulumi.Input[str]] = None,
            expression: Optional[pulumi.Input[str]] = None,
            paused: Optional[pulumi.Input[bool]] = None,
            ref: Optional[pulumi.Input[str]] = None,
            zone_id: Optional[pulumi.Input[str]] = None) -> 'Filter':
        """
        Get an existing Filter resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: A note that you can use to describe the purpose of the filter.
        :param pulumi.Input[str] expression: The filter expression to be used.
        :param pulumi.Input[bool] paused: Whether this filter is currently paused.
        :param pulumi.Input[str] ref: Short reference tag to quickly select related rules.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _FilterState.__new__(_FilterState)

        __props__.__dict__["description"] = description
        __props__.__dict__["expression"] = expression
        __props__.__dict__["paused"] = paused
        __props__.__dict__["ref"] = ref
        __props__.__dict__["zone_id"] = zone_id
        return Filter(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        A note that you can use to describe the purpose of the filter.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def expression(self) -> pulumi.Output[str]:
        """
        The filter expression to be used.
        """
        return pulumi.get(self, "expression")

    @property
    @pulumi.getter
    def paused(self) -> pulumi.Output[Optional[bool]]:
        """
        Whether this filter is currently paused.
        """
        return pulumi.get(self, "paused")

    @property
    @pulumi.getter
    def ref(self) -> pulumi.Output[Optional[str]]:
        """
        Short reference tag to quickly select related rules.
        """
        return pulumi.get(self, "ref")

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Output[str]:
        """
        The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "zone_id")

