/*
 * Copyright 2013-2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.cloud.vault.config;

import java.util.Map;

import lombok.Data;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Spencer Gibb
 */
@Data
public class VaultResponse {
	private String auth;
	private Map<String, String> data;
	@JsonProperty("lease_duration")
	private long leaseDuration;
	@JsonProperty("lease_id")
	private String leaseId;
	private boolean renewable;
}