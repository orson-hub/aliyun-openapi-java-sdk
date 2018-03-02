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
package com.aliyuncs.imm.model.v20170906;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class PutProjectRequest extends RpcAcsRequest<PutProjectResponse> {
	
	public PutProjectRequest() {
		super("imm", "2017-09-06", "PutProject", "imm");
	}

	private String indexers;

	private String engines;

	private String serviceRole;

	private String project;

	public String getIndexers() {
		return this.indexers;
	}

	public void setIndexers(String indexers) {
		this.indexers = indexers;
		if(indexers != null){
			putQueryParameter("Indexers", indexers);
		}
	}

	public String getEngines() {
		return this.engines;
	}

	public void setEngines(String engines) {
		this.engines = engines;
		if(engines != null){
			putQueryParameter("Engines", engines);
		}
	}

	public String getServiceRole() {
		return this.serviceRole;
	}

	public void setServiceRole(String serviceRole) {
		this.serviceRole = serviceRole;
		if(serviceRole != null){
			putQueryParameter("ServiceRole", serviceRole);
		}
	}

	public String getProject() {
		return this.project;
	}

	public void setProject(String project) {
		this.project = project;
		if(project != null){
			putQueryParameter("Project", project);
		}
	}

	@Override
	public Class<PutProjectResponse> getResponseClass() {
		return PutProjectResponse.class;
	}

}