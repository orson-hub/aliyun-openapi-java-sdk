/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.iot.model.v20160530;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DeviceRevokeByIdRequest extends RpcAcsRequest<DeviceRevokeByIdResponse> {
	
	public DeviceRevokeByIdRequest() {
		super("Iot", "2016-05-30", "DeviceRevokeById");
	}

	private Long productKey;

	private Long ruleId;

	private String deviceName;

	public Long getProductKey() {
		return this.productKey;
	}

	public void setProductKey(Long productKey) {
		this.productKey = productKey;
		putQueryParameter("ProductKey", productKey);
	}

	public Long getRuleId() {
		return this.ruleId;
	}

	public void setRuleId(Long ruleId) {
		this.ruleId = ruleId;
		putQueryParameter("RuleId", ruleId);
	}

	public String getDeviceName() {
		return this.deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
		putQueryParameter("DeviceName", deviceName);
	}

	@Override
	public Class<DeviceRevokeByIdResponse> getResponseClass() {
		return DeviceRevokeByIdResponse.class;
	}

}
