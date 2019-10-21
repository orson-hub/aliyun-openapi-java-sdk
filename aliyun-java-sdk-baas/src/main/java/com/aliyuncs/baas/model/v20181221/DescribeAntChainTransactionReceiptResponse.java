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

package com.aliyuncs.baas.model.v20181221;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.baas.transform.v20181221.DescribeAntChainTransactionReceiptResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAntChainTransactionReceiptResponse extends AcsResponse {

	private String requestId;

	private Result result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private String data;

		private String gasUsed;

		private Long result;

		private List<String> logs;

		public String getData() {
			return this.data;
		}

		public void setData(String data) {
			this.data = data;
		}

		public String getGasUsed() {
			return this.gasUsed;
		}

		public void setGasUsed(String gasUsed) {
			this.gasUsed = gasUsed;
		}

		public Long getResult() {
			return this.result;
		}

		public void setResult(Long result) {
			this.result = result;
		}

		public List<String> getLogs() {
			return this.logs;
		}

		public void setLogs(List<String> logs) {
			this.logs = logs;
		}
	}

	@Override
	public DescribeAntChainTransactionReceiptResponse getInstance(UnmarshallerContext context) {
		return	DescribeAntChainTransactionReceiptResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
