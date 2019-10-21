/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.baas.transform.v20181221;

import com.aliyuncs.baas.model.v20181221.AcceptFabricInvitationResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AcceptFabricInvitationResponseUnmarshaller {

	public static AcceptFabricInvitationResponse unmarshall(AcceptFabricInvitationResponse acceptFabricInvitationResponse, UnmarshallerContext _ctx) {
		
		acceptFabricInvitationResponse.setRequestId(_ctx.stringValue("AcceptFabricInvitationResponse.RequestId"));
		acceptFabricInvitationResponse.setSuccess(_ctx.booleanValue("AcceptFabricInvitationResponse.Success"));
		acceptFabricInvitationResponse.setErrorCode(_ctx.integerValue("AcceptFabricInvitationResponse.ErrorCode"));
	 
	 	return acceptFabricInvitationResponse;
	}
}