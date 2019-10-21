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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.baas.model.v20181221.DescribeAntChainNodesResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAntChainNodesResponseUnmarshaller {

	public static DescribeAntChainNodesResponse unmarshall(DescribeAntChainNodesResponse describeAntChainNodesResponse, UnmarshallerContext _ctx) {
		
		describeAntChainNodesResponse.setRequestId(_ctx.stringValue("DescribeAntChainNodesResponse.RequestId"));

		List<Map<Object, Object>> result = _ctx.listMapValue("DescribeAntChainNodesResponse.Result");
		describeAntChainNodesResponse.setResult(result);
	 
	 	return describeAntChainNodesResponse;
	}
}