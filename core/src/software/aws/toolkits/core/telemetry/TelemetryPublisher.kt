// Copyright 2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
// SPDX-License-Identifier: Apache-2.0

package software.aws.toolkits.core.telemetry

interface TelemetryPublisher {
    fun publish(metricEvents: Collection<MetricEvent>): Boolean
}