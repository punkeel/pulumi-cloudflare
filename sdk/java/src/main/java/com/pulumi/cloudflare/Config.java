// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;

public final class Config {

    private static final com.pulumi.Config config = com.pulumi.Config.of("cloudflare");
/**
 * Configure API client to always use a specific account. Alternatively, can be configured using the
 * `CLOUDFLARE_ACCOUNT_ID` environment variable.
 * 
 */
    public Optional<String> accountId() {
        return Codegen.stringProp("accountId").config(config).get();
    }
/**
 * Configure the base path used by the API client. Alternatively, can be configured using the `CLOUDFLARE_API_BASE_PATH`
 * environment variable.
 * 
 */
    public Optional<String> apiBasePath() {
        return Codegen.stringProp("apiBasePath").config(config).get();
    }
/**
 * Whether to print logs from the API client (using the default log library logger). Alternatively, can be configured using
 * the `CLOUDFLARE_API_CLIENT_LOGGING` environment variable.
 * 
 */
    public Optional<Boolean> apiClientLogging() {
        return Codegen.booleanProp("apiClientLogging").config(config).env("CLOUDFLARE_API_CLIENT_LOGGING").def(false).get();
    }
/**
 * Configure the hostname used by the API client. Alternatively, can be configured using the `CLOUDFLARE_API_HOSTNAME`
 * environment variable.
 * 
 */
    public Optional<String> apiHostname() {
        return Codegen.stringProp("apiHostname").config(config).get();
    }
/**
 * The API key for operations. Alternatively, can be configured using the `CLOUDFLARE_API_KEY` environment variable. API
 * keys are [now considered legacy by Cloudflare](https://developers.cloudflare.com/api/keys/#limitations), API tokens
 * should be used instead.
 * 
 */
    public Optional<String> apiKey() {
        return Codegen.stringProp("apiKey").config(config).get();
    }
/**
 * The API Token for operations. Alternatively, can be configured using the `CLOUDFLARE_API_TOKEN` environment variable.
 * 
 */
    public Optional<String> apiToken() {
        return Codegen.stringProp("apiToken").config(config).get();
    }
/**
 * A special Cloudflare API key good for a restricted set of endpoints. Alternatively, can be configured using the
 * `CLOUDFLARE_API_USER_SERVICE_KEY` environment variable.
 * 
 */
    public Optional<String> apiUserServiceKey() {
        return Codegen.stringProp("apiUserServiceKey").config(config).get();
    }
/**
 * A registered Cloudflare email address. Alternatively, can be configured using the `CLOUDFLARE_EMAIL` environment
 * variable.
 * 
 */
    public Optional<String> email() {
        return Codegen.stringProp("email").config(config).get();
    }
/**
 * Maximum backoff period in seconds after failed API calls. Alternatively, can be configured using the
 * `CLOUDFLARE_MAX_BACKOFF` environment variable.
 * 
 */
    public Optional<Integer> maxBackoff() {
        return Codegen.integerProp("maxBackoff").config(config).env("CLOUDFLARE_MAX_BACKOFF").def(30).get();
    }
/**
 * Minimum backoff period in seconds after failed API calls. Alternatively, can be configured using the
 * `CLOUDFLARE_MIN_BACKOFF` environment variable.
 * 
 */
    public Optional<Integer> minBackoff() {
        return Codegen.integerProp("minBackoff").config(config).env("CLOUDFLARE_MIN_BACKOFF").def(1).get();
    }
/**
 * Maximum number of retries to perform when an API request fails. Alternatively, can be configured using the
 * `CLOUDFLARE_RETRIES` environment variable.
 * 
 */
    public Optional<Integer> retries() {
        return Codegen.integerProp("retries").config(config).env("CLOUDFLARE_RETRIES").def(3).get();
    }
/**
 * RPS limit to apply when making calls to the API. Alternatively, can be configured using the `CLOUDFLARE_RPS` environment
 * variable.
 * 
 */
    public Optional<Integer> rps() {
        return Codegen.integerProp("rps").config(config).env("CLOUDFLARE_RPS").def(4).get();
    }
}