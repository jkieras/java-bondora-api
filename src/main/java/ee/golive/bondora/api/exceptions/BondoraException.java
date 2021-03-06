/*
 * Copyright 2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ee.golive.bondora.api.exceptions;

import ee.golive.bondora.api.domain.responses.ApiResult;
import org.springframework.http.HttpStatus;

public class BondoraException extends Exception {

    private ApiResult response;
    private HttpStatus httpStatus;

    public BondoraException(String message, ApiResult response, HttpStatus httpStatus) {
        super(message);
        this.response = response;
        this.httpStatus = httpStatus;
    }

    public ApiResult getResponse() {
        return response;
    }

    public void setResponse(ApiResult response) {
        this.response = response;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }
}
