#!/usr/bin/env python3
"""
Squire API Tester - Tests all known endpoints with auth keys.
Compares responses between different users to understand plugin entitlements.

Run on your local PC (not in sandbox - APIs are blocked there).
"""

import requests
import json
import sys
from datetime import datetime

# Known auth keys (add more as you collect them)
AUTH_KEYS = [
    "e8b14f67-32f3-4ea4-b172-d258b85ad29e",  # User 1
    # Add more auth keys here to compare
]

# API Endpoints
ENDPOINTS = {
    "bootstrap_modes": {
        "url": "https://jyb5ino5ucg4ylf6dhj7xp6lpe0fvycm.lambda-url.eu-west-1.on.aws/",
        "headers": lambda auth: {"auth": auth},
        "description": "Returns available bootstrap modes (stable/nightly/etc)"
    },
    "license_validation": {
        "url": "https://6zyqmauzakrgs4jprwsf6tqotm0zyepn.lambda-url.eu-west-1.on.aws/",
        "headers": lambda auth: {"auth": auth},
        "description": "License/entitlement validation (plugin access)"
    },
    "auth_endpoint": {
        "url": "https://6kvxsi2v4a3jozbz3qlc56uuxa0ecqrh.lambda-url.eu-west-1.on.aws/",
        "headers": lambda auth: {"auth": auth},
        "description": "Authentication endpoint"
    },
    "unknown_lambda": {
        "url": "https://xjgpaktg4y3h6uazduo2pfqjk40mibhr.lambda-url.eu-west-1.on.aws/",
        "headers": lambda auth: {"auth": auth},
        "description": "Unknown Lambda endpoint"
    },
    "get_bootload_jars": {
        "url": "https://g0dp8zyku3.execute-api.eu-west-1.amazonaws.com/default/GetBootloadJars",
        "headers": lambda auth: {
            "x-authentication-key": auth,
            "x-hardware-id": "launcher_id",
            "Accept": "application/json"
        },
        "description": "GetBootloadJars API (may be dead code)"
    }
}

# Bootstrap JSON URLs (static, no auth needed for download)
BOOTSTRAP_URLS = {
    "stable": "https://squire-hosting.s3.eu-west-1.amazonaws.com/bootstrap-stable.json",
    "nightly": "https://squire-hosting.s3.eu-west-1.amazonaws.com/bootstrap-nightly.json",
    "experimental": "https://squire-hosting.s3.eu-west-1.amazonaws.com/bootstrap-experimental.json",
}


def test_endpoint(name, config, auth_key):
    """Test a single endpoint with given auth key."""
    print(f"\n{'='*70}")
    print(f"Testing: {name}")
    print(f"Description: {config['description']}")
    print(f"URL: {config['url']}")
    print(f"Auth Key: {auth_key[:20]}...")
    print(f"{'='*70}")

    headers = config['headers'](auth_key)
    print(f"Headers: {headers}")

    try:
        response = requests.get(config['url'], headers=headers, timeout=30)

        print(f"\nStatus Code: {response.status_code}")
        print(f"Response Headers: {dict(response.headers)}")

        # Try to parse as JSON
        try:
            data = response.json()
            print(f"\nResponse (JSON):")
            print(json.dumps(data, indent=2)[:3000])
            return {"status": response.status_code, "data": data}
        except:
            print(f"\nResponse (Text):")
            print(response.text[:1000])
            return {"status": response.status_code, "text": response.text}

    except requests.exceptions.RequestException as e:
        print(f"\nError: {e}")
        return {"error": str(e)}


def test_bootstrap_json(mode, url):
    """Download and analyze a bootstrap JSON file."""
    print(f"\n{'='*70}")
    print(f"Fetching Bootstrap JSON: {mode}")
    print(f"URL: {url}")
    print(f"{'='*70}")

    try:
        response = requests.get(url, timeout=30)

        if response.status_code == 200:
            data = response.json()
            artifacts = data.get('artifacts', [])

            print(f"\nFound {len(artifacts)} artifacts")

            # Categorize artifacts
            squire_artifacts = [a for a in artifacts if 'squire' in a.get('path', '').lower()]
            signed_artifacts = [a for a in artifacts if 'squire-bootload-storage' in a.get('path', '')]

            print(f"Squire-specific artifacts: {len(squire_artifacts)}")
            print(f"Signed URL artifacts: {len(signed_artifacts)}")

            # List artifact names
            print("\nArtifact names:")
            for a in artifacts[:20]:
                name = a.get('name', 'unknown')
                path = a.get('path', '')
                is_signed = 'squire-bootload-storage' in path
                print(f"  {'[SIGNED]' if is_signed else '[DIRECT]'} {name}")

            if len(artifacts) > 20:
                print(f"  ... and {len(artifacts) - 20} more")

            # Save full response
            filename = f"bootstrap_{mode}_{datetime.now().strftime('%Y%m%d_%H%M%S')}.json"
            with open(filename, 'w') as f:
                json.dump(data, f, indent=2)
            print(f"\nSaved to: {filename}")

            return data
        else:
            print(f"Error: {response.status_code}")
            print(response.text[:500])
            return None

    except Exception as e:
        print(f"Error: {e}")
        return None


def compare_responses(results):
    """Compare API responses between different auth keys."""
    print(f"\n{'='*70}")
    print("COMPARISON SUMMARY")
    print(f"{'='*70}")

    for endpoint_name, auth_results in results.items():
        print(f"\n{endpoint_name}:")

        # Check if responses differ between users
        responses = list(auth_results.values())
        if len(responses) >= 2:
            first = json.dumps(responses[0], sort_keys=True)
            same = all(json.dumps(r, sort_keys=True) == first for r in responses)
            print(f"  Same for all users: {'YES' if same else 'NO - DIFFERENT!'}")

        for auth_key, response in auth_results.items():
            status = response.get('status', 'error')
            print(f"  {auth_key[:15]}...: {status}")


def main():
    print("="*70)
    print("SQUIRE API TESTER")
    print("="*70)
    print(f"Testing {len(AUTH_KEYS)} auth key(s)")
    print(f"Testing {len(ENDPOINTS)} endpoint(s)")
    print("="*70)

    # Allow overriding auth keys from command line
    auth_keys = sys.argv[1:] if len(sys.argv) > 1 else AUTH_KEYS

    results = {}

    # Test each endpoint with each auth key
    for endpoint_name, endpoint_config in ENDPOINTS.items():
        results[endpoint_name] = {}
        for auth_key in auth_keys:
            result = test_endpoint(endpoint_name, endpoint_config, auth_key)
            results[endpoint_name][auth_key] = result

    # Test bootstrap JSON files
    print("\n" + "="*70)
    print("BOOTSTRAP JSON ANALYSIS")
    print("="*70)

    for mode, url in BOOTSTRAP_URLS.items():
        test_bootstrap_json(mode, url)

    # Compare results
    if len(auth_keys) > 1:
        compare_responses(results)

    # Save all results
    output_file = f"api_test_results_{datetime.now().strftime('%Y%m%d_%H%M%S')}.json"
    with open(output_file, 'w') as f:
        json.dump(results, f, indent=2, default=str)
    print(f"\n\nAll results saved to: {output_file}")

    print("\n" + "="*70)
    print("KEY FINDINGS TO LOOK FOR:")
    print("="*70)
    print("1. Does 'bootstrap_modes' return DIFFERENT codes for different users?")
    print("2. Does 'license_validation' show purchased plugins?")
    print("3. Are the signed URLs in bootstrap JSON the SAME or DIFFERENT per user?")
    print("="*70)


if __name__ == "__main__":
    main()
