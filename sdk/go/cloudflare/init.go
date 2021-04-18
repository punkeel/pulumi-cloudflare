// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"fmt"

	"github.com/blang/semver"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type module struct {
	version semver.Version
}

func (m *module) Version() semver.Version {
	return m.version
}

func (m *module) Construct(ctx *pulumi.Context, name, typ, urn string) (r pulumi.Resource, err error) {
	switch typ {
	case "cloudflare:index/accessApplication:AccessApplication":
		r = &AccessApplication{}
	case "cloudflare:index/accessCaCertificate:AccessCaCertificate":
		r = &AccessCaCertificate{}
	case "cloudflare:index/accessGroup:AccessGroup":
		r = &AccessGroup{}
	case "cloudflare:index/accessIdentityProvider:AccessIdentityProvider":
		r = &AccessIdentityProvider{}
	case "cloudflare:index/accessMutualTlsCertificate:AccessMutualTlsCertificate":
		r = &AccessMutualTlsCertificate{}
	case "cloudflare:index/accessPolicy:AccessPolicy":
		r = &AccessPolicy{}
	case "cloudflare:index/accessRule:AccessRule":
		r = &AccessRule{}
	case "cloudflare:index/accessServiceToken:AccessServiceToken":
		r = &AccessServiceToken{}
	case "cloudflare:index/accountMember:AccountMember":
		r = &AccountMember{}
	case "cloudflare:index/apiToken:ApiToken":
		r = &ApiToken{}
	case "cloudflare:index/argo:Argo":
		r = &Argo{}
	case "cloudflare:index/argoTunnel:ArgoTunnel":
		r = &ArgoTunnel{}
	case "cloudflare:index/authenticatedOriginPulls:AuthenticatedOriginPulls":
		r = &AuthenticatedOriginPulls{}
	case "cloudflare:index/authenticatedOriginPullsCertificate:AuthenticatedOriginPullsCertificate":
		r = &AuthenticatedOriginPullsCertificate{}
	case "cloudflare:index/byoIpPrefix:ByoIpPrefix":
		r = &ByoIpPrefix{}
	case "cloudflare:index/certificatePack:CertificatePack":
		r = &CertificatePack{}
	case "cloudflare:index/customHostname:CustomHostname":
		r = &CustomHostname{}
	case "cloudflare:index/customHostnameFallbackOrigin:CustomHostnameFallbackOrigin":
		r = &CustomHostnameFallbackOrigin{}
	case "cloudflare:index/customPages:CustomPages":
		r = &CustomPages{}
	case "cloudflare:index/customSsl:CustomSsl":
		r = &CustomSsl{}
	case "cloudflare:index/filter:Filter":
		r = &Filter{}
	case "cloudflare:index/firewallRule:FirewallRule":
		r = &FirewallRule{}
	case "cloudflare:index/healthcheck:Healthcheck":
		r = &Healthcheck{}
	case "cloudflare:index/ipList:IpList":
		r = &IpList{}
	case "cloudflare:index/loadBalancer:LoadBalancer":
		r = &LoadBalancer{}
	case "cloudflare:index/loadBalancerMonitor:LoadBalancerMonitor":
		r = &LoadBalancerMonitor{}
	case "cloudflare:index/loadBalancerPool:LoadBalancerPool":
		r = &LoadBalancerPool{}
	case "cloudflare:index/logPushOwnershipChallenge:LogPushOwnershipChallenge":
		r = &LogPushOwnershipChallenge{}
	case "cloudflare:index/logpullRetention:LogpullRetention":
		r = &LogpullRetention{}
	case "cloudflare:index/logpushJob:LogpushJob":
		r = &LogpushJob{}
	case "cloudflare:index/magicFirewallRuleset:MagicFirewallRuleset":
		r = &MagicFirewallRuleset{}
	case "cloudflare:index/originCaCertificate:OriginCaCertificate":
		r = &OriginCaCertificate{}
	case "cloudflare:index/pageRule:PageRule":
		r = &PageRule{}
	case "cloudflare:index/rateLimit:RateLimit":
		r = &RateLimit{}
	case "cloudflare:index/record:Record":
		r = &Record{}
	case "cloudflare:index/spectrumApplication:SpectrumApplication":
		r = &SpectrumApplication{}
	case "cloudflare:index/wafGroup:WafGroup":
		r = &WafGroup{}
	case "cloudflare:index/wafOverride:WafOverride":
		r = &WafOverride{}
	case "cloudflare:index/wafPackage:WafPackage":
		r = &WafPackage{}
	case "cloudflare:index/wafRule:WafRule":
		r = &WafRule{}
	case "cloudflare:index/workerCronTrigger:WorkerCronTrigger":
		r = &WorkerCronTrigger{}
	case "cloudflare:index/workerRoute:WorkerRoute":
		r = &WorkerRoute{}
	case "cloudflare:index/workerScript:WorkerScript":
		r = &WorkerScript{}
	case "cloudflare:index/workersKv:WorkersKv":
		r = &WorkersKv{}
	case "cloudflare:index/workersKvNamespace:WorkersKvNamespace":
		r = &WorkersKvNamespace{}
	case "cloudflare:index/zone:Zone":
		r = &Zone{}
	case "cloudflare:index/zoneDnssec:ZoneDnssec":
		r = &ZoneDnssec{}
	case "cloudflare:index/zoneLockdown:ZoneLockdown":
		r = &ZoneLockdown{}
	case "cloudflare:index/zoneSettingsOverride:ZoneSettingsOverride":
		r = &ZoneSettingsOverride{}
	default:
		return nil, fmt.Errorf("unknown resource type: %s", typ)
	}

	err = ctx.RegisterResource(typ, name, nil, r, pulumi.URN_(urn))
	return
}

type pkg struct {
	version semver.Version
}

func (p *pkg) Version() semver.Version {
	return p.version
}

func (p *pkg) ConstructProvider(ctx *pulumi.Context, name, typ, urn string) (pulumi.ProviderResource, error) {
	if typ != "pulumi:providers:cloudflare" {
		return nil, fmt.Errorf("unknown provider type: %s", typ)
	}

	r := &Provider{}
	err := ctx.RegisterResource(typ, name, nil, r, pulumi.URN_(urn))
	return r, err
}

func init() {
	version, err := PkgVersion()
	if err != nil {
		fmt.Println("failed to determine package version. defaulting to v1: %v", err)
	}
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/accessApplication",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/accessCaCertificate",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/accessGroup",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/accessIdentityProvider",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/accessMutualTlsCertificate",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/accessPolicy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/accessRule",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/accessServiceToken",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/accountMember",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/apiToken",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/argo",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/argoTunnel",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/authenticatedOriginPulls",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/authenticatedOriginPullsCertificate",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/byoIpPrefix",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/certificatePack",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/customHostname",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/customHostnameFallbackOrigin",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/customPages",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/customSsl",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/filter",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/firewallRule",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/healthcheck",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/ipList",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/loadBalancer",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/loadBalancerMonitor",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/loadBalancerPool",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/logPushOwnershipChallenge",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/logpullRetention",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/logpushJob",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/magicFirewallRuleset",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/originCaCertificate",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/pageRule",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/rateLimit",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/record",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/spectrumApplication",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/wafGroup",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/wafOverride",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/wafPackage",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/wafRule",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/workerCronTrigger",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/workerRoute",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/workerScript",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/workersKv",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/workersKvNamespace",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/zone",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/zoneDnssec",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/zoneLockdown",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/zoneSettingsOverride",
		&module{version},
	)
	pulumi.RegisterResourcePackage(
		"cloudflare",
		&pkg{version},
	)
}
