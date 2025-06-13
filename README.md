
# PI Inspector: An Automated Binary Analysis Tool for Android APKs

**PI Inspector** (formerly known as Murax) is an automated binary analysis tool designed to enhance the security of Android inter-component communication (ICC) by identifying and mitigating vulnerabilities in Intent and PendingIntent usage within Android applications.

## Objective

PI Inspector's goal is to:
- Detect insecure creation and transmission of Intents and PendingIntents
- Trace how Intents and PendingIntents are constructed, manipulated, and transmitted
- Analyze APK binaries and smali code to extract vulnerability features
- Enable security researchers and app developers to identify and fix privilege escalation issues

## Key Features

PI Inspector provides a comprehensive binary analysis with the following capabilities:

### 1. Intent Structure Analysis
- Detects whether an Intent is **implicit** or **explicit**
- Analyzes the intent’s data, actions, and flags to evaluate its exposure to unauthorized receivers

### 2. PendingIntent Vulnerability Detection
- Identifies insecure or empty base `Intent` objects used in PendingIntent creation
- Evaluates improper use of flags such as `FLAG_UPDATE_CURRENT`
- Determines if the created PendingIntent is vulnerable to hijacking or escalation

### 3. Vulnerable PendingIntent Transfer Tracing
- Traces if a vulnerable PendingIntent is sent through a **public broadcast**
- Analyzes wrapping Intents to detect sensitive data exposure
- Labels and maps vulnerable components across the component boundaries

## Internal Architecture

The tool performs binary analysis by interpreting `.smali` code — Android's intermediate representation post-decompilation. Its internal flow includes:

- **Registry Mapping**: Registers like `v1`, `v2`, `v3` are monitored to track how Intents and PendingIntents are constructed.
- **Vulnerability Flags**: Each register is assessed with `setVulnerable(bool)` and checked via `isVulnerable()` to indicate potential threats.
- **Static Analysis Pass**: Multiple analysis passes over `.smali` code help trace complex flows and implicit data leaks.

## Output

PI Inspector generates a **CSV report** which includes:
- Feature-wise vulnerability indicators
- Component linkage analysis
- Exported object tracebacks
- Flags on public broadcasts and exposed permissions

This makes it easier for auditors to analyze data in external tools like Excel or Pandas for further inspection.

## Use Case Summary

The tool is specifically useful for:
- Malware analysts tracing insecure communication paths
- Reverse engineers examining APKs for zero-day vulnerabilities
- Developers validating if their use of IPC (inter-process communication) is secure

By integrating PI Inspector into the mobile app auditing process, developers and analysts can significantly reduce the attack surface of Android apps and ensure secure interaction between app components.
